-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 20-10-2023 a las 23:25:07
-- Versión del servidor: 10.4.27-MariaDB
-- Versión de PHP: 8.2.0

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
  `fechaHoraCita` datetime NOT NULL,
  `centroVacunacion` varchar(60) NOT NULL,
  `fechaHoraColoca` datetime NOT NULL,
  `dosis` int(11) NOT NULL,
  `estado` tinyint(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `citavacunacion`
--

INSERT INTO `citavacunacion` (`idCodCita`, `idciudadano`, `codRefuerzo`, `fechaHoraCita`, `centroVacunacion`, `fechaHoraColoca`, `dosis`, `estado`) VALUES
(4, 1, 1, '2023-10-01 00:00:00', 'Vacunatorio Hospital', '2023-10-10 00:00:00', 1, 1),
(6, 3, 1, '2023-10-05 00:00:00', 'Centro de vacunacion CIC', '2023-11-05 00:00:00', 2, 1),
(7, 2, 1, '2023-10-15 00:00:00', 'Centro de vacunacion ATE', '2023-11-09 00:00:00', 2, 1);

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
  `ambitoTrabajo` varchar(60) NOT NULL,
  `eliminado` tinyint(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `ciudadano`
--

INSERT INTO `ciudadano` (`idCiudadano`, `dni`, `nombreCompleto`, `email`, `celular`, `patologia`, `ambitoTrabajo`, `eliminado`) VALUES
(1, 123, 'Juan Lopez', 'juan@lopez', '012', 'hiv', 'Salud', 1),
(2, 23456789, 'Maria DeBernardi', 'MariaDB234@gmail.com', '15-3456-7890', 'Afeccion pulmonar', 'Bomberos', 1),
(3, 12345678, 'Jose Piñeiro', 'JoseP123@gmail.com', '15-2345-6789', 'no', 'Seguridad', 1),
(4, 34567890, 'Pedro Monte', 'PedroM345@gmail.com', '15-5678-9012', 'Diabetes', 'Fuerza Armadas', 1),
(5, 23454345, 'Juan Carlos', 'sasas@dsdsds', 'aasss', 'Cancer', 'comboBoxChanged', 1),
(6, 2323233, '', '', 'asasasa', '', 'comboBoxChanged', 1),
(7, 23232232, '', '', '2', '', 'comboBoxChanged', 1),
(8, 23232223, '', '', '233', '', 'comboBoxChanged', 1),
(9, 3232323, '', '', '21212122', '', 'comboBoxChanged', 1),
(11, 21333547, 'Mario Canovas', 'mario@gmail.com', '98765432', 'diabetes', 'comboBoxChanged', 1),
(16, 33567222, 'crisóstomo lafinur', 'lafi@gmail.com', '22222222', 'diabetes', 'comboBoxChanged', 1),
(19, 23453456, 'juana de arco', 'juana@gmail.com', '76767676', 'diabetes', 'comboBoxChanged', 1),
(20, 9898988, 'mario puente', 'juan_22@gmail.com', '33333333', 'diabetes', 'comboBoxChanged', 1),
(21, 22222222, 'enrique iglesias', 'enri_22@hotmail.com', '222234545', 'diabetes', 'comboBoxChanged', 1),
(22, 44444444, 'ozzy osbourne', 'ozzy_666@gmail.com', '6666666666', 'paranoid', 'comboBoxChanged', 1),
(23, 2121212, 'maria marta', 'juan_123@gmail.com', '234543253443', 'diabetes', 'comboBoxChanged', 1),
(25, 12323232, 'pocho la pantera', 'pocho_22s@gmail.com', '11111111', 'diabetes', 'Otros', 1),
(27, 66666666, 'biza rap', 'rap_biza@gmail.com', '45678900', 'diabetes', 'Personal de Bomberos', 1),
(28, 99999999, 'luca prodan', 'luca_casi100@gmail.com', '02657620272', 'diabetes', 'Autoridad de Gobierno', 1),
(29, 7777777, 'marta sanchez', 'martu_987-what@gmail.com', '05123456789', 'Obesidad', 'Otro', 1),
(31, 12345, 'gladys la bomba', 'bombita_68@gmail.com', '34567890', 'Afección  Cardíaca', 'Personal de Salud', 0),
(33, 87000000, 'enzo fernandez', 'enzo_321@gmail.com', '56789567', 'Obesidad', 'Otro', 1),
(34, 77777777, 'luis torti', 'torti_55@gmail.com', '34534534', 'Afección Pulmonar', 'Personal de Fuerzas Armadas', 1),
(36, 77543098, 'pedro ponce', 'pedro@gmail.com', '98987654', 'Diabétes', 'Personal de Educación', 1),
(37, 65656666, 'papu gomez', 'papu_22@gmail.com', '34534534', 'Afección  Cardíaca', 'Personal de Salud', 0);

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
(5, 1234567894, 'Gam-Covid-VacM (Sputnik)', 0.3, '2023-06-25', 1, 2, 0),
(8, 1234567899, 'ARNm(Piser)', 0.3, '2023-12-20', 1, 1, 0),
(9, 123, 'ARNm (Pfiser)', 0.3, '2024-03-13', 0, 1, 0),
(18, 2147483647, 'Seleccionar una opción', 0.3, '2023-10-06', 0, 1, 0),
(42, 987654320, 'ARNm (Pfiser)', 0.3, '2023-10-05', 0, 1, 0),
(58, 1209120912, 'ARNm (Pfiser)', 0.3, '2024-10-24', 0, 1, 0);

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
  ADD UNIQUE KEY `nroSerieDosis` (`nroSerieDosis`),
  ADD KEY `vacuna_ibfk_1` (`laboratorio`);

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
  MODIFY `idCiudadano` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=38;

--
-- AUTO_INCREMENT de la tabla `laboratorio`
--
ALTER TABLE `laboratorio`
  MODIFY `idLaboratorio` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;

--
-- AUTO_INCREMENT de la tabla `vacuna`
--
ALTER TABLE `vacuna`
  MODIFY `idVacuna` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=77;

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
