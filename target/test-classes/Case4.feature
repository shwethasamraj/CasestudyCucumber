Feature: Cart Test
Description: User tries to move to cart without adding items


Scenario Outline: The one where the user moves to cart without adding item in it 
Given User open login page of Testme app
When user enters username as "<username>" and password as "<password>"
And user clicks submit button
When user search a particular product like headphones
And user tries to access cart page
Then Testme app doesn't display the cart icon

Examples:
|username|password|
|shwesam|password123|
