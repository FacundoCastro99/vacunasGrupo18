-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 30-10-2023 a las 02:29:46
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

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `citavacunacion`
--

CREATE TABLE `citavacunacion` (
  `codCita` int(11) NOT NULL,
  `persona` int(11) NOT NULL,
  `codRefuerzo` int(11) NOT NULL,
  `fechaHoraCita` varchar(30) NOT NULL,
  `centroVacunacion` varchar(30) NOT NULL,
  `fechaHoraColoca` datetime NOT NULL,
  `dosis` int(11) NOT NULL,
  `citaConcretada` tinyint(1) NOT NULL,
  `citaCancelada` tinyint(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

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
(23756847, 'Pedro Sanchez', 'pedrito@gmail.com', '2983456354', 'Ninguna', 'Otros'),
(42547958, 'Pedro Sanchez', 'pedro123@gmail.com', '2984145677', 'diabetes', 'Salud'),
(43546456, 'Roberto Albornoz', 'roalbornoz@gmail.com', '2984567745', 'diabetes', 'Educación');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `laboratorio`
--

CREATE TABLE `laboratorio` (
  `CUIT` int(11) NOT NULL,
  `nomLaboratorio` varchar(30) NOT NULL,
  `pais` varchar(30) NOT NULL,
  `domComercial` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `laboratorio`
--

INSERT INTO `laboratorio` (`CUIT`, `nomLaboratorio`, `pais`, `domComercial`) VALUES
(20124578, 'Pfizer', 'Alemania', 'Calle falsa 123'),
(20456789, 'Moderna', 'Usa', 'calle falsa 126'),
(20963571, 'Sputnik', 'Rusia', 'calle falsa 157'),
(205689778, 'Covishield', 'India', 'Siempre vida 999'),
(206356898, 'AstraZeneca', 'Reino Unido', 'Oxford 128'),
(209987786, 'Sinopharm', 'China', 'Beijing 123');

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
(1236, 'Moderna', 0.3, '2024-10-17', 0),
(1478, 'AstraZeneca', 0.3, '2023-10-27', 0),
(2058, 'Pfizer', 0.3, '2023-12-14', 0),
(5891, 'Sinopharm', 0.3, '2024-10-26', 0);

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `citavacunacion`
--
ALTER TABLE `citavacunacion`
  ADD PRIMARY KEY (`codCita`),
  ADD UNIQUE KEY `DNI` (`persona`),
  ADD KEY `dosis` (`dosis`);

--
-- Indices de la tabla `ciudadano`
--
ALTER TABLE `ciudadano`
  ADD UNIQUE KEY `DNI` (`DNI`);

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
  ADD PRIMARY KEY (`nroSerieDosis`),
  ADD UNIQUE KEY `marca` (`marca`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `citavacunacion`
--
ALTER TABLE `citavacunacion`
  MODIFY `codCita` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `vacuna`
--
ALTER TABLE `vacuna`
  MODIFY `nroSerieDosis` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5892;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `citavacunacion`
--
ALTER TABLE `citavacunacion`
  ADD CONSTRAINT `citavacunacion_ibfk_1` FOREIGN KEY (`dosis`) REFERENCES `vacuna` (`nroSerieDosis`),
  ADD CONSTRAINT `citavacunacion_ibfk_2` FOREIGN KEY (`persona`) REFERENCES `ciudadano` (`DNI`);

--
-- Filtros para la tabla `vacuna`
--
ALTER TABLE `vacuna`
  ADD CONSTRAINT `vacuna_ibfk_1` FOREIGN KEY (`marca`) REFERENCES `laboratorio` (`nomLaboratorio`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
