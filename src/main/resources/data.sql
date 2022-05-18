
DROP table IF EXISTS trabajador;

create table trabajador(
PK_ID_TRABAJADOR int not null auto_increment,
NOMBRE varchar(250),
TRABAJADOR_TIPO varchar(50),
SALARIO double,
primary key (PK_ID_TRABAJADOR)
);