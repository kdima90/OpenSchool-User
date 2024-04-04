create table openschool_user.users
(
    id              uuid not null primary key,
    firstname       varchar(255) not null,
    lastname        varchar(255) not null,
    email           varchar(255) not null,
    street          varchar(255) not null,
    street_number   varchar(255) not null,
    city            varchar(255) not null,
    postal_code     varchar(255) not null,
    federal_state   varchar(255) not null,
    locale          varchar(2) not null,
    school_id       uuid REFERENCES school(id)
);