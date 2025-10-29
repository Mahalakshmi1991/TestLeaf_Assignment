Feature: Create Lead function of Leaftaps application


Scenario Outline: Create Lead with multiple data

And Enter the username as 'Demosalesmanager'
And Enter the password as 'crmsfa'
When Click on the Login button
Then It should navigate to the next page
When Click on the Crmsfa link
And Click on the Leads link
And Clik on the Create Lead link
Given Enter the companyname as <company>
And Enter the firstname as <first>
And Enter the lastname as <last>
When Click on the Create Lead button
Then Lead should be created

Examples:
|company|first|last|
|Testleaf|Vineeth|Rajendran|
|Qeagle|Hari|Radhakrishnan|