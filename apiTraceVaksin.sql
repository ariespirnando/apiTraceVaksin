-- --------------------------------------------------------
-- Host:                         127.0.0.1
-- Server version:               10.4.27-MariaDB - mariadb.org binary distribution
-- Server OS:                    Win64
-- HeidiSQL Version:             11.1.0.6116
-- --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8 */;
/*!50503 SET NAMES utf8mb4 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

-- Dumping structure for table apivaksin.karyawan
CREATE TABLE IF NOT EXISTS `karyawan` (
  `idKaryawan` int(11) NOT NULL AUTO_INCREMENT,
  `namaKaryawan` varchar(50) DEFAULT NULL,
  `divisiKaryawan` varchar(50) DEFAULT NULL,
  `posisiKaryawan` varchar(50) DEFAULT NULL,
  `alamatKaryawan` text DEFAULT NULL,
  PRIMARY KEY (`idKaryawan`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- Dumping data for table apivaksin.karyawan: ~4 rows (approximately)
/*!40000 ALTER TABLE `karyawan` DISABLE KEYS */;
INSERT INTO `karyawan` (`idKaryawan`, `namaKaryawan`, `divisiKaryawan`, `posisiKaryawan`, `alamatKaryawan`) VALUES
	(1, 'AINI RAHMAYATI', 'LEGAL', 'STAFF', 'JAKARTA SELATAN'),
	(2, 'SUWONDO', 'HRD', 'STAFF', 'BOGOR'),
	(3, 'MASTHURA', 'FINANCE', 'STAFF', 'DEPOK'),
	(4, 'ELLA SEPTI WH', 'LEGAL', 'MAGANG', 'JAKARTA BARAT'),
	(5, 'NIDA UL', 'IT', 'MAGANG', 'BEKASI');
/*!40000 ALTER TABLE `karyawan` ENABLE KEYS */;

-- Dumping structure for table apivaksin.vaksin
CREATE TABLE IF NOT EXISTS `vaksin` (
  `idVaksin` int(11) NOT NULL AUTO_INCREMENT,
  `jenisVaksin` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`idVaksin`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- Dumping data for table apivaksin.vaksin: ~3 rows (approximately)
/*!40000 ALTER TABLE `vaksin` DISABLE KEYS */;
INSERT INTO `vaksin` (`idVaksin`, `jenisVaksin`) VALUES
	(1, 'COVID'),
	(2, 'INFLUENZA'),
	(3, 'HEPATITIS');
/*!40000 ALTER TABLE `vaksin` ENABLE KEYS */;

-- Dumping structure for table apivaksin.vaksindetail
CREATE TABLE IF NOT EXISTS `vaksindetail` (
  `idVaksinDetail` int(11) NOT NULL AUTO_INCREMENT,
  `idVaksin` int(11) DEFAULT NULL,
  `namaVaksin` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`idVaksinDetail`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- Dumping data for table apivaksin.vaksindetail: ~7 rows (approximately)
/*!40000 ALTER TABLE `vaksindetail` DISABLE KEYS */;
INSERT INTO `vaksindetail` (`idVaksinDetail`, `idVaksin`, `namaVaksin`) VALUES
	(1, 1, 'COVID 1'),
	(2, 1, 'COVID 2'),
	(3, 1, 'BOOSTER 1'),
	(4, 1, 'BOOSTER 2'),
	(5, 2, 'FLU'),
	(6, 3, 'HEPA A'),
	(7, 4, 'HEPA B');
/*!40000 ALTER TABLE `vaksindetail` ENABLE KEYS */;

-- Dumping structure for table apivaksin.vaksinkaryawan
CREATE TABLE IF NOT EXISTS `vaksinkaryawan` (
  `idVaksinKaryawan` int(11) NOT NULL AUTO_INCREMENT,
  `idKaryawan` int(11) DEFAULT NULL,
  `idVaksinDetail` int(11) DEFAULT NULL,
  PRIMARY KEY (`idVaksinKaryawan`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- Dumping data for table apivaksin.vaksinkaryawan: ~8 rows (approximately)
/*!40000 ALTER TABLE `vaksinkaryawan` DISABLE KEYS */;
INSERT INTO `vaksinkaryawan` (`idVaksinKaryawan`, `idKaryawan`, `idVaksinDetail`) VALUES
	(1, 1, 1),
	(2, 1, 2),
	(3, 1, 3),
	(4, 2, 5),
	(5, 2, 6),
	(6, 3, 1),
	(7, 3, 2),
	(8, 3, 5);
/*!40000 ALTER TABLE `vaksinkaryawan` ENABLE KEYS */;

/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IF(@OLD_FOREIGN_KEY_CHECKS IS NULL, 1, @OLD_FOREIGN_KEY_CHECKS) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
