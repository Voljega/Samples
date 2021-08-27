# ReduxSpringBootH2

frontend: Redux with React Hooks
backend: Sprint Boot
DB: H2 (in memory)

run backend with `mvn spring-boot:run`
access h2 db through UI `http://localhost:8080/h2-ui` with `JDBC_URL`: `http://localhost:8080/h2-ui`
create sample record with `curl -X POST http://localhost:8080/api/tutorials -H 'Content-Type: application/json' -d '{"title": "tuto example", "description": "this is an example"}'`
access backend/api on `http://localhost:8080/api/tutorials`
launch frontend with `npm run start`
access backend on `http://localhost:8081/`

