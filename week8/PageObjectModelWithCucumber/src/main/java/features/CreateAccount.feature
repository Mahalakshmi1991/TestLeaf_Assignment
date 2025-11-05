Feature: Create account for leaftaps application

Scenario: Create account with multiple datas

Given Enter the username as 'Demosalesmanager'
And Enter the password as 'crmsfa'
When Click on the Login button
Then It should navigate to the next page
When Click on the Crmsfa link
And Click on the Account link
And Clik on the Create Account link
Given Enter the AccountName as <AccountName>
When Select the country 
When Click on the Create Account button
