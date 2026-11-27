CREATE TABLE tracks (
    id SERIAL primary key,
    title varchar(255) not null,
    artist varchar(255) not null,
    create_at timestamp default current_timestamp,
    listened_on	date,
    comment varchar(255)
);

CREATE TABLE users (
    user_id SERIAL PRIMARY KEY,
    username VARCHAR(255) UNIQUE NOT NULL,
    password VARCHAR(64) NOT NULL,
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);