Feature: login to Salesforce application and create Account

Scenario: Login with valid credentials
Given Launch the browser
And Load the url
And Enter the Username as 'mahalakshmikaveri990@agentforce.com'
And Enter the Password as 'Maha@2019' 
When Click on the log in button
And Click on the toggle icon from the left corner
And Click on the View All link
And Click on the Sales app
And Click on the account tab
And Click on the New Account
Given Enter the Account Name as 'Mahalakshmi'   
And Select the Ownership as Public 
When Click on the Save button
Then Verify the Account name as 'Mahalakshmi'
