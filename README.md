# ☁️ Cloud-Native TaskFlow

### Unified Project Management & Platform Engineering Platform

Cloud-Native TaskFlow is a cloud-native platform combining **software project management, developer self-service, infrastructure automation, deployment management, and observability** in a unified experience.

The goal is to connect software development workflows with the infrastructure and operational capabilities required to build, deploy, and operate modern applications.

---

## 🎯 Vision

Cloud-Native TaskFlow brings together two complementary domains:

- **Project Management:** Manage software projects, teams, tasks, priorities, and delivery progress.
- **Platform Engineering:** Provide developers with self-service capabilities to provision environments, automate infrastructure operations, deploy applications, and monitor their health.

The platform aims to improve Developer Experience (DevEx), infrastructure automation, and operational visibility.

## 🧩 Main Modules

### 1. Workspace — Project Management

A collaborative workspace for software development teams.

Planned capabilities:

- User and team management.
- Project creation and lifecycle management.
- Task management and Kanban boards.
- Priorities, deadlines, and assignments.
- Comments and activity history.
- Project progress and workload analytics.
- Git repository association.

### 2. Platform Hub — Developer Self-Service

An internal developer platform providing self-service infrastructure and automation capabilities.

Planned capabilities:

**Service Catalog**
- Request development and testing environments.
- Provision PostgreSQL databases.
- Request Kubernetes namespaces.
- Create application environments from reusable templates.

**Infrastructure Automation**
- Infrastructure provisioning with Terraform.
- Configuration management with Ansible.
- Automated operational procedures.
- Execution history and logs.
- Controlled automation workflows.

**Kubernetes Management**
- Cluster and namespace visibility.
- Workload monitoring.
- Deployment and resource status.
- Local Kubernetes and Google Kubernetes Engine (GKE) support.

**Deployment Center**
- Application deployment workflows.
- Helm chart management.
- Argo CD integration.
- Deployment history and version tracking.
- GitOps synchronization status.

### 3. Operations Center — Observability & SRE

A centralized operational interface for applications and infrastructure.

Planned capabilities:

- Application and cluster health.
- CPU and memory metrics.
- Latency and error rates.
- Centralized logs and distributed traces.
- Incident and alert management.
- Deployment and incident correlation.
- Grafana dashboard integration.

---

## 🏗️ Architecture

The target architecture is organized around independent business and platform domains.

```text
                 Angular Frontend
                        |
              API Gateway
                        |
       +----------------+----------------+
       |                |                |
   Workspace        Platform Hub    Operations Center
       |                |                |
   User Service     Platform Service  Observability
   Project Service  Automation Service   Service
   Task Service     Deployment Service
   Analytics
       |                |
       +--------+-------+
                |
           PostgreSQL
                |
       Automation Workers
          /          \
     Terraform      Ansible
                       |
                 Infrastructure
                       |
              Kubernetes / GKE
                       |
                Helm / Argo CD
```

The architecture will evolve progressively. Services will be introduced when justified by functional and technical requirements.

---

## 🛠️ Technology Stack

| Domain | Technologies |
|---|---|
| Frontend | Angular, TypeScript |
| Backend | Java 21, Spring Boot, Maven |
| API | REST, OpenAPI |
| Database | PostgreSQL 17 |
| Database Migrations | Flyway |
| Security | Spring Security, JWT |
| Containers | Docker, Docker Compose |
| Infrastructure as Code | Terraform |
| Configuration Management | Ansible |
| Orchestration | Kubernetes |
| Local Kubernetes | Kind / Minikube |
| Cloud | Google Cloud Platform, GKE |
| Packaging | Helm |
| GitOps | Argo CD |
| CI/CD | GitHub Actions |
| Code Quality | SonarQube |
| Security Scanning | Trivy |
| Container Registry | GitHub Container Registry |
| Metrics | Prometheus |
| Dashboards | Grafana |
| Logs | Loki |
| Distributed Tracing | OpenTelemetry |
| Alerting | Alertmanager |

---

## 🔄 Reference Workflow

The main end-to-end scenario is the creation and deployment of an application environment.

1. A developer creates a project in Workspace.
2. The developer associates a Git repository.
3. An environment is requested through Platform Hub.
4. The backend validates permissions and resource quotas.
5. Terraform provisions the required infrastructure.
6. Ansible performs the required system configuration.
7. Kubernetes resources are prepared.
8. Helm and Argo CD deploy the application.
9. Prometheus, Grafana, Loki, and OpenTelemetry provide operational visibility.
10. Deployment results, logs, and incidents are available through the platform.

---

## 🔐 Security & Governance

Security is a core architectural concern.

Planned controls:

- Authentication and authorization.
- Role-Based Access Control (RBAC).
- Least-privilege infrastructure access.
- Secure secrets management.
- Isolated automation workers.
- Controlled infrastructure operations.
- Execution audit logs.
- Container and dependency vulnerability scanning.
- Resource quotas and environment isolation.

---

## 🚀 Development Roadmap

Development follows an incremental approach.

| Phase | Scope | Status |
|---|---|---|
| 1 | User Service and PostgreSQL foundation | In progress |
| 2 | Project Service and Task Service | Planned |
| 3 | API Gateway and application security | Planned |
| 4 | Angular Workspace | Planned |
| 5 | Platform Hub and Service Catalog | Planned |
| 6 | Terraform and Ansible automation | Planned |
| 7 | Kubernetes and Helm | Planned |
| 8 | Argo CD and GitOps | Planned |
| 9 | CI/CD and DevSecOps | Planned |
| 10 | Observability and Operations Center | Planned |
| 11 | GKE deployment | Planned |
| 12 | AI-assisted operations | Future |

### Current Implementation

The initial development focuses on the User Service.

Implemented or developed so far:

- Spring Boot application foundation.
- PostgreSQL integration.
- User entity and repository.
- User CRUD REST endpoints.
- Request and response DTOs.
- Input validation.
- Global exception handling.
- Duplicate email handling.
- User not-found handling.
- Automated test foundation.

Database migrations, Docker integration, and the remaining platform capabilities are being progressively implemented and validated.

---

## 🧠 Future AI Capabilities

The architecture will be prepared for a future AI Assistant.

Potential capabilities:

- Incident summarization.
- Deployment failure analysis.
- Log explanation.
- Troubleshooting recommendations.
- Infrastructure automation summaries.
- Project risk analysis.
- Operational recommendations.

AI-driven actions will require appropriate permissions and human approval for sensitive operations.

---

## 📌 Engineering Principles

- Preserve and evolve existing code.
- Prefer working end-to-end features over isolated demonstrations.
- Avoid unnecessary microservices and infrastructure complexity.
- Use Infrastructure as Code.
- Apply GitOps principles.
- Secure automation and infrastructure access.
- Keep services independently maintainable.
- Test complete features.
- Document architectural decisions.
- Separate local, staging, and production configurations.

---

## 🎓 Project Objectives

Cloud-Native TaskFlow is designed as a practical engineering project to explore and demonstrate:

- Software Engineering and distributed systems.
- Platform Engineering and Developer Experience.
- Infrastructure as Code and Configuration Management.
- Kubernetes and Cloud Engineering.
- GitOps and CI/CD.
- DevSecOps.
- Observability and Site Reliability Engineering.

**Cloud-Native TaskFlow — From Project Management to Production Operations.**
