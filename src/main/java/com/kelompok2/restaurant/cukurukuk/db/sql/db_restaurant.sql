-- TABLE USER
CREATE TABLE restaurant.`user` (
    id int NOT NULL AUTO_INCREMENT,
    username varchar(255) UNIQUE,
    email varchar(255) unique,
    password varchar(255),
    active boolean,
    PRIMARY KEY(id)
);

-- TABLE CATEGORY
CREATE TABLE restaurant.`category`(
    id int NOT NULL AUTO_INCREMENT,
    name varchar(255), 
    PRIMARY KEY(id)
);

-- TABLE MENU
CREATE TABLE restaurant.`menu` (
    id int NOT NULL AUTO_INCREMENT,
    name varchar(255),
    price int,
    image varchar(255),
    status boolean,
    categoryId int,
    PRIMARY KEY(id),
    FOREIGN KEY(categoryId)
    REFERENCES category(id)
);

-- TABLE ORDER
CREATE TABLE restaurant.`orders` (
    id int NOT NULL AUTO_INCREMENT,
    orderNumber varchar(255),
    qty int,
    customerName varchar(255),
    customerPhone varchar(255),
    menuId int,
    PRIMARY KEY(id),
    FOREIGN KEY(menuId)
    REFERENCES menu(id)
);

-- TABLE TABLE
CREATE TABLE restaurant.`tables` (
    id int NOT NULL AUTO_INCREMENT,
    tableNumber int,
    active boolean,
    PRIMARY KEY(id)
);

-- TABLE RESERVATION
CREATE TABLE restaurant.`reservation` (
    id int NOT NULL AUTO_INCREMENT,
    reservationDate timestamp,
    tableId int,
    PRIMARY KEY(id),
    FOREIGN KEY(tableId)
    REFERENCES tables(id)
);

-- TABLE TRANSACTION
CREATE TABLE restaurant.`transaction` (
    id int NOT NULL AUTO_INCREMENT,
    transactionDate timestamp,
    total int,
    orderId int,
    userId int,
    reservationId int,
    PRIMARY KEY(id),
    FOREIGN KEY(userId)
    REFERENCES user(id),
    FOREIGN KEY(orderId)
    REFERENCES orders(id),
    FOREIGN KEY(reservationId)
    REFERENCES reservation(id)
);