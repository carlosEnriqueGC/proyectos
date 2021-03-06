CREATE SCHEMA IF NOT EXISTS `didactica` DEFAULT CHARACTER SET utf8 ;
USE `didactica` ;
CREATE TABLE IF NOT EXISTS persona (
id_persona INT AUTO_INCREMENT,
nombre VARCHAR(60),
apellido VARCHAR(20),
email VARCHAR(25),
telefono VARCHAR(25),
PRIMARY KEY (id_persona)
) ENGINE=InnoDB CHARACTER SET = latin1;

CREATE TABLE IF NOT EXISTS usuario (
  id_usuario INT NOT NULL AUTO_INCREMENT,
  username VARCHAR(60) NOT NULL,
  password VARCHAR(25)NOT NULL,
  PRIMARY KEY (id_usuario) )
ENGINE = InnoDB CHARACTER SET = latin1;

CREATE TABLE `vendedor` (
  `id_vendedor` int(11) NOT NULL,
  `nombreVendedor` varchar(60) NOT NULL,
  `direVendedor` varchar(25) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

CREATE TABLE `aplicacion` (
  `id_aplicacion` int(11) NOT NULL,
  `nombreAplicacion` varchar(60) NOT NULL,
  `estadoAplicacion` varchar(25) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;


CREATE TABLE IF NOT EXISTS bitacora (
  id_bitacora INT NOT NULL AUTO_INCREMENT,
  accion VARCHAR(60) NOT NULL,
  PRIMARY KEY (id_bitacora) )
ENGINE = InnoDB CHARACTER SET = latin1;

SELECT * FROM persona;