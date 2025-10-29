Feature: Delete Lead functionality of testleaf application

Scenario Outline: Delete Lead with multiple data
Given Enter the username as 'Demosalesmanager'
And Enter the password as 'crmsfa'
When Click on the Login button
Then It should navigate to the next page
When Click on the Crmsfa link
And Click on the Leads tab
And Click on the Find Leads
And Click on the Phone Menu
Given Enter the Phone number as <PhoneNumber>
When click on the Find Leads button
And Click on the first row of leaf table
And Click on the Delete button

Examples:
|PhoneNumber|
|'99'|

