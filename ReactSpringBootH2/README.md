# ReactSpringBootH2

frontend: React  
backend: Sprint Boot  
DB: H2 (in memory)  

run backend with `mvn spring-boot:run` accessible at `http://localhost:8080/`  
start frontend in `./frontend` with `npm start` accesible at `http://localhost:3000/`  

manual client creation  
`curl -X POST http://localhost:8080/clients -H 'Content-Type: application/json' -d '{"name": "John Doe", "email": "john.doe@corp.com"}'`

  
full build:
* build the frontend with `npm run build`
* run the backend (now integrating frontend) in with `mvn spring-boot:run`
* full app is now accessible at `http://localhost:8080/`
