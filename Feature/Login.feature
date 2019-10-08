@FuntionalTests
Feature: Login to Gmail

#Background: 
#Given Value is 3
#Then Value is 9

#Scenario Outline: Count Cube of 3 
#Given Parameter is <Value>
#When enter value in Calculator and Press ENTER
#Then Value is 9
#Examples:
#|Value|
#|4|
#|5|

@First
Scenario: Count Cube of 3 - FirstScenario 
Given Value is 3
When enter value in Calculator and Press ENTER
Then Value is 9


@First
Scenario: Count Cube of 3 - SecondScenario
Given Value is 4
#When enter value in Calculator and Press ENTER
Then Value is 9