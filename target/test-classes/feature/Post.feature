Feature: API testing for Jsonplaceholder Posts

Scenario: Getting whole list of Posts 
Given API is available
When user sends the request for all Post using GET
Then status code is 200

Scenario: Getting a single Post using id
Given API is available
When user sends the request using id  "1" and "GET" http method
Then status code is 200

Scenario: Updating a Post
Given API is available
When user sends the request to update a Post using id 1 and PUT http method
Then status code is 200

 Scenario Outline: Adding Post
  Given API is available
  When user sends a POST request to add a Post with title <title> and body <body>
  Then status code is 201

  Examples:
    | title            | body                        |
    | "First post"      | "This is the first post"    |
    | "Second post"     | "This is another post"      |
    
    
Scenario: Deleting a Post using id
Given API is available
When user sends the request using id  "1" and "delete" http method
Then status code is 200