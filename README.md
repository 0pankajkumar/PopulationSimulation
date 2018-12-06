# PopulationSimulation
A simulation of Human population starting at 2000 B.C.

Starting with very few ancestors the program bulids up the population i runtime.
Humans are created using objects concept which is nuts & bolts for java.

## Moto
The sole purpose of churning the cpu with this code is to see how human population grows based on certain factors.
Criterias & phenomenas deciding the death & growth will be subjected to lot of edits & updates since the world was hard to predict from its genesis & we are just playing around it.

## Selection of langauage : Java
A lot of human objects will be created which will become a mess when we reach population explosions. **C**, **C++** and friends will create a lot of mess in memory management. So, to avoid garbage collection problem **Java** has been chosen which provides the juice for free.
Ofcourse, Python and other friends can do the same job. But today it is a Java day.
Also, each object will be an independent thread running so that we can best create a world with
several humans living simultaneously. Though, we know that this is an illusion created by
rapid switching of threads such that it appears all threads executing at once.
This switching is done in robin round manner by binding java threads with Operating system threads. (This was found here https://www.researchgate.net/post/How_is_Thread_scheduling_in_Java_done)

Still we will try to best simulate the situation.

### [Update]
We are no longer using threads to simulate the situation.

|         |          |
| ------------: |:------------- |
| Reason:       | Java doesn't supply a lot of threads |
| Elaborate:    | Population had started booming uncontrolled and we realized that an infinite loop was written. We were running out of native threads supplied by my operating system. That means population at a time is limited in this world.      |
| Further Options: | Someone suggested to use **Go coroutines** as it doesn't has 1:1 ratio with OS threads or just wait for **Java fiber**|
||As of now, A Grapewine type data structure is being used with Java's ArrayList to grow each generation of Humans.|


## Rules of the Game
1. 10 couples start the game at 2000 B.C.
2. End goal is always to determine population in 2018.
3. The sex of a born human is randomized with Male or Female. No third option regarding biology.
4. Can't mate with immediate parents or siblings.
5. Mating age is randomized between 20-40 yrs.
6. Age of a human is randomized from 30-80 yrs. After dying that object is referenced to null so that garbage collector takes care of it.
7. Number of children given birth by a couple is randomized between 0 to 10 numbers.
8. Each human is given a unique identification number like social security or aadhar.

## Factors affecting marriages (To be implemented in later versions)
1. [Marriage in Islam](https://en.wikipedia.org/wiki/Marriage_in_Islam)
2. [Marriage prohibitions in Christianity](http://www.eternalgod.org/q-a-13060/)
3. Hindu Marriage
   - [The Hindu Marriage Act, 1955](https://en.wikipedia.org/wiki/The_Hindu_Marriage_Act,_1955)
   - [Sati (practise)](https://en.wikipedia.org/wiki/Sati_(practice))



