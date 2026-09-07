# E-Commerce Microservices Platform Architecture

## Overview

This project follows a Microservices Architecture.

Each microservice will be independently developed, built, containerized, and deployed.

## Planned Microservices

### User Service
Responsible for:

- User registration
- User authentication
- User profile management

### Product Service
Responsible for:

- Product management
- Product catalog
- Product inventory

### Order Service
Responsible for:

- Order creation
- Order management
- Order status tracking

### Payment Service
Responsible for:

- Payment processing
- Payment status management

### Notification Service
Responsible for:

- Email notifications
- Order notifications
- Event-based notifications

## High-Level Architecture

```text
Client
   |
   v
API Gateway
   |
   +------------------+------------------+
   |                  |                  |
   v                  v                  v
User Service     Product Service    Order Service
                                         |
                                         v
                                   Payment Service
                                         |
                                         v
                                Notification Service


---

# 🧠 Why Are We Creating This?

This document gives us a **starting architecture**, but it is not final.
As we build the project, we will improve it.
For example, later we may add:
```
# Deployment Strategy

Each microservice will have:
* Independent Spring Boot application
* Independent Docker image
* Independent Kubernetes Deployment
* Independent Kubernetes Service

# Repository Strategy
* We are using a Monorepo.
* One Git repository contains multiple independent microservices.
* However, each microservice can be independently built and deployed.

# Future Infrastructure
  The platform will later include:
* Jenkins CI/CD
* Docker
* SonarQube
* Kubernetes
* AWS EKS
* AWS ECR


