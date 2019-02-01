INSERT INTO concesionario (id, nombre, create_at) VALUES(1, 'Renault', '2019-01-01');
INSERT INTO concesionario (id, nombre, create_at) VALUES(2, 'Hyundai', '2019-01-01');
INSERT INTO concesionario (id, nombre, create_at) VALUES(3, 'Ford', '2019-01-01');
INSERT INTO concesionario (id, nombre, create_at) VALUES(4, 'Mazda', '2019-01-01');
INSERT INTO concesionario (id, nombre, create_at) VALUES(5, 'Kia', '2019-01-01');

INSERT INTO ubicacion (id, nombre, create_at) VALUES(1, 'Caracas', '2019-01-01');
INSERT INTO ubicacion (id, nombre, create_at) VALUES(2, 'Valencia', '2019-01-01');
INSERT INTO ubicacion (id, nombre, create_at) VALUES(3, 'Maracaibo', '2019-01-01');
INSERT INTO ubicacion (id, nombre, create_at) VALUES(4, 'Barquisimeto', '2019-01-01');
INSERT INTO ubicacion (id, nombre, create_at) VALUES(5, 'La Guaira', '2019-01-01');

INSERT INTO clientes (nombre, apellido, email, create_at, concesionario_id, ubicacion_id) VALUES('John', 'Doe', 'john.doe@gmail.com', '2019-01-02', 1,1);
INSERT INTO clientes (nombre, apellido, email, create_at, concesionario_id, ubicacion_id) VALUES('Linus', 'Torvalds', 'linus.torvalds@gmail.com', '2019-01-03', 1,1);
INSERT INTO clientes (nombre, apellido, email, create_at, concesionario_id, ubicacion_id) VALUES('Jane', 'Doe', 'jane.doe@gmail.com', '2019-01-04', 1,1);
INSERT INTO clientes (nombre, apellido, email, create_at, concesionario_id, ubicacion_id) VALUES('Rasmus', 'Lerdorf', 'rasmus.lerdorf@gmail.com', '2019-01-05', 2,1);
INSERT INTO clientes (nombre, apellido, email, create_at, concesionario_id, ubicacion_id) VALUES('Erich', 'Gamma', 'erich.gamma@gmail.com', '2019-01-06', 3,1);
INSERT INTO clientes (nombre, apellido, email, create_at, concesionario_id, ubicacion_id) VALUES('Richard', 'Helm', 'richard.helm@gmail.com', '2019-01-07', 4,2);
INSERT INTO clientes (nombre, apellido, email, create_at, concesionario_id, ubicacion_id) VALUES('Ralph', 'Johnson', 'ralph.johnson@gmail.com', '2019-01-08', 4,2);
INSERT INTO clientes (nombre, apellido, email, create_at, concesionario_id, ubicacion_id) VALUES('John', 'Vlissides', 'john.vlissides@gmail.com', '2019-01-09', 4,3);
INSERT INTO clientes (nombre, apellido, email, create_at, concesionario_id, ubicacion_id) VALUES('James', 'Gosling', 'james.gosling@gmail.com', '2019-01-10', 5,4);
INSERT INTO clientes (nombre, apellido, email, create_at, concesionario_id, ubicacion_id) VALUES('Bruce', 'Lee', 'bruce.lee@gmail.com', '2019-01-11', 4,4);
INSERT INTO clientes (nombre, apellido, email, create_at, concesionario_id, ubicacion_id) VALUES('Johnny', 'Doe', 'johnny.doe@gmail.com', '2019-01-12', 5,5);
INSERT INTO clientes (nombre, apellido, email, create_at, concesionario_id, ubicacion_id) VALUES('John', 'Roe', 'john.roe@gmail.com', '2019-01-13', 2,5);
INSERT INTO clientes (nombre, apellido, email, create_at, concesionario_id, ubicacion_id) VALUES('Jane', 'Roe', 'jane.roe@gmail.com', '2019-01-14', 3,3);
INSERT INTO clientes (nombre, apellido, email, create_at, concesionario_id, ubicacion_id) VALUES('Richard', 'Doe', 'richard.doe@gmail.com', '2019-01-15', 1,1);

INSERT INTO users (username, password, enabled) VALUES ('ggregor','$2a$10$DOMDxjYyfZ/e7RcBfUpzqeaCs8pLgcizuiQWXPkU35nOhZlFcE9MS',1);
INSERT INTO users (username, password, enabled) VALUES ('admin','$2a$10$XadV0gGlFqUJoDv9Ni/Gju9uedQ6FSL8FMc8R/Z2OQfq2v5qQG4qC',1);

INSERT INTO authorities (user_id, authority) VALUES (1,'ROLE_USER');
INSERT INTO authorities (user_id, authority) VALUES (2,'ROLE_ADMIN');
INSERT INTO authorities (user_id, authority) VALUES (2,'ROLE_USER');