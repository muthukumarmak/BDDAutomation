Feature: Verify Login page Content

@iPhone
Scenario: Verify Login Page Content
Given I launch the iPhone app
Then I Wait for Page to Load
Then I tap on Identifier "companyId"
Then I enter "xxxxxxx" in Identifier "companyId"
Then I Wait for Page to Load
Then I tap on Identifier "userName"
Then I enter "xxxxxxx" in Identifier "userName"
Then I Wait for Page to Load
Then I tap on Identifier "password"
Then I enter "xxxxxxx" in Identifier "password"
Then I Wait for Page to Load
Then I tap on Identifier "SignIn"
Then I Wait for Page to Load
Then I Wait for Page to Load
Then I Wait for Page to Load
Then I Wait for Page to Load
Then I tap on Identifier "OK"
Then I Wait for Page to Load
Then I assert for the Element "companyId"
Then I assert for the Element "userName"
Then I assert for the Element "password"
Then I assert for the Element "rememberMeToggleBtn"
Then I assert for the Element "SignIn"
Then I assert for the Element "contactusBtn"
Then I assert for the Element "locationBtn"
Then I Wait for Page to Load
Then I tap on Identifier "companyId"
Then I Clear the text in the Identifier "companyId"
Then I enter "ymedialabs" in Identifier "companyId"
Then I tap on Identifier "userName"
Then I Clear the text in the Identifier "userName"
Then I enter "ymluser4" in Identifier "userName"
Then I tap on Identifier "password"
Then I Clear the text in the Identifier "password"
Then I enter "ymltest@321" in Identifier "password"
Then I tap on Identifier "SignIn"
Then I Wait for Page to Load
Then I Wait for Page to Load
Then I Wait for Page to Load
Then I Wait for Page to Load