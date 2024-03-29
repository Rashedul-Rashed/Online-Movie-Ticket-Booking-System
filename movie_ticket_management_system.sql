-- phpMyAdmin SQL Dump
-- version 4.8.5
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Dec 06, 2019 at 12:02 PM
-- Server version: 10.1.38-MariaDB
-- PHP Version: 7.3.2

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `movie_ticket_management_system`
--

-- --------------------------------------------------------

--
-- Table structure for table `movies`
--

CREATE TABLE `movies` (
  `movie_list` varchar(40) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `movies`
--

INSERT INTO `movies` (`movie_list`) VALUES
('Upside Down'),
('Aquaman Returns'),
('Jumanji 1'),
('Krish part 2');

-- --------------------------------------------------------

--
-- Table structure for table `user_data`
--

CREATE TABLE `user_data` (
  `name` varchar(20) NOT NULL,
  `age` varchar(10) NOT NULL,
  `gmail` varchar(30) NOT NULL,
  `phone` varchar(20) NOT NULL,
  `address` varchar(50) NOT NULL,
  `password` varchar(30) NOT NULL,
  `m1` varchar(100) NOT NULL,
  `m2` varchar(100) NOT NULL,
  `m3` varchar(100) NOT NULL,
  `m4` varchar(100) NOT NULL,
  `m5` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `user_data`
--

INSERT INTO `user_data` (`name`, `age`, `gmail`, `phone`, `address`, `password`, `m1`, `m2`, `m3`, `m4`, `m5`) VALUES
('Md Masidul Hasan', '21', '*', '016********', '**********', '*', 'Upside Down & 03:00pm & Vip & Set Amount', '$', '$', '$', '$'),
('Md Masidul Hasan', '21', 'mdmasidulhasan27@gmail.com', '016********', '*****', '*', '', '', '', '', ''),
('*', '*', '*', '*', '**', '**', 'Upside Down & 03:00pm & Vip & Set Amount', 'movie2', 'movie3', '', ''),
('Hasan', '21', 'md', '016', 'ddd', '*', '', '', '', '', '');
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
