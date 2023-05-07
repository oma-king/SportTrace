-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: May 07, 2023 at 02:26 AM
-- Server version: 10.4.27-MariaDB
-- PHP Version: 8.2.0

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `sporttrace`
--
DROP DATABASE IF EXISTS `sporttrace`;
CREATE DATABASE IF NOT EXISTS `sporttrace` DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci;
USE `sporttrace`;

-- --------------------------------------------------------

--
-- Table structure for table `diet`
--

CREATE TABLE `diet` (
  `id` int(11) NOT NULL,
  `breakfast` varchar(255) NOT NULL,
  `lunch` varchar(255) NOT NULL,
  `dinner` varchar(255) NOT NULL,
  `snacks` varchar(255) NOT NULL,
  `calories` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `diet`
--

INSERT INTO `diet` (`id`, `breakfast`, `lunch`, `dinner`, `snacks`, `calories`) VALUES
(4, '3/4 tasse de flocons de son, 1 banane, 1 tasse de lait sans gras dans un bol', '1 mini pita de blé entier, 3 onces de poitrine de dinde, 1/2 poivron rôti, 1 cuillère à café de mayonnaise, moutarde, laitue, 1 bâtonnet de mozzarella, 2 kiwis', '4 onces de plie ou de sole grillées, 2 tranches de tomates italiennes saupoudrées de 2 cuillères à soupe de parmesan râpé, 1 tasse de couscous cuit,  tasse de brocoli cuit à la vapeur, une glace en portion individuelle en dessert', 'Demi pomme', '1600');

-- --------------------------------------------------------

--
-- Table structure for table `ingredient`
--

CREATE TABLE `ingredient` (
  `id` int(11) NOT NULL,
  `name` varchar(255) NOT NULL,
  `category` varchar(255) NOT NULL,
  `calories_category` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `ingredient`
--

INSERT INTO `ingredient` (`id`, `name`, `category`, `calories_category`) VALUES
(3, '3/4 tasse de flocons de son', 'breakfast', '1600'),
(4, '1 banane', 'breakfast', '1600'),
(5, '1 tasse de lait sans gras dans un bol', 'breakfast', '1600'),
(6, '1 mini pita de blé entier', 'lunch', '1600'),
(7, '3 onces de poitrine de dinde', 'lunch', '1600'),
(8, '1/2 poivron rôti', 'lunch', '1600'),
(9, '1 cuillère à café de mayonnaise', 'lunch', '1600'),
(10, 'moutarde', 'lunch', '1600'),
(11, 'laitue', 'lunch', '1600'),
(12, '1 bâtonnet de mozzarella', 'lunch', '1600'),
(13, '2 kiwis', 'lunch', '1600'),
(14, '4 onces de plie ou de sole grillées', 'dinner', '1600'),
(15, '2 tranches de tomates italiennes saupoudrées de 2 cuillères à soupe de parmesan râpé', 'dinner', '1600'),
(16, '1 tasse de couscous cuit', 'dinner', '1600'),
(17, ' tasse de brocoli cuit à la vapeur', 'dinner', '1600'),
(18, 'une glace en portion individuelle en dessert', 'dinner', '1600'),
(19, 'Demi pomme', 'snacks', '1600');

-- --------------------------------------------------------

--
-- Table structure for table `workout`
--

CREATE TABLE `workout` (
  `id` int(11) NOT NULL,
  `nbr_series` int(11) NOT NULL,
  `duree_serie` int(11) NOT NULL,
  `body_part` varchar(255) NOT NULL,
  `description` varchar(255) NOT NULL,
  `name` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `workout`
--

INSERT INTO `workout` (`id`, `nbr_series`, `duree_serie`, `body_part`, `description`, `name`) VALUES
(4, 3, 60, 'glutes', 'Consiste à effectuer des flexions des membres inférieurs avec une barre chargée reposant sur l\'arrière des épaules.', 'Squat'),
(5, 5, 30, 'arms', 'La pompe est un exercice physique de musculation qui sollicite principalement le grand pectoral, le deltoïde et les triceps. Cet exercice est populaire car il peut être pratiqué n\'importe où, ne nécessitant pas de matériel.', 'Push-up'),
(6, 5, 60, 'shoulders', 'L\'exercice se fait à la machine ou aux haltères. Ordinairement assis, le pratiquant démarre les mains au niveau des épaules, les lève en étendant les bras à une position au-dessus de la tête, avant de descendre sans rebondir au point bas du cycle.', 'Overhead press'),
(7, 3, 60, 'abdominals', 'La planche est un exercice de gainage qui implique le maintien le plus de temps possible d\'une position similaire à celle de quelqu\'un qui ferait des pompes.', 'Plank'),
(8, 10, 30, 'back', 'A bent-over row (or barbell row) is a weight training exercise that targets a variety of back muscles. Which ones are targeted varies on form. The bent over row is often used for both bodybuilding and powerlifting.', 'Bent-over row'),
(9, 5, 60, 'legs', 'Mountain Climbers – start in a push-up position. Then start alternating legs as you bring a knee to your chest, and back to starting position.', 'Mountain Climbers'),
(10, 5, 90, 'legs', 'Il existe deux configurations d\'appareil. Dans la presse traditionnelle, le pratiquant se cale dans un siège incliné, pieds sur un chariot chargé de disques, et le repousse en tendant les jambes.', 'Leg press'),
(11, 5, 60, 'chest', 'Grip a dip station about shoulder-width apart, and climb or jump to get into the starting position. Lower yourself with control until your shoulder is below your elbow, or as deep as you comfortably can.', 'Bar Dip');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `diet`
--
ALTER TABLE `diet`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `ingredient`
--
ALTER TABLE `ingredient`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `workout`
--
ALTER TABLE `workout`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `diet`
--
ALTER TABLE `diet`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT for table `ingredient`
--
ALTER TABLE `ingredient`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=20;

--
-- AUTO_INCREMENT for table `workout`
--
ALTER TABLE `workout`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=12;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
