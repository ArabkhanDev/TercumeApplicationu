# Library

A Spring Boot application with Docker integration.

## Table of Contents

- [Project Overview](#project-overview)
- [Prerequisites](#prerequisites)
- [Building and Running the Application](#building-and-running-the-application)
  - [Building the Application](#building-the-application)
  - [Running the Application Locally](#running-the-application-locally)
  - [Building and Pushing Docker Image](#building-and-pushing-docker-image)
  - [Deploying with Docker Compose](#deploying-with-docker-compose)
- [Dependencies](#dependencies)
- [Configuration](#configuration)
- [License](#license)

## Project Overview

This project is a Spring Boot application that uses various Spring Boot starters for data access, web, and security functionalities. It also integrates with Docker for containerization and deployment.

## Prerequisites

- Java 17
- Spring Boot
- Spring Security
- Docker
- Docker Compose
- Git
- Liquibase
- JUnit 5

## Building and Running the Application

### Building the Application

To build the application, run:

```sh
./gradlew clean build

docker-compose up -d

./gradlew bootRun


