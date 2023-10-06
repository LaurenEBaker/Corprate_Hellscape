# Corporate Hellscape Company Policies

# General role assignments:
* Lauren - Team lead (+art)
* Joe - Tech lead (+devops)
* Josh - Developer
* Chaz - Developer
* Mo - Developer

# Role descriptions:

*_Team Lead_* - Responsible for setting team direction, dolling out feature work/load balancing the team, being core resolver of conflicts, and making sure the team stays unblocked.

*_Tech Lead_* - Responsible for helping to turn feature descriptions into technical implementation details, assisting team with technical issues and trouble understanding how to accomplish the described technical goals, and making top-level decisions on what technologies and design patterns should be used where when refining feature work.

*_Developer_* - Responsible for picking up and completing individual feature work jobs. Contributes to individual feature job workload estimation and contributes opinions on implementation direction for team debate.

# Testing and QA
There are no formal QA positions. Devs are expected to thoroughly test their own changes. In the case of any major regressions, the team will meet and determine next steps on a case-by-case basis.

# Branching and Pull Requests
The main branch will be protected. All changes must be merged to master via a pull request, which will be approved and merged by the Tech Lead. 

Our team will use a trunk-based model. Each feature job should have its own feature branch which will only exist for the time between work on the feature begins and its approval and merge back to main (the 'trunk')

All PRs should be completed using a squash commit (this flattens all changes in the merge request to a single commit corresponding to the PR as a whole)

All PRs should be associated with a specific github issue

# Work tracking
The team will use the github issues board to create, prioritize, and track each feature job. 
