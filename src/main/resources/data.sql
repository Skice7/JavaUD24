DROP table IF EXISTS empleado;

create table empleado(
    id int auto_increment,
    nombre varchar(250),
    trabajo enum ('Tester','Junior', 'Senior'),
    salario double
   );

insert into empleado (nombre, trabajo,salario)values('Jose','Tester',1000);
insert into empleado (nombre, trabajo,salario)values('Juan','Junior',2000 );
insert into empleado (nombre, trabajo,salario)values('Pedro','Junior',3000);
insert into empleado (nombre, trabajo,salario)values('Jordi','Senior',4000);
insert into empleado (nombre, trabajo,salario)values('Jonatan','Senior',5000);