Feature: Create Lead
Background:	
Given Open chrome browser
And Maximize the browser
And Set the timeout
And Enter the url
And Enter the username as DemoCSR
And Enter the password as crmsfa
And Click on Login button
And Click on crmsfa
And Click Lead
And Click Create Lead

Scenario: Negative flow
//And Enter Company Name as  
And Enter First Name as Jayashree
And Enter Last Name as Jayachander
When Click Create Lead button
But Verify Create Lead is done

Scenario: Positive flow
And Enter Company Name as Capgemini
And Enter First Name as Jayashree
And Enter Last Name as Jayachander
When Click Create Lead button
Then Verify Create Lead is done