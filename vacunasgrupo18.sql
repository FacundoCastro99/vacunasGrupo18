-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 30-10-2023 a las 03:04:53
-- Versión del servidor: 10.4.28-MariaDB
-- Versión de PHP: 8.2.4

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `vacunasgrupo18`
--
CREATE DATABASE IF NOT EXISTS `vacunasgrupo18` DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci;
USE `vacunasgrupo18`;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `citavacunacion`
--

CREATE TABLE `citavacunacion` (
  `codCita` int(11) NOT NULL,
  `Persona` varchar(30) NOT NULL,
  `email` varchar(30) NOT NULL,
  `codRefuerzo` int(11) NOT NULL,
  `fechaHoraCita` datetime NOT NULL,
  `centroVacunacion` varchar(30) NOT NULL,
  `fechaHoraColoca` datetime NOT NULL,
  `Dosis` double NOT NULL,
  `citaConcretada` tinyint(1) NOT NULL,
  `citaCancelada` tinyint(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `citavacunacion`
--

INSERT INTO `citavacunacion` (`codCita`, `Persona`, `email`, `codRefuerzo`, `fechaHoraCita`, `centroVacunacion`, `fechaHoraColoca`, `Dosis`, `citaConcretada`, `citaCancelada`) VALUES
(34, 'Castro Facundo', 'facundocastro671@gmail.com', 1, '2023-10-10 10:00:00', 'Lopez Lima', '0000-00-00 00:00:00', 0, 0, 1),
(35, 'Dante Garcia', 'lean5891@gmail.com', 1, '2023-10-28 08:00:00', 'Lopez Lima', '0000-00-00 00:00:00', 0, 0, 0);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `ciudadano`
--

CREATE TABLE `ciudadano` (
  `DNI` int(11) NOT NULL,
  `nombreCompleto` varchar(100) NOT NULL,
  `email` varchar(30) NOT NULL,
  `celular` varchar(30) NOT NULL,
  `patologia` varchar(100) NOT NULL,
  `ambitoTrabajo` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `ciudadano`
--

INSERT INTO `ciudadano` (`DNI`, `nombreCompleto`, `email`, `celular`, `patologia`, `ambitoTrabajo`) VALUES
(22456435, 'Castro Facundo', 'facundocastro671@gmail.com', '23145324', 'Ninguna', 'Otros'),
(23435654, 'Maximiliano Romero', 'maxii2015@gmail.com', '123523512', 'Ninguna', 'Fuerzas Armadas'),
(23453141, 'Dante Garcia', 'lean5891@gmail.com', '1231245', 'Ninguna', 'Otros'),
(25456765, 'Martinez Mariano', 'martinez@gmail.com', '2984153546', 'Ninguna', 'Otros'),
(27289654, 'Roberto Martinez', 'robertito@gmail.com', '2984567645', 'diabetes', 'Educación'),
(42547958, 'Pedro Sanchez', 'pedro123@gmail.com', '2984145677', 'diabetes', 'Salud'),
(43534654, 'Roberto', '123.roberto.barrios@gmail.com', '12315213', 'Ninguna', 'Educación'),
(43546456, 'Roberto Albornoz', 'roalbornoz@gmail.com', '2984567745', 'riñones', 'Educación');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `laboratorio`
--

CREATE TABLE `laboratorio` (
  `CUIT` bigint(11) NOT NULL,
  `nomLaboratorio` varchar(30) NOT NULL,
  `pais` varchar(30) NOT NULL,
  `domComercial` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `laboratorio`
--

INSERT INTO `laboratorio` (`CUIT`, `nomLaboratorio`, `pais`, `domComercial`) VALUES
(20124578, 'Pfizer', 'Inglaterra', 'Calle falsa 1234'),
(20345654214, 'AstraZeneca', 'Estados Unidos', 'Calle Falsa 2134'),
(30452314354, 'Moderna', 'China', 'Calle Falsa 23455');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `vacuna`
--

CREATE TABLE `vacuna` (
  `nroSerieDosis` int(11) NOT NULL,
  `marca` varchar(30) NOT NULL,
  `medida` double NOT NULL,
  `fechaCaduca` date NOT NULL,
  `colocada` tinyint(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `vacuna`
--

INSERT INTO `vacuna` (`nroSerieDosis`, `marca`, `medida`, `fechaCaduca`, `colocada`) VALUES
(0, 'Pfizer', 0.3, '2022-12-23', 0),
(12345, 'Pfizer', 0.5, '2023-10-06', 0),
(123413, 'AstraZeneca', 0.3, '2023-10-05', 0),
(124455, 'Moderna', 0.3, '2023-10-21', 0);

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `citavacunacion`
--
ALTER TABLE `citavacunacion`
  ADD PRIMARY KEY (`codCita`),
  ADD KEY `Persona` (`Persona`),
  ADD KEY `email` (`email`);

--
-- Indices de la tabla `ciudadano`
--
ALTER TABLE `ciudadano`
  ADD UNIQUE KEY `DNI` (`DNI`),
  ADD UNIQUE KEY `email_2` (`email`),
  ADD KEY `nombreCompleto` (`nombreCompleto`),
  ADD KEY `email` (`email`);

--
-- Indices de la tabla `laboratorio`
--
ALTER TABLE `laboratorio`
  ADD UNIQUE KEY `CUIT` (`CUIT`),
  ADD UNIQUE KEY `nomLaboratorio` (`nomLaboratorio`);

--
-- Indices de la tabla `vacuna`
--
ALTER TABLE `vacuna`
  ADD UNIQUE KEY `nroSerieDosis` (`nroSerieDosis`),
  ADD KEY `marca` (`marca`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `citavacunacion`
--
ALTER TABLE `citavacunacion`
  MODIFY `codCita` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=36;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `citavacunacion`
--
ALTER TABLE `citavacunacion`
  ADD CONSTRAINT `citavacunacion_ibfk_1` FOREIGN KEY (`Persona`) REFERENCES `ciudadano` (`nombreCompleto`),
  ADD CONSTRAINT `citavacunacion_ibfk_2` FOREIGN KEY (`email`) REFERENCES `ciudadano` (`email`);

--
-- Filtros para la tabla `vacuna`
--
ALTER TABLE `vacuna`
  ADD CONSTRAINT `vacuna_ibfk_1` FOREIGN KEY (`marca`) REFERENCES `laboratorio` (`nomLaboratorio`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
