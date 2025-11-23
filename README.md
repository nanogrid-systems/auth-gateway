# auth-gateway

This is the **auth-gateway** microservice, part of the **nanogrid-systems** organization.

## Technology Stack

- **Type**: Java/Spring Boot Microservice
- **Framework**: Spring Boot 3.2.0, WebFlux
- **Language**: Java 17

## Overview

This service is part of the Rippler demo ecosystem for impact propagation testing and dependency analysis.

## Service Configuration

See `.rippler/service.yaml` for service metadata and dependencies.

## Development

### Building the Java Service

```bash
mvn clean install
mvn spring-boot:run
```

### Running Tests

```bash
mvn test
```

## API Endpoints

- `GET /auth-gateway/{id}` - Get resource by ID

## Dependencies

This service's dependencies are defined in the Rippler configuration and will be used for impact propagation analysis.

---

*Bootstrapped by: bootstrap_all_orgs.sh*
*Generated: 2025-11-24*
