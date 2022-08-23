DROP TABLE IF EXISTS `articulo`;
DROP TABLE IF EXISTS `fabricante`;


CREATE TABLE `fabricante`(
`codigo` int auto_increment PRIMARY KEY,
`nombre` varchar(100)
);

INSERT INTO `fabricante` (`codigo`, `nombre`) VALUES (default,'Redbull'),(default,'Mercedes'),(default,'Alpine'),(default,'McClaren');

CREATE TABLE `articulo`(
`codigo` int auto_increment PRIMARY KEY,
`nombre` varchar(100),
`precio` int,
`codigo_fabricante` int,
CONSTRAINT `fabricante_fk` FOREIGN KEY (`codigo_fabricante`) REFERENCES `fabricante` (codigo)
);

INSERT INTO `articulo` (`codigo`, `nombre`, `precio`, `codigo_fabricante`) VALUES (default,'Motor',6000,82),(default,'Alerón',43555,93),(default,'DRS',60000,50),(default,'Volante',20000,2);
