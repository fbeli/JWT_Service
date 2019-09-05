# JWT_Service

Chamar o serviço 
http://localhost:8080/authenticate
com o body
{"username":"javainuse","password":"password"}

depois de autenticado
http://localhost:8080/hello
colocar no header:
"authorization": "Bearer eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJqYXZhaW51c2UiLCJleHAiOjE1Njc2NDc2OTUsImlhdCI6MTU2NzYyOTY5NX0.nhvmqIboyF6WF01eFUlV8T0js7tZdBndOLv9xy3YwgksUAbRLwk5t5Rv08Kde2dZq146ZH4BeaH7-rnsM9y66g"