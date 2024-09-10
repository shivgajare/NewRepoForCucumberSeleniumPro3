Feature:Login Features
Scenario: positive login scenario
Given user is on login page
When user enter "shivaji.gajare123@gmail.com" and "maHA@456"
And user click on submit button
Then user is on home page

Scenario Outline:negative login scenario
Given user is on login page
When user enters "<user>" and "<password>"
And user clicks on submit button
Then user is on same page login unsuccessful
Examples:
|user|password|
|admin|admin12g|
||admin123|
|admin||