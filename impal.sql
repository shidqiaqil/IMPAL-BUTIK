-- phpMyAdmin SQL Dump
-- version 4.8.3
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Dec 05, 2018 at 03:54 PM
-- Server version: 10.1.36-MariaDB
-- PHP Version: 7.2.11

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `impal`
--

-- --------------------------------------------------------

--
-- Table structure for table `bahan`
--

CREATE TABLE `bahan` (
  `no_bahan` varchar(5) NOT NULL,
  `nama_bahan` varchar(20) NOT NULL,
  `jml_bahan` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `bahan`
--

INSERT INTO `bahan` (`no_bahan`, `nama_bahan`, `jml_bahan`) VALUES
('12345', 'katun', 2);

-- --------------------------------------------------------

--
-- Table structure for table `barang`
--

CREATE TABLE `barang` (
  `no_baju` varchar(5) NOT NULL,
  `nama_baju` varchar(20) NOT NULL,
  `jumlah_baju` int(11) NOT NULL,
  `model` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `barang`
--

INSERT INTO `barang` (`no_baju`, `nama_baju`, `jumlah_baju`, `model`) VALUES
('23456', 'kaos', 5, 'v neck'),
('fu\'an', 'aku', 5, 'aku'),
('kau', 'aku', 123, 'aku');

-- --------------------------------------------------------

--
-- Table structure for table `kasir`
--

CREATE TABLE `kasir` (
  `no_kasir` varchar(5) NOT NULL,
  `nama_kasir` varchar(20) NOT NULL,
  `no_baju` varchar(5) NOT NULL,
  `no_transaksi` varchar(5) NOT NULL,
  `no_laporan` varchar(5) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `laporan`
--

CREATE TABLE `laporan` (
  `no_laporan` varchar(5) NOT NULL,
  `no_baju` varchar(20) NOT NULL,
  `no_transaksi` varchar(20) NOT NULL,
  `jumlah` int(11) NOT NULL,
  `nama_baju` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `laporan`
--

INSERT INTO `laporan` (`no_laporan`, `no_baju`, `no_transaksi`, `jumlah`, `nama_baju`) VALUES
('0987', '23456', 'T1', 1, 'kaos'),
('12322', '3113', '1222', 12, 'fsdfsdfsdf'),
('sdsd1', '2qs', '122s3', 12, 'kaos');

-- --------------------------------------------------------

--
-- Table structure for table `login_supervisor`
--

CREATE TABLE `login_supervisor` (
  `usupervisor` varchar(20) NOT NULL,
  `psupervisor` varchar(20) NOT NULL,
  `status` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `login_supervisor`
--

INSERT INTO `login_supervisor` (`usupervisor`, `psupervisor`, `status`) VALUES
('supervisor123', '123', ''),
('supervisor1234', '1234', 'supervisor'),
('suplier123', '123', 'suplier'),
('kasir123', '123', 'kasir');

-- --------------------------------------------------------

--
-- Table structure for table `penjahit`
--

CREATE TABLE `penjahit` (
  `no_penjahit` varchar(5) NOT NULL,
  `model_baju` varchar(20) NOT NULL,
  `no_bahan` varchar(5) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `penjahit`
--

INSERT INTO `penjahit` (`no_penjahit`, `model_baju`, `no_bahan`) VALUES
('78945', 'gamis', '12345');

-- --------------------------------------------------------

--
-- Table structure for table `supervisor`
--

CREATE TABLE `supervisor` (
  `id_supervisor` varchar(5) NOT NULL,
  `nama_supervisor` varchar(20) NOT NULL,
  `no_laporan` varchar(5) NOT NULL,
  `no_suplier` varchar(5) NOT NULL,
  `no_bahan` varchar(5) NOT NULL,
  `no_baju` varchar(5) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `suplier`
--

CREATE TABLE `suplier` (
  `no_suplier` varchar(5) NOT NULL,
  `bahan_kirim` varchar(20) NOT NULL,
  `no_bahan` varchar(5) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `transaksi`
--

CREATE TABLE `transaksi` (
  `no_transaksi` varchar(5) NOT NULL,
  `tgl_transaksi` date NOT NULL,
  `no_baju` varchar(11) NOT NULL,
  `jumlah` int(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Indexes for dumped tables
--

--
-- Indexes for table `bahan`
--
ALTER TABLE `bahan`
  ADD PRIMARY KEY (`no_bahan`);

--
-- Indexes for table `barang`
--
ALTER TABLE `barang`
  ADD PRIMARY KEY (`no_baju`);

--
-- Indexes for table `kasir`
--
ALTER TABLE `kasir`
  ADD PRIMARY KEY (`no_kasir`),
  ADD KEY `kasir_barang_fk` (`no_baju`),
  ADD KEY `kasir_transaksi_fk` (`no_transaksi`),
  ADD KEY `kasir_laporan_fk` (`no_laporan`);

--
-- Indexes for table `laporan`
--
ALTER TABLE `laporan`
  ADD PRIMARY KEY (`no_laporan`);

--
-- Indexes for table `penjahit`
--
ALTER TABLE `penjahit`
  ADD KEY `penjahit_bahan_fk` (`no_bahan`);

--
-- Indexes for table `supervisor`
--
ALTER TABLE `supervisor`
  ADD PRIMARY KEY (`id_supervisor`),
  ADD KEY `supervisor_laporan_fk` (`no_laporan`),
  ADD KEY `supervisor_bahan_fk` (`no_bahan`),
  ADD KEY `supervisor_suplier_fk` (`no_suplier`),
  ADD KEY `supervisor_barang_fk` (`no_baju`);

--
-- Indexes for table `suplier`
--
ALTER TABLE `suplier`
  ADD PRIMARY KEY (`no_suplier`),
  ADD KEY `no_bahan` (`no_bahan`);

--
-- Indexes for table `transaksi`
--
ALTER TABLE `transaksi`
  ADD PRIMARY KEY (`no_transaksi`),
  ADD KEY `transaksi_fk` (`no_baju`);

--
-- Constraints for dumped tables
--

--
-- Constraints for table `kasir`
--
ALTER TABLE `kasir`
  ADD CONSTRAINT `kasir_barang_fk` FOREIGN KEY (`no_baju`) REFERENCES `barang` (`no_baju`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `kasir_laporan_fk` FOREIGN KEY (`no_laporan`) REFERENCES `laporan` (`no_laporan`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `kasir_transaksi_fk` FOREIGN KEY (`no_transaksi`) REFERENCES `transaksi` (`no_transaksi`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `penjahit`
--
ALTER TABLE `penjahit`
  ADD CONSTRAINT `penjahit_bahan_fk` FOREIGN KEY (`no_bahan`) REFERENCES `bahan` (`no_bahan`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `supervisor`
--
ALTER TABLE `supervisor`
  ADD CONSTRAINT `supervisor_bahan_fk` FOREIGN KEY (`no_bahan`) REFERENCES `bahan` (`no_bahan`),
  ADD CONSTRAINT `supervisor_barang_fk` FOREIGN KEY (`no_baju`) REFERENCES `barang` (`no_baju`),
  ADD CONSTRAINT `supervisor_laporan_fk` FOREIGN KEY (`no_laporan`) REFERENCES `laporan` (`no_laporan`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `supervisor_suplier_fk` FOREIGN KEY (`no_suplier`) REFERENCES `suplier` (`no_suplier`);

--
-- Constraints for table `suplier`
--
ALTER TABLE `suplier`
  ADD CONSTRAINT `no_bahan` FOREIGN KEY (`no_bahan`) REFERENCES `bahan` (`no_bahan`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `transaksi`
--
ALTER TABLE `transaksi`
  ADD CONSTRAINT `transaksi_fk` FOREIGN KEY (`no_baju`) REFERENCES `barang` (`no_baju`) ON DELETE CASCADE ON UPDATE CASCADE;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
