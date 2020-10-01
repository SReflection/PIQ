Coding Challenge
===

Overview
---

The "physIQ Coding Challenge" is a simple app. It contains two input fields for a numerator and a 
divisor, a button to perform the division, a textview element that displays the result, and a button 
that clears all the fields.

### Coding exercise

1. Document a list of test cases for the coding challenge app.
2. Write at least one automated test.
   1. Download and install Android Studio (https://developer.android.com/studio)
   2. Set up an Android Virtual Device (https://developer.android.com/studio/run/managing-avds)
   3. Implement the tests with Espresso (https://developer.android.com/training/testing/espresso)
3. Run the tests with Gradle cli or in Studio

Please submit the test files you wrote or recorded and test results (logged output or xml reports). If you find any bugs please please document them, too.

### Written exercises

1. Describe how you would run these tests in a continuous integration pipeline.
  // I would use Jenkins on AWC EC2 machine. would build a job using cron expression, set up time and date
  // using @tags for @Smoke, @Regression ect. 
  // I would run commands to trigger, commands to generate report

2. If the division function were moved to a REST api that you were also responsible for testing, what tools would you use to test it.
 // I would use RestAssured Library for automation and Postman for manual checking 
  using CRUD methods to check every end points
  I would check 
   Status code 
   Body 
   Header
   // I would send Delete to Post URL 
   // I would send Post to Delete  URL 
   // Provide different body type  ect. 
   
   
   
   
   