-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 11-10-2023 a las 00:39:44
-- Versión del servidor: 10.4.28-MariaDB
-- Versión de PHP: 8.0.28

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `vacunas`
--
CREATE DATABASE IF NOT EXISTS `vacunas` DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci;
USE `vacunas`;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `ciudadano`
--

CREATE TABLE `ciudadano` (
  `idCiudadano` tinyint(20) NOT NULL,
  `DNI` int(20) NOT NULL,
  `apellido` varchar(20) NOT NULL,
  `nombre` varchar(20) NOT NULL,
  `latitud` double NOT NULL,
  `longitud` double NOT NULL,
  `email` varchar(20) NOT NULL,
  `celular` int(20) NOT NULL,
  `ambitoTrabajo` varchar(20) NOT NULL,
  `dosisAplicadas` tinyint(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `fabricante`
--

CREATE TABLE `fabricante` (
  `idEmpresa` tinyint(5) NOT NULL,
  `Cuit` varchar(13) NOT NULL,
  `Nombre` varchar(20) NOT NULL,
  `País` varchar(20) NOT NULL,
  `Direccion` varchar(20) NOT NULL,
  `Stock` int(15) NOT NULL,
  `Viales` varchar(20) NOT NULL,
  `VolumenVial` tinyint(5) NOT NULL,
  `Estado` tinyint(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `fabricante`
--

INSERT INTO `fabricante` (`idEmpresa`, `Cuit`, `Nombre`, `País`, `Direccion`, `Stock`, `Viales`, `VolumenVial`, `Estado`) VALUES
(1, '50-12313223-0', 'Pfizer', 'Estados Unidos', '123 MainStreet NY', 500000000, 'Pfizer', 5, 0),
(2, '98-76543210-9', 'Johnson Johnson', 'Estados Unidos', 'Miami 3350', 47000000, 'Johnson Johnson', 10, 0),
(3, '17-54698759-9', 'AstraZeneca', 'Argentina', 'Buenos Aires', 164543534, 'AstraZeneca', 10, 0),
(4, '20-45698753-5', 'Sinopharm y Sinovac', 'Conurbano', 'Villa 11-14', 41231231, 'Sinopharm y Sinovac', 4, 0),
(5, '99-98765432-1', 'Sputnik V', 'Rusia', 'Moscu 4050', 170000000, 'Sputnik V\"', 5, 0);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `geo`
--

CREATE TABLE `geo` (
  `idGeo` tinyint(4) NOT NULL,
  `nombre` varchar(40) NOT NULL,
  `latitud` double NOT NULL,
  `longitud` double NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `geo`
--

INSERT INTO `geo` (`idGeo`, `nombre`, `latitud`, `longitud`) VALUES
(1, 'CABA', -34.61180114746094, -58.417301177978516),
(2, 'La Plata', -34.92060089111328, -57.9536018371582),
(3, 'San Miguel de Tucumán', -26.808300018310547, -65.22260284423828),
(4, 'Salta', -24.782899856567383, -65.41290283203125),
(5, 'San Salvador de Jujuy', -24.185800552368164, -65.29949951171875),
(6, 'San Fernando del Valle de Catamarca', -28.469600677490234, -65.78520202636719),
(7, 'Resistencia', -27.451200485229492, -58.98659896850586),
(8, 'Santa Rosa', -36.617401123046875, -64.28820037841797),
(9, 'Neuquén', -38.95159912109375, -68.05909729003906),
(10, 'Viedma', -40.81129837036133, -63.00170135498047),
(11, 'Rawson', -43.29999923706055, -65.10230255126953),
(12, 'Ushuaia', -54.80400085449219, -68.30729675292969),
(13, 'La Rioja', -29.411100387573242, -66.85669708251953),
(14, 'San Juan', -31.537500381469727, -68.5363998413086),
(15, 'San Luis', -33.301700592041016, -66.33779907226562),
(16, 'Santa Fe', -31.618200302124023, -60.699501037597656),
(17, 'Córdoba', -31.42009925842285, -64.18879699707031),
(18, 'Rosario', -32.94219970703125, -60.661800384521484),
(19, 'Mendoza', -32.889400482177734, -68.8458023071289),
(20, 'San Carlos de Bariloche', -41.133399963378906, -71.310302734375),
(21, 'Mar del Plata', -38.00550079345703, -57.542598724365234),
(22, 'Gran Salta', -24.780099868774414, -65.41169738769531),
(23, 'Gran Santa Rosa', -36.61669921875, -64.28720092773438),
(24, 'San Rafael', -34.617698669433594, -68.3302993774414),
(25, 'Gran San Juan', -31.53569984436035, -68.5363998413086),
(26, 'Tandil', -37.32170104980469, -59.133201599121094),
(27, 'Gran Neuquén', -38.94889831542969, -68.1050033569336),
(28, 'Comodoro Rivadavia', -45.86439895629883, -67.49649810791016),
(29, 'Gran Junín', -34.58319854736328, -60.94499969482422),
(30, 'Gran Bahía Blanca', -38.71670150756836, -62.28329849243164),
(31, 'Santiago del Estero', -27.79509925842285, -64.2614974975586),
(32, 'Corrientes', -27.46980094909668, -58.830101013183594),
(33, 'Posadas', -27.36709976196289, -55.89609909057617);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `login`
--

CREATE TABLE `login` (
  `usuario` int(30) NOT NULL,
  `clave` varchar(30) NOT NULL,
  `idLogin` int(11) NOT NULL,
  `recordar` tinyint(2) NOT NULL,
  `ingresos` tinyint(10) NOT NULL,
  `estado` tinyint(4) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `patologias`
--

CREATE TABLE `patologias` (
  `DNI` int(20) NOT NULL,
  `Cardiovasculares` tinyint(1) NOT NULL,
  `Diabetes` tinyint(1) NOT NULL,
  `Respiratorias_Cronicas` tinyint(1) NOT NULL,
  `Inmunosupresion` tinyint(1) NOT NULL,
  `Obesidad` tinyint(1) NOT NULL,
  `Renales_cronicas` tinyint(1) NOT NULL,
  `Embarazo` tinyint(1) NOT NULL,
  `Hepaticas_cronicas` tinyint(1) NOT NULL,
  `Neurologicas` tinyint(1) NOT NULL,
  `otra` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `turnero_1`
--

CREATE TABLE `turnero_1` (
  `idTurnos` int(20) NOT NULL,
  `fecha` date NOT NULL,
  `idCentro` tinyint(20) NOT NULL,
  `8_9` tinyint(5) NOT NULL DEFAULT 5,
  `9_10` tinyint(5) NOT NULL DEFAULT 5,
  `10_11` tinyint(5) NOT NULL DEFAULT 5,
  `11_12` tinyint(5) NOT NULL DEFAULT 5,
  `12_13` tinyint(5) NOT NULL DEFAULT 5,
  `13_14` tinyint(5) NOT NULL DEFAULT 5,
  `14_15` tinyint(5) NOT NULL DEFAULT 5,
  `15_16` tinyint(5) NOT NULL DEFAULT 5,
  `16_17` tinyint(5) NOT NULL DEFAULT 5,
  `turnos_libres` int(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `turnero_1`
--

INSERT INTO `turnero_1` (`idTurnos`, `fecha`, `idCentro`, `8_9`, `9_10`, `10_11`, `11_12`, `12_13`, `13_14`, `14_15`, `15_16`, `16_17`, `turnos_libres`) VALUES
(1, '2000-01-01', 1, 5, 5, 5, 5, 5, 5, 5, 5, 5, 0),
(2, '2023-10-02', 1, 5, 0, 5, 5, 5, 0, 5, 5, 5, 35),
(3, '2023-10-03', 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
(4, '2023-10-04', 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
(5, '2023-10-05', 1, 0, 0, 0, 0, 3, 5, 2, 4, 4, 18),
(6, '2023-10-06', 1, 4, 5, 5, 5, 5, 5, 5, 5, 5, 44),
(7, '2023-10-07', 1, 5, 5, 5, 5, 5, 5, 5, 5, 5, 45),
(8, '2023-10-08', 1, 5, 5, 5, 5, 5, 5, 5, 5, 5, 45),
(9, '2023-10-09', 1, 5, 5, 5, 5, 5, 5, 5, 5, 5, 45),
(10, '2023-10-10', 1, 4, 5, 5, 5, 4, 5, 5, 5, 5, 43),
(11, '2023-10-11', 1, 5, 5, 5, 5, 5, 5, 5, 5, 5, 45),
(12, '2023-10-12', 1, 5, 5, 5, 5, 5, 5, 5, 5, 5, 45),
(13, '2023-10-13', 1, 5, 2, 5, 5, 5, 5, 5, 5, 5, 42),
(14, '2023-10-14', 1, 5, 5, 5, 5, 5, 5, 5, 5, 5, 45),
(15, '2023-10-15', 1, 5, 5, 5, 5, 5, 5, 5, 5, 5, 45),
(16, '2023-10-16', 1, 5, 5, 5, 5, 5, 5, 5, 5, 5, 45),
(17, '2023-10-17', 1, 5, 5, 5, 5, 5, 5, 5, 5, 5, 45),
(18, '2023-10-18', 1, 5, 5, 5, 5, 5, 5, 5, 5, 5, 45),
(19, '2023-10-19', 1, 5, 5, 5, 5, 5, 5, 5, 5, 5, 45),
(20, '2023-10-20', 1, 5, 5, 5, 5, 5, 5, 5, 5, 5, 45),
(21, '2023-10-21', 1, 5, 5, 5, 5, 5, 5, 5, 5, 5, 45),
(22, '2023-10-22', 1, 5, 5, 5, 5, 5, 5, 5, 5, 5, 45),
(23, '2023-10-23', 1, 5, 5, 5, 5, 5, 5, 5, 5, 5, 45),
(24, '2023-10-24', 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
(25, '2023-10-25', 1, 5, 5, 5, 5, 5, 5, 5, 5, 5, 45),
(26, '2023-10-26', 1, 5, 5, 5, 5, 5, 5, 5, 5, 5, 45),
(27, '2023-10-27', 1, 5, 5, 5, 2, 5, 5, 4, 5, 4, 40),
(28, '2023-10-28', 1, 5, 5, 5, 5, 5, 5, 5, 5, 5, 45),
(29, '2023-10-29', 1, 5, 5, 5, 5, 5, 5, 5, 5, 5, 45),
(30, '2023-10-30', 1, 5, 5, 5, 5, 5, 5, 5, 5, 5, 45),
(31, '2023-10-31', 1, 5, 5, 5, 5, 5, 5, 5, 5, 5, 45),
(32, '2023-11-01', 1, 5, 5, 5, 5, 5, 5, 5, 5, 5, 45),
(33, '2023-11-02', 1, 5, 5, 5, 5, 5, 5, 5, 5, 5, 45),
(34, '2023-11-03', 1, 5, 5, 5, 5, 5, 5, 5, 5, 5, 45),
(35, '2023-11-04', 1, 5, 5, 5, 2, 5, 5, 5, 5, 5, 42),
(36, '2023-11-05', 1, 5, 5, 5, 5, 5, 5, 5, 5, 5, 45),
(37, '2023-11-06', 1, 5, 5, 5, 5, 5, 5, 5, 5, 5, 45),
(38, '2023-11-07', 1, 0, 0, 0, 2, 0, 0, 0, 0, 0, 38),
(39, '2023-11-08', 1, 5, 5, 5, 5, 5, 5, 5, 5, 5, 45),
(40, '2023-11-09', 1, 5, 5, 5, 5, 5, 5, 5, 5, 5, 45),
(41, '2023-11-10', 1, 5, 5, 5, 5, 5, 5, 5, 5, 5, 45),
(42, '2023-11-11', 1, 5, 5, 5, 5, 5, 5, 5, 5, 5, 45),
(43, '2023-11-12', 1, 5, 5, 5, 5, 5, 5, 5, 5, 5, 45),
(44, '2023-11-13', 1, 5, 5, 5, 5, 5, 5, 5, 5, 5, 45),
(45, '2023-11-14', 1, 5, 5, 5, 5, 5, 5, 5, 5, 5, 45),
(46, '2023-11-15', 1, 5, 5, 5, 5, 5, 5, 5, 5, 5, 45),
(47, '2023-11-16', 1, 5, 5, 5, 5, 5, 5, 5, 5, 5, 45),
(48, '2023-11-17', 1, 5, 5, 5, 5, 5, 5, 5, 5, 5, 45),
(49, '2023-11-18', 1, 5, 5, 4, 4, 5, 4, 5, 5, 4, 41),
(50, '2023-11-19', 1, 5, 5, 5, 5, 5, 5, 5, 5, 5, 45),
(51, '2023-11-20', 1, 5, 5, 5, 5, 5, 5, 5, 5, 5, 45),
(52, '2023-11-21', 1, 5, 5, 5, 5, 5, 5, 5, 5, 5, 45),
(53, '2023-11-22', 1, 5, 5, 5, 5, 5, 5, 5, 5, 5, 45),
(54, '2023-11-23', 1, 5, 5, 5, 5, 5, 5, 5, 5, 5, 45),
(55, '2023-11-24', 1, 5, 5, 5, 5, 5, 5, 5, 5, 5, 45),
(56, '2023-11-25', 1, 5, 5, 5, 5, 5, 5, 5, 5, 5, 45),
(57, '2023-11-26', 1, 5, 5, 2, 5, 5, 5, 5, 5, 5, 42),
(58, '2023-11-27', 1, 5, 5, 5, 5, 5, 5, 5, 5, 5, 45),
(59, '2023-11-28', 1, 5, 5, 5, 5, 5, 5, 5, 5, 5, 45),
(60, '2023-11-29', 1, 5, 5, 5, 5, 5, 5, 5, 5, 5, 45),
(61, '2023-11-30', 1, 5, 5, 5, 5, 5, 5, 5, 5, 5, 45),
(62, '2023-12-01', 1, 5, 5, 5, 5, 5, 5, 5, 5, 5, 45),
(63, '2023-12-02', 1, 5, 5, 5, 5, 5, 5, 5, 5, 5, 45),
(64, '2023-12-03', 1, 5, 5, 5, 5, 5, 5, 5, 5, 5, 45),
(65, '2023-12-04', 1, 5, 5, 5, 5, 5, 5, 5, 5, 5, 45),
(66, '2023-12-05', 1, 5, 5, 5, 5, 5, 5, 5, 5, 5, 45),
(67, '2023-12-06', 1, 5, 5, 5, 5, 5, 5, 5, 5, 5, 45),
(68, '2023-12-07', 1, 5, 5, 5, 5, 5, 5, 5, 5, 5, 45),
(69, '2023-12-08', 1, 5, 5, 5, 5, 5, 5, 5, 5, 5, 45),
(70, '2023-12-09', 1, 5, 5, 5, 5, 5, 5, 5, 5, 5, 45),
(71, '2023-12-10', 1, 5, 5, 5, 5, 5, 5, 5, 5, 5, 45),
(72, '2023-12-11', 1, 5, 5, 5, 5, 5, 5, 5, 5, 5, 45),
(73, '2023-12-12', 1, 5, 5, 5, 5, 5, 5, 5, 5, 5, 45),
(74, '2023-12-13', 1, 5, 5, 5, 5, 5, 5, 5, 5, 5, 45),
(75, '2023-12-14', 1, 5, 5, 5, 5, 5, 5, 5, 5, 5, 45),
(76, '2023-12-15', 1, 5, 5, 5, 5, 5, 5, 5, 5, 5, 45),
(77, '2023-12-16', 1, 5, 5, 5, 5, 5, 5, 5, 5, 5, 45),
(78, '2023-12-17', 1, 5, 5, 5, 5, 5, 5, 5, 5, 5, 45),
(79, '2023-12-18', 1, 5, 5, 5, 5, 5, 5, 5, 5, 5, 45),
(80, '2023-12-19', 1, 5, 5, 5, 5, 5, 5, 5, 5, 5, 45),
(81, '2023-12-20', 1, 5, 5, 5, 5, 5, 5, 5, 5, 5, 45),
(82, '2023-12-21', 1, 5, 5, 5, 5, 5, 5, 5, 5, 5, 45),
(83, '2023-12-22', 1, 5, 5, 5, 5, 5, 5, 5, 5, 5, 45),
(84, '2023-12-23', 1, 5, 5, 5, 5, 5, 5, 5, 5, 5, 45),
(85, '2023-12-24', 1, 5, 5, 5, 5, 5, 5, 5, 5, 5, 45),
(86, '2023-12-25', 1, 5, 5, 5, 5, 5, 5, 5, 5, 5, 45),
(87, '2023-12-26', 1, 5, 5, 5, 5, 5, 5, 5, 5, 5, 45),
(88, '2023-12-27', 1, 5, 5, 5, 5, 5, 5, 5, 5, 5, 45),
(89, '2023-12-28', 1, 5, 5, 5, 5, 5, 5, 5, 5, 5, 45),
(90, '2023-12-29', 1, 5, 5, 5, 5, 5, 5, 5, 5, 5, 45),
(91, '2023-12-30', 1, 5, 5, 5, 5, 5, 5, 5, 5, 5, 45),
(92, '2023-12-31', 1, 5, 5, 5, 5, 5, 5, 5, 5, 5, 45);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `turnero_2`
--

CREATE TABLE `turnero_2` (
  `idTurnos` tinyint(20) NOT NULL,
  `fecha` date NOT NULL,
  `idCentro` tinyint(20) NOT NULL,
  `8_9` tinyint(5) NOT NULL DEFAULT 5,
  `9_10` tinyint(5) NOT NULL DEFAULT 5,
  `10_11` tinyint(5) NOT NULL DEFAULT 5,
  `11_12` tinyint(5) NOT NULL DEFAULT 5,
  `12_13` tinyint(5) NOT NULL DEFAULT 5,
  `13_14` tinyint(5) NOT NULL DEFAULT 5,
  `14_15` tinyint(5) NOT NULL DEFAULT 5,
  `15_16` tinyint(5) NOT NULL DEFAULT 5,
  `16_17` tinyint(5) NOT NULL DEFAULT 5,
  `turnos_libres` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `turnero_2`
--

INSERT INTO `turnero_2` (`idTurnos`, `fecha`, `idCentro`, `8_9`, `9_10`, `10_11`, `11_12`, `12_13`, `13_14`, `14_15`, `15_16`, `16_17`, `turnos_libres`) VALUES
(1, '2000-01-01', 1, 5, 5, 5, 5, 5, 5, 5, 5, 5, 0),
(2, '2023-10-02', 1, 5, 0, 5, 5, 5, 0, 5, 5, 5, 35),
(3, '2023-10-03', 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
(4, '2023-10-04', 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
(5, '2023-10-05', 1, 0, 0, 0, 0, 3, 5, 2, 4, 4, 18),
(6, '2023-10-06', 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
(7, '2023-10-07', 1, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1),
(8, '2023-10-08', 1, 5, 5, 5, 5, 5, 5, 5, 5, 5, 45),
(9, '2023-10-09', 1, 5, 5, 5, 5, 5, 5, 5, 5, 5, 45),
(10, '2023-10-10', 1, 5, 5, 5, 3, 5, 5, 5, 5, 5, 45),
(11, '2023-10-11', 1, 5, 5, 5, 5, 5, 5, 5, 5, 5, 45),
(12, '2023-10-12', 1, 5, 5, 5, 5, 5, 5, 5, 5, 5, 45),
(13, '2023-10-13', 1, 5, 2, 5, 5, 5, 5, 5, 5, 5, 42),
(14, '2023-10-14', 1, 5, 5, 5, 5, 5, 5, 5, 5, 5, 45),
(15, '2023-10-15', 1, 5, 5, 5, 5, 5, 5, 5, 5, 5, 45),
(16, '2023-10-16', 1, 5, 5, 5, 5, 5, 5, 5, 5, 5, 45),
(17, '2023-10-17', 1, 5, 5, 5, 5, 5, 5, 5, 5, 5, 45),
(18, '2023-10-18', 1, 5, 5, 5, 5, 5, 5, 5, 5, 5, 45),
(19, '2023-10-19', 1, 5, 5, 5, 5, 5, 5, 5, 5, 5, 45),
(20, '2023-10-20', 1, 5, 5, 5, 5, 5, 5, 5, 5, 5, 45),
(21, '2023-10-21', 1, 5, 5, 5, 5, 5, 5, 5, 5, 5, 45),
(22, '2023-10-22', 1, 5, 5, 5, 5, 5, 5, 5, 5, 5, 45),
(23, '2023-10-23', 1, 5, 5, 5, 5, 5, 5, 5, 5, 5, 45),
(24, '2023-10-24', 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
(25, '2023-10-25', 1, 5, 5, 5, 5, 5, 5, 5, 5, 5, 45),
(26, '2023-10-26', 1, 5, 5, 5, 5, 5, 5, 5, 5, 5, 45),
(27, '2023-10-27', 1, 5, 5, 5, 2, 5, 5, 4, 5, 4, 40),
(28, '2023-10-28', 1, 5, 5, 5, 5, 5, 5, 5, 5, 5, 45),
(29, '2023-10-29', 1, 5, 5, 5, 5, 5, 5, 5, 5, 5, 45),
(30, '2023-10-30', 1, 5, 5, 5, 5, 5, 5, 5, 5, 5, 45),
(31, '2023-10-31', 1, 5, 5, 5, 5, 5, 5, 5, 5, 5, 45),
(32, '2023-11-01', 1, 5, 5, 5, 5, 5, 5, 5, 5, 5, 45),
(33, '2023-11-02', 1, 5, 5, 5, 5, 5, 5, 5, 5, 5, 45),
(34, '2023-11-03', 1, 5, 5, 5, 5, 5, 5, 5, 5, 5, 45),
(35, '2023-11-04', 1, 5, 5, 5, 2, 5, 5, 5, 5, 5, 42),
(36, '2023-11-05', 1, 5, 5, 5, 5, 5, 5, 5, 5, 5, 45),
(37, '2023-11-06', 1, 5, 5, 5, 5, 5, 5, 5, 5, 5, 45),
(38, '2023-11-07', 1, 5, 5, 5, 5, 4, 5, 5, 5, 5, 44),
(39, '2023-11-08', 1, 5, 5, 5, 5, 5, 5, 5, 5, 5, 45),
(40, '2023-11-09', 1, 5, 5, 5, 5, 5, 5, 5, 5, 5, 45),
(41, '2023-11-10', 1, 5, 5, 5, 5, 5, 5, 5, 5, 5, 45),
(42, '2023-11-11', 1, 5, 5, 5, 5, 5, 5, 5, 5, 5, 45),
(43, '2023-11-12', 1, 5, 5, 5, 5, 5, 5, 5, 5, 5, 45),
(44, '2023-11-13', 1, 5, 5, 5, 5, 5, 5, 5, 5, 5, 45),
(45, '2023-11-14', 1, 5, 5, 5, 5, 5, 5, 5, 5, 5, 45),
(46, '2023-11-15', 1, 5, 5, 5, 5, 5, 5, 5, 5, 5, 45),
(47, '2023-11-16', 1, 5, 5, 5, 5, 5, 5, 5, 5, 5, 45),
(48, '2023-11-17', 1, 5, 5, 5, 5, 5, 5, 5, 5, 5, 45),
(49, '2023-11-18', 1, 5, 5, 4, 4, 5, 4, 5, 5, 4, 41),
(50, '2023-11-19', 1, 5, 5, 5, 5, 5, 5, 5, 5, 5, 45),
(51, '2023-11-20', 1, 5, 5, 5, 5, 5, 5, 5, 5, 5, 45),
(52, '2023-11-21', 1, 5, 5, 5, 5, 5, 5, 5, 5, 5, 45),
(53, '2023-11-22', 1, 5, 5, 5, 5, 5, 5, 5, 5, 5, 45),
(54, '2023-11-23', 1, 5, 5, 5, 5, 5, 5, 5, 5, 5, 45),
(55, '2023-11-24', 1, 5, 5, 5, 5, 5, 5, 5, 5, 5, 45),
(56, '2023-11-25', 1, 5, 5, 5, 5, 5, 5, 5, 5, 5, 45),
(57, '2023-11-26', 1, 5, 5, 2, 5, 5, 5, 5, 5, 5, 42),
(58, '2023-11-27', 1, 5, 5, 5, 5, 5, 5, 5, 5, 5, 45),
(59, '2023-11-28', 1, 5, 5, 5, 5, 5, 5, 5, 5, 5, 45),
(60, '2023-11-29', 1, 5, 5, 5, 5, 5, 5, 5, 5, 5, 45),
(61, '2023-11-30', 1, 5, 5, 5, 5, 5, 5, 5, 5, 4, 44),
(62, '2023-12-01', 1, 5, 5, 5, 5, 5, 5, 5, 5, 5, 45),
(63, '2023-12-02', 1, 5, 5, 5, 5, 5, 5, 5, 5, 5, 45),
(64, '2023-12-03', 1, 5, 5, 5, 5, 5, 5, 5, 5, 5, 45),
(65, '2023-12-04', 1, 5, 5, 5, 5, 5, 5, 5, 5, 5, 45),
(66, '2023-12-05', 1, 5, 5, 5, 5, 5, 5, 5, 5, 5, 45),
(67, '2023-12-06', 1, 5, 5, 5, 5, 5, 5, 5, 5, 5, 45),
(68, '2023-12-07', 1, 5, 5, 5, 5, 5, 5, 5, 5, 5, 45),
(69, '2023-12-08', 1, 5, 5, 5, 5, 5, 5, 5, 5, 5, 45),
(70, '2023-12-09', 1, 5, 5, 5, 5, 5, 5, 5, 5, 5, 45),
(71, '2023-12-10', 1, 5, 5, 5, 5, 5, 5, 5, 5, 5, 45),
(72, '2023-12-11', 1, 5, 5, 5, 5, 5, 5, 5, 5, 5, 45),
(73, '2023-12-12', 1, 5, 5, 5, 5, 5, 5, 5, 5, 5, 45),
(74, '2023-12-13', 1, 5, 5, 5, 5, 5, 5, 5, 5, 5, 45),
(75, '2023-12-14', 1, 5, 5, 5, 5, 5, 5, 5, 5, 5, 45),
(76, '2023-12-15', 1, 5, 5, 5, 5, 5, 5, 5, 5, 5, 45),
(77, '2023-12-16', 1, 5, 5, 5, 5, 5, 5, 5, 5, 5, 45),
(78, '2023-12-17', 1, 5, 5, 5, 5, 5, 5, 5, 5, 5, 45),
(79, '2023-12-18', 1, 5, 5, 5, 5, 5, 5, 5, 5, 5, 45),
(80, '2023-12-19', 1, 5, 5, 5, 5, 5, 5, 5, 5, 5, 45),
(81, '2023-12-20', 1, 5, 5, 5, 5, 5, 5, 5, 5, 5, 45),
(82, '2023-12-21', 1, 5, 5, 5, 5, 5, 5, 5, 5, 5, 45),
(83, '2023-12-22', 1, 5, 5, 5, 5, 5, 5, 5, 5, 5, 45),
(84, '2023-12-23', 1, 5, 5, 5, 5, 5, 5, 5, 5, 5, 45),
(85, '2023-12-24', 1, 5, 5, 5, 5, 5, 5, 5, 5, 5, 45),
(86, '2023-12-25', 1, 5, 5, 5, 5, 5, 5, 5, 5, 5, 45),
(87, '2023-12-26', 1, 5, 5, 5, 5, 5, 5, 5, 5, 5, 45),
(88, '2023-12-27', 1, 5, 5, 5, 5, 5, 5, 5, 5, 5, 45),
(89, '2023-12-28', 1, 5, 5, 5, 5, 5, 5, 5, 5, 5, 45),
(90, '2023-12-29', 1, 5, 5, 5, 5, 5, 5, 5, 5, 5, 45),
(91, '2023-12-30', 1, 5, 5, 5, 5, 5, 5, 5, 5, 5, 45),
(92, '2023-12-31', 1, 5, 5, 5, 5, 5, 5, 5, 5, 5, 45);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `turnero_3`
--

CREATE TABLE `turnero_3` (
  `idTurnos` tinyint(20) NOT NULL,
  `fecha` date NOT NULL,
  `idCentro` tinyint(20) NOT NULL,
  `8_9` tinyint(5) NOT NULL DEFAULT 5,
  `9_10` tinyint(5) NOT NULL DEFAULT 5,
  `10_11` tinyint(5) NOT NULL DEFAULT 5,
  `11_12` tinyint(5) NOT NULL DEFAULT 5,
  `12_13` tinyint(5) NOT NULL DEFAULT 5,
  `13_14` tinyint(5) NOT NULL DEFAULT 5,
  `14_15` tinyint(5) NOT NULL DEFAULT 5,
  `15_16` tinyint(5) NOT NULL DEFAULT 5,
  `16_17` tinyint(5) NOT NULL DEFAULT 5,
  `turnos_libres` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `turnero_3`
--

INSERT INTO `turnero_3` (`idTurnos`, `fecha`, `idCentro`, `8_9`, `9_10`, `10_11`, `11_12`, `12_13`, `13_14`, `14_15`, `15_16`, `16_17`, `turnos_libres`) VALUES
(1, '2000-01-01', 1, 5, 5, 5, 5, 5, 5, 5, 5, 5, 0),
(2, '2023-10-02', 1, 5, 0, 5, 5, 5, 0, 5, 5, 5, 35),
(3, '2023-10-03', 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
(4, '2023-10-04', 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
(5, '2023-10-05', 1, 0, 0, 0, 0, 3, 5, 2, 4, 4, 18),
(6, '2023-10-06', 1, 5, 5, 5, 5, 4, 5, 5, 5, 4, 43),
(7, '2023-10-07', 1, 5, 5, 5, 5, 5, 5, 5, 5, 5, 45),
(8, '2023-10-08', 1, 4, 5, 5, 5, 5, 4, 5, 5, 5, 43),
(9, '2023-10-09', 1, 5, 5, 5, 5, 4, 5, 5, 5, 5, 44),
(10, '2023-10-10', 1, 5, 5, 5, 5, 5, 5, 5, 5, 5, 45),
(11, '2023-10-11', 1, 5, 5, 5, 5, 5, 5, 5, 5, 5, 45),
(12, '2023-10-12', 1, 5, 5, 5, 5, 5, 5, 5, 5, 5, 45),
(13, '2023-10-13', 1, 5, 2, 5, 5, 5, 5, 5, 5, 5, 42),
(14, '2023-10-14', 1, 5, 5, 5, 5, 5, 5, 5, 5, 5, 45),
(15, '2023-10-15', 1, 5, 5, 5, 5, 5, 5, 5, 5, 5, 45),
(16, '2023-10-16', 1, 5, 5, 5, 5, 5, 5, 5, 5, 5, 45),
(17, '2023-10-17', 1, 5, 5, 5, 5, 5, 5, 5, 5, 5, 45),
(18, '2023-10-18', 1, 5, 5, 5, 5, 5, 5, 5, 5, 5, 45),
(19, '2023-10-19', 1, 5, 5, 5, 5, 5, 5, 5, 5, 5, 45),
(20, '2023-10-20', 1, 5, 5, 5, 5, 5, 5, 5, 5, 5, 45),
(21, '2023-10-21', 1, 5, 5, 5, 5, 5, 5, 5, 5, 5, 45),
(22, '2023-10-22', 1, 5, 5, 5, 5, 5, 5, 5, 5, 5, 45),
(23, '2023-10-23', 1, 5, 5, 5, 5, 5, 5, 5, 5, 5, 45),
(24, '2023-10-24', 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
(25, '2023-10-25', 1, 5, 5, 5, 5, 5, 5, 5, 5, 5, 45),
(26, '2023-10-26', 1, 5, 5, 5, 5, 5, 5, 5, 5, 5, 45),
(27, '2023-10-27', 1, 5, 5, 5, 2, 5, 5, 4, 5, 4, 40),
(28, '2023-10-28', 1, 5, 5, 5, 5, 5, 5, 5, 5, 5, 45),
(29, '2023-10-29', 1, 5, 5, 5, 5, 5, 5, 5, 5, 5, 45),
(30, '2023-10-30', 1, 5, 5, 5, 5, 5, 5, 5, 5, 5, 45),
(31, '2023-10-31', 1, 5, 5, 5, 5, 5, 5, 5, 5, 5, 45),
(32, '2023-11-01', 1, 5, 5, 5, 5, 5, 5, 5, 5, 5, 45),
(33, '2023-11-02', 1, 5, 5, 5, 5, 5, 5, 5, 5, 5, 45),
(34, '2023-11-03', 1, 5, 5, 5, 5, 5, 5, 5, 5, 5, 45),
(35, '2023-11-04', 1, 5, 5, 5, 2, 5, 5, 5, 5, 5, 42),
(36, '2023-11-05', 1, 5, 5, 5, 5, 5, 5, 5, 5, 5, 45),
(37, '2023-11-06', 1, 5, 5, 5, 5, 5, 5, 5, 5, 5, 45),
(38, '2023-11-07', 1, 5, 5, 5, 5, 5, 5, 5, 5, 5, 45),
(39, '2023-11-08', 1, 5, 5, 5, 5, 5, 5, 5, 5, 5, 45),
(40, '2023-11-09', 1, 5, 5, 5, 5, 5, 5, 5, 5, 5, 45),
(41, '2023-11-10', 1, 5, 5, 5, 5, 5, 5, 5, 5, 5, 45),
(42, '2023-11-11', 1, 5, 5, 5, 5, 5, 5, 5, 5, 5, 45),
(43, '2023-11-12', 1, 5, 5, 5, 5, 5, 5, 5, 5, 5, 45),
(44, '2023-11-13', 1, 5, 5, 5, 5, 5, 5, 5, 5, 5, 45),
(45, '2023-11-14', 1, 5, 5, 5, 5, 5, 5, 5, 5, 5, 45),
(46, '2023-11-15', 1, 5, 5, 5, 5, 5, 5, 5, 5, 5, 45),
(47, '2023-11-16', 1, 5, 5, 5, 5, 5, 5, 5, 5, 5, 45),
(48, '2023-11-17', 1, 5, 5, 5, 5, 5, 5, 5, 5, 5, 45),
(49, '2023-11-18', 1, 5, 5, 4, 4, 5, 4, 5, 5, 4, 41),
(50, '2023-11-19', 1, 5, 5, 5, 5, 5, 5, 5, 5, 5, 45),
(51, '2023-11-20', 1, 5, 5, 5, 5, 5, 5, 5, 5, 5, 45),
(52, '2023-11-21', 1, 5, 5, 5, 5, 5, 5, 5, 5, 5, 45),
(53, '2023-11-22', 1, 5, 5, 5, 5, 5, 5, 5, 5, 5, 45),
(54, '2023-11-23', 1, 5, 5, 5, 5, 5, 5, 5, 5, 5, 45),
(55, '2023-11-24', 1, 5, 5, 5, 5, 5, 5, 5, 5, 5, 45),
(56, '2023-11-25', 1, 5, 5, 5, 5, 5, 5, 5, 5, 5, 45),
(57, '2023-11-26', 1, 5, 5, 2, 5, 5, 5, 5, 5, 5, 42),
(58, '2023-11-27', 1, 5, 5, 5, 5, 5, 5, 5, 5, 5, 45),
(59, '2023-11-28', 1, 5, 5, 5, 5, 5, 5, 5, 5, 5, 45),
(60, '2023-11-29', 1, 5, 5, 5, 5, 5, 5, 5, 5, 5, 45),
(61, '2023-11-30', 1, 5, 5, 5, 5, 5, 5, 5, 5, 5, 45),
(62, '2023-12-01', 1, 5, 5, 5, 5, 5, 5, 5, 5, 5, 45),
(63, '2023-12-02', 1, 5, 5, 5, 5, 5, 5, 5, 5, 5, 45),
(64, '2023-12-03', 1, 5, 5, 5, 5, 5, 5, 5, 5, 5, 45),
(65, '2023-12-04', 1, 5, 5, 5, 5, 5, 5, 5, 5, 5, 45),
(66, '2023-12-05', 1, 5, 5, 5, 5, 5, 5, 5, 5, 5, 45),
(67, '2023-12-06', 1, 5, 5, 5, 5, 5, 5, 5, 5, 5, 45),
(68, '2023-12-07', 1, 5, 5, 5, 5, 5, 5, 5, 5, 5, 45),
(69, '2023-12-08', 1, 5, 5, 5, 5, 5, 5, 5, 5, 5, 45),
(70, '2023-12-09', 1, 5, 5, 5, 5, 5, 5, 5, 5, 5, 45),
(71, '2023-12-10', 1, 5, 5, 5, 5, 5, 5, 5, 5, 5, 45),
(72, '2023-12-11', 1, 5, 5, 5, 5, 5, 5, 5, 5, 5, 45),
(73, '2023-12-12', 1, 5, 5, 5, 5, 5, 5, 5, 5, 5, 45),
(74, '2023-12-13', 1, 5, 5, 5, 5, 5, 5, 5, 5, 5, 45),
(75, '2023-12-14', 1, 5, 5, 5, 5, 5, 5, 5, 5, 5, 45),
(76, '2023-12-15', 1, 5, 5, 5, 5, 5, 5, 5, 5, 5, 45),
(77, '2023-12-16', 1, 5, 5, 5, 5, 5, 5, 5, 5, 5, 45),
(78, '2023-12-17', 1, 5, 5, 5, 5, 5, 5, 5, 5, 5, 45),
(79, '2023-12-18', 1, 5, 5, 5, 5, 5, 5, 5, 5, 5, 45),
(80, '2023-12-19', 1, 5, 5, 5, 5, 5, 5, 5, 5, 5, 45),
(81, '2023-12-20', 1, 5, 5, 5, 5, 5, 5, 5, 5, 5, 45),
(82, '2023-12-21', 1, 5, 5, 5, 5, 5, 5, 5, 5, 5, 45),
(83, '2023-12-22', 1, 5, 5, 5, 5, 5, 5, 5, 5, 5, 45),
(84, '2023-12-23', 1, 5, 5, 5, 5, 5, 5, 5, 5, 5, 45),
(85, '2023-12-24', 1, 5, 5, 5, 5, 5, 5, 5, 5, 5, 45),
(86, '2023-12-25', 1, 5, 5, 5, 5, 5, 5, 5, 5, 5, 45),
(87, '2023-12-26', 1, 5, 5, 5, 5, 5, 5, 5, 5, 5, 45),
(88, '2023-12-27', 1, 5, 5, 5, 5, 5, 5, 5, 5, 5, 45),
(89, '2023-12-28', 1, 5, 5, 5, 5, 5, 5, 5, 5, 5, 45),
(90, '2023-12-29', 1, 5, 5, 5, 5, 5, 5, 5, 5, 5, 45),
(91, '2023-12-30', 1, 5, 5, 5, 5, 5, 5, 5, 5, 5, 45),
(92, '2023-12-31', 1, 5, 5, 5, 5, 5, 5, 5, 5, 5, 45);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `turno`
--

CREATE TABLE `turno` (
  `idTurno` int(30) NOT NULL,
  `DNI` int(20) NOT NULL,
  `fechaTurno` datetime NOT NULL,
  `idCentro` tinyint(20) NOT NULL,
  `codigoRefuerzo` varchar(20) NOT NULL,
  `estado` varchar(20) NOT NULL,
  `idVial` int(30) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `vacunatorio`
--

CREATE TABLE `vacunatorio` (
  `idCentro` tinyint(11) NOT NULL,
  `Nombre` varchar(20) NOT NULL,
  `Direccion` text NOT NULL,
  `latitud` double NOT NULL,
  `longitud` double NOT NULL,
  `Citas` tinyint(10) NOT NULL,
  `Estado` tinyint(1) NOT NULL,
  `idVial` tinyint(20) NOT NULL,
  `tipo` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `vacunatorio`
--

INSERT INTO `vacunatorio` (`idCentro`, `Nombre`, `Direccion`, `latitud`, `longitud`, `Citas`, `Estado`, `idVial`, `tipo`) VALUES
(1, 'Esquina encendida', 'Avenida Facundo Zuviria 3200', -31.60337301024548, -60.70347099780419, 4, 0, 27, 'dani'),
(2, 'La redonda', 'Salvador del Carril 3000', -31.619257404754777, -60.69506533559279, 1, 0, 28, 'si'),
(3, 'El Birri', 'Av. Gral. Lopez 3699-3641', -31.654640004725557, -60.724482201066316, 1, 0, 16, '0');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `viales`
--

CREATE TABLE `viales` (
  `idVial` int(100) NOT NULL,
  `NumeroSerie` int(50) NOT NULL,
  `Marca` varchar(20) NOT NULL,
  `Antigeno` varchar(20) NOT NULL,
  `FechaVencimiento` date NOT NULL,
  `idLaboratorio` tinyint(20) NOT NULL,
  `Estado` tinyint(1) NOT NULL,
  `idVacunatorio` tinyint(20) DEFAULT NULL,
  `fechaColocacion` date DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `viales`
--

INSERT INTO `viales` (`idVial`, `NumeroSerie`, `Marca`, `Antigeno`, `FechaVencimiento`, `idLaboratorio`, `Estado`, `idVacunatorio`, `fechaColocacion`) VALUES
(1329, 213419, 'Sputnik V', 'Adenovirus Ad26 y Ad', '2024-01-07', 5, 1, 1, '2023-10-10'),
(1330, 723303, 'Pfizer', 'ARN mensajero (ARNm)', '2024-01-07', 1, 1, 3, '2023-10-10'),
(1331, 698874, 'Pfizer', 'ARN mensajero (ARNm)', '2024-01-07', 1, 1, 3, '2023-10-10'),
(1332, 578563, 'Pfizer', 'ARN mensajero (ARNm)', '2024-01-07', 1, 1, 1, '2023-10-10'),
(1333, 664030, 'Sinopharm y Sinovac', 'Partículas SARS-CoV-', '2024-01-07', 4, 1, 2, '2023-10-10'),
(1334, 802446, 'Johnson_Johnson', 'Partículas SARS-CoV-', '2024-01-07', 2, 1, 3, '2023-10-10'),
(1335, 395361, 'AstraZeneca', 'Proteína de pico del', '2024-01-07', 3, 1, 3, '2023-10-10'),
(1336, 580860, 'Sinopharm y Sinovac', 'Partículas SARS-CoV-', '2024-01-07', 4, 1, 3, '2023-10-10'),
(1337, 831908, 'Sputnik V', 'Adenovirus Ad26 y Ad', '2024-01-07', 5, 1, 1, '2023-10-10'),
(1338, 323384, 'Sinopharm y Sinovac', 'Partículas SARS-CoV-', '2024-01-07', 4, 1, 1, '2023-10-10'),
(1339, 536315, 'Pfizer', 'ARN mensajero (ARNm)', '2024-01-07', 1, 1, 1, '2023-10-10'),
(1340, 134149, 'Sinopharm y Sinovac', 'Partículas SARS-CoV-', '2024-01-07', 4, 1, 1, '2023-10-10'),
(1341, 595933, 'Johnson_Johnson', 'Partículas SARS-CoV-', '2024-01-07', 2, 1, 2, '2023-10-10'),
(1342, 603913, 'Pfizer', 'ARN mensajero (ARNm)', '2024-01-07', 1, 1, 1, '2023-10-10'),
(1343, 16126, 'Pfizer', 'ARN mensajero (ARNm)', '2024-01-07', 1, 1, 1, '2023-10-10'),
(1344, 34907, 'Sinopharm y Sinovac', 'Partículas SARS-CoV-', '2024-01-07', 4, 1, 1, '2023-10-10'),
(1345, 500176, 'Pfizer', 'ARN mensajero (ARNm)', '2024-01-07', 1, 0, 2, NULL),
(1346, 110370, 'Sinopharm y Sinovac', 'Partículas SARS-CoV-', '2024-01-07', 4, 0, 2, NULL),
(1347, 621555, 'Pfizer', 'ARN mensajero (ARNm)', '2024-01-07', 1, 1, 1, '2023-10-10'),
(1348, 343204, 'Sputnik V', 'Adenovirus Ad26 y Ad', '2024-01-07', 5, 1, 3, '2023-10-10'),
(1349, 426159, 'Sputnik V', 'Adenovirus Ad26 y Ad', '2024-01-07', 5, 1, 3, '2023-10-10'),
(1350, 391416, 'Sputnik V', 'Adenovirus Ad26 y Ad', '2024-01-07', 5, 1, 3, '2023-10-10'),
(1351, 393107, 'Johnson_Johnson', 'Partículas SARS-CoV-', '2024-01-07', 2, 1, 3, '2023-10-10'),
(1352, 942885, 'Sinopharm y Sinovac', 'Partículas SARS-CoV-', '2024-01-07', 4, 1, 3, '2023-10-10'),
(1353, 418084, 'Sputnik V', 'Adenovirus Ad26 y Ad', '2024-01-07', 5, 0, 3, NULL),
(1354, 450801, 'Johnson_Johnson', 'Partículas SARS-CoV-', '2024-01-07', 2, 1, 1, '2023-10-10'),
(1355, 345224, 'Sinopharm y Sinovac', 'Partículas SARS-CoV-', '2024-01-07', 4, 1, 1, '2023-10-10'),
(1356, 568489, 'Sputnik V', 'Adenovirus Ad26 y Ad', '2024-01-07', 5, 0, 3, NULL),
(1357, 391343, 'Sinopharm y Sinovac', 'Partículas SARS-CoV-', '2024-01-07', 4, 0, 2, NULL),
(1358, 884385, 'Pfizer', 'ARN mensajero (ARNm)', '2024-01-07', 1, 0, 2, NULL),
(1359, 205805, 'Johnson_Johnson', 'Partículas SARS-CoV-', '2024-01-07', 2, 0, 3, NULL),
(1360, 112942, 'AstraZeneca', 'Proteína de pico del', '2024-01-07', 3, 0, 3, NULL),
(1361, 963428, 'AstraZeneca', 'Proteína de pico del', '2024-01-07', 3, 0, 1, NULL),
(1362, 545182, 'Sinopharm y Sinovac', 'Partículas SARS-CoV-', '2024-01-07', 4, 0, 1, NULL),
(1363, 766196, 'AstraZeneca', 'Proteína de pico del', '2024-01-07', 3, 0, 3, NULL),
(1364, 515456, 'Sputnik V', 'Adenovirus Ad26 y Ad', '2024-01-07', 5, 0, 2, NULL),
(1365, 248867, 'Johnson_Johnson', 'Partículas SARS-CoV-', '2024-01-07', 2, 0, 1, NULL),
(1366, 282424, 'Johnson_Johnson', 'Partículas SARS-CoV-', '2024-01-07', 2, 0, 1, NULL),
(1367, 957224, 'AstraZeneca', 'Proteína de pico del', '2024-01-07', 3, 0, 2, NULL),
(1368, 858122, 'Johnson_Johnson', 'Partículas SARS-CoV-', '2024-01-07', 2, 0, 1, NULL),
(1369, 156141, 'Pfizer', 'ARN mensajero (ARNm)', '2024-01-07', 1, 0, 3, NULL),
(1370, 426594, 'Sinopharm y Sinovac', 'Partículas SARS-CoV-', '2024-01-07', 4, 0, 3, NULL),
(1371, 885015, 'Johnson_Johnson', 'Partículas SARS-CoV-', '2024-01-07', 2, 0, 1, NULL),
(1372, 472571, 'Sinopharm y Sinovac', 'Partículas SARS-CoV-', '2024-01-07', 4, 0, 2, NULL),
(1373, 514533, 'Sputnik V', 'Adenovirus Ad26 y Ad', '2024-01-07', 5, 0, 2, NULL),
(1374, 162144, 'Johnson_Johnson', 'Partículas SARS-CoV-', '2024-01-07', 2, 0, 3, NULL),
(1375, 772233, 'Sputnik V', 'Adenovirus Ad26 y Ad', '2024-01-07', 5, 0, 3, NULL),
(1376, 874660, 'Johnson_Johnson', 'Partículas SARS-CoV-', '2024-01-07', 2, 0, 3, NULL),
(1377, 242682, 'Pfizer', 'ARN mensajero (ARNm)', '2024-01-07', 1, 0, 3, NULL),
(1378, 743048, 'AstraZeneca', 'Proteína de pico del', '2024-01-07', 3, 0, 3, NULL),
(1379, 56058, 'Pfizer', 'ARN mensajero (ARNm)', '2024-01-07', 1, 0, 3, NULL),
(1380, 205501, 'Sinopharm y Sinovac', 'Partículas SARS-CoV-', '2024-01-07', 4, 0, 2, NULL),
(1381, 748147, 'Sinopharm y Sinovac', 'Partículas SARS-CoV-', '2024-01-07', 4, 0, 3, NULL),
(1382, 663599, 'Sinopharm y Sinovac', 'Partículas SARS-CoV-', '2024-01-07', 4, 0, 2, NULL),
(1383, 793639, 'Pfizer', 'ARN mensajero (ARNm)', '2024-01-07', 1, 0, 2, NULL),
(1384, 561248, 'Pfizer', 'ARN mensajero (ARNm)', '2024-01-07', 1, 0, 3, NULL),
(1385, 818560, 'AstraZeneca', 'Proteína de pico del', '2024-01-07', 3, 0, 2, NULL),
(1386, 397817, 'Sputnik V', 'Adenovirus Ad26 y Ad', '2024-01-07', 5, 0, 3, NULL),
(1387, 18889, 'Johnson_Johnson', 'Partículas SARS-CoV-', '2024-01-07', 2, 0, 2, NULL),
(1388, 141899, 'Johnson_Johnson', 'Partículas SARS-CoV-', '2024-01-07', 2, 0, 2, NULL),
(1389, 429994, 'Sputnik V', 'Adenovirus Ad26 y Ad', '2024-01-07', 5, 0, 2, NULL),
(1390, 165566, 'Pfizer', 'ARN mensajero (ARNm)', '2024-01-07', 1, 0, 1, NULL),
(1391, 781452, 'AstraZeneca', 'Proteína de pico del', '2024-01-07', 3, 0, 1, NULL),
(1392, 541005, 'Sinopharm y Sinovac', 'Partículas SARS-CoV-', '2024-01-07', 4, 0, 2, NULL),
(1393, 156986, 'AstraZeneca', 'Proteína de pico del', '2024-01-07', 3, 0, 3, NULL),
(1394, 371960, 'Sinopharm y Sinovac', 'Partículas SARS-CoV-', '2024-01-07', 4, 0, 1, NULL),
(1395, 279292, 'Johnson_Johnson', 'Partículas SARS-CoV-', '2024-01-07', 2, 0, 3, NULL),
(1396, 733483, 'Pfizer', 'ARN mensajero (ARNm)', '2024-01-07', 1, 0, 1, NULL),
(1397, 221145, 'Sinopharm y Sinovac', 'Partículas SARS-CoV-', '2024-01-07', 4, 0, 2, NULL),
(1398, 898861, 'Johnson_Johnson', 'Partículas SARS-CoV-', '2024-01-07', 2, 0, 3, NULL),
(1399, 770797, 'Pfizer', 'ARN mensajero (ARNm)', '2024-01-07', 1, 0, 3, NULL),
(1400, 397863, 'AstraZeneca', 'Proteína de pico del', '2024-01-07', 3, 0, 2, NULL),
(1401, 661604, 'Sputnik V', 'Adenovirus Ad26 y Ad', '2024-01-07', 5, 0, 3, NULL),
(1402, 303244, 'Sputnik V', 'Adenovirus Ad26 y Ad', '2024-01-07', 5, 0, 3, NULL),
(1403, 820438, 'AstraZeneca', 'Proteína de pico del', '2024-01-07', 3, 0, 2, NULL),
(1404, 132154, 'Pfizer', 'ARN mensajero (ARNm)', '2024-01-07', 1, 0, 1, NULL),
(1405, 650604, 'AstraZeneca', 'Proteína de pico del', '2024-01-07', 3, 0, 3, NULL),
(1406, 196935, 'Sputnik V', 'Adenovirus Ad26 y Ad', '2024-01-07', 5, 0, 3, NULL),
(1407, 893954, 'Johnson_Johnson', 'Partículas SARS-CoV-', '2024-01-07', 2, 0, 1, NULL),
(1408, 889082, 'Pfizer', 'ARN mensajero (ARNm)', '2024-01-07', 1, 0, 3, NULL),
(1409, 611273, 'Sinopharm y Sinovac', 'Partículas SARS-CoV-', '2024-01-07', 4, 0, 1, NULL),
(1410, 645708, 'Sputnik V', 'Adenovirus Ad26 y Ad', '2024-01-07', 5, 0, 2, NULL),
(1411, 374667, 'Sinopharm y Sinovac', 'Partículas SARS-CoV-', '2024-01-07', 4, 0, 1, NULL),
(1412, 566851, 'AstraZeneca', 'Proteína de pico del', '2024-01-07', 3, 0, 2, NULL),
(1413, 522224, 'Sinopharm y Sinovac', 'Partículas SARS-CoV-', '2024-01-07', 4, 0, 3, NULL),
(1414, 332948, 'Sputnik V', 'Adenovirus Ad26 y Ad', '2024-01-07', 5, 0, 1, NULL),
(1415, 721994, 'Sputnik V', 'Adenovirus Ad26 y Ad', '2024-01-07', 5, 0, 3, NULL),
(1416, 145629, 'Pfizer', 'ARN mensajero (ARNm)', '2024-01-07', 1, 0, 1, NULL),
(1417, 614871, 'Johnson_Johnson', 'Partículas SARS-CoV-', '2024-01-07', 2, 0, 1, NULL),
(1418, 484060, 'Sputnik V', 'Adenovirus Ad26 y Ad', '2024-01-07', 5, 0, 3, NULL),
(1419, 736335, 'Pfizer', 'ARN mensajero (ARNm)', '2024-01-07', 1, 0, 2, NULL),
(1420, 57870, 'Sputnik V', 'Adenovirus Ad26 y Ad', '2024-01-07', 5, 0, 3, NULL),
(1421, 584395, 'Johnson_Johnson', 'Partículas SARS-CoV-', '2024-01-07', 2, 0, 3, NULL),
(1422, 142549, 'Johnson_Johnson', 'Partículas SARS-CoV-', '2024-01-07', 2, 0, 3, NULL),
(1423, 731467, 'Sputnik V', 'Adenovirus Ad26 y Ad', '2024-01-07', 5, 0, 2, NULL),
(1424, 622121, 'Johnson_Johnson', 'Partículas SARS-CoV-', '2024-01-07', 2, 0, 3, NULL),
(1425, 444101, 'Johnson_Johnson', 'Partículas SARS-CoV-', '2024-01-07', 2, 0, 2, NULL),
(1426, 327145, 'Pfizer', 'ARN mensajero (ARNm)', '2024-01-07', 1, 0, 3, NULL),
(1427, 846219, 'Sinopharm y Sinovac', 'Partículas SARS-CoV-', '2024-01-07', 4, 0, 1, NULL),
(1428, 355369, 'Sinopharm y Sinovac', 'Partículas SARS-CoV-', '2024-01-07', 4, 0, 3, NULL),
(1429, 255441, 'AstraZeneca', 'Proteína de pico del', '2024-01-07', 3, 0, 2, NULL),
(1430, 881591, 'Sinopharm y Sinovac', 'Partículas SARS-CoV-', '2024-01-07', 4, 0, 2, NULL),
(1431, 751627, 'Sputnik V', 'Adenovirus Ad26 y Ad', '2024-01-07', 5, 0, 3, NULL),
(1432, 808062, 'Sinopharm y Sinovac', 'Partículas SARS-CoV-', '2024-01-07', 4, 0, 3, NULL),
(1433, 162238, 'Sinopharm y Sinovac', 'Partículas SARS-CoV-', '2024-01-07', 4, 0, 2, NULL),
(1434, 454699, 'Sinopharm y Sinovac', 'Partículas SARS-CoV-', '2024-01-07', 4, 0, 3, NULL),
(1435, 627926, 'AstraZeneca', 'Proteína de pico del', '2024-01-07', 3, 0, 1, NULL),
(1436, 238768, 'Sputnik V', 'Adenovirus Ad26 y Ad', '2024-01-07', 5, 0, 1, NULL),
(1437, 447730, 'Sputnik V', 'Adenovirus Ad26 y Ad', '2024-01-07', 5, 0, 1, NULL),
(1438, 17972, 'Pfizer', 'ARN mensajero (ARNm)', '2024-01-07', 1, 0, 2, NULL),
(1439, 497652, 'Sputnik V', 'Adenovirus Ad26 y Ad', '2024-01-07', 5, 0, 1, NULL),
(1440, 962095, 'Johnson_Johnson', 'Partículas SARS-CoV-', '2024-01-07', 2, 0, 2, NULL),
(1441, 716818, 'AstraZeneca', 'Proteína de pico del', '2024-01-07', 3, 0, 2, NULL),
(1442, 641602, 'Sinopharm y Sinovac', 'Partículas SARS-CoV-', '2024-01-07', 4, 0, 1, NULL),
(1443, 806793, 'Johnson_Johnson', 'Partículas SARS-CoV-', '2024-01-07', 2, 0, 3, NULL),
(1444, 563774, 'Sinopharm y Sinovac', 'Partículas SARS-CoV-', '2024-01-07', 4, 0, 3, NULL),
(1445, 783427, 'AstraZeneca', 'Proteína de pico del', '2024-01-07', 3, 0, 2, NULL),
(1446, 906854, 'Pfizer', 'ARN mensajero (ARNm)', '2024-01-07', 1, 0, 3, NULL),
(1447, 545337, 'AstraZeneca', 'Proteína de pico del', '2024-01-07', 3, 0, 3, NULL),
(1448, 380977, 'Pfizer', 'ARN mensajero (ARNm)', '2024-01-07', 1, 0, 1, NULL),
(1449, 414220, 'AstraZeneca', 'Proteína de pico del', '2024-01-07', 3, 0, 2, NULL),
(1450, 333850, 'Sputnik V', 'Adenovirus Ad26 y Ad', '2024-01-07', 5, 0, 2, NULL),
(1451, 191734, 'Johnson_Johnson', 'Partículas SARS-CoV-', '2024-01-07', 2, 0, 2, NULL),
(1452, 693740, 'Sinopharm y Sinovac', 'Partículas SARS-CoV-', '2024-01-07', 4, 0, 2, NULL),
(1453, 744892, 'Johnson_Johnson', 'Partículas SARS-CoV-', '2024-01-07', 2, 0, 1, NULL),
(1454, 548452, 'Sputnik V', 'Adenovirus Ad26 y Ad', '2024-01-07', 5, 0, 3, NULL),
(1455, 352710, 'Sinopharm y Sinovac', 'Partículas SARS-CoV-', '2024-01-07', 4, 0, 1, NULL),
(1456, 965002, 'Pfizer', 'ARN mensajero (ARNm)', '2024-01-07', 1, 0, 1, NULL),
(1457, 944112, 'Sinopharm y Sinovac', 'Partículas SARS-CoV-', '2024-01-07', 4, 0, 3, NULL),
(1458, 600474, 'Pfizer', 'ARN mensajero (ARNm)', '2024-01-07', 1, 0, 2, NULL),
(1459, 150506, 'Sputnik V', 'Adenovirus Ad26 y Ad', '2024-01-07', 5, 0, 2, NULL),
(1460, 202088, 'Sputnik V', 'Adenovirus Ad26 y Ad', '2024-01-07', 5, 0, 3, NULL),
(1461, 552673, 'Johnson_Johnson', 'Partículas SARS-CoV-', '2024-01-07', 2, 0, 3, NULL),
(1462, 877626, 'Pfizer', 'ARN mensajero (ARNm)', '2024-01-07', 1, 0, 1, NULL),
(1463, 184071, 'Sputnik V', 'Adenovirus Ad26 y Ad', '2024-01-07', 5, 0, 1, NULL),
(1464, 91598, 'Pfizer', 'ARN mensajero (ARNm)', '2024-01-07', 1, 0, 1, NULL),
(1465, 871735, 'AstraZeneca', 'Proteína de pico del', '2024-01-07', 3, 0, 3, NULL),
(1466, 435609, 'Johnson_Johnson', 'Partículas SARS-CoV-', '2024-01-07', 2, 0, 1, NULL),
(1467, 258869, 'Johnson_Johnson', 'Partículas SARS-CoV-', '2024-01-07', 2, 0, 1, NULL),
(1468, 982497, 'Pfizer', 'ARN mensajero (ARNm)', '2024-01-07', 1, 0, 2, NULL),
(1469, 814068, 'Sinopharm y Sinovac', 'Partículas SARS-CoV-', '2024-01-07', 4, 0, 1, NULL),
(1470, 284490, 'Pfizer', 'ARN mensajero (ARNm)', '2024-01-07', 1, 0, 2, NULL),
(1471, 41887, 'Pfizer', 'ARN mensajero (ARNm)', '2024-01-07', 1, 0, 1, NULL),
(1472, 58797, 'AstraZeneca', 'Proteína de pico del', '2024-01-07', 3, 0, 1, NULL),
(1473, 765985, 'Pfizer', 'ARN mensajero (ARNm)', '2024-01-07', 1, 0, 1, NULL),
(1474, 234950, 'Sinopharm y Sinovac', 'Partículas SARS-CoV-', '2024-01-07', 4, 0, 1, NULL),
(1475, 354100, 'Pfizer', 'ARN mensajero (ARNm)', '2024-01-07', 1, 0, 1, NULL),
(1476, 153597, 'Johnson_Johnson', 'Partículas SARS-CoV-', '2024-01-07', 2, 0, 1, NULL),
(1477, 235224, 'Johnson_Johnson', 'Partículas SARS-CoV-', '2024-01-07', 2, 0, 3, NULL),
(1478, 315263, 'Pfizer', 'ARN mensajero (ARNm)', '2024-01-07', 1, 0, 2, NULL),
(1479, 962042, 'AstraZeneca', 'Proteína de pico del', '2024-01-07', 3, 0, 2, NULL),
(1480, 610320, 'Johnson_Johnson', 'Partículas SARS-CoV-', '2024-01-07', 2, 0, 1, NULL),
(1481, 381274, 'Sputnik V', 'Adenovirus Ad26 y Ad', '2024-01-07', 5, 0, 3, NULL),
(1482, 520793, 'AstraZeneca', 'Proteína de pico del', '2024-01-07', 3, 0, 2, NULL),
(1483, 473336, 'Pfizer', 'ARN mensajero (ARNm)', '2024-01-07', 1, 0, 1, NULL),
(1484, 394868, 'Sputnik V', 'Adenovirus Ad26 y Ad', '2024-01-07', 5, 0, 3, NULL),
(1485, 939746, 'AstraZeneca', 'Proteína de pico del', '2024-01-07', 3, 0, 2, NULL),
(1486, 752565, 'Sinopharm y Sinovac', 'Partículas SARS-CoV-', '2024-01-07', 4, 0, 1, NULL),
(1487, 277892, 'AstraZeneca', 'Proteína de pico del', '2024-01-07', 3, 0, 1, NULL),
(1488, 303979, 'AstraZeneca', 'Proteína de pico del', '2024-01-07', 3, 0, 3, NULL),
(1489, 561122, 'Johnson_Johnson', 'Partículas SARS-CoV-', '2024-01-07', 2, 0, 3, NULL),
(1490, 239904, 'AstraZeneca', 'Proteína de pico del', '2024-01-07', 3, 0, 1, NULL),
(1491, 407213, 'AstraZeneca', 'Proteína de pico del', '2024-01-07', 3, 0, 2, NULL),
(1492, 600475, 'Johnson_Johnson', 'Partículas SARS-CoV-', '2024-01-07', 2, 0, 2, NULL),
(1493, 186778, 'Sputnik V', 'Adenovirus Ad26 y Ad', '2024-01-07', 5, 0, 1, NULL),
(1494, 524400, 'Johnson_Johnson', 'Partículas SARS-CoV-', '2024-01-07', 2, 0, 1, NULL),
(1495, 708600, 'Johnson_Johnson', 'Partículas SARS-CoV-', '2024-01-07', 2, 0, 2, NULL),
(1496, 735122, 'Sinopharm y Sinovac', 'Partículas SARS-CoV-', '2024-01-07', 4, 0, 3, NULL),
(1497, 781473, 'Johnson_Johnson', 'Partículas SARS-CoV-', '2024-01-07', 2, 0, 3, NULL),
(1498, 208407, 'AstraZeneca', 'Proteína de pico del', '2024-01-07', 3, 0, 3, NULL),
(1499, 849263, 'AstraZeneca', 'Proteína de pico del', '2024-01-07', 3, 0, 2, NULL),
(1500, 987755, 'AstraZeneca', 'Proteína de pico del', '2024-01-07', 3, 0, 1, NULL),
(1501, 531524, 'Sinopharm y Sinovac', 'Partículas SARS-CoV-', '2024-01-07', 4, 0, 1, NULL),
(1502, 141019, 'Sinopharm y Sinovac', 'Partículas SARS-CoV-', '2024-01-07', 4, 0, 2, NULL),
(1503, 377220, 'Sputnik V', 'Adenovirus Ad26 y Ad', '2024-01-07', 5, 0, 2, NULL),
(1504, 876839, 'AstraZeneca', 'Proteína de pico del', '2024-01-07', 3, 0, 2, NULL),
(1505, 501671, 'Pfizer', 'ARN mensajero (ARNm)', '2024-01-07', 1, 0, 3, NULL),
(1506, 527941, 'Johnson_Johnson', 'Partículas SARS-CoV-', '2024-01-07', 2, 0, 1, NULL),
(1507, 371554, 'Pfizer', 'ARN mensajero (ARNm)', '2024-01-07', 1, 0, 2, NULL),
(1508, 47069, 'AstraZeneca', 'Proteína de pico del', '2024-01-07', 3, 0, 1, NULL),
(1509, 721192, 'Pfizer', 'ARN mensajero (ARNm)', '2024-01-07', 1, 0, 3, NULL),
(1510, 608908, 'AstraZeneca', 'Proteína de pico del', '2024-01-07', 3, 0, 1, NULL),
(1511, 114002, 'Sinopharm y Sinovac', 'Partículas SARS-CoV-', '2024-01-07', 4, 0, 3, NULL),
(1512, 48644, 'Pfizer', 'ARN mensajero (ARNm)', '2024-01-07', 1, 0, 1, NULL),
(1513, 741100, 'AstraZeneca', 'Proteína de pico del', '2024-01-07', 3, 0, 2, NULL),
(1514, 47270, 'Pfizer', 'ARN mensajero (ARNm)', '2024-01-07', 1, 0, 3, NULL),
(1515, 707022, 'Johnson_Johnson', 'Partículas SARS-CoV-', '2024-01-07', 2, 0, 2, NULL),
(1516, 969749, 'Sputnik V', 'Adenovirus Ad26 y Ad', '2024-01-07', 5, 0, 2, NULL),
(1517, 869309, 'Sinopharm y Sinovac', 'Partículas SARS-CoV-', '2024-01-07', 4, 0, 1, NULL),
(1518, 21094, 'Sputnik V', 'Adenovirus Ad26 y Ad', '2024-01-07', 5, 0, 2, NULL),
(1519, 650377, 'Sputnik V', 'Adenovirus Ad26 y Ad', '2024-01-07', 5, 0, 1, NULL),
(1520, 275361, 'AstraZeneca', 'Proteína de pico del', '2024-01-07', 3, 0, 3, NULL),
(1521, 549428, 'Johnson_Johnson', 'Partículas SARS-CoV-', '2024-01-07', 2, 0, 1, NULL),
(1522, 193602, 'Sputnik V', 'Adenovirus Ad26 y Ad', '2024-01-07', 5, 0, 3, NULL),
(1523, 68980, 'AstraZeneca', 'Proteína de pico del', '2024-01-07', 3, 0, 1, NULL),
(1524, 440845, 'Johnson_Johnson', 'Partículas SARS-CoV-', '2024-01-07', 2, 0, 2, NULL),
(1525, 701394, 'Sinopharm y Sinovac', 'Partículas SARS-CoV-', '2024-01-07', 4, 0, 2, NULL),
(1526, 273011, 'Pfizer', 'ARN mensajero (ARNm)', '2024-01-07', 1, 0, 3, NULL),
(1527, 559101, 'Johnson_Johnson', 'Partículas SARS-CoV-', '2024-01-07', 2, 0, 3, NULL),
(1528, 47918, 'AstraZeneca', 'Proteína de pico del', '2024-01-07', 3, 0, 3, NULL),
(1529, 288441, 'Pfizer', 'ARN mensajero (ARNm)', '2024-01-07', 1, 0, 3, NULL),
(1530, 747796, 'Johnson_Johnson', 'Partículas SARS-CoV-', '2024-01-07', 2, 0, 3, NULL),
(1531, 488264, 'Pfizer', 'ARN mensajero (ARNm)', '2024-01-07', 1, 0, 2, NULL),
(1532, 933400, 'AstraZeneca', 'Proteína de pico del', '2024-01-07', 3, 0, 3, NULL),
(1533, 914941, 'Sinopharm y Sinovac', 'Partículas SARS-CoV-', '2024-01-07', 4, 0, 3, NULL),
(1534, 603127, 'Johnson_Johnson', 'Partículas SARS-CoV-', '2024-01-07', 2, 0, 1, NULL),
(1535, 46020, 'Sputnik V', 'Adenovirus Ad26 y Ad', '2024-01-07', 5, 0, 1, NULL),
(1536, 747782, 'Sinopharm y Sinovac', 'Partículas SARS-CoV-', '2024-01-07', 4, 0, 1, NULL),
(1537, 893429, 'Johnson_Johnson', 'Partículas SARS-CoV-', '2024-01-07', 2, 0, 2, NULL),
(1538, 387720, 'Johnson_Johnson', 'Partículas SARS-CoV-', '2024-01-07', 2, 0, 2, NULL),
(1539, 398485, 'Sputnik V', 'Adenovirus Ad26 y Ad', '2024-01-07', 5, 0, 1, NULL),
(1540, 890978, 'Sinopharm y Sinovac', 'Partículas SARS-CoV-', '2024-01-07', 4, 0, 2, NULL),
(1541, 946699, 'AstraZeneca', 'Proteína de pico del', '2024-01-07', 3, 0, 2, NULL),
(1542, 907560, 'Sputnik V', 'Adenovirus Ad26 y Ad', '2024-01-07', 5, 0, 3, NULL),
(1543, 948928, 'Sinopharm y Sinovac', 'Partículas SARS-CoV-', '2024-01-07', 4, 0, 3, NULL),
(1544, 246751, 'Pfizer', 'ARN mensajero (ARNm)', '2024-01-07', 1, 0, 1, NULL),
(1545, 532094, 'Johnson_Johnson', 'Partículas SARS-CoV-', '2024-01-07', 2, 0, 2, NULL),
(1546, 73930, 'Johnson_Johnson', 'Partículas SARS-CoV-', '2024-01-07', 2, 0, 2, NULL),
(1547, 949859, 'AstraZeneca', 'Proteína de pico del', '2024-01-07', 3, 0, 1, NULL),
(1548, 435139, 'Johnson_Johnson', 'Partículas SARS-CoV-', '2024-01-07', 2, 0, 3, NULL),
(1549, 690205, 'Johnson_Johnson', 'Partículas SARS-CoV-', '2024-01-07', 2, 0, 3, NULL),
(1550, 27902, 'Johnson_Johnson', 'Partículas SARS-CoV-', '2024-01-07', 2, 0, 3, NULL),
(1551, 548990, 'Sinopharm y Sinovac', 'Partículas SARS-CoV-', '2024-01-07', 4, 0, 1, NULL),
(1552, 443806, 'Sputnik V', 'Adenovirus Ad26 y Ad', '2024-01-07', 5, 0, 2, NULL),
(1553, 328948, 'Johnson_Johnson', 'Partículas SARS-CoV-', '2024-01-07', 2, 0, 3, NULL),
(1554, 601938, 'Sputnik V', 'Adenovirus Ad26 y Ad', '2024-01-07', 5, 0, 3, NULL),
(1555, 782088, 'Sinopharm y Sinovac', 'Partículas SARS-CoV-', '2024-01-07', 4, 0, 3, NULL),
(1556, 484612, 'Sinopharm y Sinovac', 'Partículas SARS-CoV-', '2024-01-07', 4, 0, 2, NULL),
(1557, 956538, 'Sputnik V', 'Adenovirus Ad26 y Ad', '2024-01-07', 5, 0, 1, NULL),
(1558, 461462, 'AstraZeneca', 'Proteína de pico del', '2024-01-07', 3, 0, 3, NULL),
(1559, 50187, 'Sputnik V', 'Adenovirus Ad26 y Ad', '2024-01-07', 5, 0, 3, NULL),
(1560, 750772, 'Pfizer', 'ARN mensajero (ARNm)', '2024-01-07', 1, 0, 3, NULL),
(1561, 73172, 'AstraZeneca', 'Proteína de pico del', '2024-01-07', 3, 0, 1, NULL),
(1562, 895244, 'Johnson_Johnson', 'Partículas SARS-CoV-', '2024-01-07', 2, 0, 3, NULL),
(1563, 236741, 'Pfizer', 'ARN mensajero (ARNm)', '2024-01-07', 1, 0, 2, NULL),
(1564, 422860, 'Johnson_Johnson', 'Partículas SARS-CoV-', '2024-01-07', 2, 0, 3, NULL),
(1565, 721270, 'Sputnik V', 'Adenovirus Ad26 y Ad', '2024-01-07', 5, 0, 1, NULL),
(1566, 193158, 'AstraZeneca', 'Proteína de pico del', '2024-01-07', 3, 0, 3, NULL),
(1567, 832266, 'Sputnik V', 'Adenovirus Ad26 y Ad', '2024-01-07', 5, 0, 3, NULL),
(1568, 788473, 'Sputnik V', 'Adenovirus Ad26 y Ad', '2024-01-07', 5, 0, 3, NULL),
(1569, 77901, 'AstraZeneca', 'Proteína de pico del', '2024-01-07', 3, 0, 1, NULL),
(1570, 863381, 'Sputnik V', 'Adenovirus Ad26 y Ad', '2024-01-07', 5, 0, 1, NULL),
(1571, 239636, 'Sinopharm y Sinovac', 'Partículas SARS-CoV-', '2024-01-07', 4, 0, 2, NULL),
(1572, 700766, 'Sputnik V', 'Adenovirus Ad26 y Ad', '2024-01-07', 5, 0, 3, NULL),
(1573, 450582, 'Johnson_Johnson', 'Partículas SARS-CoV-', '2024-01-07', 2, 0, 3, NULL),
(1574, 598266, 'Johnson_Johnson', 'Partículas SARS-CoV-', '2024-01-07', 2, 0, 2, NULL),
(1575, 832656, 'Johnson_Johnson', 'Partículas SARS-CoV-', '2024-01-07', 2, 0, 1, NULL),
(1576, 805128, 'Johnson_Johnson', 'Partículas SARS-CoV-', '2024-01-07', 2, 0, 1, NULL),
(1578, 212504, 'AstraZeneca', 'Proteína de pico del', '2024-01-07', 3, 0, 3, NULL),
(1579, 252347, 'Pfizer', 'ARN mensajero (ARNm)', '2024-01-07', 1, 0, 2, NULL),
(1580, 376411, 'AstraZeneca', 'Proteína de pico del', '2024-01-07', 3, 0, 2, NULL),
(1581, 268441, 'Johnson_Johnson', 'Partículas SARS-CoV-', '2024-01-07', 2, 0, 2, NULL),
(1582, 751047, 'Pfizer', 'ARN mensajero (ARNm)', '2024-01-07', 1, 0, 2, NULL),
(1583, 976911, 'AstraZeneca', 'Proteína de pico del', '2024-01-07', 3, 0, 1, NULL),
(1584, 897499, 'Sinopharm y Sinovac', 'Partículas SARS-CoV-', '2024-01-07', 4, 0, 1, NULL),
(1585, 693541, 'AstraZeneca', 'Proteína de pico del', '2024-01-07', 3, 0, 3, NULL),
(1586, 2750, 'Johnson_Johnson', 'Partículas SARS-CoV-', '2024-01-07', 2, 0, 3, NULL),
(1587, 837309, 'Johnson_Johnson', 'Partículas SARS-CoV-', '2024-01-07', 2, 0, 2, NULL),
(1588, 937272, 'Sputnik V', 'Adenovirus Ad26 y Ad', '2024-01-07', 5, 0, 1, NULL),
(1589, 121755, 'Sinopharm y Sinovac', 'Partículas SARS-CoV-', '2024-01-07', 4, 0, 1, NULL),
(1590, 15561, 'Sinopharm y Sinovac', 'Partículas SARS-CoV-', '2024-01-07', 4, 0, 1, NULL),
(1591, 698980, 'Sinopharm y Sinovac', 'Partículas SARS-CoV-', '2024-01-07', 4, 0, 1, NULL),
(1592, 538209, 'AstraZeneca', 'Proteína de pico del', '2024-01-07', 3, 0, 2, NULL),
(1593, 744616, 'Pfizer', 'ARN mensajero (ARNm)', '2024-01-07', 1, 0, 3, NULL),
(1594, 427388, 'Johnson_Johnson', 'Partículas SARS-CoV-', '2024-01-07', 2, 0, 1, NULL),
(1595, 190856, 'Pfizer', 'ARN mensajero (ARNm)', '2024-01-07', 1, 0, 2, NULL),
(1596, 774956, 'Pfizer', 'ARN mensajero (ARNm)', '2024-01-07', 1, 0, 2, NULL),
(1597, 489737, 'Pfizer', 'ARN mensajero (ARNm)', '2024-01-07', 1, 0, 2, NULL),
(1598, 811101, 'Sinopharm y Sinovac', 'Partículas SARS-CoV-', '2024-01-07', 4, 0, 1, NULL),
(1599, 69526, 'AstraZeneca', 'Proteína de pico del', '2024-01-07', 3, 0, 2, NULL),
(1600, 125559, 'Sputnik V', 'Adenovirus Ad26 y Ad', '2024-01-07', 5, 0, 1, NULL),
(1601, 354760, 'AstraZeneca', 'Proteína de pico del', '2024-01-07', 3, 0, 3, NULL),
(1602, 184009, 'Pfizer', 'ARN mensajero (ARNm)', '2024-01-07', 1, 0, 2, NULL),
(1603, 98183, 'AstraZeneca', 'Proteína de pico del', '2024-01-07', 3, 0, 2, NULL),
(1604, 577024, 'Sputnik V', 'Adenovirus Ad26 y Ad', '2024-01-07', 5, 0, 3, NULL),
(1605, 235761, 'Sinopharm y Sinovac', 'Partículas SARS-CoV-', '2024-01-07', 4, 0, 3, NULL),
(1606, 612792, 'Pfizer', 'ARN mensajero (ARNm)', '2024-01-07', 1, 0, 1, NULL),
(1607, 360883, 'Johnson_Johnson', 'Partículas SARS-CoV-', '2024-01-07', 2, 0, 1, NULL),
(1608, 959194, 'Sinopharm y Sinovac', 'Partículas SARS-CoV-', '2024-01-07', 4, 0, 3, NULL),
(1609, 229684, 'Sputnik V', 'Adenovirus Ad26 y Ad', '2024-01-07', 5, 0, 1, NULL),
(1610, 994299, 'AstraZeneca', 'Proteína de pico del', '2024-01-07', 3, 0, 1, NULL),
(1611, 886687, 'Sputnik V', 'Adenovirus Ad26 y Ad', '2024-01-07', 5, 0, 3, NULL),
(1612, 322221, 'AstraZeneca', 'Proteína de pico del', '2024-01-07', 3, 0, 3, NULL),
(1613, 141387, 'Pfizer', 'ARN mensajero (ARNm)', '2024-01-07', 1, 0, 3, NULL),
(1614, 835811, 'Sinopharm y Sinovac', 'Partículas SARS-CoV-', '2024-01-07', 4, 0, 3, NULL),
(1615, 256168, 'AstraZeneca', 'Proteína de pico del', '2024-01-07', 3, 0, 1, NULL),
(1616, 587954, 'Johnson_Johnson', 'Partículas SARS-CoV-', '2024-01-07', 2, 0, 2, NULL),
(1617, 20561, 'Sinopharm y Sinovac', 'Partículas SARS-CoV-', '2024-01-07', 4, 0, 2, NULL),
(1618, 195237, 'Johnson_Johnson', 'Partículas SARS-CoV-', '2024-01-07', 2, 0, 2, NULL),
(1619, 504326, 'Sputnik V', 'Adenovirus Ad26 y Ad', '2024-01-07', 5, 0, 1, NULL),
(1620, 214341, 'Sputnik V', 'Adenovirus Ad26 y Ad', '2024-01-07', 5, 0, 2, NULL),
(1621, 992307, 'Johnson_Johnson', 'Partículas SARS-CoV-', '2024-01-07', 2, 0, 1, NULL),
(1622, 872417, 'Pfizer', 'ARN mensajero (ARNm)', '2024-01-07', 1, 0, 3, NULL),
(1623, 119321, 'Johnson_Johnson', 'Partículas SARS-CoV-', '2024-01-07', 2, 0, 3, NULL),
(1624, 214486, 'Pfizer', 'ARN mensajero (ARNm)', '2024-01-07', 1, 0, 2, NULL),
(1625, 427344, 'Sputnik V', 'Adenovirus Ad26 y Ad', '2024-01-07', 5, 0, 3, NULL),
(1626, 467087, 'Pfizer', 'ARN mensajero (ARNm)', '2024-01-07', 1, 0, 1, NULL),
(1627, 265532, 'Pfizer', 'ARN mensajero (ARNm)', '2024-01-07', 1, 0, 3, NULL),
(1628, 568313, 'Sinopharm y Sinovac', 'Partículas SARS-CoV-', '2024-01-07', 4, 0, 2, NULL),
(1629, 623828, 'Pfizer', 'ARN mensajero (ARNm)', '2024-01-07', 1, 0, 2, NULL),
(1630, 37254, 'Sinopharm y Sinovac', 'Partículas SARS-CoV-', '2024-01-07', 4, 0, 1, NULL),
(1631, 532308, 'Pfizer', 'ARN mensajero (ARNm)', '2024-01-07', 1, 0, 3, NULL),
(1632, 854785, 'Pfizer', 'ARN mensajero (ARNm)', '2024-01-07', 1, 0, 2, NULL),
(1633, 642467, 'AstraZeneca', 'Proteína de pico del', '2024-01-07', 3, 0, 1, NULL),
(1634, 803624, 'Pfizer', 'ARN mensajero (ARNm)', '2024-01-07', 1, 0, 3, NULL),
(1635, 526369, 'Sinopharm y Sinovac', 'Partículas SARS-CoV-', '2024-01-07', 4, 0, 3, NULL),
(1636, 816458, 'Sputnik V', 'Adenovirus Ad26 y Ad', '2024-01-07', 5, 0, 1, NULL),
(1637, 750104, 'Johnson_Johnson', 'Partículas SARS-CoV-', '2024-01-07', 2, 0, 3, NULL),
(1638, 651385, 'Pfizer', 'ARN mensajero (ARNm)', '2024-01-07', 1, 0, 3, NULL),
(1639, 486179, 'Pfizer', 'ARN mensajero (ARNm)', '2024-01-07', 1, 0, 3, NULL),
(1640, 545660, 'Sinopharm y Sinovac', 'Partículas SARS-CoV-', '2024-01-07', 4, 0, 2, NULL),
(1641, 84165, 'Pfizer', 'ARN mensajero (ARNm)', '2024-01-07', 1, 0, 3, NULL),
(1642, 80091, 'Johnson_Johnson', 'Partículas SARS-CoV-', '2024-01-07', 2, 0, 3, NULL),
(1643, 800686, 'Sputnik V', 'Adenovirus Ad26 y Ad', '2024-01-07', 5, 0, 2, NULL),
(1644, 52894, 'Pfizer', 'ARN mensajero (ARNm)', '2024-01-07', 1, 0, 2, NULL),
(1645, 651343, 'Pfizer', 'ARN mensajero (ARNm)', '2024-01-07', 1, 0, 3, NULL),
(1646, 745522, 'Johnson_Johnson', 'Partículas SARS-CoV-', '2024-01-07', 2, 0, 3, NULL),
(1647, 862729, 'Pfizer', 'ARN mensajero (ARNm)', '2024-01-07', 1, 0, 3, NULL),
(1648, 143077, 'Sinopharm y Sinovac', 'Partículas SARS-CoV-', '2024-01-07', 4, 0, 1, NULL),
(1649, 618621, 'Sputnik V', 'Adenovirus Ad26 y Ad', '2024-01-07', 5, 0, 3, NULL),
(1650, 824330, 'Sputnik V', 'Adenovirus Ad26 y Ad', '2024-01-07', 5, 0, 3, NULL),
(1651, 78952, 'AstraZeneca', 'Proteína de pico del', '2024-01-07', 3, 0, 3, NULL),
(1652, 784058, 'Johnson_Johnson', 'Partículas SARS-CoV-', '2024-01-07', 2, 0, 1, NULL),
(1653, 43203, 'Johnson_Johnson', 'Partículas SARS-CoV-', '2024-01-07', 2, 0, 1, NULL),
(1654, 112937, 'AstraZeneca', 'Proteína de pico del', '2024-01-07', 3, 0, 2, NULL),
(1655, 93457, 'AstraZeneca', 'Proteína de pico del', '2024-01-07', 3, 0, 2, NULL),
(1656, 504348, 'Pfizer', 'ARN mensajero (ARNm)', '2024-01-07', 1, 0, 3, NULL),
(1657, 720165, 'Pfizer', 'ARN mensajero (ARNm)', '2024-01-07', 1, 0, 3, NULL),
(1658, 46574, 'Pfizer', 'ARN mensajero (ARNm)', '2024-01-07', 1, 0, 3, NULL),
(1659, 361522, 'Pfizer', 'ARN mensajero (ARNm)', '2024-01-07', 1, 0, 1, NULL),
(1660, 803316, 'AstraZeneca', 'Proteína de pico del', '2024-01-07', 3, 0, 3, NULL),
(1661, 702594, 'Sinopharm y Sinovac', 'Partículas SARS-CoV-', '2024-01-07', 4, 0, 2, NULL),
(1662, 692501, 'Sinopharm y Sinovac', 'Partículas SARS-CoV-', '2024-01-07', 4, 0, 2, NULL),
(1663, 132551, 'Sputnik V', 'Adenovirus Ad26 y Ad', '2024-01-07', 5, 0, 3, NULL),
(1664, 97146, 'Johnson_Johnson', 'Partículas SARS-CoV-', '2024-01-07', 2, 0, 1, NULL),
(1665, 268735, 'Pfizer', 'ARN mensajero (ARNm)', '2024-01-07', 1, 0, 2, NULL),
(1666, 233366, 'Johnson_Johnson', 'Partículas SARS-CoV-', '2024-01-07', 2, 0, 2, NULL),
(1667, 668029, 'Sinopharm y Sinovac', 'Partículas SARS-CoV-', '2024-01-07', 4, 0, 1, NULL),
(1668, 357614, 'Johnson_Johnson', 'Partículas SARS-CoV-', '2024-01-07', 2, 0, 1, NULL),
(1669, 674110, 'Johnson_Johnson', 'Partículas SARS-CoV-', '2024-01-07', 2, 0, 3, NULL),
(1670, 512341, 'Sputnik V', 'Adenovirus Ad26 y Ad', '2024-01-07', 5, 0, 2, NULL),
(1671, 130622, 'Pfizer', 'ARN mensajero (ARNm)', '2024-01-07', 1, 0, 2, NULL),
(1672, 328304, 'Sputnik V', 'Adenovirus Ad26 y Ad', '2024-01-07', 5, 0, 3, NULL),
(1673, 933834, 'Johnson_Johnson', 'Partículas SARS-CoV-', '2024-01-07', 2, 0, 3, NULL),
(1674, 861059, 'Pfizer', 'ARN mensajero (ARNm)', '2024-01-07', 1, 0, 2, NULL),
(1675, 34632, 'Pfizer', 'ARN mensajero (ARNm)', '2024-01-07', 1, 0, 3, NULL),
(1676, 24168, 'Pfizer', 'ARN mensajero (ARNm)', '2024-01-07', 1, 0, 1, NULL),
(1677, 131307, 'Johnson_Johnson', 'Partículas SARS-CoV-', '2024-01-07', 2, 0, 2, NULL),
(1678, 674564, 'AstraZeneca', 'Proteína de pico del', '2024-01-07', 3, 0, 2, NULL),
(1679, 445901, 'Sinopharm y Sinovac', 'Partículas SARS-CoV-', '2024-01-07', 4, 0, 2, NULL),
(1680, 135369, 'Sputnik V', 'Adenovirus Ad26 y Ad', '2024-01-07', 5, 0, 1, NULL),
(1681, 344186, 'Sinopharm y Sinovac', 'Partículas SARS-CoV-', '2024-01-07', 4, 0, 1, NULL),
(1682, 34388, 'Sputnik V', 'Adenovirus Ad26 y Ad', '2024-01-07', 5, 0, 2, NULL),
(1683, 260838, 'Pfizer', 'ARN mensajero (ARNm)', '2024-01-07', 1, 0, 2, NULL),
(1684, 965132, 'Johnson_Johnson', 'Partículas SARS-CoV-', '2024-01-07', 2, 0, 1, NULL),
(1685, 217045, 'Johnson_Johnson', 'Partículas SARS-CoV-', '2024-01-07', 2, 0, 1, NULL),
(1686, 111535, 'AstraZeneca', 'Proteína de pico del', '2024-01-07', 3, 0, 1, NULL),
(1687, 879610, 'Sputnik V', 'Adenovirus Ad26 y Ad', '2024-01-07', 5, 0, 2, NULL),
(1688, 633885, 'AstraZeneca', 'Proteína de pico del', '2024-01-07', 3, 0, 1, NULL),
(1689, 492316, 'Pfizer', 'ARN mensajero (ARNm)', '2024-01-07', 1, 0, 2, NULL),
(1690, 105569, 'Sputnik V', 'Adenovirus Ad26 y Ad', '2024-01-07', 5, 0, 3, NULL),
(1691, 417616, 'Pfizer', 'ARN mensajero (ARNm)', '2024-01-07', 1, 0, 3, NULL),
(1692, 478230, 'AstraZeneca', 'Proteína de pico del', '2024-01-07', 3, 0, 1, NULL),
(1693, 437116, 'AstraZeneca', 'Proteína de pico del', '2024-01-07', 3, 0, 2, NULL),
(1694, 94164, 'Sinopharm y Sinovac', 'Partículas SARS-CoV-', '2024-01-07', 4, 0, 1, NULL),
(1695, 272249, 'Sinopharm y Sinovac', 'Partículas SARS-CoV-', '2024-01-07', 4, 0, 3, NULL),
(1696, 863363, 'AstraZeneca', 'Proteína de pico del', '2024-01-07', 3, 0, 1, NULL),
(1697, 73278, 'Johnson_Johnson', 'Partículas SARS-CoV-', '2024-01-07', 2, 0, 1, NULL),
(1698, 379392, 'Pfizer', 'ARN mensajero (ARNm)', '2024-01-07', 1, 0, 3, NULL),
(1699, 378518, 'Johnson_Johnson', 'Partículas SARS-CoV-', '2024-01-07', 2, 0, 3, NULL),
(1700, 11313, 'Johnson_Johnson', 'Partículas SARS-CoV-', '2024-01-07', 2, 0, 1, NULL),
(1701, 431370, 'Pfizer', 'ARN mensajero (ARNm)', '2024-01-07', 1, 0, 1, NULL),
(1702, 722677, 'Johnson_Johnson', 'Partículas SARS-CoV-', '2024-01-07', 2, 0, 1, NULL),
(1703, 847484, 'Johnson_Johnson', 'Partículas SARS-CoV-', '2024-01-07', 2, 0, 2, NULL),
(1704, 924925, 'Johnson_Johnson', 'Partículas SARS-CoV-', '2024-01-07', 2, 0, 3, NULL),
(1705, 706740, 'Sinopharm y Sinovac', 'Partículas SARS-CoV-', '2024-01-07', 4, 0, 3, NULL),
(1706, 259785, 'Pfizer', 'ARN mensajero (ARNm)', '2024-01-07', 1, 0, 3, NULL),
(1707, 885533, 'Pfizer', 'ARN mensajero (ARNm)', '2024-01-07', 1, 0, 1, NULL),
(1708, 58821, 'Sinopharm y Sinovac', 'Partículas SARS-CoV-', '2024-01-07', 4, 0, 2, NULL),
(1709, 196566, 'Sinopharm y Sinovac', 'Partículas SARS-CoV-', '2024-01-07', 4, 0, 2, NULL),
(1710, 880340, 'Sinopharm y Sinovac', 'Partículas SARS-CoV-', '2024-01-07', 4, 0, 3, NULL),
(1711, 940393, 'Johnson_Johnson', 'Partículas SARS-CoV-', '2024-01-07', 2, 0, 1, NULL),
(1712, 53567, 'Pfizer', 'ARN mensajero (ARNm)', '2024-01-07', 1, 0, 3, NULL),
(1713, 241653, 'Sinopharm y Sinovac', 'Partículas SARS-CoV-', '2024-01-07', 4, 0, 2, NULL),
(1714, 443317, 'Sinopharm y Sinovac', 'Partículas SARS-CoV-', '2024-01-07', 4, 0, 2, NULL),
(1715, 911386, 'Sputnik V', 'Adenovirus Ad26 y Ad', '2024-01-07', 5, 0, 1, NULL),
(1716, 608104, 'AstraZeneca', 'Proteína de pico del', '2024-01-07', 3, 0, 1, NULL),
(1717, 85162, 'AstraZeneca', 'Proteína de pico del', '2024-01-07', 3, 0, 3, NULL),
(1718, 380599, 'Sputnik V', 'Adenovirus Ad26 y Ad', '2024-01-07', 5, 0, 2, NULL),
(1719, 996752, 'Johnson_Johnson', 'Partículas SARS-CoV-', '2024-01-07', 2, 0, 1, NULL),
(1720, 418028, 'Pfizer', 'ARN mensajero (ARNm)', '2024-01-07', 1, 0, 2, NULL),
(1721, 592715, 'Pfizer', 'ARN mensajero (ARNm)', '2024-01-07', 1, 0, 3, NULL),
(1722, 15097, 'AstraZeneca', 'Proteína de pico del', '2024-01-07', 3, 0, 2, NULL),
(1723, 330005, 'Sinopharm y Sinovac', 'Partículas SARS-CoV-', '2024-01-07', 4, 0, 3, NULL),
(1724, 53575, 'Sputnik V', 'Adenovirus Ad26 y Ad', '2024-01-07', 5, 0, 2, NULL),
(1725, 154264, 'AstraZeneca', 'Proteína de pico del', '2024-01-07', 3, 0, 3, NULL),
(1726, 288118, 'Sinopharm y Sinovac', 'Partículas SARS-CoV-', '2024-01-07', 4, 0, 2, NULL),
(1727, 980108, 'Johnson_Johnson', 'Partículas SARS-CoV-', '2024-01-07', 2, 0, 3, NULL),
(1728, 691232, 'Sinopharm y Sinovac', 'Partículas SARS-CoV-', '2024-01-07', 4, 0, 1, NULL),
(1729, 807861, 'Johnson_Johnson', 'Partículas SARS-CoV-', '2024-01-07', 2, 0, 2, NULL),
(1730, 552556, 'Sputnik V', 'Adenovirus Ad26 y Ad', '2024-01-07', 5, 0, 2, NULL),
(1731, 156873, 'Johnson_Johnson', 'Partículas SARS-CoV-', '2024-01-07', 2, 0, 2, NULL),
(1732, 746673, 'Sputnik V', 'Adenovirus Ad26 y Ad', '2024-01-07', 5, 0, 2, NULL),
(1733, 688949, 'AstraZeneca', 'Proteína de pico del', '2024-01-07', 3, 0, 1, NULL),
(1734, 644165, 'Sinopharm y Sinovac', 'Partículas SARS-CoV-', '2024-01-07', 4, 0, 1, NULL),
(1735, 573340, 'Pfizer', 'ARN mensajero (ARNm)', '2024-01-07', 1, 0, 2, NULL),
(1736, 684256, 'AstraZeneca', 'Proteína de pico del', '2024-01-07', 3, 0, 1, NULL),
(1737, 315979, 'Pfizer', 'ARN mensajero (ARNm)', '2024-01-07', 1, 0, 2, NULL),
(1738, 592566, 'Sinopharm y Sinovac', 'Partículas SARS-CoV-', '2024-01-07', 4, 0, 2, NULL),
(1739, 870981, 'AstraZeneca', 'Proteína de pico del', '2024-01-07', 3, 0, 3, NULL),
(1740, 599598, 'Sputnik V', 'Adenovirus Ad26 y Ad', '2024-01-07', 5, 0, 1, NULL),
(1741, 974193, 'AstraZeneca', 'Proteína de pico del', '2024-01-07', 3, 0, 3, NULL),
(1742, 76832, 'Sinopharm y Sinovac', 'Partículas SARS-CoV-', '2024-01-07', 4, 0, 1, NULL),
(1743, 811439, 'Sputnik V', 'Adenovirus Ad26 y Ad', '2024-01-07', 5, 0, 3, NULL),
(1744, 586818, 'AstraZeneca', 'Proteína de pico del', '2024-01-07', 3, 0, 1, NULL),
(1745, 554090, 'Johnson_Johnson', 'Partículas SARS-CoV-', '2024-01-07', 2, 0, 2, NULL),
(1746, 67372, 'AstraZeneca', 'Proteína de pico del', '2024-01-07', 3, 0, 2, NULL),
(1747, 580110, 'AstraZeneca', 'Proteína de pico del', '2024-01-07', 3, 0, 3, NULL),
(1748, 410778, 'Johnson_Johnson', 'Partículas SARS-CoV-', '2024-01-07', 2, 0, 3, NULL),
(1749, 639601, 'Pfizer', 'ARN mensajero (ARNm)', '2024-01-07', 1, 0, 2, NULL),
(1750, 26544, 'Sinopharm y Sinovac', 'Partículas SARS-CoV-', '2024-01-07', 4, 0, 2, NULL),
(1751, 32217, 'AstraZeneca', 'Proteína de pico del', '2024-01-07', 3, 0, 2, NULL),
(1752, 607230, 'Sinopharm y Sinovac', 'Partículas SARS-CoV-', '2024-01-07', 4, 0, 3, NULL),
(1753, 423201, 'Pfizer', 'ARN mensajero (ARNm)', '2024-01-07', 1, 0, 3, NULL),
(1754, 564798, 'Johnson_Johnson', 'Partículas SARS-CoV-', '2024-01-07', 2, 0, 3, NULL),
(1755, 41149, 'Sputnik V', 'Adenovirus Ad26 y Ad', '2024-01-07', 5, 0, 2, NULL),
(1756, 830054, 'Pfizer', 'ARN mensajero (ARNm)', '2024-01-07', 1, 0, 3, NULL),
(1757, 151184, 'AstraZeneca', 'Proteína de pico del', '2024-01-07', 3, 0, 1, NULL),
(1758, 567340, 'Sinopharm y Sinovac', 'Partículas SARS-CoV-', '2024-01-07', 4, 0, 1, NULL),
(1759, 281665, 'Sputnik V', 'Adenovirus Ad26 y Ad', '2024-01-07', 5, 0, 3, NULL),
(1760, 54798, 'Sinopharm y Sinovac', 'Partículas SARS-CoV-', '2024-01-07', 4, 0, 1, NULL),
(1761, 272044, 'Sputnik V', 'Adenovirus Ad26 y Ad', '2024-01-07', 5, 0, 3, NULL),
(1762, 518216, 'Johnson_Johnson', 'Partículas SARS-CoV-', '2024-01-07', 2, 0, 3, NULL),
(1763, 797177, 'Sinopharm y Sinovac', 'Partículas SARS-CoV-', '2024-01-07', 4, 0, 2, NULL),
(1764, 131543, 'Sinopharm y Sinovac', 'Partículas SARS-CoV-', '2024-01-07', 4, 0, 3, NULL),
(1765, 274376, 'Johnson_Johnson', 'Partículas SARS-CoV-', '2024-01-07', 2, 0, 2, NULL),
(1766, 54379, 'Sinopharm y Sinovac', 'Partículas SARS-CoV-', '2024-01-07', 4, 0, 2, NULL),
(1767, 560685, 'Pfizer', 'ARN mensajero (ARNm)', '2024-01-07', 1, 0, 3, NULL),
(1768, 157637, 'Sinopharm y Sinovac', 'Partículas SARS-CoV-', '2024-01-07', 4, 0, 1, NULL),
(1769, 357942, 'Pfizer', 'ARN mensajero (ARNm)', '2024-01-07', 1, 0, 2, NULL),
(1770, 681713, 'Sinopharm y Sinovac', 'Partículas SARS-CoV-', '2024-01-07', 4, 0, 2, NULL),
(1771, 943018, 'Sputnik V', 'Adenovirus Ad26 y Ad', '2024-01-07', 5, 0, 2, NULL),
(1772, 212142, 'Pfizer', 'ARN mensajero (ARNm)', '2024-01-07', 1, 0, 2, NULL),
(1773, 582535, 'Sputnik V', 'Adenovirus Ad26 y Ad', '2024-01-07', 5, 0, 1, NULL),
(1774, 78154, 'Pfizer', 'ARN mensajero (ARNm)', '2024-01-07', 1, 0, 3, NULL),
(1775, 549907, 'AstraZeneca', 'Proteína de pico del', '2024-01-07', 3, 0, 1, NULL),
(1776, 158864, 'Pfizer', 'ARN mensajero (ARNm)', '2024-01-07', 1, 0, 1, NULL),
(1777, 983984, 'AstraZeneca', 'Proteína de pico del', '2024-01-07', 3, 0, 2, NULL),
(1778, 495962, 'AstraZeneca', 'Proteína de pico del', '2024-01-07', 3, 0, 2, NULL),
(1779, 281004, 'Sinopharm y Sinovac', 'Partículas SARS-CoV-', '2024-01-07', 4, 0, 3, NULL),
(1780, 483651, 'Johnson_Johnson', 'Partículas SARS-CoV-', '2024-01-07', 2, 0, 1, NULL),
(1781, 335122, 'Johnson_Johnson', 'Partículas SARS-CoV-', '2024-01-07', 2, 0, 3, NULL),
(1782, 455870, 'Sinopharm y Sinovac', 'Partículas SARS-CoV-', '2024-01-07', 4, 0, 3, NULL),
(1783, 699317, 'Pfizer', 'ARN mensajero (ARNm)', '2024-01-07', 1, 0, 3, NULL),
(1784, 484141, 'Sinopharm y Sinovac', 'Partículas SARS-CoV-', '2024-01-07', 4, 0, 1, NULL),
(1785, 761774, 'Pfizer', 'ARN mensajero (ARNm)', '2024-01-07', 1, 0, 1, NULL),
(1786, 200231, 'AstraZeneca', 'Proteína de pico del', '2024-01-07', 3, 0, 2, NULL),
(1787, 878642, 'Johnson_Johnson', 'Partículas SARS-CoV-', '2024-01-07', 2, 0, 2, NULL),
(1788, 576484, 'Sinopharm y Sinovac', 'Partículas SARS-CoV-', '2024-01-07', 4, 0, 1, NULL),
(1789, 299797, 'Sputnik V', 'Adenovirus Ad26 y Ad', '2024-01-07', 5, 0, 3, NULL),
(1790, 240469, 'Pfizer', 'ARN mensajero (ARNm)', '2024-01-07', 1, 0, 2, NULL),
(1791, 819403, 'Pfizer', 'ARN mensajero (ARNm)', '2024-01-07', 1, 0, 3, NULL),
(1792, 23542, 'Johnson_Johnson', 'Partículas SARS-CoV-', '2024-01-07', 2, 0, 3, NULL),
(1793, 698924, 'Sinopharm y Sinovac', 'Partículas SARS-CoV-', '2024-01-07', 4, 0, 3, NULL),
(1794, 796034, 'Sputnik V', 'Adenovirus Ad26 y Ad', '2024-01-07', 5, 0, 1, NULL),
(1795, 289929, 'AstraZeneca', 'Proteína de pico del', '2024-01-07', 3, 0, 2, NULL),
(1796, 22927, 'Pfizer', 'ARN mensajero (ARNm)', '2024-01-07', 1, 0, 3, NULL),
(1797, 342638, 'Sinopharm y Sinovac', 'Partículas SARS-CoV-', '2024-01-07', 4, 0, 3, NULL),
(1798, 977756, 'Pfizer', 'ARN mensajero (ARNm)', '2024-01-07', 1, 0, 1, NULL),
(1799, 560555, 'Johnson_Johnson', 'Partículas SARS-CoV-', '2024-01-07', 2, 0, 3, NULL),
(1800, 820701, 'Johnson_Johnson', 'Partículas SARS-CoV-', '2024-01-07', 2, 0, 2, NULL),
(1801, 60552, 'Sinopharm y Sinovac', 'Partículas SARS-CoV-', '2024-01-07', 4, 0, 2, NULL),
(1802, 217857, 'Johnson_Johnson', 'Partículas SARS-CoV-', '2024-01-07', 2, 0, 3, NULL),
(1803, 952009, 'Sinopharm y Sinovac', 'Partículas SARS-CoV-', '2024-01-07', 4, 0, 1, NULL),
(1804, 337923, 'Pfizer', 'ARN mensajero (ARNm)', '2024-01-07', 1, 0, 3, NULL),
(1805, 860708, 'Sputnik V', 'Adenovirus Ad26 y Ad', '2024-01-07', 5, 0, 2, NULL),
(1806, 692106, 'Sinopharm y Sinovac', 'Partículas SARS-CoV-', '2024-01-07', 4, 0, 2, NULL),
(1807, 417425, 'Sputnik V', 'Adenovirus Ad26 y Ad', '2024-01-07', 5, 0, 3, NULL),
(1808, 712217, 'AstraZeneca', 'Proteína de pico del', '2024-01-07', 3, 0, 2, NULL),
(1809, 203978, 'AstraZeneca', 'Proteína de pico del', '2024-01-07', 3, 0, 3, NULL),
(1810, 316455, 'Sputnik V', 'Adenovirus Ad26 y Ad', '2024-01-07', 5, 0, 2, NULL),
(1811, 518913, 'Johnson_Johnson', 'Partículas SARS-CoV-', '2024-01-07', 2, 0, 3, NULL),
(1812, 165343, 'Johnson_Johnson', 'Partículas SARS-CoV-', '2024-01-07', 2, 0, 3, NULL),
(1813, 381187, 'Sinopharm y Sinovac', 'Partículas SARS-CoV-', '2024-01-07', 4, 0, 1, NULL),
(1814, 331213, 'AstraZeneca', 'Proteína de pico del', '2024-01-07', 3, 0, 2, NULL),
(1815, 144964, 'AstraZeneca', 'Proteína de pico del', '2024-01-07', 3, 0, 1, NULL),
(1816, 710293, 'AstraZeneca', 'Proteína de pico del', '2024-01-07', 3, 0, 3, NULL),
(1817, 835842, 'Sputnik V', 'Adenovirus Ad26 y Ad', '2024-01-07', 5, 0, 1, NULL),
(1818, 510177, 'Pfizer', 'ARN mensajero (ARNm)', '2024-01-07', 1, 0, 3, NULL),
(1819, 144083, 'Sputnik V', 'Adenovirus Ad26 y Ad', '2024-01-07', 5, 0, 3, NULL),
(1820, 407722, 'Pfizer', 'ARN mensajero (ARNm)', '2024-01-07', 1, 0, 2, NULL),
(1821, 901288, 'Pfizer', 'ARN mensajero (ARNm)', '2024-01-07', 1, 0, 1, NULL),
(1822, 650356, 'Sinopharm y Sinovac', 'Partículas SARS-CoV-', '2024-01-07', 4, 0, 3, NULL),
(1823, 722870, 'Johnson_Johnson', 'Partículas SARS-CoV-', '2024-01-07', 2, 0, 3, NULL),
(1824, 171555, 'Sinopharm y Sinovac', 'Partículas SARS-CoV-', '2024-01-07', 4, 0, 2, NULL),
(1825, 390874, 'Sinopharm y Sinovac', 'Partículas SARS-CoV-', '2024-01-07', 4, 0, 3, NULL),
(1826, 209787, 'Sputnik V', 'Adenovirus Ad26 y Ad', '2024-01-07', 5, 0, 2, NULL),
(1827, 973410, 'Pfizer', 'ARN mensajero (ARNm)', '2024-01-07', 1, 0, 2, NULL),
(1828, 507417, 'Sinopharm y Sinovac', 'Partículas SARS-CoV-', '2024-01-07', 4, 0, 3, NULL),
(1829, 793171, 'AstraZeneca', 'Proteína de pico del', '2024-01-07', 3, 0, 1, NULL),
(1830, 766647, 'Sinopharm y Sinovac', 'Partículas SARS-CoV-', '2024-01-07', 4, 0, 1, NULL),
(1831, 255142, 'AstraZeneca', 'Proteína de pico del', '2024-01-07', 3, 0, 1, NULL),
(1832, 45046, 'Sinopharm y Sinovac', 'Partículas SARS-CoV-', '2024-01-07', 4, 0, 1, NULL),
(1833, 481511, 'Johnson_Johnson', 'Partículas SARS-CoV-', '2024-01-07', 2, 0, 3, NULL),
(1834, 372256, 'Johnson_Johnson', 'Partículas SARS-CoV-', '2024-01-07', 2, 0, 2, NULL),
(1835, 360503, 'Pfizer', 'ARN mensajero (ARNm)', '2024-01-07', 1, 0, 2, NULL),
(1836, 297170, 'Sputnik V', 'Adenovirus Ad26 y Ad', '2024-01-07', 5, 0, 3, NULL),
(1837, 348088, 'Sinopharm y Sinovac', 'Partículas SARS-CoV-', '2024-01-07', 4, 0, 3, NULL),
(1838, 863731, 'Johnson_Johnson', 'Partículas SARS-CoV-', '2024-01-07', 2, 0, 1, NULL),
(1839, 441491, 'Sinopharm y Sinovac', 'Partículas SARS-CoV-', '2024-01-07', 4, 0, 3, NULL),
(1840, 742342, 'AstraZeneca', 'Proteína de pico del', '2024-01-07', 3, 0, 3, NULL),
(1841, 617612, 'Sinopharm y Sinovac', 'Partículas SARS-CoV-', '2024-01-07', 4, 0, 3, NULL),
(1842, 788986, 'Sputnik V', 'Adenovirus Ad26 y Ad', '2024-01-07', 5, 0, 2, NULL),
(1843, 565896, 'Pfizer', 'ARN mensajero (ARNm)', '2024-01-07', 1, 0, 3, NULL),
(1844, 88027, 'Sinopharm y Sinovac', 'Partículas SARS-CoV-', '2024-01-07', 4, 0, 2, NULL),
(1845, 283955, 'AstraZeneca', 'Proteína de pico del', '2024-01-07', 3, 0, 3, NULL),
(1846, 777403, 'Sinopharm y Sinovac', 'Partículas SARS-CoV-', '2024-01-07', 4, 0, 3, NULL),
(1847, 507286, 'Sinopharm y Sinovac', 'Partículas SARS-CoV-', '2024-01-07', 4, 0, 1, NULL),
(1848, 422775, 'Pfizer', 'ARN mensajero (ARNm)', '2024-01-07', 1, 0, 1, NULL),
(1849, 645462, 'Sputnik V', 'Adenovirus Ad26 y Ad', '2024-01-07', 5, 0, 1, NULL),
(1850, 963944, 'Sinopharm y Sinovac', 'Partículas SARS-CoV-', '2024-01-07', 4, 0, 1, NULL),
(1851, 951939, 'Pfizer', 'ARN mensajero (ARNm)', '2024-01-07', 1, 0, 3, NULL),
(1852, 912599, 'Pfizer', 'ARN mensajero (ARNm)', '2024-01-07', 1, 0, 2, NULL),
(1853, 790596, 'Johnson_Johnson', 'Partículas SARS-CoV-', '2024-01-07', 2, 0, 2, NULL),
(1854, 442622, 'Pfizer', 'ARN mensajero (ARNm)', '2024-01-07', 1, 0, 2, NULL),
(1855, 728795, 'Pfizer', 'ARN mensajero (ARNm)', '2024-01-07', 1, 0, 1, NULL),
(1856, 736721, 'Sputnik V', 'Adenovirus Ad26 y Ad', '2024-01-07', 5, 0, 3, NULL),
(1857, 605290, 'Sputnik V', 'Adenovirus Ad26 y Ad', '2024-01-07', 5, 0, 1, NULL),
(1858, 687164, 'Johnson_Johnson', 'Partículas SARS-CoV-', '2024-01-07', 2, 0, 1, NULL),
(1859, 935051, 'AstraZeneca', 'Proteína de pico del', '2024-01-07', 3, 0, 1, NULL),
(1860, 91625, 'Pfizer', 'ARN mensajero (ARNm)', '2024-01-07', 1, 0, 1, NULL),
(1861, 936854, 'Johnson_Johnson', 'Partículas SARS-CoV-', '2024-01-07', 2, 0, 3, NULL),
(1862, 432374, 'Johnson_Johnson', 'Partículas SARS-CoV-', '2024-01-07', 2, 0, 1, NULL),
(1863, 940412, 'AstraZeneca', 'Proteína de pico del', '2024-01-07', 3, 0, 2, NULL),
(1864, 319924, 'Sputnik V', 'Adenovirus Ad26 y Ad', '2024-01-07', 5, 0, 2, NULL),
(1865, 956539, 'AstraZeneca', 'Proteína de pico del', '2024-01-07', 3, 0, 3, NULL),
(1866, 659094, 'AstraZeneca', 'Proteína de pico del', '2024-01-07', 3, 0, 2, NULL),
(1867, 207102, 'Pfizer', 'ARN mensajero (ARNm)', '2024-01-07', 1, 0, 1, NULL),
(1868, 541800, 'Johnson_Johnson', 'Partículas SARS-CoV-', '2024-01-07', 2, 0, 3, NULL),
(1869, 513802, 'Pfizer', 'ARN mensajero (ARNm)', '2024-01-07', 1, 0, 1, NULL),
(1870, 68865, 'Sinopharm y Sinovac', 'Partículas SARS-CoV-', '2024-01-07', 4, 0, 2, NULL),
(1871, 660593, 'Sinopharm y Sinovac', 'Partículas SARS-CoV-', '2024-01-07', 4, 0, 2, NULL),
(1872, 581836, 'Sputnik V', 'Adenovirus Ad26 y Ad', '2024-01-07', 5, 0, 3, NULL),
(1873, 370073, 'Johnson_Johnson', 'Partículas SARS-CoV-', '2024-01-07', 2, 0, 1, NULL),
(1874, 771254, 'Pfizer', 'ARN mensajero (ARNm)', '2024-01-07', 1, 0, 2, NULL),
(1875, 987597, 'Pfizer', 'ARN mensajero (ARNm)', '2024-01-07', 1, 0, 1, NULL),
(1876, 492858, 'Sinopharm y Sinovac', 'Partículas SARS-CoV-', '2024-01-07', 4, 0, 3, NULL),
(1877, 638272, 'Pfizer', 'ARN mensajero (ARNm)', '2024-01-07', 1, 0, 1, NULL),
(1878, 837517, 'AstraZeneca', 'Proteína de pico del', '2024-01-07', 3, 0, 1, NULL),
(1879, 723238, 'Sinopharm y Sinovac', 'Partículas SARS-CoV-', '2024-01-07', 4, 0, 3, NULL),
(1880, 580917, 'Sputnik V', 'Adenovirus Ad26 y Ad', '2024-01-07', 5, 0, 3, NULL),
(1881, 536577, 'Sinopharm y Sinovac', 'Partículas SARS-CoV-', '2024-01-07', 4, 0, 2, NULL),
(1882, 898673, 'Pfizer', 'ARN mensajero (ARNm)', '2024-01-07', 1, 0, 2, NULL),
(1883, 318415, 'Sputnik V', 'Adenovirus Ad26 y Ad', '2024-01-07', 5, 0, 2, NULL),
(1884, 531850, 'Sputnik V', 'Adenovirus Ad26 y Ad', '2024-01-07', 5, 0, 1, NULL),
(1885, 690912, 'Johnson_Johnson', 'Partículas SARS-CoV-', '2024-01-07', 2, 0, 2, NULL),
(1886, 84211, 'AstraZeneca', 'Proteína de pico del', '2024-01-07', 3, 0, 2, NULL),
(1887, 551207, 'Sinopharm y Sinovac', 'Partículas SARS-CoV-', '2024-01-07', 4, 0, 1, NULL),
(1888, 29892, 'Sputnik V', 'Adenovirus Ad26 y Ad', '2024-01-07', 5, 0, 3, NULL),
(1889, 690332, 'Johnson_Johnson', 'Partículas SARS-CoV-', '2024-01-07', 2, 0, 3, NULL),
(1890, 309579, 'Sputnik V', 'Adenovirus Ad26 y Ad', '2024-01-07', 5, 0, 2, NULL),
(1891, 662798, 'Sinopharm y Sinovac', 'Partículas SARS-CoV-', '2024-01-07', 4, 0, 2, NULL),
(1892, 142605, 'AstraZeneca', 'Proteína de pico del', '2024-01-07', 3, 0, 3, NULL),
(1893, 412999, 'AstraZeneca', 'Proteína de pico del', '2024-01-07', 3, 0, 1, NULL),
(1894, 226281, 'Sinopharm y Sinovac', 'Partículas SARS-CoV-', '2024-01-07', 4, 0, 3, NULL),
(1895, 458718, 'Pfizer', 'ARN mensajero (ARNm)', '2024-01-07', 1, 0, 2, NULL),
(1896, 723913, 'Sputnik V', 'Adenovirus Ad26 y Ad', '2024-01-07', 5, 0, 2, NULL),
(1897, 797617, 'Pfizer', 'ARN mensajero (ARNm)', '2024-01-07', 1, 0, 1, NULL),
(1898, 47794, 'Sputnik V', 'Adenovirus Ad26 y Ad', '2024-01-07', 5, 0, 1, NULL),
(1899, 320331, 'Pfizer', 'ARN mensajero (ARNm)', '2024-01-07', 1, 0, 1, NULL),
(1900, 158344, 'AstraZeneca', 'Proteína de pico del', '2024-01-07', 3, 0, 1, NULL),
(1901, 236224, 'Sinopharm y Sinovac', 'Partículas SARS-CoV-', '2024-01-07', 4, 0, 2, NULL),
(1902, 957699, 'Sputnik V', 'Adenovirus Ad26 y Ad', '2024-01-07', 5, 0, 2, NULL),
(1903, 619330, 'AstraZeneca', 'Proteína de pico del', '2024-01-07', 3, 0, 1, NULL),
(1904, 934606, 'AstraZeneca', 'Proteína de pico del', '2024-01-07', 3, 0, 3, NULL),
(1905, 608929, 'Johnson_Johnson', 'Partículas SARS-CoV-', '2024-01-07', 2, 0, 3, NULL),
(1906, 893333, 'Sputnik V', 'Adenovirus Ad26 y Ad', '2024-01-07', 5, 0, 2, NULL),
(1907, 419608, 'Sinopharm y Sinovac', 'Partículas SARS-CoV-', '2024-01-07', 4, 0, 2, NULL),
(1908, 795402, 'AstraZeneca', 'Proteína de pico del', '2024-01-07', 3, 0, 2, NULL),
(1909, 169664, 'Pfizer', 'ARN mensajero (ARNm)', '2024-01-07', 1, 0, 1, NULL),
(1910, 178933, 'Sputnik V', 'Adenovirus Ad26 y Ad', '2024-01-07', 5, 0, 1, NULL),
(1911, 586230, 'Sputnik V', 'Adenovirus Ad26 y Ad', '2024-01-07', 5, 0, 2, NULL),
(1912, 562966, 'Sputnik V', 'Adenovirus Ad26 y Ad', '2024-01-07', 5, 0, 2, NULL),
(1913, 24266, 'Sinopharm y Sinovac', 'Partículas SARS-CoV-', '2024-01-07', 4, 0, 3, NULL),
(1914, 756642, 'Sputnik V', 'Adenovirus Ad26 y Ad', '2024-01-07', 5, 0, 3, NULL),
(1915, 500321, 'AstraZeneca', 'Proteína de pico del', '2024-01-07', 3, 0, 2, NULL),
(1916, 186037, 'Sputnik V', 'Adenovirus Ad26 y Ad', '2024-01-07', 5, 0, 2, NULL),
(1917, 818163, 'Pfizer', 'ARN mensajero (ARNm)', '2024-01-07', 1, 0, 2, NULL),
(1918, 631944, 'Johnson_Johnson', 'Partículas SARS-CoV-', '2024-01-07', 2, 0, 3, NULL),
(1919, 501550, 'Pfizer', 'ARN mensajero (ARNm)', '2024-01-07', 1, 0, 3, NULL),
(1920, 94075, 'Sinopharm y Sinovac', 'Partículas SARS-CoV-', '2024-01-07', 4, 0, 2, NULL),
(1921, 470664, 'Sputnik V', 'Adenovirus Ad26 y Ad', '2024-01-07', 5, 0, 3, NULL),
(1922, 611968, 'Pfizer', 'ARN mensajero (ARNm)', '2024-01-07', 1, 0, 3, NULL),
(1923, 946482, 'Pfizer', 'ARN mensajero (ARNm)', '2024-01-07', 1, 0, 2, NULL),
(1924, 578292, 'Johnson_Johnson', 'Partículas SARS-CoV-', '2024-01-07', 2, 0, 2, NULL),
(1925, 356344, 'Sputnik V', 'Adenovirus Ad26 y Ad', '2024-01-07', 5, 0, 2, NULL),
(1926, 470795, 'Pfizer', 'ARN mensajero (ARNm)', '2024-01-07', 1, 0, 2, NULL),
(1927, 381425, 'Pfizer', 'ARN mensajero (ARNm)', '2024-01-07', 1, 0, 2, NULL),
(1928, 646598, 'Sputnik V', 'Adenovirus Ad26 y Ad', '2024-01-07', 5, 0, 1, NULL);
INSERT INTO `viales` (`idVial`, `NumeroSerie`, `Marca`, `Antigeno`, `FechaVencimiento`, `idLaboratorio`, `Estado`, `idVacunatorio`, `fechaColocacion`) VALUES
(1929, 241229, 'Johnson_Johnson', 'Partículas SARS-CoV-', '2024-01-07', 2, 0, 1, NULL),
(1930, 325316, 'Johnson_Johnson', 'Partículas SARS-CoV-', '2024-01-07', 2, 0, 1, NULL),
(1931, 782502, 'Johnson_Johnson', 'Partículas SARS-CoV-', '2024-01-07', 2, 0, 1, NULL),
(1932, 620882, 'AstraZeneca', 'Proteína de pico del', '2024-01-07', 3, 0, 3, NULL),
(1933, 532463, 'Johnson_Johnson', 'Partículas SARS-CoV-', '2024-01-07', 2, 0, 2, NULL),
(1934, 248325, 'Sinopharm y Sinovac', 'Partículas SARS-CoV-', '2024-01-07', 4, 0, 1, NULL),
(1935, 113521, 'Pfizer', 'ARN mensajero (ARNm)', '2024-01-07', 1, 0, 2, NULL),
(1936, 660049, 'Pfizer', 'ARN mensajero (ARNm)', '2024-01-07', 1, 0, 3, NULL),
(1937, 994875, 'Sinopharm y Sinovac', 'Partículas SARS-CoV-', '2024-01-07', 4, 0, 1, NULL),
(1938, 982477, 'Sputnik V', 'Adenovirus Ad26 y Ad', '2024-01-07', 5, 0, 1, NULL),
(1939, 593839, 'AstraZeneca', 'Proteína de pico del', '2024-01-07', 3, 0, 3, NULL),
(1940, 401067, 'AstraZeneca', 'Proteína de pico del', '2024-01-07', 3, 0, 3, NULL),
(1941, 26330, 'Sinopharm y Sinovac', 'Partículas SARS-CoV-', '2024-01-07', 4, 0, 3, NULL),
(1942, 49386, 'Sinopharm y Sinovac', 'Partículas SARS-CoV-', '2024-01-07', 4, 0, 1, NULL),
(1943, 53734, 'Pfizer', 'ARN mensajero (ARNm)', '2024-01-07', 1, 0, 1, NULL),
(1944, 12769, 'Sinopharm y Sinovac', 'Partículas SARS-CoV-', '2024-01-07', 4, 0, 2, NULL),
(1945, 865982, 'AstraZeneca', 'Proteína de pico del', '2024-01-07', 3, 0, 2, NULL),
(1946, 572570, 'Pfizer', 'ARN mensajero (ARNm)', '2024-01-07', 1, 0, 2, NULL),
(1947, 583938, 'Sputnik V', 'Adenovirus Ad26 y Ad', '2024-01-07', 5, 0, 1, NULL),
(1948, 153487, 'Sinopharm y Sinovac', 'Partículas SARS-CoV-', '2024-01-07', 4, 0, 2, NULL),
(1949, 735514, 'Pfizer', 'ARN mensajero (ARNm)', '2024-01-07', 1, 0, 1, NULL),
(1950, 751078, 'AstraZeneca', 'Proteína de pico del', '2024-01-07', 3, 0, 2, NULL),
(1951, 358800, 'Pfizer', 'ARN mensajero (ARNm)', '2024-01-07', 1, 0, 3, NULL),
(1952, 613606, 'AstraZeneca', 'Proteína de pico del', '2024-01-07', 3, 0, 1, NULL),
(1953, 883197, 'Sputnik V', 'Adenovirus Ad26 y Ad', '2024-01-07', 5, 0, 3, NULL),
(1954, 132599, 'Johnson_Johnson', 'Partículas SARS-CoV-', '2024-01-07', 2, 0, 1, NULL),
(1955, 29184, 'Sinopharm y Sinovac', 'Partículas SARS-CoV-', '2024-01-07', 4, 0, 1, NULL),
(1956, 807925, 'Sinopharm y Sinovac', 'Partículas SARS-CoV-', '2024-01-07', 4, 0, 2, NULL),
(1957, 814047, 'Sputnik V', 'Adenovirus Ad26 y Ad', '2024-01-07', 5, 0, 2, NULL),
(1958, 640473, 'Johnson_Johnson', 'Partículas SARS-CoV-', '2024-01-07', 2, 0, 3, NULL),
(1959, 441522, 'Pfizer', 'ARN mensajero (ARNm)', '2024-01-07', 1, 0, 3, NULL),
(1960, 760256, 'Sputnik V', 'Adenovirus Ad26 y Ad', '2024-01-07', 5, 0, 1, NULL),
(1961, 646607, 'Sputnik V', 'Adenovirus Ad26 y Ad', '2024-01-07', 5, 0, 2, NULL),
(1962, 708464, 'AstraZeneca', 'Proteína de pico del', '2024-01-07', 3, 0, 2, NULL),
(1963, 643582, 'Sinopharm y Sinovac', 'Partículas SARS-CoV-', '2024-01-07', 4, 0, 1, NULL),
(1964, 793968, 'Sputnik V', 'Adenovirus Ad26 y Ad', '2024-01-07', 5, 0, 2, NULL),
(1965, 537858, 'Sinopharm y Sinovac', 'Partículas SARS-CoV-', '2024-01-07', 4, 0, 2, NULL),
(1966, 870298, 'AstraZeneca', 'Proteína de pico del', '2024-01-07', 3, 0, 2, NULL),
(1967, 185330, 'Sinopharm y Sinovac', 'Partículas SARS-CoV-', '2024-01-07', 4, 0, 2, NULL),
(1968, 807235, 'Sputnik V', 'Adenovirus Ad26 y Ad', '2024-01-07', 5, 0, 1, NULL),
(1969, 462475, 'Sinopharm y Sinovac', 'Partículas SARS-CoV-', '2024-01-07', 4, 0, 3, NULL),
(1970, 737918, 'AstraZeneca', 'Proteína de pico del', '2024-01-07', 3, 0, 1, NULL),
(1971, 614884, 'Johnson_Johnson', 'Partículas SARS-CoV-', '2024-01-07', 2, 0, 1, NULL),
(1972, 770531, 'Sinopharm y Sinovac', 'Partículas SARS-CoV-', '2024-01-07', 4, 0, 2, NULL),
(1973, 321134, 'Pfizer', 'ARN mensajero (ARNm)', '2024-01-07', 1, 0, 2, NULL),
(1974, 483023, 'AstraZeneca', 'Proteína de pico del', '2024-01-07', 3, 0, 1, NULL),
(1975, 804908, 'Sinopharm y Sinovac', 'Partículas SARS-CoV-', '2024-01-07', 4, 0, 1, NULL),
(1976, 936448, 'Sputnik V', 'Adenovirus Ad26 y Ad', '2024-01-07', 5, 0, 3, NULL),
(1977, 384791, 'Pfizer', 'ARN mensajero (ARNm)', '2024-01-07', 1, 0, 3, NULL),
(1978, 710922, 'Sinopharm y Sinovac', 'Partículas SARS-CoV-', '2024-01-07', 4, 0, 2, NULL),
(1979, 323886, 'Pfizer', 'ARN mensajero (ARNm)', '2024-01-07', 1, 0, 1, NULL),
(1980, 198217, 'Sinopharm y Sinovac', 'Partículas SARS-CoV-', '2024-01-07', 4, 0, 1, NULL),
(1981, 457850, 'AstraZeneca', 'Proteína de pico del', '2024-01-07', 3, 0, 1, NULL),
(1982, 983852, 'Sinopharm y Sinovac', 'Partículas SARS-CoV-', '2024-01-07', 4, 0, 1, NULL),
(1983, 489586, 'Pfizer', 'ARN mensajero (ARNm)', '2024-01-07', 1, 0, 1, NULL),
(1984, 73331, 'Sinopharm y Sinovac', 'Partículas SARS-CoV-', '2024-01-07', 4, 0, 2, NULL),
(1985, 862833, 'Pfizer', 'ARN mensajero (ARNm)', '2024-01-07', 1, 0, 2, NULL),
(1986, 212875, 'Sputnik V', 'Adenovirus Ad26 y Ad', '2024-01-07', 5, 0, 2, NULL),
(1987, 8603, 'Johnson_Johnson', 'Partículas SARS-CoV-', '2024-01-07', 2, 0, 1, NULL),
(1988, 922481, 'Sputnik V', 'Adenovirus Ad26 y Ad', '2024-01-07', 5, 0, 3, NULL),
(1989, 412675, 'AstraZeneca', 'Proteína de pico del', '2024-01-07', 3, 0, 2, NULL),
(1990, 693065, 'Sputnik V', 'Adenovirus Ad26 y Ad', '2024-01-07', 5, 0, 3, NULL),
(1991, 216237, 'AstraZeneca', 'Proteína de pico del', '2024-01-07', 3, 0, 3, NULL),
(1992, 241530, 'Sputnik V', 'Adenovirus Ad26 y Ad', '2024-01-07', 5, 0, 3, NULL),
(1993, 943967, 'AstraZeneca', 'Proteína de pico del', '2024-01-07', 3, 0, 3, NULL),
(1994, 706191, 'Sinopharm y Sinovac', 'Partículas SARS-CoV-', '2024-01-07', 4, 0, 3, NULL),
(1995, 885060, 'Sputnik V', 'Adenovirus Ad26 y Ad', '2024-01-07', 5, 0, 1, NULL),
(1996, 185565, 'Sinopharm y Sinovac', 'Partículas SARS-CoV-', '2024-01-07', 4, 0, 1, NULL),
(1997, 735467, 'Pfizer', 'ARN mensajero (ARNm)', '2024-01-07', 1, 0, 3, NULL),
(1998, 358187, 'Sinopharm y Sinovac', 'Partículas SARS-CoV-', '2024-01-07', 4, 0, 3, NULL),
(1999, 368377, 'Sinopharm y Sinovac', 'Partículas SARS-CoV-', '2024-01-07', 4, 0, 1, NULL),
(2000, 899084, 'Johnson_Johnson', 'Partículas SARS-CoV-', '2024-01-07', 2, 0, 2, NULL),
(2001, 230903, 'Johnson_Johnson', 'Partículas SARS-CoV-', '2024-01-07', 2, 0, 2, NULL),
(2002, 655680, 'Sputnik V', 'Adenovirus Ad26 y Ad', '2024-01-07', 5, 0, 2, NULL),
(2003, 486390, 'AstraZeneca', 'Proteína de pico del', '2024-01-07', 3, 0, 3, NULL),
(2004, 735175, 'Sputnik V', 'Adenovirus Ad26 y Ad', '2024-01-07', 5, 0, 1, NULL),
(2005, 923594, 'Sinopharm y Sinovac', 'Partículas SARS-CoV-', '2024-01-07', 4, 0, 2, NULL),
(2006, 756457, 'Pfizer', 'ARN mensajero (ARNm)', '2024-01-07', 1, 0, 1, NULL),
(2007, 48209, 'Pfizer', 'ARN mensajero (ARNm)', '2024-01-07', 1, 0, 1, NULL),
(2008, 49086, 'Pfizer', 'ARN mensajero (ARNm)', '2024-01-07', 1, 0, 3, NULL),
(2009, 42623, 'Sinopharm y Sinovac', 'Partículas SARS-CoV-', '2024-01-07', 4, 0, 2, NULL),
(2010, 853214, 'Sputnik V', 'Adenovirus Ad26 y Ad', '2024-01-07', 5, 0, 3, NULL),
(2011, 231990, 'Sputnik V', 'Adenovirus Ad26 y Ad', '2024-01-07', 5, 0, 3, NULL),
(2012, 947865, 'Johnson_Johnson', 'Partículas SARS-CoV-', '2024-01-07', 2, 0, 1, NULL),
(2013, 806277, 'Sinopharm y Sinovac', 'Partículas SARS-CoV-', '2024-01-07', 4, 0, 3, NULL),
(2014, 268053, 'Johnson_Johnson', 'Partículas SARS-CoV-', '2024-01-07', 2, 0, 1, NULL),
(2015, 218302, 'AstraZeneca', 'Proteína de pico del', '2024-01-07', 3, 0, 3, NULL),
(2016, 167787, 'Pfizer', 'ARN mensajero (ARNm)', '2024-01-07', 1, 0, 3, NULL),
(2017, 478205, 'Johnson_Johnson', 'Partículas SARS-CoV-', '2024-01-07', 2, 0, 2, NULL),
(2018, 47138, 'AstraZeneca', 'Proteína de pico del', '2024-01-07', 3, 0, 2, NULL),
(2019, 488425, 'Pfizer', 'ARN mensajero (ARNm)', '2024-01-07', 1, 0, 3, NULL),
(2020, 135100, 'Sputnik V', 'Adenovirus Ad26 y Ad', '2024-01-07', 5, 0, 3, NULL),
(2021, 275198, 'Johnson_Johnson', 'Partículas SARS-CoV-', '2024-01-07', 2, 0, 2, NULL),
(2022, 650560, 'Sinopharm y Sinovac', 'Partículas SARS-CoV-', '2024-01-07', 4, 0, 3, NULL),
(2023, 59661, 'AstraZeneca', 'Proteína de pico del', '2024-01-07', 3, 0, 2, NULL),
(2024, 243108, 'Sputnik V', 'Adenovirus Ad26 y Ad', '2024-01-07', 5, 0, 1, NULL),
(2025, 332758, 'Sinopharm y Sinovac', 'Partículas SARS-CoV-', '2024-01-07', 4, 0, 2, NULL),
(2026, 231902, 'Johnson_Johnson', 'Partículas SARS-CoV-', '2024-01-07', 2, 0, 1, NULL),
(2027, 633815, 'Pfizer', 'ARN mensajero (ARNm)', '2024-01-07', 1, 0, 2, NULL),
(2028, 449968, 'Johnson_Johnson', 'Partículas SARS-CoV-', '2024-01-07', 2, 0, 1, NULL),
(2029, 435564, 'Pfizer', 'ARN mensajero (ARNm)', '2024-01-07', 1, 0, 3, NULL),
(2030, 495131, 'Sputnik V', 'Adenovirus Ad26 y Ad', '2024-01-07', 5, 0, 1, NULL),
(2031, 182862, 'Johnson_Johnson', 'Partículas SARS-CoV-', '2024-01-07', 2, 0, 2, NULL),
(2032, 466543, 'AstraZeneca', 'Proteína de pico del', '2024-01-07', 3, 0, 3, NULL),
(2033, 64687, 'Johnson_Johnson', 'Partículas SARS-CoV-', '2024-01-07', 2, 0, 3, NULL),
(2034, 203376, 'Sinopharm y Sinovac', 'Partículas SARS-CoV-', '2024-01-07', 4, 0, 3, NULL),
(2035, 887422, 'Sinopharm y Sinovac', 'Partículas SARS-CoV-', '2024-01-07', 4, 0, 1, NULL),
(2036, 62509, 'Johnson_Johnson', 'Partículas SARS-CoV-', '2024-01-07', 2, 0, 2, NULL),
(2037, 501880, 'Sputnik V', 'Adenovirus Ad26 y Ad', '2024-01-07', 5, 0, 3, NULL),
(2038, 94820, 'Johnson_Johnson', 'Partículas SARS-CoV-', '2024-01-07', 2, 0, 2, NULL),
(2039, 579012, 'Sinopharm y Sinovac', 'Partículas SARS-CoV-', '2024-01-07', 4, 0, 1, NULL),
(2040, 371402, 'Johnson_Johnson', 'Partículas SARS-CoV-', '2024-01-07', 2, 0, 1, NULL),
(2041, 263505, 'Sinopharm y Sinovac', 'Partículas SARS-CoV-', '2024-01-07', 4, 0, 2, NULL),
(2042, 235319, 'Pfizer', 'ARN mensajero (ARNm)', '2024-01-07', 1, 0, 2, NULL),
(2043, 916151, 'Johnson_Johnson', 'Partículas SARS-CoV-', '2024-01-07', 2, 0, 2, NULL),
(2044, 521618, 'Sputnik V', 'Adenovirus Ad26 y Ad', '2024-01-07', 5, 0, 2, NULL),
(2045, 12609, 'Pfizer', 'ARN mensajero (ARNm)', '2024-01-07', 1, 0, 2, NULL),
(2046, 705562, 'Pfizer', 'ARN mensajero (ARNm)', '2024-01-07', 1, 0, 2, NULL),
(2047, 447229, 'Sputnik V', 'Adenovirus Ad26 y Ad', '2024-01-07', 5, 0, 2, NULL),
(2048, 460381, 'AstraZeneca', 'Proteína de pico del', '2024-01-07', 3, 0, 1, NULL),
(2049, 317419, 'Pfizer', 'ARN mensajero (ARNm)', '2024-01-07', 1, 0, 3, NULL),
(2050, 982476, 'Sputnik V', 'Adenovirus Ad26 y Ad', '2024-01-07', 5, 0, 1, NULL),
(2051, 479686, 'AstraZeneca', 'Proteína de pico del', '2024-01-07', 3, 0, 2, NULL),
(2052, 471519, 'Sputnik V', 'Adenovirus Ad26 y Ad', '2024-01-07', 5, 0, 3, NULL),
(2053, 187980, 'Sputnik V', 'Adenovirus Ad26 y Ad', '2024-01-07', 5, 0, 2, NULL),
(2054, 430249, 'Johnson_Johnson', 'Partículas SARS-CoV-', '2024-01-07', 2, 0, 1, NULL),
(2055, 285359, 'Pfizer', 'ARN mensajero (ARNm)', '2024-01-07', 1, 0, 1, NULL),
(2056, 615410, 'Johnson_Johnson', 'Partículas SARS-CoV-', '2024-01-07', 2, 0, 2, NULL),
(2057, 229899, 'Sputnik V', 'Adenovirus Ad26 y Ad', '2024-01-07', 5, 0, 1, NULL),
(2058, 965763, 'Pfizer', 'ARN mensajero (ARNm)', '2024-01-07', 1, 0, 2, NULL),
(2059, 625983, 'Johnson_Johnson', 'Partículas SARS-CoV-', '2024-01-07', 2, 0, 3, NULL),
(2060, 140741, 'Sputnik V', 'Adenovirus Ad26 y Ad', '2024-01-07', 5, 0, 1, NULL),
(2061, 505127, 'Sputnik V', 'Adenovirus Ad26 y Ad', '2024-01-07', 5, 0, 1, NULL),
(2062, 206391, 'AstraZeneca', 'Proteína de pico del', '2024-01-07', 3, 0, 2, NULL),
(2063, 880674, 'Johnson_Johnson', 'Partículas SARS-CoV-', '2024-01-07', 2, 0, 2, NULL),
(2064, 832773, 'Sinopharm y Sinovac', 'Partículas SARS-CoV-', '2024-01-07', 4, 0, 3, NULL),
(2065, 784448, 'Pfizer', 'ARN mensajero (ARNm)', '2024-01-07', 1, 0, 1, NULL),
(2066, 245017, 'Johnson_Johnson', 'Partículas SARS-CoV-', '2024-01-07', 2, 0, 2, NULL),
(2067, 198830, 'AstraZeneca', 'Proteína de pico del', '2024-01-07', 3, 0, 1, NULL),
(2068, 271603, 'Sinopharm y Sinovac', 'Partículas SARS-CoV-', '2024-01-07', 4, 0, 3, NULL),
(2069, 814800, 'Pfizer', 'ARN mensajero (ARNm)', '2024-01-07', 1, 0, 1, NULL),
(2070, 627821, 'AstraZeneca', 'Proteína de pico del', '2024-01-07', 3, 0, 3, NULL),
(2071, 87230, 'Sinopharm y Sinovac', 'Partículas SARS-CoV-', '2024-01-07', 4, 0, 2, NULL),
(2072, 76432, 'Johnson_Johnson', 'Partículas SARS-CoV-', '2024-01-07', 2, 0, 1, NULL),
(2073, 506809, 'Johnson_Johnson', 'Partículas SARS-CoV-', '2024-01-07', 2, 0, 1, NULL),
(2074, 134768, 'Sputnik V', 'Adenovirus Ad26 y Ad', '2024-01-07', 5, 0, 3, NULL),
(2075, 669206, 'Sputnik V', 'Adenovirus Ad26 y Ad', '2024-01-07', 5, 0, 3, NULL),
(2076, 408147, 'Johnson_Johnson', 'Partículas SARS-CoV-', '2024-01-07', 2, 0, 1, NULL),
(2077, 573861, 'Sputnik V', 'Adenovirus Ad26 y Ad', '2024-01-07', 5, 0, 3, NULL),
(2078, 580910, 'AstraZeneca', 'Proteína de pico del', '2024-01-07', 3, 0, 3, NULL),
(2079, 526647, 'Johnson_Johnson', 'Partículas SARS-CoV-', '2024-01-07', 2, 0, 2, NULL),
(2080, 292567, 'Sinopharm y Sinovac', 'Partículas SARS-CoV-', '2024-01-07', 4, 0, 2, NULL),
(2081, 123800, 'Johnson_Johnson', 'Partículas SARS-CoV-', '2024-01-07', 2, 0, 1, NULL),
(2082, 68522, 'Sinopharm y Sinovac', 'Partículas SARS-CoV-', '2024-01-07', 4, 0, 2, NULL),
(2083, 552144, 'AstraZeneca', 'Proteína de pico del', '2024-01-07', 3, 0, 1, NULL),
(2084, 710500, 'Sputnik V', 'Adenovirus Ad26 y Ad', '2024-01-07', 5, 0, 2, NULL),
(2085, 17775, 'Johnson_Johnson', 'Partículas SARS-CoV-', '2024-01-07', 2, 0, 1, NULL),
(2086, 925771, 'Johnson_Johnson', 'Partículas SARS-CoV-', '2024-01-07', 2, 0, 2, NULL),
(2087, 598992, 'Pfizer', 'ARN mensajero (ARNm)', '2024-01-07', 1, 0, 3, NULL),
(2088, 878259, 'Sinopharm y Sinovac', 'Partículas SARS-CoV-', '2024-01-07', 4, 0, 1, NULL),
(2089, 468023, 'Sinopharm y Sinovac', 'Partículas SARS-CoV-', '2024-01-07', 4, 0, 3, NULL),
(2090, 966999, 'AstraZeneca', 'Proteína de pico del', '2024-01-07', 3, 0, 1, NULL),
(2091, 920824, 'Sinopharm y Sinovac', 'Partículas SARS-CoV-', '2024-01-07', 4, 0, 1, NULL),
(2092, 713639, 'Sputnik V', 'Adenovirus Ad26 y Ad', '2024-01-07', 5, 0, 3, NULL),
(2093, 347331, 'Johnson_Johnson', 'Partículas SARS-CoV-', '2024-01-07', 2, 0, 3, NULL),
(2094, 702909, 'AstraZeneca', 'Proteína de pico del', '2024-01-07', 3, 0, 1, NULL),
(2095, 440515, 'Sputnik V', 'Adenovirus Ad26 y Ad', '2024-01-07', 5, 0, 1, NULL),
(2096, 147319, 'Johnson_Johnson', 'Partículas SARS-CoV-', '2024-01-07', 2, 0, 2, NULL),
(2097, 27647, 'Sinopharm y Sinovac', 'Partículas SARS-CoV-', '2024-01-07', 4, 0, 1, NULL),
(2098, 715814, 'Sputnik V', 'Adenovirus Ad26 y Ad', '2024-01-07', 5, 0, 1, NULL),
(2099, 779620, 'Pfizer', 'ARN mensajero (ARNm)', '2024-01-07', 1, 0, 3, NULL),
(2100, 698518, 'Johnson_Johnson', 'Partículas SARS-CoV-', '2024-01-07', 2, 0, 1, NULL),
(2101, 253799, 'Pfizer', 'ARN mensajero (ARNm)', '2024-01-07', 1, 0, 3, NULL),
(2102, 595798, 'Johnson_Johnson', 'Partículas SARS-CoV-', '2024-01-07', 2, 0, 2, NULL),
(2103, 714924, 'Sputnik V', 'Adenovirus Ad26 y Ad', '2024-01-07', 5, 0, 1, NULL),
(2104, 586209, 'AstraZeneca', 'Proteína de pico del', '2024-01-07', 3, 0, 2, NULL),
(2105, 590492, 'Sputnik V', 'Adenovirus Ad26 y Ad', '2024-01-07', 5, 0, 1, NULL),
(2106, 608060, 'Sinopharm y Sinovac', 'Partículas SARS-CoV-', '2024-01-07', 4, 0, 3, NULL),
(2107, 307804, 'Pfizer', 'ARN mensajero (ARNm)', '2024-01-07', 1, 0, 2, NULL),
(2108, 593527, 'AstraZeneca', 'Proteína de pico del', '2024-01-07', 3, 0, 3, NULL),
(2109, 356742, 'Sinopharm y Sinovac', 'Partículas SARS-CoV-', '2024-01-07', 4, 0, 1, NULL),
(2110, 629837, 'Sinopharm y Sinovac', 'Partículas SARS-CoV-', '2024-01-07', 4, 0, 1, NULL),
(2111, 374956, 'Johnson_Johnson', 'Partículas SARS-CoV-', '2024-01-07', 2, 0, 2, NULL),
(2112, 943032, 'Johnson_Johnson', 'Partículas SARS-CoV-', '2024-01-07', 2, 0, 2, NULL),
(2113, 681629, 'Pfizer', 'ARN mensajero (ARNm)', '2024-01-07', 1, 0, 3, NULL),
(2114, 857268, 'AstraZeneca', 'Proteína de pico del', '2024-01-07', 3, 0, 2, NULL),
(2115, 235641, 'Sputnik V', 'Adenovirus Ad26 y Ad', '2024-01-07', 5, 0, 3, NULL),
(2116, 574259, 'AstraZeneca', 'Proteína de pico del', '2024-01-07', 3, 0, 2, NULL),
(2117, 378713, 'AstraZeneca', 'Proteína de pico del', '2024-01-07', 3, 0, 1, NULL),
(2118, 338177, 'Johnson_Johnson', 'Partículas SARS-CoV-', '2024-01-07', 2, 0, 2, NULL),
(2119, 780930, 'Pfizer', 'ARN mensajero (ARNm)', '2024-01-07', 1, 0, 2, NULL),
(2120, 442567, 'AstraZeneca', 'Proteína de pico del', '2024-01-07', 3, 0, 1, NULL),
(2121, 743723, 'Pfizer', 'ARN mensajero (ARNm)', '2024-01-07', 1, 0, 2, NULL),
(2122, 536205, 'AstraZeneca', 'Proteína de pico del', '2024-01-07', 3, 0, 1, NULL),
(2123, 864588, 'Pfizer', 'ARN mensajero (ARNm)', '2024-01-07', 1, 0, 2, NULL),
(2124, 779545, 'Sinopharm y Sinovac', 'Partículas SARS-CoV-', '2024-01-07', 4, 0, 3, NULL),
(2125, 131043, 'Johnson_Johnson', 'Partículas SARS-CoV-', '2024-01-07', 2, 0, 2, NULL),
(2126, 874861, 'Pfizer', 'ARN mensajero (ARNm)', '2024-01-07', 1, 0, 1, NULL),
(2127, 813013, 'Johnson_Johnson', 'Partículas SARS-CoV-', '2024-01-07', 2, 0, 1, NULL),
(2128, 670301, 'Pfizer', 'ARN mensajero (ARNm)', '2024-01-07', 1, 0, 2, NULL),
(2129, 259324, 'Sinopharm y Sinovac', 'Partículas SARS-CoV-', '2024-01-07', 4, 0, 3, NULL),
(2130, 546985, 'Johnson_Johnson', 'Partículas SARS-CoV-', '2024-01-07', 2, 0, 1, NULL),
(2131, 493315, 'Sinopharm y Sinovac', 'Partículas SARS-CoV-', '2024-01-07', 4, 0, 3, NULL),
(2132, 811734, 'AstraZeneca', 'Proteína de pico del', '2024-01-07', 3, 0, 1, NULL),
(2133, 634944, 'Sinopharm y Sinovac', 'Partículas SARS-CoV-', '2024-01-07', 4, 0, 3, NULL),
(2134, 805775, 'Johnson_Johnson', 'Partículas SARS-CoV-', '2024-01-07', 2, 0, 2, NULL),
(2135, 863927, 'Pfizer', 'ARN mensajero (ARNm)', '2024-01-07', 1, 0, 2, NULL),
(2136, 918441, 'AstraZeneca', 'Proteína de pico del', '2024-01-07', 3, 0, 2, NULL),
(2137, 264338, 'Sinopharm y Sinovac', 'Partículas SARS-CoV-', '2024-01-07', 4, 0, 2, NULL),
(2138, 477960, 'Sputnik V', 'Adenovirus Ad26 y Ad', '2024-01-07', 5, 0, 3, NULL),
(2139, 261264, 'Sinopharm y Sinovac', 'Partículas SARS-CoV-', '2024-01-07', 4, 0, 3, NULL),
(2140, 939178, 'Sputnik V', 'Adenovirus Ad26 y Ad', '2024-01-07', 5, 0, 1, NULL),
(2141, 952148, 'Johnson_Johnson', 'Partículas SARS-CoV-', '2024-01-07', 2, 0, 2, NULL),
(2142, 557843, 'AstraZeneca', 'Proteína de pico del', '2024-01-07', 3, 0, 3, NULL),
(2143, 848795, 'Pfizer', 'ARN mensajero (ARNm)', '2024-01-07', 1, 0, 1, NULL),
(2144, 36869, 'Sputnik V', 'Adenovirus Ad26 y Ad', '2024-01-07', 5, 0, 3, NULL),
(2145, 951888, 'Sinopharm y Sinovac', 'Partículas SARS-CoV-', '2024-01-07', 4, 0, 1, NULL),
(2146, 452860, 'Sinopharm y Sinovac', 'Partículas SARS-CoV-', '2024-01-07', 4, 0, 1, NULL),
(2147, 671475, 'AstraZeneca', 'Proteína de pico del', '2024-01-07', 3, 0, 3, NULL),
(2148, 168898, 'Johnson_Johnson', 'Partículas SARS-CoV-', '2024-01-07', 2, 0, 3, NULL),
(2149, 549299, 'Sputnik V', 'Adenovirus Ad26 y Ad', '2024-01-07', 5, 0, 2, NULL),
(2150, 756977, 'Sinopharm y Sinovac', 'Partículas SARS-CoV-', '2024-01-07', 4, 0, 3, NULL),
(2151, 618871, 'AstraZeneca', 'Proteína de pico del', '2024-01-07', 3, 0, 1, NULL),
(2152, 82011, 'Sinopharm y Sinovac', 'Partículas SARS-CoV-', '2024-01-07', 4, 0, 2, NULL),
(2153, 315786, 'Sinopharm y Sinovac', 'Partículas SARS-CoV-', '2024-01-07', 4, 0, 3, NULL),
(2154, 327646, 'Sputnik V', 'Adenovirus Ad26 y Ad', '2024-01-07', 5, 0, 1, NULL),
(2155, 304385, 'AstraZeneca', 'Proteína de pico del', '2024-01-07', 3, 1, 3, '2023-10-09'),
(2156, 607395, 'Sputnik V', 'Adenovirus Ad26 y Ad', '2024-01-07', 5, 0, 1, NULL),
(2157, 270310, 'Sputnik V', 'Adenovirus Ad26 y Ad', '2024-01-07', 5, 1, 3, '2023-10-09'),
(2158, 935210, 'Sputnik V', 'Adenovirus Ad26 y Ad', '2024-01-07', 5, 0, 2, NULL),
(2159, 415844, 'Sputnik V', 'Adenovirus Ad26 y Ad', '2024-01-07', 5, 1, 3, '2023-10-09'),
(2160, 306583, 'AstraZeneca', 'Proteína de pico del', '2024-01-07', 3, 1, 3, '2023-10-09'),
(2161, 32839, 'Johnson_Johnson', 'Partículas SARS-CoV-', '2024-01-07', 2, 0, 1, NULL),
(2162, 840559, 'AstraZeneca', 'Proteína de pico del', '2024-01-07', 3, 0, 1, NULL),
(2163, 484329, 'Johnson_Johnson', 'Partículas SARS-CoV-', '2024-01-07', 2, 1, 3, '2023-10-09'),
(2164, 777581, 'Sinopharm y Sinovac', 'Partículas SARS-CoV-', '2024-01-07', 4, 0, 1, NULL),
(2165, 240921, 'Sputnik V', 'Adenovirus Ad26 y Ad', '2024-01-07', 5, 0, 1, NULL),
(2166, 337514, 'Pfizer', 'ARN mensajero (ARNm)', '2024-01-07', 1, 0, 1, NULL),
(2167, 253458, 'Pfizer', 'ARN mensajero (ARNm)', '2024-01-07', 1, 0, 1, NULL),
(2168, 283194, 'Pfizer', 'ARN mensajero (ARNm)', '2024-01-07', 1, 1, 3, '2023-10-09'),
(2169, 33203, 'Sputnik V', 'Adenovirus Ad26 y Ad', '2024-01-07', 5, 1, 3, '2023-10-09'),
(2170, 570811, 'Pfizer', 'ARN mensajero (ARNm)', '2024-01-07', 1, 0, 2, NULL),
(2171, 910452, 'Pfizer', 'ARN mensajero (ARNm)', '2024-01-07', 1, 0, 1, NULL),
(2172, 809786, 'Sinopharm y Sinovac', 'Partículas SARS-CoV-', '2024-01-07', 4, 0, 1, NULL),
(2173, 279652, 'Sputnik V', 'Adenovirus Ad26 y Ad', '2024-01-07', 5, 0, 1, NULL),
(2174, 808743, 'Sputnik V', 'Adenovirus Ad26 y Ad', '2024-01-07', 5, 1, 3, NULL),
(2175, 363153, 'Sputnik V', 'Adenovirus Ad26 y Ad', '2024-01-07', 5, 0, 2, NULL),
(2176, 204760, 'Johnson_Johnson', 'Partículas SARS-CoV-', '2024-01-07', 2, 1, 3, NULL),
(2177, 458003, 'AstraZeneca', 'Proteína de pico del', '2024-01-07', 3, 1, 1, '2023-10-10');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `ciudadano`
--
ALTER TABLE `ciudadano`
  ADD PRIMARY KEY (`idCiudadano`),
  ADD UNIQUE KEY `DNI` (`DNI`);

--
-- Indices de la tabla `fabricante`
--
ALTER TABLE `fabricante`
  ADD PRIMARY KEY (`idEmpresa`),
  ADD UNIQUE KEY `Cuit` (`Cuit`);

--
-- Indices de la tabla `geo`
--
ALTER TABLE `geo`
  ADD PRIMARY KEY (`idGeo`),
  ADD UNIQUE KEY `nombre` (`nombre`);

--
-- Indices de la tabla `login`
--
ALTER TABLE `login`
  ADD PRIMARY KEY (`idLogin`),
  ADD KEY `usuario` (`usuario`);

--
-- Indices de la tabla `patologias`
--
ALTER TABLE `patologias`
  ADD PRIMARY KEY (`DNI`);

--
-- Indices de la tabla `turnero_1`
--
ALTER TABLE `turnero_1`
  ADD PRIMARY KEY (`idTurnos`);

--
-- Indices de la tabla `turnero_2`
--
ALTER TABLE `turnero_2`
  ADD PRIMARY KEY (`idTurnos`);

--
-- Indices de la tabla `turnero_3`
--
ALTER TABLE `turnero_3`
  ADD PRIMARY KEY (`idTurnos`);

--
-- Indices de la tabla `turno`
--
ALTER TABLE `turno`
  ADD PRIMARY KEY (`idTurno`),
  ADD UNIQUE KEY `idVial` (`idVial`),
  ADD KEY `DNI` (`DNI`),
  ADD KEY `idCentro` (`idCentro`);

--
-- Indices de la tabla `vacunatorio`
--
ALTER TABLE `vacunatorio`
  ADD PRIMARY KEY (`idCentro`),
  ADD UNIQUE KEY `idVial` (`idVial`),
  ADD UNIQUE KEY `idVial_2` (`idVial`),
  ADD KEY `Citas` (`Citas`),
  ADD KEY `idVial_3` (`idVial`);

--
-- Indices de la tabla `viales`
--
ALTER TABLE `viales`
  ADD PRIMARY KEY (`idVial`),
  ADD UNIQUE KEY `NumeroSerie` (`NumeroSerie`),
  ADD KEY `idLaboratorio` (`idLaboratorio`),
  ADD KEY `idVacunatorio` (`idVacunatorio`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `ciudadano`
--
ALTER TABLE `ciudadano`
  MODIFY `idCiudadano` tinyint(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=84;

--
-- AUTO_INCREMENT de la tabla `fabricante`
--
ALTER TABLE `fabricante`
  MODIFY `idEmpresa` tinyint(5) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;

--
-- AUTO_INCREMENT de la tabla `geo`
--
ALTER TABLE `geo`
  MODIFY `idGeo` tinyint(4) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=66;

--
-- AUTO_INCREMENT de la tabla `login`
--
ALTER TABLE `login`
  MODIFY `idLogin` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=25;

--
-- AUTO_INCREMENT de la tabla `turnero_1`
--
ALTER TABLE `turnero_1`
  MODIFY `idTurnos` int(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=93;

--
-- AUTO_INCREMENT de la tabla `turnero_2`
--
ALTER TABLE `turnero_2`
  MODIFY `idTurnos` tinyint(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=93;

--
-- AUTO_INCREMENT de la tabla `turnero_3`
--
ALTER TABLE `turnero_3`
  MODIFY `idTurnos` tinyint(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=93;

--
-- AUTO_INCREMENT de la tabla `turno`
--
ALTER TABLE `turno`
  MODIFY `idTurno` int(30) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=26;

--
-- AUTO_INCREMENT de la tabla `vacunatorio`
--
ALTER TABLE `vacunatorio`
  MODIFY `idCentro` tinyint(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT de la tabla `viales`
--
ALTER TABLE `viales`
  MODIFY `idVial` int(100) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2178;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `login`
--
ALTER TABLE `login`
  ADD CONSTRAINT `login_ibfk_1` FOREIGN KEY (`usuario`) REFERENCES `ciudadano` (`DNI`);

--
-- Filtros para la tabla `patologias`
--
ALTER TABLE `patologias`
  ADD CONSTRAINT `patologias_ibfk_1` FOREIGN KEY (`DNI`) REFERENCES `ciudadano` (`DNI`);

--
-- Filtros para la tabla `turno`
--
ALTER TABLE `turno`
  ADD CONSTRAINT `turno_ibfk_1` FOREIGN KEY (`idCentro`) REFERENCES `vacunatorio` (`idCentro`),
  ADD CONSTRAINT `turno_ibfk_10` FOREIGN KEY (`idVial`) REFERENCES `viales` (`idVial`),
  ADD CONSTRAINT `turno_ibfk_3` FOREIGN KEY (`idCentro`) REFERENCES `vacunatorio` (`idCentro`),
  ADD CONSTRAINT `turno_ibfk_8` FOREIGN KEY (`idCentro`) REFERENCES `vacunatorio` (`idCentro`),
  ADD CONSTRAINT `turno_ibfk_9` FOREIGN KEY (`DNI`) REFERENCES `ciudadano` (`DNI`);

--
-- Filtros para la tabla `viales`
--
ALTER TABLE `viales`
  ADD CONSTRAINT `viales_ibfk_1` FOREIGN KEY (`idLaboratorio`) REFERENCES `fabricante` (`idEmpresa`),
  ADD CONSTRAINT `viales_ibfk_2` FOREIGN KEY (`idVacunatorio`) REFERENCES `vacunatorio` (`idCentro`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
