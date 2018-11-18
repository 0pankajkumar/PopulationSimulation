# PopulationSimulation
A simulation of Human population starting at 2000 B.C.

Starting with very few ancestors the program bulids up the population i runtime.
Humans are created using objects concept which is nuts & bolts for java.

## Moto
The sole purpose of churning the cpu with this code is to see how human population grows based on certain factors.
Criterias & phenomenas deciding the death & growth will be subjected to lot of edits & updates since the world was hard to predict from its genesis & we are just playing around it.

## Selection of langauage : Java
Since, a lot of human objects will be created which will become a mess when we reach population explosions. So, to avoid garbage collection problem **Java** has been chosen which provides the juice for free. Ofcourse, Python and other friends can do the same job. But today it is a Java day.

## Rules of the Game
1. 10 couples start the game at 2000 B.C.
2. End goal is always to determine population in 2018.
3. The sex of a born human is randomized with Male or Female. No third option regarding biology.
4. Can't mate with immediate parents or siblings.
5. Mating age is randomized between 20-40 yrs.
6. Age of a human is randomized from 30-80 yrs. After dying that object is referenced to null so that garbage collector takes care of it.
7. Number of children given birth by a couple is randomized between 0 to 10 numbers.
8. Each human is given a unique identification number like social security or aadhar.


A quick tree
![tree structure](https://raw.githubusercontent.com/805bluebell/PopulationSimulation/master/Initial_Tree_Structure.jpg)

