-- phpMyAdmin SQL Dump
-- version 4.8.5
-- https://www.phpmyadmin.net/
--
-- Anamakine: 127.0.0.1
-- Üretim Zamanı: 12 May 2019, 18:50:01
-- Sunucu sürümü: 10.1.38-MariaDB
-- PHP Sürümü: 7.1.28

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Veritabanı: `otokiralama`
--

-- --------------------------------------------------------

--
-- Tablo için tablo yapısı `admin`
--

CREATE TABLE `admin` (
  `id` int(11) NOT NULL,
  `k_adi` text NOT NULL,
  `sifre` text NOT NULL,
  `k_turu` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Tablo döküm verisi `admin`
--

INSERT INTO `admin` (`id`, `k_adi`, `sifre`, `k_turu`) VALUES
(1, 'sa', '123', 'admin');

-- --------------------------------------------------------

--
-- Tablo için tablo yapısı `arac`
--

CREATE TABLE `arac` (
  `id` int(11) NOT NULL,
  `plaka` varchar(255) NOT NULL,
  `marka` varchar(255) DEFAULT NULL,
  `model` varchar(255) DEFAULT NULL,
  `arac_tipi` varchar(255) DEFAULT NULL,
  `renk` varchar(255) DEFAULT NULL,
  `yil` varchar(255) DEFAULT NULL,
  `resim` varchar(255) DEFAULT NULL,
  `durum` varchar(255) DEFAULT NULL,
  `ucret` int(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Tablo döküm verisi `arac`
--

INSERT INTO `arac` (`id`, `plaka`, `marka`, `model`, `arac_tipi`, `renk`, `yil`, `resim`, `durum`, `ucret`) VALUES
(1, '55rsa55', 'ford', 'focus', 'otomobil', 'Beyaz', '2017', 'null', 'musait', 150),
(2, '25kk25', 'mercedens', 'benz', 'otomobil', 'Gri', '2015', 'resimyok.jpg', 'musait', 150),
(4, '55rsa23', 'ford', 'focus', 'otomobil', 'Beyaz', '2017', 'resimyok.jpg', 'musaitdegil', 255),
(5, '55rsa54', 'ford', 'focus', 'otomobil', 'Gri', '2017', 'resimyok.jpg', 'musait', 250);

-- --------------------------------------------------------

--
-- Tablo için tablo yapısı `kiralama`
--

CREATE TABLE `kiralama` (
  `id` int(11) NOT NULL,
  `tc` varchar(255) DEFAULT NULL,
  `plaka` varchar(255) DEFAULT NULL,
  `alis_tarihi` varchar(255) DEFAULT NULL,
  `veris_tarihi` varchar(255) DEFAULT NULL,
  `ucret` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Tablo döküm verisi `kiralama`
--

INSERT INTO `kiralama` (`id`, `tc`, `plaka`, `alis_tarihi`, `veris_tarihi`, `ucret`) VALUES
(1, '19949521012', '55rte55', '23.02.2019', '25.04.2019', '1500'),
(2, '19969592012', '55rsa55', '', '', '450'),
(3, '19969592012', '55rsa55', '', '', '555');

-- --------------------------------------------------------

--
-- Tablo için tablo yapısı `musteri`
--

CREATE TABLE `musteri` (
  `id` int(11) NOT NULL,
  `tc` varchar(255) DEFAULT NULL,
  `adi_soyadi` varchar(255) DEFAULT NULL,
  `cinsiyet` varchar(255) DEFAULT NULL,
  `telefon` varchar(255) DEFAULT NULL,
  `dogum_tarihi` varchar(255) DEFAULT NULL,
  `ehliyet_no` varchar(255) DEFAULT NULL,
  `sifre` varchar(255) DEFAULT NULL,
  `gizli_soru` varchar(255) DEFAULT NULL,
  `yaniti` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Tablo döküm verisi `musteri`
--

INSERT INTO `musteri` (`id`, `tc`, `adi_soyadi`, `cinsiyet`, `telefon`, `dogum_tarihi`, `ehliyet_no`, `sifre`, `gizli_soru`, `yaniti`) VALUES
(1, '19969592012', 'imam bakir', 'Erkek', '05454', '12.02.1999', '25252', '123', 'Hangi ?ehirde do?dunuz?', 'santuri'),
(2, '24252525252', 'ramazan serif', 'Erkek', '05454', '12.02.1999', '25252', '123', '?lk evcil hayvan?n?z?n ad? nedir?', 'santuri');

--
-- Dökümü yapılmış tablolar için indeksler
--

--
-- Tablo için indeksler `admin`
--
ALTER TABLE `admin`
  ADD PRIMARY KEY (`id`);

--
-- Tablo için indeksler `arac`
--
ALTER TABLE `arac`
  ADD PRIMARY KEY (`id`);

--
-- Tablo için indeksler `kiralama`
--
ALTER TABLE `kiralama`
  ADD PRIMARY KEY (`id`);

--
-- Tablo için indeksler `musteri`
--
ALTER TABLE `musteri`
  ADD PRIMARY KEY (`id`);

--
-- Dökümü yapılmış tablolar için AUTO_INCREMENT değeri
--

--
-- Tablo için AUTO_INCREMENT değeri `admin`
--
ALTER TABLE `admin`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- Tablo için AUTO_INCREMENT değeri `arac`
--
ALTER TABLE `arac`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- Tablo için AUTO_INCREMENT değeri `kiralama`
--
ALTER TABLE `kiralama`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- Tablo için AUTO_INCREMENT değeri `musteri`
--
ALTER TABLE `musteri`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
