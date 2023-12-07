/*drop database multi_escuelas;*/
create database multi_escuelas;
use multi_escuelas;

create table usuarios(
    id int auto_increment primary key,
    usuario varchar(20),
    contrasena varchar(20)
);

CREATE TABLE tb_alumno (
    codest INT AUTO_INCREMENT PRIMARY KEY,
    dni INT(8),
    nombre VARCHAR(100),
    genero VARCHAR(9),
    grado VARCHAR(20),
    seccion VARCHAR(1),
    fecha DATE,
    indicador VARCHAR(1)
);

CREATE TABLE tb_datos (
    iddatos INT AUTO_INCREMENT PRIMARY KEY,
    descrip VARCHAR(100),
    fini DATE,
    ffin DATE,
    monto DECIMAL(10,2),
    indicador VARCHAR(1),
    codest_fk INT, -- Columna para la clave foránea
    FOREIGN KEY (codest_fk) REFERENCES tb_alumno(codest) -- Clave foránea que referencia a tb_alumno
);


insert into usuarios(usuario,contrasena) values ('YTORRESAS','12345678');
insert into tb_alumno(codest,dni,nombre,genero,grado,seccion,fecha,indicador) values ('1001', '76420854', 'Mariori Carranza Felix', 'Femenino', 'Quinto', 'A', '2023-03-12', 'S');
INSERT INTO tb_datos(descrip, fini, ffin, monto, indicador, codest_fk)
VALUES 
    ('Cuota Matricula 2', '2023-04-08', '2023-04-19', 50.0, 'S', 1001),
    ('Cuota 2', '2023-04-29', '2023-05-05', 15.0, 'S', 1001),
    ('Cuota 3', '2023-05-10', '2023-05-19', 15.0, 'S', 1001),
    ('Cuota 4', '2023-05-25', '2023-06-05', 15.0, 'S', 1001),
    ('Cuota 5', '2023-06-10', '2023-06-19', 15.0, 'S', 1001),
    ('Cuota 6', '2023-06-25', '2023-07-05', 15.0, 'S', 1001),
    ('Cuota 7', '2023-07-10', '2023-07-19', 15.0, 'S', 1001),
    ('Cuota 8', '2023-07-25', '2023-08-05', 15.0, 'S', 1001),
    ('Cuota 9', '2023-08-10', '2023-08-19', 15.0, 'S', 1001),
    ('Cuota 10', '2023-08-25', '2023-09-05', 15.0, 'S', 1001);

                                                               
select * from usuarios;
select * from tb_alumno;
select * from tb_datos;