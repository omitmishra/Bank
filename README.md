
A Backned Application wchih does tranfer money from one account to Another 







Changes the configuration of MYSQL according to local setup in application.properties

Run the spring Application

create two Account using json below http://localhost:8080/createAccount

{ "currentBalance": 100, "ownerName": "ravi" }

transfer the Amount http://localhost:8080/transfermoney

{

"sourceAccountId": 1,
"targetAccountId": 2,
"targetOwnerName": "don",
"amount":10
}
