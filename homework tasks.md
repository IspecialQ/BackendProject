# BackendProject

Протестировать CRUD операции для сервиса - https://minimarket1.herokuapp.com/market/swagger-ui.html через базу данных
То есть создаем продукт через сервис, смотрим, что продукт с ИД появился в базе данных
Кейс - создать продукт через POST /api/v1/products, найти созданный продукт в БД (mybatis), удалить продукт из БД (mybatis), проверить через GET /api/v1/products/{id} на 404 ошибку

Test CRUD operations for service - https://minimarket1.herokuapp.com/market/swagger-ui.html via database
That is, we create a product through the service, we see that the product with the ID appeared in the database
Case - create a product via POST /api/v1/products, find the created product in the database (mybatis), delete the product from the database (mybatis), check for a 404 error via GET /api/v1/products/{id}
