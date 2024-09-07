-- phpMyAdmin SQL Dump
-- version 4.2.11
-- http://www.phpmyadmin.net
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 29-11-2021 a las 07:40:41
-- Versión del servidor: 5.6.21
-- Versión de PHP: 5.6.3

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Base de datos: `hospitalpuertadelcielo`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `datosmedicar`
--

CREATE TABLE IF NOT EXISTS `datosmedicar` (
  `FechaCons` date NOT NULL,
  `Padecimiento` text NOT NULL,
  `Medicar` varchar(50) NOT NULL,
  `Observaciones` text NOT NULL,
  `Continuidad` int(5) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `datosmedicar`
--

INSERT INTO `datosmedicar` (`FechaCons`, `Padecimiento`, `Medicar`, `Observaciones`, `Continuidad`) VALUES
('2021-11-02', 'Cancer vias urinarias', 'Caldo de pollo', 'Reposo, consumo reducido de liquidos\ngaseosas', 20),
('2021-11-03', 'Contraccion estomacal, reflujo', 'PeptoBismol', 'Consumir entre cada comida, evitar \nagitamientos', 3);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `datospaciente`
--

CREATE TABLE IF NOT EXISTS `datospaciente` (
  `FechaReg` date NOT NULL,
  `Nombre` varchar(100) NOT NULL,
  `APaterno` varchar(50) NOT NULL,
  `AMaterno` varchar(50) NOT NULL,
  `FechaNac` date NOT NULL,
  `Edad` int(5) NOT NULL,
  `Teléfono` varchar(10) NOT NULL,
  `Sexo` varchar(10) NOT NULL,
  `Estado` varchar(50) NOT NULL,
  `Ciudad` varchar(50) NOT NULL,
  `CP` varchar(20) NOT NULL,
  `Sintomas` text NOT NULL,
  `RegionC` varchar(30) NOT NULL,
  `Lapso` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `datospaciente`
--

INSERT INTO `datospaciente` (`FechaReg`, `Nombre`, `APaterno`, `AMaterno`, `FechaNac`, `Edad`, `Teléfono`, `Sexo`, `Estado`, `Ciudad`, `CP`, `Sintomas`, `RegionC`, `Lapso`) VALUES
('2021-11-28', 'Miguel', 'Garcia', 'Arrieta', '2021-11-02', 16, '878787', 'Masculino', 'puebla', 'cuetza', 'nohay', 'chorro', 'Cabeza', '4'),
('2021-11-03', 'Miguel', 'Garcia', 'Romero', '2005-02-23', 17, '7676787', 'Femenino', 'Casado', 'Ecatepec', '73560', 'Caldo , dolor de head', 'Cabeza', '2'),
('2021-11-03', 'miguel', 'garcia', 'romero', '2005-02-12', 17, '23324354', 'Masculino', 'puebla', 'cuetzalan', '73560', 'Diarrea', 'Abdomen', '4');

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
