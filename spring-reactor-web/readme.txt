We can call this service as follows
Use the spring-reactor-client project or call the below services using post man or any rest client

To get one product
Http method GET
http://localhost:8080/getProduct
Response
{
"name": "Phone",
"description": "Nokia3310",
"price": "2000",
"yearOfManufacturing": "2019"
}

to get all products
http://localhost:8080/getAllProducts
Response

[
{
"name": "Phone",
"description": "Nokia3310",
"price": "2000",
"yearOfManufacturing": "2019"
},
{
"name": "Phone",
"description": "Motorola",
"price": "2000",
"yearOfManufacturing": "2019"
},
{
"name": "Phone",
"description": "samsung",
"price": "2000",
"yearOfManufacturing": "2019"
},
{
"name": "Phone",
"description": "LG",
"price": "2000",
"yearOfManufacturing": "2019"
}
]
