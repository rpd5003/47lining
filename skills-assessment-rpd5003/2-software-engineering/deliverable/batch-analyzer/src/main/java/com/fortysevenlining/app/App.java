package com.fortysevenlining.app;


import java.io.FileReader;
import java.lang.reflect.Type;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;


public class App 
{
	
    public static void main( String[] args )
    {
    	try{
    		String capability = args[0];
    		
    		Type listType = new TypeToken<List<String>>() {}.getType();
    		List<String> batchList = new Gson().fromJson(new FileReader(args[1]), listType);
    		
    		switch(capability){
    			case "is-invalid-batch":
    				isInvalidBatch(batchList);
    				break;
    			case "waste-metric":
    				getWasteMetric(batchList, 0);
    				break;
    			case "one-swap-recommendation":
    				getWasteMetric(batchList, 1);
    				break;
    			case "two-swap-recommendation":
    				getWasteMetric(batchList, 2);
    				break;
    			default:
    				System.out.println("Invalid capability \"" + capability + "\" trying to be invoked");
    			
    		}
    	} catch (Exception e) {
            System.out.println(e.toString());
        }

    }

    private static void isInvalidBatch(List<String> batchList){
    	try{
    		
    		String currentItem;
    		String currentSuit;
    		boolean isValidBatch = true;
    		
    		if(batchList.size() != 52){
    			System.out.println("ALARM: Batch size is " + batchList.size() + ", instead of 52");
    			isValidBatch = false;
    			return;
    		}
    		
    		for(int i=0; i <= batchList.size()-1; i++){
    			currentItem = batchList.get(i);
    			currentSuit = getSuit(currentItem);
    			
    			if(getRank(currentItem) == -9999 || getSuit(currentItem).equals("XXXX") || getColor(currentSuit).equals("XXXX")){
        			System.out.println("ALARM: Invalid Batch. One or more data elements does not follow requirements for batch entry syntax");
        			isValidBatch = false;
        			return;
    			}
    		}
    		

    		Set<String> fullDeck = new HashSet<String>(batchList);
    		
    		if(fullDeck.size() != 52){
    			System.out.println("ALARM: Invalid Batch. Number of cards in each suit does not match, or there are duplicates");
    			isValidBatch = false;
    		}
    		
    		if(isValidBatch){
    			System.out.println("This Batch is valid");
    		}

    	} catch (Exception e) {
            System.out.println(e.toString());
        }
    }
    
    private static void getWasteMetric(List<String> batchList, int numberOfSwaps){
    	try{
    		
    		String currentItem;
    		int currentRank;
    		String currentSuit;
    		String currentColor;
    		
    		String nextItem;
    		int nextRank;
    		String nextSuit;
    		String nextColor;
    		
    		String maxWasteCurrentValue = "";
    		String maxWasteNextValue = "";
    		int maxWaste = 0;

    		String secondMaxWasteCurrentValue = "";
    		String secondMaxWasteNextValue = "";
    		int secondMaxWaste = 0;
    		
    		int totalRank=0;
    		
    		for(int i=0; i < batchList.size()-1; i++){
    			int currentWaste=0;
    			
    			currentItem = batchList.get(i);
    			nextItem = batchList.get(i+1);
    			
    			currentRank = getRank(currentItem);
    			currentSuit = getSuit(currentItem);
    			currentColor = getColor(currentSuit);
    			
    			nextRank = getRank(nextItem);
    			nextSuit = getSuit(nextItem);
    			nextColor = getColor(nextSuit);
    			
    			if(currentSuit.equals(nextSuit)){
    				currentWaste = Math.abs(currentRank - nextRank);
        			totalRank += currentWaste;   
    			} else if (currentColor.equals(nextColor)){
    				currentWaste = 2*Math.abs(currentRank - nextRank);
        			totalRank += currentWaste;	
    			} else if (!currentColor.equals(nextColor)){
    				currentWaste = 3*Math.abs(currentRank - nextRank);
        			totalRank += currentWaste; 	
    			} else{
    				System.out.println("How could this happen???");
    			}
    			
    			if(currentWaste > maxWaste){
    				maxWaste = currentWaste;
    				maxWasteCurrentValue = currentItem;
    				maxWasteNextValue = nextItem;
    			}
    			
    			if(currentWaste > secondMaxWaste && currentWaste < maxWaste){
    				secondMaxWaste = currentWaste;
    				secondMaxWasteCurrentValue = currentItem;
    				secondMaxWasteNextValue = nextItem;
    			}
    			
    		}

    		if(numberOfSwaps == 0){
    			System.out.println("Total waste is: " + totalRank);
    		} else if (numberOfSwaps == 1){
    			System.out.println("By swapping " + maxWasteCurrentValue + " and " + maxWasteNextValue + ", you could reduce waste metric from " + totalRank + " to " + (totalRank - maxWaste) + ".");
    		} else if (numberOfSwaps == 2){
    			System.out.println("By swapping " + maxWasteCurrentValue + " and " + maxWasteNextValue + ", then swapping " + secondMaxWasteCurrentValue + " and " + secondMaxWasteNextValue + ", you could reduce waste metric from " + totalRank + " to " + (totalRank - maxWaste - secondMaxWaste) + ".");
    		} else {
    			System.out.println("ALARM: Invalid number of swaps specified");
    		}
    		
    		
    	} catch (Exception e) {
            System.out.println(e.toString());
        }
    }
    
    private static String getColor(String suit){
		String color;
		
		switch(suit){
			case "C":
				color = "Black";
				break;
			case "S":
				color = "Black";
				break;
			case "D":
				color = "Red";
				break;
			case "H":
				color = "Red";
				break;
			default:
				color = "XXXX";
		}

    	return color;
    }
    
    
    private static String getSuit(String item){
		String suit;
		
    	if(item.length() == 2){
    		suit = item.substring(1,2);
    	} else if (item.length() == 3){
    		suit = item.substring(2,3);
    	} else {
    		return "XXXX";
    	}
    	
    	if(!suit.equals("C") && !suit.equals("S") && !suit.equals("D") && !suit.equals("H")){
    		return "XXXX";
    	}
    	
    	return suit;
    }
    
    private static int getRank(String item){
		String rank;
		int rankInt;
		
    	if(item.length() == 2){
    		rank = item.substring(0,1);
    	} else if (item.length() == 3){
    		rank = item.substring(0,2);
    	} else {
    		return -9999;
    	}
    	
    	switch(rank){
	    	case "2":
	    		rankInt = 2;
				break;
	    	case "3":
	    		rankInt = 3;
				break;
	    	case "4":
	    		rankInt = 4;
				break;
	    	case "5":
	    		rankInt = 5;
				break;
	    	case "6":
	    		rankInt = 6;
				break;
	    	case "7":
	    		rankInt = 7;
				break;
	    	case "8":
	    		rankInt = 8;
				break;
	    	case "9":
	    		rankInt = 9;
				break;
	    	case "10":
	    		rankInt = 10;
				break;
	    	case "J":
	    		rankInt = 10;
				break;
	    	case "Q":
	    		rankInt = 10;
				break;
	    	case "K":
	    		rankInt = 10;
				break;
	    	case "A":
	    		rankInt = 1;
				break;
	    	default:
	    		rankInt = -9999;
    	}
    	
    	return rankInt;
    }
    
    
}
