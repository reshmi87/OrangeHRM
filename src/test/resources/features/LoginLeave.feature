@Login
Feature: Login to leave application and apply leave

@Sanity
Scenario: Login and navigate to leave page
Given user is login to Orange HRM application with "Admin" and "admin123"
When user navigates to Leave meanu in Orange HRM application
And user clicks apply link in leave screen of Orange HRM application
Then user should able to view Apply Leave screen in Orange HRM application