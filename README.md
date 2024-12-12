This is a personal project focused on API testing using **RestAssured** for making HTTP requests and **Cucumber** for Behavior-Driven Development (BDD) testing. The project interacts with the public **JSONPlaceholder API** to perform various CRUD operations (Create, Read, Update, Delete) on the "posts" resource.

## Project Overview

This project demonstrates how to:

- Perform **GET** requests to retrieve posts.
- Perform **POST** requests to create new posts.
- Perform **PUT** requests to update existing posts.
- Perform **DELETE** requests to remove posts.
- Validate the responses using **RestAssured** assertions.
- Use **Cucumber** for running API tests with Gherkin syntax.

## Technologies Used

- **Java**: The programming language used for writing the tests.
- **RestAssured**: A powerful Java library for testing REST APIs.
- **Cucumber**: A tool for Behavior-Driven Development (BDD) that allows writing tests in plain English using Gherkin syntax.
- **JUnit**: The testing framework used to run Cucumber feature files.

## Prerequisites

Before you start, make sure you have the following installed:

- **Java 21 or higher**: Download and install Java. 
- **Maven**: A build automation tool used for managing project dependencies. 

## API Endpoints Tested

- **GET** `/posts` – Fetch all posts
- **GET** `/posts/{id}` – Fetch a post by ID
- **POST** `/posts` – Add a new post
- **PUT** `/posts/{id}` – Update an existing post
- **DELETE** `/posts/{id}` – Delete a post by ID
