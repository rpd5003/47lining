Specifications
==============

Context
-------

Our customers use SQL developed for a variety of database products.
In our solutions, we often use SQL targeted at Amazon Redshift,
PostgreSQL, MariaDB, or MySQL.

AWS has developed a [sample
database](https://docs.aws.amazon.com/redshift/latest/dg/c_sampledb.html)
("tickit") that models the data for a ticket listing, sales and
purchasing system.  We will use this sample database for this
exercise.

The data for tickit is available in
[../provided-data/](../provided-data/).  Its table structure is
available in [../provided-sql/](../provided-sql).

For your convenience, we have loaded the tickit database to a live,
read-only, redshift instance that is available to you, along with
[connectivity instructions](how-to-connect.md) to make it fast and
easy for you to connect.

The customer has some simple questions of the their data.  Please use
Redshift SQL (largely based on PostgreSQL), to create SQL that meets
their need as stated in the user story below.

Development Constraints
-----------------------

1. You are welcome to the Redshift instance at
   ```tickit.47lining.com```, or to load the data into a local
   PostgreSQL database.  We will test your solution using the Redshift
   instance at ```tickit.47lining.com```.


User Story
----------

As the customer I would like a summary that details:

- for each month starting with the current month,
  - the total sales by revenue and the total sales by ticket volume
    for the top 3 event categories during that month

Acceptance Criteria
-------------------

1. Solution can be produced by submitting SQL provided in
   ```../deliverable/query.sql``` to ```tickit.47lining.com```.
