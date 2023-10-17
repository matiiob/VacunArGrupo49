-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 09-10-2023 a las 23:54:55
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
-- Base de datos: `vacunargrupo49`
--
CREATE DATABASE IF NOT EXISTS `vacunargrupo49` DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci;
USE `vacunargrupo49`;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `citavacunacion`
--

CREATE TABLE `citavacunacion` (
  `idCodCita` int(11) NOT NULL,
  `idciudadano` int(11) NOT NULL,
  `codRefuerzo` int(11) NOT NULL,
  `fechaHoraCita` varchar(60) NOT NULL,
  `centroVacunacion` varchar(60) NOT NULL,
  `fechaHoraColoca` datetime NOT NULL,
  `dosis` int(11) NOT NULL,
  `estado` tinyint(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `citavacunacion`
--

INSERT INTO `citavacunacion` (`idCodCita`, `idciudadano`, `codRefuerzo`, `fechaHoraCita`, `centroVacunacion`, `fechaHoraColoca`, `dosis`, `estado`) VALUES
(4, 1, 1, '2023/10/01', 'Vacunatorio Hospital', '2023-10-10 00:00:00', 1, 1),
(6, 3, 1, '2023/10/05', 'Centro de vacunacion CIC', '2023-11-05 00:00:00', 2, 1),
(7, 2, 1, '2023/10/15', 'Centro de vacunacion ATE', '2023-11-09 00:00:00', 2, 1);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `ciudadano`
--

CREATE TABLE `ciudadano` (
  `idCiudadano` int(11) NOT NULL,
  `dni` int(11) NOT NULL,
  `nombreCompleto` varchar(60) NOT NULL,
  `email` varchar(60) NOT NULL,
  `celular` varchar(60) NOT NULL,
  `patologia` varchar(60) DEFAULT NULL,
  `ambitoTrabajo` varchar(60) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `ciudadano`
--

INSERT INTO `ciudadano` (`idCiudadano`, `dni`, `nombreCompleto`, `email`, `celular`, `patologia`, `ambitoTrabajo`) VALUES
(1, 123, 'Juan Lopez', 'juan@lopez', '012', 'hiv', 'Salud'),
(2, 23456789, 'Maria DeBernardi', 'MariaDB234@gmail.com', '15-3456-7890', 'Afeccion pulmonar', 'Bomberos'),
(3, 12345678, 'Jose Piñeiro', 'JoseP123@gmail.com', '15-2345-6789', 'no', 'Seguridad'),
(4, 34567890, 'Pedro Monte', 'PedroM345@gmail.com', '15-5678-9012', 'Diabetes', 'Fuerza Armadas');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `laboratorio`
--

CREATE TABLE `laboratorio` (
  `idLaboratorio` int(11) NOT NULL,
  `cuit` bigint(11) NOT NULL,
  `nomLaboratorio` varchar(90) NOT NULL,
  `pais` varchar(90) NOT NULL,
  `domComercial` varchar(90) NOT NULL,
  `estado` tinyint(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `laboratorio`
--

INSERT INTO `laboratorio` (`idLaboratorio`, `cuit`, `nomLaboratorio`, `pais`, `domComercial`, `estado`) VALUES
(1, 12345678900, 'Pfizer (Pfizer)', 'ARG', 'Colec.Panamericana 1804 Piso 1°(Sector B),Lado Sur\nV.Adelina, Prov.Bs As', 1),
(2, 12345678901, 'Raffo (Moderna)', 'ARG', 'Laprida 1225 PB “A”, Ciudad Autónoma de Buenos Aires', 1),
(3, 12345678902, 'mAbxience Argentina-Manufacturing Drug Substance (AstraSeneca)', 'ARG', 'Carlos Villate 5148 Munro, Buenos Aires', 1),
(4, 12345678903, 'Sinergium Biotech(Sinopharm)', 'ARG', 'Panamericana\nKm 38,7. Garín.Prov.Bs As', 1),
(6, 12345678904, 'Laboratorio Richmond(Spunik v)', 'ARG', 'Bouchard 680, Ciudad Autónoma de Buenos Aires', 1);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `vacuna`
--

CREATE TABLE `vacuna` (
  `idVacuna` int(11) NOT NULL,
  `nroSerieDosis` int(11) NOT NULL,
  `marca` varchar(60) NOT NULL,
  `medida` double NOT NULL,
  `fechaCaduca` date NOT NULL,
  `colocada` tinyint(1) NOT NULL,
  `laboratorio` int(11) NOT NULL,
  `eliminada` tinyint(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `vacuna`
--

INSERT INTO `vacuna` (`idVacuna`, `nroSerieDosis`, `marca`, `medida`, `fechaCaduca`, `colocada`, `laboratorio`, `eliminada`) VALUES
(1, 1234567890, 'ARNm (Pfiser)', 0.3, '2023-06-10', 1, 1, 0),
(2, 1234567891, 'mRNA-1273 (Moderna)', 0.5, '2023-06-15', 1, 2, 0),
(3, 1234567892, 'ChAdOx1-s (AstraSeneca)', 0.5, '2023-06-20', 1, 2, 0),
(4, 1234567893, 'BBIBP-Corv (Sinopharm)', 0.5, '2023-06-05', 1, 2, 0),
(5, 1234567894, 'Gam-Covid-VacM (Sputnik)', 0.3, '2023-06-25', 1, 2, 0);

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `citavacunacion`
--
ALTER TABLE `citavacunacion`
  ADD PRIMARY KEY (`idCodCita`),
  ADD UNIQUE KEY `idciudadano` (`idciudadano`),
  ADD KEY `dosis` (`dosis`);

--
-- Indices de la tabla `ciudadano`
--
ALTER TABLE `ciudadano`
  ADD PRIMARY KEY (`idCiudadano`),
  ADD UNIQUE KEY `dni` (`dni`);

--
-- Indices de la tabla `laboratorio`
--
ALTER TABLE `laboratorio`
  ADD PRIMARY KEY (`idLaboratorio`),
  ADD UNIQUE KEY `cuit` (`cuit`);

--
-- Indices de la tabla `vacuna`
--
ALTER TABLE `vacuna`
  ADD PRIMARY KEY (`idVacuna`),
  ADD UNIQUE KEY `nroSerieDosis` (`nroSerieDosis`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `citavacunacion`
--
ALTER TABLE `citavacunacion`
  MODIFY `idCodCita` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;

--
-- AUTO_INCREMENT de la tabla `ciudadano`
--
ALTER TABLE `ciudadano`
  MODIFY `idCiudadano` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT de la tabla `laboratorio`
--
ALTER TABLE `laboratorio`
  MODIFY `idLaboratorio` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;

--
-- AUTO_INCREMENT de la tabla `vacuna`
--
ALTER TABLE `vacuna`
  MODIFY `idVacuna` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `citavacunacion`
--
ALTER TABLE `citavacunacion`
  ADD CONSTRAINT `citavacunacion_ibfk_1` FOREIGN KEY (`idciudadano`) REFERENCES `ciudadano` (`idCiudadano`),
  ADD CONSTRAINT `citavacunacion_ibfk_2` FOREIGN KEY (`dosis`) REFERENCES `vacuna` (`idVacuna`);

--
-- Filtros para la tabla `vacuna`
--
ALTER TABLE `vacuna`
  ADD CONSTRAINT `vacuna_ibfk_1` FOREIGN KEY (`laboratorio`) REFERENCES `laboratorio` (`idLaboratorio`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;