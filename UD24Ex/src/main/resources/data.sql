
DROP table IF EXISTS empleado;

create table empleado(
	id long auto_increment primary key,
	nombre varchar(250),
    apellido varchar(250),
	trabajo varchar(250),
	salario double
);

insert into empleado(nombre, apellido, trabajo, salario) values ('Nombre1', 'Apellido 1', 'Jefe', 50000);
insert into empleado(nombre, apellido, trabajo, salario) values ('Nombre2', 'Apellido 2', 'Programador', 25000);
insert into empleado(nombre, apellido, trabajo, salario) values ('Nombre3', 'Apellido 3', 'Programador', 25000);
insert into empleado(nombre, apellido, trabajo, salario) values ('Nombre4', 'Apellido 4', 'Becario', 10000);
insert into empleado(nombre, apellido, trabajo, salario) values ('Nombre5', 'Apellido 5', 'Becario', 10000);