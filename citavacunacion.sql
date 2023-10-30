-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 30-10-2023 a las 02:18:01
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

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `citavacunacion`
--

CREATE TABLE `citavacunacion` (
  `idCodCita` int(11) NOT NULL,
  `idciudadano` int(11) NOT NULL,
  `codRefuerzo` int(11) NOT NULL,
  `fechaHoraCita` datetime DEFAULT NULL,
  `centroVacunacion` varchar(60) NOT NULL,
  `fechaHoraColoca` datetime DEFAULT NULL,
  `dosis` int(11) NOT NULL,
  `estado` tinyint(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `citavacunacion`
--

INSERT INTO `citavacunacion` (`idCodCita`, `idciudadano`, `codRefuerzo`, `fechaHoraCita`, `centroVacunacion`, `fechaHoraColoca`, `dosis`, `estado`) VALUES
(4, 1, 2, '2023-10-15 00:00:00', 'Centro de vacunacion ATE', NULL, 2, 0),
(8, 4, 1, '2023-11-15 10:30:00', 'Centro de vacunacion ATE', '2023-11-09 10:30:00', 2, 1),
(28, 5, 1, '2023-10-24 00:00:00', 'Centro de Vacunacion 2.', '2023-10-26 00:00:00', 3, 1),
(29, 6, 2, '2023-11-01 00:00:00', 'Centro de vacunacion ATE', '2023-11-09 00:00:00', 2, 1),
(45, 3, 1, '2023-10-25 00:00:00', 'Centro de Vacunacion 1.', '2023-12-30 00:00:00', 2, 1),
(46, 2, 1, '2023-10-25 00:00:00', 'Centro de Vacunacion 2.', NULL, 2, 0),
(47, 7, 1, '2023-10-30 00:00:00', 'Centro de Vacunacion 1', '2023-11-29 00:00:00', 1, 0);

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
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `citavacunacion`
--
ALTER TABLE `citavacunacion`
  MODIFY `idCodCita` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=56;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `citavacunacion`
--
ALTER TABLE `citavacunacion`
  ADD CONSTRAINT `citavacunacion_ibfk_1` FOREIGN KEY (`idciudadano`) REFERENCES `ciudadano` (`idCiudadano`),
  ADD CONSTRAINT `citavacunacion_ibfk_2` FOREIGN KEY (`dosis`) REFERENCES `vacuna` (`idVacuna`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
