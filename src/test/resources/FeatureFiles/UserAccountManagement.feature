Feature: UserAccountManagement

  Scenario Outline: Add a new user with valid information
    When a sign-up request is sent for a new user with name <name>, email <email>, and password <password>
    Then the new user with email <email> is successfully registered and appears in the user list
    Examples:
      | name    | email                  | password |
      |   Arwa  |   Arwa@gmail.com          | god     |
      | Yasmine | Yasmineee@yahoo.fr       | iilmk    |
      | Hachem  | Hachemmmm.cd@gmail.com    | klkmgod  |

  Scenario Outline: Add a new user with invalid information
    When a sign-up request is sent for a new user with username <userName>, email <userEmail>, and Password<userPassword>
    Then the sign-up should be rejected due to the uniqueness constraint of the name, email and id combination
    Examples:
      | userName  | userEmail            | userPassword |
      | Arwa      | Arwa@gmail.com       | god          |

  Scenario Outline: Verify the uniqueness of the email field
    Given A user with email <email> already exists
    When a new user attempts to sign up with the same email <email>
    Then the sign-up should be rejected due to the uniqueness constraint of the email attribute
    Examples:
      | email           |
      | Arwa@gmail.com  |

  Scenario Outline: Verify the uniqueness of the password field
    Given A user with password <password> already exists
    When a new user attempts to sign up with the same password <password>
    Then the sign-up should be rejected due to the uniqueness constraint of the password attribute
    Examples:
      | password |
      | god      |

  Scenario Outline: Update a User's email
    Given A user with email <OldEmail> already exists
    When the user updates their email to a new one <NewEmail>
    Then the update should be successfully completed
    Examples:
      | OldEmail             | NewEmail                  |
      | Hachem.cd@gmail.com  | Hachem.cd@enicar.ucar.tn |

  Scenario Outline: Update a User's password
    Given A user with email <Email> already exists
    When the user updates their password to a new one <NewPassword>
    Then the update should be successfully completed
    Examples:
      | Email              | NewPassword |
      | Yasmine@yahoo.fr   | iilmk       |
