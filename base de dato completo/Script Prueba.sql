DROP DATABASE prueba;

CREATE DATABASE prueba;
USE prueba;
CREATE TABLE usuario(
	usucodigo VARCHAR(15) PRIMARY KEY,
	usunombre varchar(60) NOT NULL, 
	usudireccion VARCHAR(60) NOT NULL,
    usutelefono VARCHAR(30) NOT NULL,
    usucorreo VARCHAR(60) NOT NULL,
	usucontra VARCHAR(100) NOT NULL,
	usuestado VARCHAR(1) NOT NULL	
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
CREATE TABLE aplicaciones(
	aplcodigo VARCHAR(5) PRIMARY KEY,
	aplnombre varchar(60) NOT NULL, 
	aplestado VARCHAR(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

CREATE TABLE bitacora (
	bitcodigo int auto_increment PRIMARY KEY,
    bitfecha datetime NULL, 
	bitaccion VARCHAR(10) NOT NULL,
    usucodigo VARCHAR(15) NOT NULL,
    aplcodigo VARCHAR(5) NOT NULL,
	FOREIGN KEY (usucodigo) REFERENCES usuario (usucodigo),
    FOREIGN KEY (aplcodigo) REFERENCES aplicaciones (aplcodigo)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

CREATE TABLE perfil (
	idperfil int auto_increment PRIMARY KEY,
    nombre_perfil varchar(50) NOT NULL, 
	estatus_perfil VARCHAR(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

CREATE TABLE perfil_usuario (
	idperfil int auto_increment PRIMARY KEY,
    usucodigo VARCHAR(15) NOT NULL,
   FOREIGN KEY (usucodigo) REFERENCES usuario (usucodigo)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
