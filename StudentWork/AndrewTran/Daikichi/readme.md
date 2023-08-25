*   Practice
*   Deadline: Friday of Week 1
*   Difficulty Level: Basic
*   Est. Time: < 1 hr

Daikichi Routes
===============

Daikichi (大吉) means "excellent luck" or "great blessing". We will be creating a website that will deliver a message of good fortune based on which URL path is typed into the browser. For this assignment, you are going to practice routes in Spring Boot. The goal is to master writing method level `@RequestMapping` annotations and `@RequestMapping` class level annotation.

### ![''](https://assets.codingdojo.com/boomyeah2015/codingdojo/curriculum/content/chapter/1643999097__General visual.png "''")Learning Objectives:

*   Create a Spring Boot application using Spring Tool Suite
*   Create a controller using the `@RestController` annotation
*   Use request mapping and `@RequestMapping` annotations to have distinct URL endpoints return different messages

![](https://assets.codingdojo.com/boomyeah2015/codingdojo/curriculum/content/chapter/1630083737__omikuji.jpeg)

Assignment
----------

Create an app that will show in the browser either a welcome message or a fortune, based on which URL is typed in the browser. Please note, you may show simple text without any html formatting.

![](https://assets.codingdojo.com/boomyeah2015/codingdojo/curriculum/content/chapter/1630723573__Daikichi Routes.png)

*   Start a new Spring Starter Project and create a package for your controllers.
    
*   Create a new controller called DaikichiController, and be sure you annotate it as a @RestController.
    
*   Have an http GET request to 'http://localhost:8080/daikichi' that displays the following: 'Welcome!'.
    
*   Have an http GET request to 'http://localhost:8080/daikichi/today' that displays the following: 'Today you will find luck in all your endeavors!'.
    
*   Have an http GET request to 'http://localhost:8080/daikichi/tomorrow' that displays the following: 'Tomorrow, an opportunity will arise, so be sure to be open to new ideas!'.