-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: May 23, 2024 at 02:39 PM
-- Server version: 10.4.32-MariaDB
-- PHP Version: 8.0.30

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `villanueva_mariaangelnoelle_db`
--

-- --------------------------------------------------------

--
-- Table structure for table `users`
--

CREATE TABLE `users` (
  `id` int(11) NOT NULL,
  `username` varchar(50) DEFAULT NULL,
  `email` varchar(100) DEFAULT NULL,
  `student_id` varchar(50) DEFAULT NULL,
  `age` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `users`
--

INSERT INTO `users` (`id`, `username`, `email`, `student_id`, `age`) VALUES
(1, 'Pikachu Ketchum', 'pika@pokeworld.com', '2019-23145', 10),
(2, 'Naruto Uzumaki', 'naruru@leafvillage.com', '2023-27451', 12),
(3, 'Saint Philomena', 'miraculous@rome.com', '2021-21487', 13),
(4, 'Hina Ichigo', 'cute@strawberry.com', '2017-23409', 5),
(5, 'Temari Chan', 'best@waifu.com', '2019-22243', 16),
(6, 'Joseph Cupertino', 'flying@church.com', '2024-25437', 17),
(7, 'Detective Kunkun', 'smart@puppy.com', '2022-26593', 8),
(8, 'Misty Kasumi', 'water@gymleader.com', '2020-29438', 2),
(9, 'Ryuk Shinigami', 'eating@apples.com', '2020-20485', 9),
(10, 'Misa Misa', 'queen@idol.com', '2017-21874', 1);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `users`
--
ALTER TABLE `users`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `users`
--
ALTER TABLE `users`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=13;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
