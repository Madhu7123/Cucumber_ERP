@tag
Feature:
As admin User i want test Supplier and customer modules
@suppliers
Scenario Outline:
Given Launch Browser
And launch url in a browser
When Wait for username with "name" and "username"
And Enter username with "name" and "username" and "admin"
And Enter password with "id" and "password" and "master"
And click login with "name" and "btnsubmit"
And Wait for logout link with "xpath" and "(//a[text()=' Logout'])[2]"
And Verify page title with "Dashboard « Stock Accounting"
And Wait for suppliiers link with "xpath" and "(//a[contains(text(),'Suppliers')])[2]"
And Click Suppliers link with "xpath" and "(//a[contains(text(),'Suppliers')])[2]"
And Wait for Add Icon with "xpath" and "(//span[@data-caption='Add'])[1]"
And Click Add icon with "xpath" and "(//span[@data-caption='Add'])[1]"
And Wait for Supplier Number with "name" and "x_Supplier_Number"
And Captrure Supplier number with "name" and "x_Supplier_Number"
When Enter in "<SupplierName>" with "id" and "x_Supplier_Name"
When Enter in "<address>" with "xpath" and "//*[@id='x_Address']" 
When Enter in "<city>" with "xpath" and "//*[@id='x_City']" 
When Enter in "<country>" with "xpath" and "//*[@id='x_Country']" 
When Enter in "<cperson>" with "xpath" and "//*[@id='x_Contact_Person']" 
When Enter in "<pnumber>" with "xpath" and "//*[@id='x_Phone_Number']" 
When Enter in "<mail>" with "xpath" and "//*[@id='x__Email']" 
When Enter in "<mnumber>" with "xpath" and "//*[@id='x_Mobile_Number']" 
When Enter in "<note>" with "xpath" and "//*[@id='x_Notes']"  
When Click Add button with "id" and "btnAction"
When Wait for confirm ok with "xpath" and "//button[normalize-space()='OK!']"
When click confirm ok button with "xpath" and "//button[normalize-space()='OK!']"
When Wait for alert ok with "xpath" and "(//button[contains(text(),'OK')])[6]"
When ClickAlert ok with "xpath" and "(//button[contains(text(),'OK')])[6]"
Then Verify supplier number
When Close app browser
Examples:
|SupplierName|address|city|country|cperson|pnumber|mail|mnumber|note|
|firstakhi1|kkpalli|Ameerpet1|India|Qedge1|765432123|test@gmail.com|987654321|iam new supplier1|
|firstakhi2|kkpalli3|Ameerpet41|India|Qedge1|765432123|test@gmail.com|987654321|iam new supplier1|
|firstakhi561|kkpalli|Ameerpet31|India|Qedge1|765432123|test@gmail.com|987654321|iam new supplier1|
|firstakhi21|kkpalli3|Ameerpet1|India|Qedge1|765432123|test@gmail.com|987654321|iam new supplier1|
|firstakhi12|kkpalli7|Ameerpet1|India|Qedge1|765432123|test@gmail.com|987654321|iam new supplier1|
@customers
Scenario Outline: validate customer Module
Given Launch Browser
And launch url in a browser
When Wait for username with "name" and "username"
And Enter username with "name" and "username" and "admin"
And Enter password with "id" and "password" and "master"
And click login with "name" and "btnsubmit"
And Wait for logout link with "xpath" and "(//a[text()=' Logout'])[2]"
And Verify page title with "Dashboard « Stock Accounting"
And Wait for customers link with "xpath" and "(//a[contains(text(),'Customers')])[2]"
And Click customers link with "xpath" and "(//a[contains(text(),'Customers')])[2]"
And Wait for Add Icon with "xpath" and "(//span[@data-caption='Add'])[1]"
And Click Add icon with "xpath" and "(//span[@data-caption='Add'])[1]"
And Wait for cutomer Number with "name" and "x_Customer_Number"
And Captrure customer number with "name" and "x_Customer_Number"
When Enter in "<CustomerName>" with "id" and "x_Customer_Name"
When Enter in "<address>" with "xpath" and "//*[@id='x_Address']" 
When Enter in "<city>" with "xpath" and "//*[@id='x_City']" 
When Enter in "<country>" with "xpath" and "//*[@id='x_Country']" 
When Enter in "<cperson>" with "xpath" and "//*[@id='x_Contact_Person']" 
When Enter in "<pnumber>" with "xpath" and "//*[@id='x_Phone_Number']" 
When Enter in "<mail>" with "xpath" and "//*[@id='x__Email']" 
When Enter in "<mnumber>" with "xpath" and "//*[@id='x_Mobile_Number']" 
When Enter in "<note>" with "xpath" and "//*[@id='x_Notes']"  
When Click Add button with "id" and "btnAction"
When Wait for confirm ok with "xpath" and "//button[normalize-space()='OK!']"
When click confirm ok button with "xpath" and "//button[normalize-space()='OK!']"
When Wait for alert ok with "xpath" and "(//button[contains(text(),'OK')])[6]"
When ClickAlert ok with "xpath" and "(//button[contains(text(),'OK')])[6]"
Then Verify customer number
When Close app browser
Examples:
|CustomerName|address|city|country|cperson|pnumber|mail|mnumber|note|
|firstakhi561|kkpalli|Ameerpet1|India|Qedge1|765432123|test@gmail.com|987654321|iam new customer1|
|firstakhi245|kkpalli3|Ameerpet41|India|Qedge1|765432123|test@gmail.com|987654321|iam new customer21|
|firstakhi54561|kkpalli|Ameerpet31|India|Qedge1|765432123|test@gmail.com|987654321|iam new customer21|
|firstakhi2123|kkpalli3|Ameerpet1|India|Qedge1|765432123|test@gmail.com|987654321|iam new customer21|
|firstakhi1452|kkpalli7|Ameerpet1|India|Qedge1|765432123|test@gmail.com|987654321|iam new customer41|

