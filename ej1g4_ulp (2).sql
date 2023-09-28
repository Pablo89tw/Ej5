-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 28-09-2023 a las 17:40:26
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
-- Base de datos: `ej1g4_ulp`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `alumno`
--

CREATE TABLE `alumno` (
  `idAlumno` int(11) NOT NULL,
  `dni` int(11) NOT NULL,
  `apellido` varchar(20) NOT NULL,
  `nombre` varchar(20) NOT NULL,
  `fechaNacimiento` date NOT NULL,
  `estado` tinyint(4) NOT NULL,
  `año` tinyint(2) NOT NULL,
  `categoria` tinyint(4) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `alumno`
--

INSERT INTO `alumno` (`idAlumno`, `dni`, `apellido`, `nombre`, `fechaNacimiento`, `estado`, `año`, `categoria`) VALUES
(1499, 35508715, 'Fernandez', 'Martina', '1989-03-23', 1, 4, 1),
(1500, 37001234, 'Gomez', 'Juan', '1990-05-12', 1, 2, 1),
(1501, 38234567, 'Lopez', 'Carla', '1991-08-29', 1, 6, 1),
(1502, 39876543, 'Martinez', 'Pedro', '1992-09-15', 1, 1, 1),
(1503, 41012345, 'Rodriguez', 'Ana', '1993-11-28', 1, 5, 1),
(1504, 38012345, 'Martinez', 'Andrea', '1997-04-25', 1, 1, 1),
(1505, 38567890, 'Sanchez', 'Lucas', '1998-05-30', 1, 5, 1),
(1506, 39012345, 'Garcia', 'Valentina', '1999-06-05', 1, 6, 1),
(1507, 39567890, 'Rodriguez', 'Mariano', '2000-07-10', 1, 3, 1),
(1508, 40012345, 'Fernandez', 'Camila', '2001-08-15', 1, 2, 1),
(1509, 40567890, 'Lopez', 'Gabriel', '2002-09-20', 1, 4, 1),
(1510, 21012345, 'Gonzalez', 'Sofia', '2003-10-25', 1, 1, 1),
(1511, 41567890, 'Perez', 'Javier', '2004-11-30', 1, 5, 1),
(1512, 42012345, 'Sanchez', 'Andrea', '2005-12-05', 1, 6, 1),
(1513, 42567890, 'Garcia', 'Mateo', '2006-01-10', 1, 3, 1),
(1514, 43012345, 'Rodriguez', 'Valentina', '2007-02-15', 1, 2, 1),
(1515, 43567890, 'Fernandez', 'Mariano', '2008-03-20', 1, 4, 1),
(1516, 44012345, 'Lopez', 'Camila', '2009-04-25', 1, 1, 1),
(1518, 45012345, 'Perez', 'Sofia', '2011-06-05', 1, 6, 1),
(1519, 35567890, 'Sanchez', 'Javier', '2012-07-10', 1, 3, 1),
(1520, 36012345, 'Garcia', 'Andrea', '2013-08-15', 1, 2, 1),
(1521, 36567890, 'Rodriguez', 'Lucas', '2014-09-20', 1, 4, 1),
(1523, 37567890, 'Lopez', 'Mariano', '2016-11-30', 1, 5, 1),
(1524, 28012345, 'Martinez', 'Camila', '2017-12-05', 1, 6, 1),
(1525, 28567890, 'Sanchez', 'Gabriel', '2018-01-10', 1, 3, 1),
(1526, 29012345, 'Garcia', 'Sofia', '2019-02-15', 1, 2, 1),
(1527, 29567890, 'Rodriguez', 'Javier', '2020-03-20', 1, 4, 1),
(1528, 20012345, 'Fernandez', 'Andrea', '2021-04-25', 1, 1, 1),
(1529, 20567890, 'Lopez', 'Lucas', '2022-05-30', 1, 5, 1),
(1530, 19012345, 'Martinez', 'Valentina', '2023-06-05', 1, 6, 1),
(1531, 26543210, 'Gonzalez', 'Luis', '1994-01-10', 1, 3, 1),
(1532, 27098765, 'Perez', 'Sofia', '1995-02-15', 1, 2, 1),
(1533, 27567890, 'Lopez', 'Javier', '1996-03-20', 1, 4, 1),
(1534, 46543210, 'Gonzalez', 'Luis', '1994-01-10', 1, 3, 1),
(1535, 47098765, 'Perez', 'Sofia', '1995-02-15', 1, 2, 1),
(1536, 47567890, 'Lopez', 'Javier', '1996-03-20', 1, 4, 1),
(1537, 48012345, 'Martinez', 'Andrea', '1997-04-25', 1, 1, 1),
(1538, 48567890, 'Sanchez', 'Lucas', '1998-05-30', 1, 5, 1),
(1539, 49012345, 'Garcia', 'Valentina', '1999-06-05', 1, 6, 1),
(1540, 49567890, 'Rodriguez', 'Mariano', '2000-07-10', 1, 3, 1),
(1541, 50012345, 'Fernandez', 'Camila', '2001-08-15', 1, 2, 1),
(1543, 51012345, 'Gonzalez', 'Sofia', '2003-10-25', 1, 1, 1),
(1544, 51567890, 'Perez', 'Javier', '2004-11-30', 1, 5, 1),
(1545, 52012345, 'Sanchez', 'Andrea', '2005-12-05', 1, 6, 1),
(1546, 52567890, 'Garcia', 'Lucas', '2006-01-10', 1, 3, 1),
(1547, 53012345, 'Rodriguez', 'Valentina', '2007-02-15', 1, 2, 1),
(1548, 53567890, 'Fernandez', 'Mariano', '2008-03-20', 1, 4, 1),
(1549, 54012345, 'Lopez', 'Camila', '2009-04-25', 1, 1, 1),
(1550, 54567890, 'Gonzalez', 'Gabriel2', '2010-05-30', 1, 5, 1),
(1551, 55012345, 'Perez', 'Sofia', '2011-06-05', 1, 6, 1),
(1552, 55567890, 'Sanchez', 'Javier', '2012-07-10', 1, 3, 1),
(1553, 56012345, 'Garcia', 'Andrea', '2013-08-15', 1, 2, 1),
(1554, 56567890, 'Rodriguez', 'Lucas', '2014-09-20', 1, 4, 1),
(1555, 57012345, 'Fernandez', 'Valentina', '2015-10-25', 1, 1, 1),
(1556, 57567890, 'Lopez', 'Mariano', '2016-11-30', 1, 5, 1),
(1557, 58012345, 'Martinez', 'Camila', '2017-12-05', 1, 6, 1),
(1558, 58567890, 'Sanchez', 'Gabriel', '2018-01-10', 1, 3, 1),
(1559, 59012345, 'Garcia', 'Sofia', '2019-02-15', 1, 2, 1),
(1560, 59567890, 'Rodriguez', 'Javier', '2020-03-20', 1, 4, 1),
(1561, 60012345, 'Fernandez', 'Andrea', '2021-04-25', 1, 1, 1),
(1562, 60567890, 'Lopez', 'Lucas', '2022-05-30', 1, 5, 1),
(1563, 61012345, 'Martinez', 'Valentina', '2023-06-05', 1, 6, 1),
(1564, 47567891, 'Fernandez', 'Viviana', '1997-03-20', 1, 4, 1),
(1565, 48012346, 'Martinez', 'Adriana', '1998-04-25', 1, 1, 1),
(1566, 48567892, 'Perez', 'Matias', '1999-05-30', 1, 5, 1),
(1567, 49012346, 'Rodriguez', 'Andres', '2000-06-05', 1, 6, 1),
(1568, 49567893, 'Lopez', 'Gabriela', '2001-07-10', 1, 3, 1),
(1569, 50012347, 'Diaz', 'Fernando', '2002-08-15', 1, 2, 1),
(1570, 50567894, 'Hernandez', 'Mariana', '2003-09-20', 1, 4, 1),
(1571, 51012348, 'Torres', 'Cristian', '2004-10-25', 1, 1, 1),
(1572, 51567895, 'Gomez', 'Lorena', '2005-11-30', 1, 5, 1),
(1573, 52012349, 'Vargas', 'Ricardo', '2006-12-05', 1, 6, 1),
(1574, 52567896, 'Gonzalez', 'Marcela', '2007-01-10', 1, 3, 1),
(1575, 53012350, 'Silva', 'Federico', '2008-02-15', 1, 2, 1),
(1576, 53567897, 'Luna', 'Ana', '2009-03-20', 1, 4, 1),
(1577, 54012351, 'Castro', 'Esteban', '2010-04-25', 1, 1, 1),
(1578, 54567898, 'Ortega', 'Valeria', '2011-05-30', 1, 5, 1),
(1579, 55012352, 'Ruiz', 'Sebastian', '2012-06-05', 1, 6, 1),
(1580, 55567899, 'Molina', 'Carolina', '2013-07-10', 1, 3, 1),
(1581, 56012353, 'Santos', 'Alejandro', '2014-08-15', 1, 2, 1),
(1582, 56567900, 'Flores', 'Luisa', '2015-09-20', 1, 4, 1),
(1583, 57012354, 'Pereira', 'Marcos', '2016-10-25', 1, 1, 1),
(1584, 57567901, 'Cabrera', 'Micaela', '2017-11-30', 1, 5, 1),
(1585, 58012355, 'Gimenez', 'Ignacio', '2018-12-05', 1, 6, 1),
(1586, 58567902, 'Rios', 'Romina', '2019-01-10', 1, 3, 1),
(1587, 59012356, 'Blanco', 'Ezequiel', '2020-02-15', 1, 2, 1),
(1588, 59567903, 'Acosta', 'Solange', '2021-03-20', 1, 4, 1),
(1590, 60567904, 'Suarez', 'Antonella', '2023-05-30', 1, 5, 1),
(1591, 46543211, 'Gutierrez', 'Lucia', '1995-01-10', 1, 3, 1),
(1592, 47098766, 'Ramirez', 'Gonzalo', '1996-02-15', 1, 2, 1),
(1593, 17567891, 'Fernandez', 'Viviana', '1997-03-20', 1, 4, 1),
(1594, 61543210, 'Fernandez', 'Lucia', '1995-01-10', 1, 3, 1),
(1595, 62098765, 'Gutierrez', 'Gonzalo', '1996-02-15', 1, 2, 1),
(1596, 62567890, 'Ramirez', 'Viviana', '1997-03-20', 1, 4, 1),
(1597, 63012345, 'Lopez', 'Adriana', '1998-04-25', 1, 1, 1),
(1598, 63567891, 'Garcia', 'Matias', '1999-05-30', 1, 5, 1),
(1599, 64012346, 'Martinez', 'Andres', '2000-06-05', 1, 6, 1),
(1600, 64567892, 'Perez', 'Gabriela', '2001-07-10', 1, 3, 1),
(1601, 65012347, 'Diaz', 'Fernando', '2002-08-15', 1, 2, 1),
(1602, 65567892, 'Hernandez', 'Mariana', '2003-09-20', 1, 4, 1),
(1603, 66012348, 'Torres', 'Cristian', '2004-10-25', 1, 1, 1),
(1604, 66567894, 'Gomez', 'Lorena', '2005-11-30', 1, 5, 1),
(1605, 67012349, 'Vargas', 'Ricardo', '2006-12-05', 1, 6, 1),
(1606, 67567895, 'Gonzalez', 'Marcela', '2007-01-10', 1, 3, 1),
(1607, 68012350, 'Silva', 'Federico', '2008-02-15', 1, 2, 1),
(1608, 68567896, 'Luna', 'Gabriela', '2009-03-20', 1, 4, 1),
(1609, 69012351, 'Castro', 'Esteban', '2010-04-25', 1, 1, 1),
(1610, 69567897, 'Ortega', 'Valeria', '2011-05-30', 1, 5, 1),
(1611, 70012352, 'Ruiz', 'Sebastian', '2012-06-05', 1, 6, 1),
(1612, 70567898, 'Molina', 'Carolina', '2013-07-10', 1, 3, 1),
(1613, 71012353, 'Santos', 'Alejandro', '2014-08-15', 1, 2, 1),
(1614, 71567900, 'Flores', 'Luisa', '2015-09-20', 1, 4, 1),
(1615, 72012354, 'Pereira', 'Marcos', '2016-10-25', 1, 1, 1),
(1616, 72567901, 'Cabrera', 'Daniela', '2017-11-30', 1, 5, 1),
(1617, 73012355, 'Gimenez', 'Ignacio', '2018-12-05', 1, 6, 1),
(1618, 73567902, 'Rios', 'Romina', '2019-01-10', 1, 3, 1),
(1619, 74012356, 'Blanco', 'Ezequiel', '2020-02-15', 1, 2, 1),
(1620, 74567903, 'Acosta', 'Solange', '2021-03-20', 1, 4, 1),
(1621, 75012357, 'Mendez', 'Facundo', '2022-04-25', 1, 1, 1),
(1622, 75567904, 'Suarez', 'Antonella', '2023-05-30', 1, 5, 1),
(1623, 76012358, 'Martinez', 'Laura', '1994-06-10', 1, 3, 1),
(1624, 76567905, 'Lopez', 'Gonzalo', '1995-07-15', 1, 2, 1),
(1625, 77012359, 'Fernandez', 'Viviana', '1996-08-20', 1, 4, 1),
(1626, 77567906, 'Gutierrez', 'Adriana', '1997-09-25', 1, 1, 1),
(1627, 78012360, 'Ramirez', 'Matias', '1998-10-30', 1, 5, 1),
(1628, 78567907, 'Diaz', 'Andres', '1999-11-05', 1, 6, 1),
(1629, 79012361, 'Hernandez', 'Gabriela', '2000-12-10', 1, 3, 1),
(1630, 79567908, 'Torres', 'Fernando', '2001-01-15', 1, 2, 1),
(1631, 80000001, 'Alvarez', 'Lucia', '1995-01-10', 1, 3, 1),
(1632, 80000002, 'Barrera', 'Gonzalo', '1996-02-15', 1, 2, 1),
(1633, 80000003, 'Cabrera', 'Viviana', '1997-03-20', 1, 4, 1),
(1634, 80000004, 'Delgado', 'Adriana', '1998-04-25', 1, 1, 1),
(1635, 80000005, 'Espinoza', 'Matias', '1999-05-30', 1, 5, 1),
(1636, 80000006, 'Fernandez', 'Andres', '2000-06-05', 1, 6, 1),
(1637, 80000007, 'Garcia', 'Gabriela', '2001-07-10', 1, 3, 1),
(1638, 80000008, 'Hernandez', 'Fernando', '2002-08-15', 1, 2, 1),
(1639, 80000009, 'Iglesias', 'Mariana', '2003-09-20', 1, 4, 1),
(1640, 80000010, 'Jimenez', 'Cristian', '2004-10-25', 1, 1, 1),
(1641, 80000011, 'Kumar', 'Lorena', '2005-11-30', 1, 5, 1),
(1642, 80000012, 'Lopez', 'Ricardo', '2006-12-05', 1, 6, 1),
(1643, 80000013, 'Martinez', 'Marcela', '2007-01-10', 1, 3, 1),
(1644, 80000014, 'Nunez', 'Federico', '2008-02-15', 1, 2, 1),
(1645, 80000015, 'Ortega', 'Gabriela', '2009-03-20', 1, 4, 1),
(1646, 80000016, 'Perez', 'Esteban', '2010-04-25', 1, 1, 1),
(1647, 80000017, 'Quintana', 'Valeria', '2011-05-30', 1, 5, 1),
(1648, 80000018, 'Rios', 'Sebastian', '2012-06-05', 1, 6, 1),
(1649, 80000019, 'Sanchez', 'Carolina', '2013-07-10', 1, 3, 1),
(1650, 80000020, 'Torres', 'Alejandro', '2014-08-15', 1, 2, 1),
(1651, 80000021, 'Urena', 'Luisa', '2015-09-20', 1, 4, 1),
(1652, 80000022, 'Vargas', 'Marcos', '2016-10-25', 1, 1, 1),
(1653, 80000023, 'Wang', 'Daniela', '2017-11-30', 1, 5, 1),
(1654, 80000024, 'Xiong', 'Ignacio', '2018-12-05', 1, 6, 1),
(1655, 80000025, 'Yilmaz', 'Romina', '2019-01-10', 1, 3, 1),
(1656, 80000026, 'Zhang', 'Ezequiel', '2020-02-15', 1, 2, 1),
(1657, 80000027, 'Aguirre', 'Solange', '2021-03-20', 1, 4, 1),
(1658, 80000028, 'Bianchi', 'Facundo', '2022-04-25', 1, 1, 1),
(1659, 80000029, 'Chavez', 'Antonella', '2023-05-30', 1, 5, 1),
(1660, 11500000, 'Dr Mollo', 'Ariel', '2020-02-15', 1, 0, 0),
(1661, 10000027, 'Dr Virraude', 'Daniel', '2021-03-20', 1, 0, 0),
(1662, 10000028, 'Dr Torti', 'Pablo', '2022-04-25', 1, 0, 0),
(1663, 0, 'Dr new', 'Super', '2023-05-30', 1, 0, 0),
(1664, 34335685, 'Puntillo', 'Melisa', '1989-04-20', 1, 0, 0),
(1666, 91555314, 'Mollon', 'Archin', '2023-09-01', 1, 0, 0),
(1667, 25888814, 'Stanley', 'Thermo', '2023-09-06', 1, 0, 0),
(1668, 34508710, 'Grande', 'Ariana', '2016-06-14', 1, 0, 1),
(1669, 25878985, 'Ale', 'Elisa', '1990-09-13', 1, 0, 1),
(1670, 65887952, 'Brunero', 'Bracalenti', '2016-05-12', 0, 0, 1),
(1671, 65841222, 'Eristro', 'Maracaibo', '2016-05-12', 1, 0, 1),
(1672, 25888914, 'Armellini', 'Lucas', '2015-09-03', 1, 0, 1),
(1673, 53775922, 'Torti', 'Mateo', '2013-12-13', 1, 1, 1),
(1674, 25879865, 'Apellido', 'Diego', '2023-09-11', 0, 1, 1),
(1675, 35876952, 'Matarazzo', 'Andrea', '2023-09-06', 0, 1, 1),
(1676, 49586785, 'Verstappen', 'Max', '1997-05-14', 1, 1, 1),
(1678, 35689953, 'kevin', 'Clain', '2023-09-14', 1, 1, 1),
(1681, 45923412, 'Inglés', 'Tennis', '2023-09-01', 1, 1, 1),
(1684, 58695862, 'LEON', 'MATEO', '2023-09-01', 1, 1, 1),
(1686, 34508716, 'Pedroza', '  German', '2023-09-01', 1, 4, 1);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `inscripcion`
--

CREATE TABLE `inscripcion` (
  `idInscripcion` int(11) NOT NULL,
  `nota` int(11) NOT NULL,
  `idAlumno` int(11) NOT NULL,
  `idMateria` int(11) NOT NULL,
  `estado` tinyint(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `inscripcion`
--

INSERT INTO `inscripcion` (`idInscripcion`, `nota`, `idAlumno`, `idMateria`, `estado`) VALUES
(39, 10, 1532, 106, 0),
(40, 10, 1524, 101, 0),
(42, 4, 1641, 101, 0),
(43, 555, 1662, 106, 0),
(44, 11, 1662, 101, 0),
(45, 4, 1662, 102, 0),
(46, 6, 1662, 103, 0),
(47, 8, 1662, 105, 0),
(48, 9, 1662, 108, 0),
(49, 10, 1662, 110, 0),
(50, 10, 1669, 106, 0),
(52, 10, 1658, 106, 0),
(53, 200, 1658, 101, 0),
(54, 10, 1658, 110, 0),
(55, 9, 1658, 127, 1),
(56, 7, 1658, 120, 0),
(57, 4, 1658, 113, 0),
(58, 6, 1513, 101, 0),
(59, 7, 1502, 114, 0),
(61, 2, 1511, 122, 0),
(62, 2, 1511, 122, 0),
(63, 9, 1502, 109, 0),
(64, 6, 1504, 114, 1),
(65, 10, 1502, 106, 0),
(66, 7, 1502, 114, 0),
(67, 7, 1504, 115, 0),
(68, 0, 1602, 128, 1),
(69, 0, 1550, 139, 0),
(70, 5, 1506, 114, 0),
(71, 4, 1506, 110, 0),
(72, 0, 1507, 136, 0),
(73, 0, 1658, 107, 0),
(74, 0, 1676, 109, 0),
(75, 0, 1658, 119, 0),
(76, 0, 1658, 125, 0),
(77, 0, 1645, 104, 0),
(79, 2, 1657, 104, 0),
(80, 2, 1656, 108, 0),
(81, 3, 1656, 114, 0),
(82, 4, 1656, 126, 0),
(83, 3, 1657, 116, 0),
(84, 5, 1656, 132, 0),
(85, 5, 1506, 114, 0),
(87, 7, 1502, 101, 0),
(88, 0, 1515, 102, 0),
(89, 9, 1673, 135, 1),
(90, 8, 1673, 136, 0),
(91, 4, 1673, 137, 0),
(92, 0, 1500, 121, 0);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `login`
--

CREATE TABLE `login` (
  `Usuario` int(10) NOT NULL,
  `Clave` varchar(10) NOT NULL,
  `estado` tinyint(4) NOT NULL,
  `ingresos` tinyint(4) NOT NULL,
  `recordar` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `login`
--

INSERT INTO `login` (`Usuario`, `Clave`, `estado`, `ingresos`, `recordar`) VALUES
(0, '0', 0, 0, 1),
(10000027, 'pepe1', 0, 0, 0),
(10000028, 'pepe1', 0, 0, 1),
(11500000, '11500', 0, 0, 0),
(17567891, '17567', 0, 0, 0),
(19012345, '19012', 0, 0, 0),
(20012345, '20012', 0, 0, 0),
(20567890, '20567', 0, 0, 0),
(21012345, '21012', 0, 0, 0),
(25878985, '25878', 0, 0, 0),
(25879865, '25879', 0, 0, 0),
(25888814, '25888', 0, 0, 1),
(25888914, '25888', 0, 0, 0),
(26543210, '26543', 0, 0, 0),
(27098765, '27098', 0, 0, 0),
(27567890, '27567', 0, 0, 0),
(28012345, '28012', 0, 0, 0),
(28567890, '28567', 0, 0, 0),
(29012345, '29012', 0, 0, 1),
(29567890, '29567', 0, 0, 0),
(34335685, '34335', 0, 0, 0),
(34508710, '34508', 0, 0, 0),
(34508716, '34508', 0, 0, 0),
(35508715, '35508', 0, 0, 0),
(35567890, '35567', 0, 0, 0),
(35689953, '35689', 0, 0, 0),
(35876952, '35876', 0, 0, 0),
(36012345, '36012', 0, 0, 0),
(36567890, '36567', 0, 0, 0),
(37001234, '37001', 0, 0, 0),
(37012345, '37012', 0, 0, 0),
(37567890, '37567', 0, 0, 0),
(38012345, '38012', 0, 0, 0),
(38234567, '38234', 0, 0, 0),
(38567890, '38567', 0, 0, 0),
(39012345, '39012', 0, 0, 0),
(39567890, '39567', 0, 0, 0),
(39876543, '39876', 1, 0, 0),
(40012345, '40012', 0, 0, 0),
(40567890, '40567', 0, 0, 0),
(41012345, '41012', 0, 0, 0),
(41567890, '41567', 0, 0, 0),
(42012345, '42012', 0, 0, 0),
(42567890, '42567', 0, 0, 0),
(43012345, '43012', 0, 0, 0),
(43567890, '43567', 1, 0, 0),
(44012345, '44012', 0, 0, 0),
(44567890, '44567', 0, 0, 0),
(45012345, '45012', 0, 0, 0),
(45923412, '45923', 0, 0, 0),
(46543210, '46543', 0, 0, 0),
(46543211, '46543', 0, 0, 0),
(47098765, '47098', 0, 0, 0),
(47098766, '47098', 0, 0, 0),
(47567890, '47567', 0, 0, 0),
(47567891, '47567', 0, 0, 0),
(48012345, '48012', 0, 0, 0),
(48012346, '48012', 0, 0, 0),
(48567890, '48567', 0, 0, 0),
(48567892, '48567', 0, 0, 0),
(49012345, '49012', 0, 0, 0),
(49012346, '49012', 0, 0, 0),
(49567890, '49567', 0, 0, 0),
(49567893, '49567', 0, 0, 0),
(49586785, '49586', 0, 0, 0),
(50012345, '50012', 0, 0, 0),
(50012347, '50012', 1, 0, 0),
(50567890, '50567', 0, 0, 0),
(50567894, '50567', 0, 0, 0),
(51012345, '51012', 0, 0, 0),
(51012348, '51012', 0, 0, 0),
(51567890, '51567', 0, 0, 0),
(51567895, '51567', 0, 0, 0),
(52012345, '52012', 0, 0, 0),
(52012349, '52012', 0, 0, 0),
(52567890, '52567', 0, 0, 0),
(52567896, '52567', 0, 0, 0),
(53012345, '53012', 0, 0, 0),
(53012350, '53012', 0, 0, 0),
(53567890, '53567', 0, 0, 0),
(53567897, '53567', 0, 0, 0),
(53775922, '53775', 0, 0, 1),
(54012345, '54012', 0, 0, 0),
(54012351, '54012', 0, 0, 0),
(54567890, '54567', 0, 0, 0),
(54567898, '54567', 0, 0, 0),
(55012345, '55012', 0, 0, 0),
(55012352, '55012', 0, 0, 0),
(55567890, '55567', 0, 0, 0),
(55567899, '55567', 0, 0, 0),
(56012345, '56012', 0, 0, 0),
(56012353, '56012', 0, 0, 0),
(56567890, '56567', 0, 0, 0),
(56567900, '56567', 0, 0, 0),
(57012345, '57012', 0, 0, 0),
(57012354, '57012', 0, 0, 0),
(57567890, '57567', 0, 0, 0),
(57567901, '57567', 0, 0, 0),
(58012345, '58012', 0, 0, 0),
(58012355, '58012', 0, 0, 0),
(58567890, '58567', 0, 0, 0),
(58567902, '58567', 0, 0, 0),
(58695862, '58695', 0, 0, 0),
(58965325, '58965', 0, 0, 0),
(59012345, '59012', 0, 0, 0),
(59012356, '59012', 0, 0, 0),
(59567890, '59567', 0, 0, 0),
(59567903, '59567', 0, 0, 0),
(60012345, '60012', 0, 0, 0),
(60012357, '60012', 0, 0, 0),
(60567890, '60567', 0, 0, 0),
(60567904, '60567', 0, 0, 0),
(61012345, '61012', 0, 0, 0),
(61543210, '61543', 0, 0, 0),
(62098765, '62098', 0, 0, 0),
(62567890, '62567', 0, 0, 0),
(63012345, '63012', 0, 0, 0),
(63567891, '63567', 0, 0, 0),
(64012346, '64012', 0, 0, 0),
(64567892, '64567', 0, 0, 0),
(65012347, '65012', 0, 0, 0),
(65567893, '65567', 0, 0, 0),
(65841222, '65841', 0, 0, 0),
(65887952, '65887', 0, 0, 0),
(66012348, '66012', 0, 0, 0),
(66567894, '66567', 0, 0, 0),
(67012349, '67012', 0, 0, 0),
(67567895, '67567', 0, 0, 0),
(68012350, '68012', 0, 0, 0),
(68567896, '68567', 0, 0, 0),
(69012351, '69012', 0, 0, 0),
(69567897, '69567', 0, 0, 0),
(70012352, '70012', 0, 0, 0),
(70567898, '70567', 0, 0, 0),
(71012353, '71012', 0, 0, 0),
(71567900, '71567', 0, 0, 0),
(72012354, '72012', 0, 0, 0),
(72567901, '72567', 0, 0, 0),
(73012355, '73012', 0, 0, 0),
(73567902, '73567', 0, 0, 0),
(74012356, '74012', 0, 0, 0),
(74567903, '74567', 0, 0, 0),
(75012357, '75012', 0, 0, 0),
(75567904, '75567', 0, 0, 0),
(76012358, '76012', 0, 0, 0),
(76567905, '76567', 0, 0, 0),
(77012359, '77012', 0, 0, 0),
(77567906, '77567', 0, 0, 0),
(78012360, '78012', 0, 0, 0),
(78567907, '78567', 0, 0, 0),
(79012361, '79012', 0, 0, 0),
(79567908, '79567', 0, 0, 0),
(80000001, '80000', 0, 0, 0),
(80000002, '80000', 1, 0, 0),
(80000003, '80000', 0, 0, 0),
(80000004, '80000', 0, 0, 0),
(80000005, '80000', 0, 0, 0),
(80000006, '80000', 0, 0, 0),
(80000007, '80000', 0, 0, 0),
(80000008, '80000', 0, 0, 0),
(80000009, '80000', 0, 0, 0),
(80000010, '80000', 0, 0, 0),
(80000011, '80000', 0, 0, 0),
(80000012, '80000', 0, 0, 0),
(80000013, '80000', 0, 0, 0),
(80000014, '80000', 0, 0, 0),
(80000015, '80000', 0, 0, 0),
(80000016, '80000', 0, 0, 0),
(80000017, '80000', 0, 0, 0),
(80000018, '80000', 0, 0, 0),
(80000019, '80000', 0, 0, 0),
(80000020, '80000', 0, 0, 0),
(80000021, '80000', 0, 0, 0),
(80000022, '80000', 0, 0, 0),
(80000023, '80000', 0, 0, 0),
(80000024, '80000', 0, 0, 0),
(80000025, '80000', 0, 0, 0),
(80000026, '80000', 0, 0, 0),
(80000027, '80000', 0, 0, 1),
(80000028, '80000', 0, 0, 1),
(80000029, '80000', 1, 0, 0),
(91555314, '91555', 0, 0, 0);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `materia`
--

CREATE TABLE `materia` (
  `idMateria` int(11) NOT NULL,
  `nombre` varchar(100) NOT NULL,
  `año` int(11) NOT NULL,
  `estado` tinyint(1) NOT NULL,
  `cupo` int(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `materia`
--

INSERT INTO `materia` (`idMateria`, `nombre`, `año`, `estado`, `cupo`) VALUES
(101, 'Matemáticas', 1, 1, 132),
(102, 'Física', 2, 1, 130),
(103, 'Química', 3, 1, 140),
(104, 'Biología', 4, 0, 115),
(105, 'Historia', 5, 1, 120),
(106, 'Geografía', 6, 1, 150),
(107, 'Lengua Española', 1, 1, 110),
(108, 'Literatura', 2, 1, 135),
(109, 'Arte', 3, 1, 130),
(110, 'Música', 1, 1, 125),
(111, 'Educación Física', 5, 1, 120),
(112, 'Tecnología', 6, 1, 135),
(113, 'Inglés', 1, 1, 140),
(114, 'Francés', 2, 1, 130),
(115, 'Alemán', 3, 1, 125),
(116, 'Español Avanzado', 4, 1, 135),
(117, 'Programación', 5, 1, 145),
(118, 'Economía', 6, 1, 120),
(119, 'Ética y Ciudadanía', 1, 1, 115),
(120, 'Religión', 2, 0, 130),
(121, 'Filosofía', 3, 1, 125),
(122, 'Psicología', 4, 1, 135),
(123, 'Sociología', 5, 1, 140),
(124, 'Derecho', 6, 1, 120),
(125, 'Biología Marina', 1, 1, 140),
(126, 'Astronomía', 2, 1, 130),
(127, 'Medicina', 3, 1, 145),
(128, 'Geología', 4, 1, 125),
(129, 'Ecología', 5, 1, 120),
(130, 'Ciencias Políticas', 6, 1, 135),
(131, 'Nutrición', 1, 1, 130),
(132, 'Enfermería', 2, 1, 135),
(133, 'Odontología', 3, 1, 125),
(134, 'Veterinaria', 4, 1, 140),
(135, 'Arquitectura', 5, 1, 120),
(136, 'Diseño Gráfico', 6, 1, 145),
(137, 'Historia 2', 3, 1, 0),
(138, 'Historia III', 3, 1, 345),
(139, 'Fisica Cuantica Tu Loro', 6, 1, 840),
(140, 'PSEINT', 1, 1, 150),
(141, 'Fisicoquímica de las Metaloproteínas', 6, 1, 150),
(142, 'Fisica Cúantica III', 6, 1, 150),
(147, 'Fisica IIZ   ', 1, 1, 150);

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `alumno`
--
ALTER TABLE `alumno`
  ADD PRIMARY KEY (`idAlumno`),
  ADD UNIQUE KEY `dni` (`dni`);

--
-- Indices de la tabla `inscripcion`
--
ALTER TABLE `inscripcion`
  ADD PRIMARY KEY (`idInscripcion`),
  ADD KEY `idAlumno` (`idAlumno`),
  ADD KEY `idMateria` (`idMateria`);

--
-- Indices de la tabla `login`
--
ALTER TABLE `login`
  ADD UNIQUE KEY `Usuario` (`Usuario`);

--
-- Indices de la tabla `materia`
--
ALTER TABLE `materia`
  ADD PRIMARY KEY (`idMateria`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `alumno`
--
ALTER TABLE `alumno`
  MODIFY `idAlumno` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=1687;

--
-- AUTO_INCREMENT de la tabla `inscripcion`
--
ALTER TABLE `inscripcion`
  MODIFY `idInscripcion` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=93;

--
-- AUTO_INCREMENT de la tabla `materia`
--
ALTER TABLE `materia`
  MODIFY `idMateria` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=149;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `inscripcion`
--
ALTER TABLE `inscripcion`
  ADD CONSTRAINT `inscripcion_ibfk_1` FOREIGN KEY (`idAlumno`) REFERENCES `alumno` (`idAlumno`),
  ADD CONSTRAINT `inscripcion_ibfk_2` FOREIGN KEY (`idMateria`) REFERENCES `materia` (`idMateria`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
