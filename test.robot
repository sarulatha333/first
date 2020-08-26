*** Settings ***
Library    SeleniumLibrary
Library    OperatingSystem

*** Test Cases ***
Alphabets Argument Testcase
    [Tags]    test-args
    Check Args  
    check
    Check List Args

*** Keywords ***
Check Args
    Log    'INSIDE Keyword'

Check List Args
	Log    'INSIDE Keyword 2'
