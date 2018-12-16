create table boards
(
    id serial PRIMARY KEY,
    name text
);

create table users
(
    id serial PRIMARY KEY,
    login text NOT NULL,
    password text NOT NULL,
    email text NOT NULL,
    registration_date timestamptz NOT NULL
);

create table topics
(
    id serial PRIMARY KEY,
    board_id int REFERENCES boards(id ),
    user_id int REFERENCES users(id),
    title text NOT NULL,
    head text NOT NULL,
    creation_date timestamptz NOT NULL
);

create table messages
(
    id serial PRIMARY KEY,
    user_id int REFERENCES users(id),
    topic_id int REFERENCES topics(id),
    message_text text NOT NULL,
    message_date timestamptz NOT NULL
);
