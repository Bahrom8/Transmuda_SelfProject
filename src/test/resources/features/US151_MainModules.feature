@wip_bakhrom3
Feature: Access to Main Modules
  As a user
  I should be able to access all the main modules of the app
  So that I can navigate to the correct sections based on my role


  Scenario Outline: Store and Sales Managers should see 8 modules
    Given user is on the login page
    When the user logged in as "<userType>"
    When the user views the main modules
    Then the user should see "8" modules
    Then the user should see the following modules
      | Dashboards         |
      | Fleet              |
      | Customers          |
      | Sales              |
      | Activities         |
      | Marketing          |
      | Reports & Segments |
      | System             |
    Examples:
      | userType      |
      | sales manager |
      | store manager |


  @driver
  Scenario: Drivers should see 4 modules
    Given user is on the login page
    When the user logged in as "driver"
    When the user views the main modules
    When the user should see "4" modules
    Then the user should see the following modules
      | Fleet      |
      | Customers  |
      | Activities |
      | System     |
