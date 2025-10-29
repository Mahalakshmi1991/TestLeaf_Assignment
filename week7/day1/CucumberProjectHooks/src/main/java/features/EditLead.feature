Feature: Edit Lead functionality of leaftap application

Scenario Outline: Edit Lead with multiple data
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
When Click on the Edit button
Given Enter the Company Name as <CompanyName>
When Click on the Update button
Then Verify the view lead page

Examples:
|PhoneNumber||CompanyName|
|'99'||'CTS'|
