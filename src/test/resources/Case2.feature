Feature: Login Test
Description: Registered user can login into application using valid username and valid password

Scenario Outline: Login with valid combinations
Given user opens the login page in newtours application
When user enter username as "<uname>" and password as "<pass>"
And Click Submit button
Then verify login success

Examples:

|uname|pass|
|shwesam|password123|
|shwe|shwe123|



