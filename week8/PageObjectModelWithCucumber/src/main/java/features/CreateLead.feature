Feature: Create lead function of leaftaps application

Scenario Outline: Create lead with multiple data

Given Enter the username as 'Demosalesmanager'
Given Enter the password as 'crmsfa
When Click on the login button
Then It should navigate to next page
When Click on the Crmsfa link
And Click on the Leads link
And Click on the Create Lead link 
Given Enter the companyname as <company>
And Enter the firstname as <first>
And Enter the lastname as <last>
When Click on the Create Lead button
Then Lead should be created

Examples:
|company|first|last|
|Testleaf|Maha|Palani|
|Accenture|Maha|Palani|
