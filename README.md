# Course Management API

This project implements a RESTful API for managing courses using Spring Boot.

## Endpoints

### Home
- **GET** `/home`
  - Returns a welcome message

### Courses

#### Get All Courses
- **GET** `/courses`
  - Retrieves a list of all courses

#### Get Single Course
- **GET** `/courses/{courseId}`
  - Retrieves a specific course by its ID

#### Add New Course
- **POST** `/courses`
  - Adds a new course
  - Requires a Course object in the request body

#### Update Course
- **PUT** `/courses`
  - Updates an existing course
  - Requires a Course object in the request body

#### Delete Course
- **DELETE** `/courses/{Id}`
  - Deletes a course by its ID

## Technologies Used
- Java
- Spring Boot
- Spring Web
