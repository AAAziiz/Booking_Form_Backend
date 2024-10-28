CREATE USER IF NOT EXISTS 'root'@'%' IDENTIFIED BY 'test';
CREATE DATABASE IF NOT EXISTS codsoft;
USE codsoft;
create table users
(
    card_id  bigint       null,
    id       bigint auto_increment
        primary key,
    email    varchar(255) null,
    name     varchar(255) null,
    password varchar(255) null,
    constraint UK_qvssa6h1me5k6ohvd67jexrh8
        unique (card_id),
    constraint UKe67ryb8s35ckhfnb17qe4wlgp
        unique (id, name, email),
    constraint FKrxplbc3h7tax4h43tfg5qgc1l
        foreign key (card_id) references cards (id)
);
create table hotels
(
    adults       int          null,
    children     int          null,
    rooms        int          null,
    star_rating  int          null,
    id           bigint auto_increment
        primary key,
    arrival_date varchar(255) null,
    destination  varchar(255) null,
    hotel_type   varchar(255) null,
    leave_date   varchar(255) null
);
create table flights
(
    add_nearby_airports_from bit          null,
    add_nearby_airports_to   bit          null,
    adults                   int          null,
    children                 int          null,
    direct_flight            bit          null,
    id                       bigint auto_increment
        primary key,
    departure_date           varchar(255) null,
    flight_type              varchar(255) null,
    fromcity                 varchar(255) null,
    return_date              varchar(255) null,
    tocity                   varchar(255) null,
    travel_class             varchar(255) null
);

create table cars
(
    location_return bit          null,
    id              bigint auto_increment
        primary key,
    awd             varchar(255) null,
    carclass        varchar(255) null,
    cartype         varchar(255) null,
    drop_date       varchar(255) null,
    passengers      varchar(255) null,
    pick_date       varchar(255) null
);

create table cards
(
    id          bigint auto_increment
        primary key,
    card_cvc    varchar(255) null,
    card_number varchar(255) null,
    month_expir varchar(255) null,
    year_expir  varchar(255) null
);