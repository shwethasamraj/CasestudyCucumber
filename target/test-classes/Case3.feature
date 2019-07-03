Feature: Search for products
Description: Opens TestMe App and searches for the product
Scenario Outline: Search for headphones
Given user opens the login page in TestMe App
When User enter username as "<uname>" and password as "<pass>"
And click Submit button
And search for product
Then verify Search

Examples:

|uname|pass|
|shwesam|password123|