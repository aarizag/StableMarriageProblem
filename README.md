This is an algorithm based on the stable marriage problem discussed in this video:
https://www.youtube.com/watch?v=Qcv1IqHWAzg

This program will generate a series of random names for a set number of people and seperate them into 2 catagories: men and women.

Each man and women will then rank all the members of the opposite sex into a preference list.
A "Stable Marriage" as defined by the problem is one in which no man and woman who would prefer each other are in seperate engagements. 

Day 1:
    Each woman will propose to the man on the top of their list. Some men will recieve more than one proposal, some will receive none. Each man will reject all but his top choice that is available to him. This will form the first tentative engagements.
    
Day 2:
    Each rejected woman proposes to the next man on her preference list. Each man will reject all but his top suitor, regardless of previous tentative engagements.
    
Day 3, 4 , 5 ...:
    Repeat Day 2 until all people are paired.
