Feature:user registration
Scenario:User should be able to register with valid  credentials
Given I am on the registration page
When i enter username,email & password
And i click on register button
Then i should be landed on the Dashboard page