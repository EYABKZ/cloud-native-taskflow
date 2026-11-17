
# Cloud-Native TaskFlow — Architecture

## 1. Project Overview

Cloud-Native TaskFlow is a task and project management platform
built with a microservices architecture.

## 2. Architecture

The platform consists of:

- Angular frontend
- Spring Cloud API Gateway
- User Service
- Project Service
- Task Service
- PostgreSQL databases

## 3. Technology Stack

| Component | Technology |
|---|---|
| Frontend | Angular |
| Backend | Java / Spring Boot |
| API Gateway | Spring Cloud Gateway |
| Database | PostgreSQL |
| Authentication | Spring Security / JWT |
| Containerization | Docker |
| Orchestration | Kubernetes |
| CI/CD | GitHub Actions |
| GitOps | Argo CD |
| Monitoring | Prometheus / Grafana |
| Infrastructure as Code | Terraform |

## 4. Microservices Responsibilities

### User Service
- User registration
- User management
- Authentication

### Project Service
- Project creation
- Project management
- Project ownership

### Task Service
- Task creation
- Task assignment
- Task status management

### API Gateway
- Single entry point
- Request routing
- Authentication integration

## 5. Database Strategy

Each microservice owns its data and its database.
Services must not directly access another service's database.

## 6. Deployment Strategy

- Local development with Docker Compose
- Container orchestration with Kubernetes
- Infrastructure provisioning with Terraform
- GitOps deployment with Argo CD

## 7. Observability

Prometheus and Grafana will be used for metrics,
dashboards and monitoring.
