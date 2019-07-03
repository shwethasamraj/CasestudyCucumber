Feature: SignUp
Scenario Outline: Test signup function with different set of input

Given user opens signup page in TestMe App
When user enters un as "<username>"
And user enters fn as "<firstname>"
And user enters ln as "<lastname>"
And user enters psd as "<password>"
And user enters cnfrmpass as "<confirmpassword>"
And user enters gender 
And user enters email as "<email>"
And user enters mob as "<mob>"
And user enters dob as "<dob>"
And user enters address as "<address>"
And user enters sec_ques as "<sec_ques>"
And user enters sec_ans as "<sec_ans>"
And click signup button
Then verify signup success message
Then close application

Examples: 

|username|firstname|lastname|password|confirmpassword|email|mob|dob|address|sec_ques|sec_ans|
|sumathi|sumathi|samraj|sumi1234|sumi1234|sumisam09@gmail.com|8939419716|19-07-1997|chennai,Mylapore|what is your favour color?|black|
|shwesam|lalitha|abc|abc123|abc123|abc@gmail.com|8457854557|01-01-2010|chennai, Perungalathur|what is your favour color?|white|