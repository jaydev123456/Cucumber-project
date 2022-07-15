Feature:Add User Module
Scenario Outline:
Validate Add user with multiple data
Given  user navigate orangehrm url
When user logs in using username as "Admin" and password as "Qedge123!@#"
When user click login button
When user click admin button
When user click add button
When user Enter Employeename
When user Enter username
When user Enter password button
When user Enter confirm password
When user click save button 
Then user validate url
Then user close browser
Examples:
|Employeename|username|password|confirm password|
|Abhay Jain|lalita|Lalita@123|Lalita@123|
|Abhi demo|lalita|Lalita@123|Lalita@123|
|Abhiram Demo|lalita|Lalita@123|Lalita@123|
|Anand kumbar|lalita|Lalita@123|Lalita@123|
|Ananth Prabhu|lalita|Lalita@123|Lalita@123|