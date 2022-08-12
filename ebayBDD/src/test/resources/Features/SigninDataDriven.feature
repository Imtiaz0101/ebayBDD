Feature: Sign in data driven test

  @chrome
  Scenario Outline: Sign in with invalid credentials
    Given user is on ebay sign in page
    When user input invalid  email address <email>
    And user click continue
    And user input invalid password <password>
    And user click sign in button
    Then user see error messege <messege>

    Examples: 
      | email                 | password      | messege                     |
      | sifat0101@gmail.com   | Admin12345698 | "Oops, that's not a match." |
      | sifat010101@gmail.com |               | "Oops, that's not a match." |
      | sifat01@gmail.com     |               | "Oops, that's not a match." |
