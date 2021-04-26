# Projeto-Ecommerce

### Ferramentar necessárias:

* Java
* Docker
* Apache Kafka
* Zookeeper
* Apache Avro
* Spring boot
* Spring Cloud
* Postgresql
* Postman

## O projeto

### O projeto tem como proposta a construção de uma solução e-commerce com o uso de microsserviços e aplicar a integração entre eles orientada a eventos com Kafka. Para ser possível construir este 
projeto é necessário todas as ferramentas listadas acima.

### Frontend

* Possui um front-end estático com formulário de preenchimento para acessar a api.

### Checkout

* Responsável por receber a requisição de pagamento, armazenar e informar a parte que irá processar o pagamento.

### Payment

* Irá receber os dados de pagamento, processar e retornar uma mensagem independente do resultado do processamento.

## Criar o container docker

`` 
cd ecommerce-checkout-api/docker
`` 

``
docker-compose up --build -d
``

 ### Com o uso do Postman é possível realizar a documentação do projeto.
