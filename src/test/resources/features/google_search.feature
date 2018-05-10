Feature: Google Search
@runThis
Scenario Outline: Google searching verification
When user goes to "google.com"
Then user searches for "<data>"
And user should see same keyword in the result

Examples:
|data|
|spoon|
|iphone|
|apple|