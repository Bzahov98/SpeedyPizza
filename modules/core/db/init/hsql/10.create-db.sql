-- begin SPEEDYPIZZA_ORDER
create table SPEEDYPIZZA_ORDER (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    FINAL_PAY_PRICE double precision,
    TOTAL_PRICE decimal(19, 2) not null,
    DISCOUNT integer,
    DISH_COUNT integer,
    CUSTOMER_ID varchar(36) not null,
    DATE_ timestamp not null,
    VAT integer,
    EMPLOYER_ID varchar(36),
    --
    primary key (ID)
)^
-- end SPEEDYPIZZA_ORDER
-- begin SPEEDYPIZZA_CUSTOMER
create table SPEEDYPIZZA_CUSTOMER (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    USER_ID varchar(36) not null,
    CITY varchar(255),
    PHONE varchar(10),
    ADRESS varchar(255),
    ORDERS_COUNT integer,
    --
    primary key (ID)
)^
-- end SPEEDYPIZZA_CUSTOMER
-- begin SPEEDYPIZZA_DISH
create table SPEEDYPIZZA_DISH (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    NAME varchar(255),
    PRICE decimal(19, 2) not null,
    TYPE_ integer not null,
    ORDER_ID varchar(36),
    --
    primary key (ID)
)^
-- end SPEEDYPIZZA_DISH
-- begin SPEEDYPIZZA_DELIVERY
create table SPEEDYPIZZA_DELIVERY (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    INSTRUCTIONS varchar(255) not null,
    ARRIVAL_TIME timestamp,
    DELIVERY_ADRESS varchar(255),
    CITY varchar(255),
    EMPLOYER_ID varchar(36),
    ORDER_ID varchar(36),
    IS_SUCCESSFUL boolean,
    --
    primary key (ID)
)^
-- end SPEEDYPIZZA_DELIVERY
-- begin SPEEDYPIZZA_EMPLOYER
create table SPEEDYPIZZA_EMPLOYER (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    USER_ID varchar(36),
    --
    primary key (ID)
)^
-- end SPEEDYPIZZA_EMPLOYER
-- begin SPEEDYPIZZA_PRODUCTS
create table SPEEDYPIZZA_PRODUCTS (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    NAME varchar(255) not null,
    AMOUNT double precision,
    METRIC_SYSTEM_UNIT varchar(255),
    --
    primary key (ID)
)^
-- end SPEEDYPIZZA_PRODUCTS
-- begin SPEEDYPIZZA_DISH_PRODUCTS_LINK
create table SPEEDYPIZZA_DISH_PRODUCTS_LINK (
    PRODUCTS_ID varchar(36) not null,
    DISH_ID varchar(36) not null,
    primary key (PRODUCTS_ID, DISH_ID)
)^
-- end SPEEDYPIZZA_DISH_PRODUCTS_LINK
