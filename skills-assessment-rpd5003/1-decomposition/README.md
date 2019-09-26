Problem Decomposition / Solution Architecture Diagram / User Story Generation
=============================================================================

Our customers often seek our assistance in decomposing large-scale
systems into a set of specific components within a solution
architecture that is consistent with a stated set of requirements and
solution approach.

Being clear about the solution architecture allows us to get traction
by distributing the work across our team, and sometimes across
contributors provided by the customer.

Instructions
------------

1. Review the [System Context, Requirements, and Solution
   Approach](specifications/solution-approach.md).

2. Create a 1-2 page solution architecture that includes a solution
   architecture diagram and brief prose descriptions of the
   architecture, each of its key components, and how they work
   together to solve the problem.

   Don't overinvest in perfect diagrams.  A picture of a "good enough"
   sketch using pen, pencil, or sharpies should suffice to be able to
   communicate your intent.

3. Think about the most minimal possible implementation that resembles
   your solution architecture, and how you could specify the work so
   that you could leverage the contribution of others on the team.
   Aim for a single sprint with about 3 contributors.

4. Write a set of user stories for the first sprint of realizing and
   implementing your proposed solution.

   We use the common format ```“As a [persona], I want to [goal], so
   that [benefits].”``` (See some
   [examples](http://yodiz.com/help/agile-user-stories-and-groomed-product-backlog/)).
   Include some minimal task breakdown for each story, just enough to
   help the team to understand how each story maps to components in
   the solution architecture, so they can dig in efficiently.

   Try to keep your stories bounded and focused so the work would fit
   into a single sprint with a small team.  Just use a .txt or .md
   document to capture them.

5. Place your solution architecture description and initial user
   stories into a relative ```deliverables``` subdirectory so we can
   easily find them.