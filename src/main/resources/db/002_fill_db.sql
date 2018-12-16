insert into boards (name)
values
('News'),
('Bugs'),
('Chat');

insert into users (login, password, email, registration date)
values
('aaa', '123456', 'aaa@gmail.com', '2018-12-01 10:00'),
('bbb', '123456', 'bbb@gmail.com', '2018-12-02 11:00'),
('ccc', '123456', 'ccc@gmail.com', '2018-12-03 12:00'),
('ddd', '123456', 'ddd@gmail.com', '2018-12-04 13:00'),
('eee', '123456', 'eee@gmail.com', '2018-12-05 14:00'),
('fff', '123456', 'fff@gmail.com', '2018-12-06 15:00'),
('ggg', '123456', 'ggg@gmail.com', '2018-12-07 16:00');

insert into topics (board_id, user_id, title, head, creation_date)
values
(1, 1, 'News 1', 'Hi everyone!\n\nThis is the content of News 1.\nNothing interesting has happened today!', '2018-12-08 8:00'),
(1, 2, 'News 2', 'Hi everyone!\n\nThis is the content of News 2.\nNothing interesting has happened today!', '2018-12-09 8:00'),
(1, 3, 'News 3', 'Hi everyone!\n\nThis is the content of News 3.\nNothing interesting has happened today!', '2018-12-10 8:00'),

(2, 4, 'Bug 1', 'This is bug 1.\n\nThis is a very minor fug.\nIt will never be fixed.', '2018-12-11 9:00'),
(2, 5, 'Bug 2', 'This is bug 2.\n\nThis is a very minor fug.\nIt will never be fixed.', '2018-12-12 9:00'),
(2, 6, 'Bug 3', 'This is bug 3.\n\nThis is a very minor fug.\nIt will never be fixed.', '2018-12-13 9:00'),

(3, 7, 'Chat 1', 'Looks like that this is chat 1.\n\nLet\'s talk about Dogs!', '2018-12-14 10:00'),
(3, 1, 'Chat 1', 'Looks like that this is chat 1.\n\nLet\'s talk about Cats!', '2018-12-15 10:00'),
(3, 2, 'Chat 1', 'Looks like that this is chat 1.\n\nLet\'s talk about Bears!', '2018-12-16 10:00');

insert into messages (user_id, topic_id, message_text, message_date)
values
(1, 1, 'Message 1', '2018-12-11 11:11:11'),
(2, 1, 'Message 2', '2018-12-12 12:12:12'),
(3, 1, 'Message 3', '2018-12-13 13:13:13'),

(4, 2, 'Message 1', '2018-12-11 11:11:11'),
(5, 2, 'Message 2', '2018-12-12 12:12:12'),
(6, 2, 'Message 3', '2018-12-13 13:13:13'),

(7, 3, 'Message 1', '2018-12-11 11:11:11'),
(1, 3, 'Message 2', '2018-12-12 12:12:12'),
(2, 3, 'Message 3', '2018-12-13 13:13:13'),

(3, 4, 'Message 1', '2018-12-11 11:11:11'),
(4, 4, 'Message 2', '2018-12-12 12:12:12'),
(5, 4, 'Message 3', '2018-12-13 13:13:13'),

(6, 5, 'Message 1', '2018-12-11 11:11:11'),
(7, 5, 'Message 2', '2018-12-12 12:12:12'),
(1, 5, 'Message 3', '2018-12-13 13:13:13'),

(2, 6, 'Message 1', '2018-12-11 11:11:11'),
(3, 6, 'Message 2', '2018-12-12 12:12:12'),
(4, 6, 'Message 3', '2018-12-13 13:13:13'),

(5, 7, 'Message 1', '2018-12-11 11:11:11'),
(6, 7, 'Message 2', '2018-12-12 12:12:12'),
(7, 7, 'Message 3', '2018-12-13 13:13:13'),

(1, 8, 'Message 1', '2018-12-11 11:11:11'),
(2, 8, 'Message 2', '2018-12-12 12:12:12'),
(3, 8, 'Message 3', '2018-12-13 13:13:13'),

(4, 9, 'Message 1', '2018-12-11 11:11:11'),
(5, 9, 'Message 2', '2018-12-12 12:12:12'),
(6, 9, 'Message 3', '2018-12-13 13:13:13');