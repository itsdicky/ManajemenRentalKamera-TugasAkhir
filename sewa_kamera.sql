-- phpMyAdmin SQL Dump
-- version 5.1.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Waktu pembuatan: 05 Jan 2022 pada 15.34
-- Versi server: 10.4.18-MariaDB
-- Versi PHP: 8.0.3

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `sewa_kamera`
--

-- --------------------------------------------------------

--
-- Struktur dari tabel `data_login`
--

CREATE TABLE `data_login` (
  `email` varchar(64) NOT NULL,
  `username` varchar(32) NOT NULL,
  `password` varchar(64) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data untuk tabel `data_login`
--

INSERT INTO `data_login` (`email`, `username`, `password`) VALUES
('admin@gmail.com', 'admin', 'admin123'),
('dicky@gmail.com', 'dicky', 'dicky123'),
('satria@gmail.com', 'satria', 'satria123');

-- --------------------------------------------------------

--
-- Struktur dari tabel `list_order`
--

CREATE TABLE `list_order` (
  `id_order` varchar(32) NOT NULL,
  `nik_order` varchar(64) NOT NULL,
  `nama_order` varchar(128) NOT NULL,
  `alamat_order` varchar(255) NOT NULL,
  `telepon_order` varchar(32) NOT NULL,
  `kamera_order` varchar(64) NOT NULL,
  `waktu_order` varchar(32) NOT NULL,
  `bayar_order` varchar(32) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Struktur dari tabel `list_stock`
--

CREATE TABLE `list_stock` (
  `id_stock` varchar(32) NOT NULL,
  `nama_stock` varchar(64) NOT NULL,
  `jenis_stock` varchar(32) NOT NULL,
  `harga_stock` varchar(32) NOT NULL,
  `tahun_stock` varchar(32) NOT NULL,
  `count_stock` varchar(32) NOT NULL,
  `status_stock` varchar(32) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Indexes for dumped tables
--

--
-- Indeks untuk tabel `list_order`
--
ALTER TABLE `list_order`
  ADD PRIMARY KEY (`id_order`);

--
-- Indeks untuk tabel `list_stock`
--
ALTER TABLE `list_stock`
  ADD PRIMARY KEY (`id_stock`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
