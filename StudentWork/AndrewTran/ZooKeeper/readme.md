*Zookeeper
=========

## Learning Objective:

*   Implement packages to namespace your project
*   Implement inheritance

* * *

A zookeeper has asked you to help her track animals' energy levels. In particular, she is having difficulty tracking the mammals. Every mammal should have an energy level that starts at 100. Each animal's energy level should be displayed with the `displayEnergy` method, which should print and return the energy level.

Once this is done, she has asked that you also create a separate gorilla class. The gorilla should extend the Mammal class and have the following three methods:

*   `throwSomething()` - decrease the gorilla's energy by 5 and print out a message indicating that the gorilla has thrown something
*   `eatBananas()` - increase the gorilla's energy by 10 and print out a message indicating the gorilla's satisfaction
*   `climb()` - decrease the gorilla's energy by 10 and print out a message indicating the gorilla has climbed a tree

### Test

To demonstrate that the class works as expected, create an instance of the gorilla class, have the gorilla throw things 3 times, eat bananas twice, climb once, and print the gorilla's energy level.



![](https://assets.codingdojo.com/boomyeah2015/codingdojo/curriculum/content/chapter/1641595276__Gorilla.png)



The zookeeper has also captured a rare specimen. Its default energy is much higher than most mammals, its energy level is 300. It can also do a lot more than climb - it can fly. Moreover, this specimen doesn't eat bananas, it eats humans... and it doesn't throw things, but attacks towns. The zookeeper has caught a giant Bat and wants your help to track its energy levels.

The bat should extend the Mammal class and have the following three methods:

*   `fly()` - decrease the bat's energy by 50 and print a message indicating the bat is airborne
*   `eatHumans()` - increase the bat's energy by 25 and print a message indicating the bat's satisfaction
*   `attackTown()` - decrease the bat's energy by 100 and print a message describing the bat's attack

### Test

The bat should be tested by attacking three towns, eating two humans, flying twice, and then displaying its energy. Use the display energy from the superclass!



![](https://assets.codingdojo.com/boomyeah2015/codingdojo/curriculum/content/chapter/1641593895__scarey-bat.png)



*   Create a Mammal class with an 'energy' attribute and a 'displayEnergy' method.

*   Create a Gorilla class that extends the Mammal class and has the 'throwSomething', 'eatBananas', and 'climb' methods.

*   Create a Bat class that extends the Mammal class, has an energy level of 300, and has the 'fly', 'eatHumans', and 'attackTown' methods.

*   Test the Gorilla and Bat classes.*