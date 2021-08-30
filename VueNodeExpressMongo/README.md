# VueNodeExpressMongo

you might need to install vue with `npm install -g @vue/cli`

run mongoDB through docker with `docker run -d -p 27017:27017 --name mongo mongo`    
run server in `backend` folder with `node server.js`  
create sample record with `curl -X POST http://localhost:8080/api/tutorials -H 'Content-Type: application/json' -d '{"title": "tuto example", "description": "this is an example"}'`

access backend/api on `http://localhost:8080/api/tutorials`  

run frontend with `npm run serve`
fronted can be accessed at `http://localhost:8081/`
