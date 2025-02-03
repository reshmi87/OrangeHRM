@Login2
Feature: Again-Login to leave application and apply leave

@Sanity2
Scenario: Again-Login and navigate to leave page
Given Again-user is login to Orange HRM application with "Admin" and "admin123"
When Again-user navigates to Leave meanu in Orange HRM application
And Again-user clicks apply link in leave screen of Orange HRM application
Then Again-user should able to view Apply Leave screen in Orange HRM application