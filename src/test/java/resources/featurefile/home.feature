Feature: Jobsearch Test

  Scenario Outline: : Verify Job Search Result Using Different DataSet
    Given I am On Home Page
    When I Accept Coockies all
    And I enter "<Job Title>"
    And I enter location "<Location>"
    And I select "<Distance>"
    And I click on more Search option lick
    And I enter Min.Salary "<Salary Min>"
    And I enter Max.Salary "<Salary Max>"
    And I select SalaryType "<Salary Type>"
    And I select JobType "<Job Type>"
    And I click on FindJobs Button
    Then I should see the "<Result Text>"


    Examples:
      | Job Title | Location | Distance  | Salary Min | Salary Max | Salary Type | Job Type       | Result Text                                 |
      | Tester    | Harrow   | 5 miles   | 30000      | 500000     | Per annum   | Permanent      | Permanent Tester jobs in Harrow on the Hill |
      | Tester    | Reading  | 1 mile    | 2000       | 5000       | Per month   | Contract       | Contract Tester jobs in Reading             |
      | Tester    | Ealing   | 10 miles  | 100        | 500        | Per day     | Part Time      | Part Time Tester jobs in Ealing             |
      | Tester    | Stanmore | 2 miles   | 35         | 55         | Per hour    | Temporary      | Temporary Tester jobs in Stanmore           |
      | Tester    | Pinner   | 25 miles  | 25000      | 900000     | Per annum   | Apprenticeship | Apprenticeship Tester jobs in Pinner        |
      | Tester    | Finchley | 7 miles   | 55000      | 65000      | Per annum   | Permanent      | Permanent Tester jobs in Finchley           |
      | Tester    | London   | 750 miles | 32000      | 70000      | Per annum   | Temporary      | Temporary Tester jobs in London             |



