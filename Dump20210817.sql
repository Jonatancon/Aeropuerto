CREATE DATABASE  IF NOT EXISTS `aeropuerto` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci */ /*!80016 DEFAULT ENCRYPTION='N' */;
USE `aeropuerto`;
-- MySQL dump 10.13  Distrib 8.0.25, for Win64 (x86_64)
--
-- Host: localhost    Database: aeropuerto
-- ------------------------------------------------------
-- Server version	8.0.25

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `aviones`
--

DROP TABLE IF EXISTS `aviones`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `aviones` (
  `matricula` varchar(15) NOT NULL,
  `modelo` varchar(15) NOT NULL,
  `cedula_propietario` varchar(15) NOT NULL,
  `tipo_contrato` int NOT NULL,
  PRIMARY KEY (`matricula`),
  KEY `fk_cedula_propietario` (`cedula_propietario`),
  KEY `fk_tipo_contrato` (`tipo_contrato`),
  CONSTRAINT `fk_cedula_propietario` FOREIGN KEY (`cedula_propietario`) REFERENCES `propietarios` (`cedula`),
  CONSTRAINT `fk_tipo_contrato` FOREIGN KEY (`tipo_contrato`) REFERENCES `contratos` (`tipo_contrato`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `aviones`
--

LOCK TABLES `aviones` WRITE;
/*!40000 ALTER TABLE `aviones` DISABLE KEYS */;
INSERT INTO `aviones` VALUES ('234das','2018','1018376574',1);
/*!40000 ALTER TABLE `aviones` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `celdas`
--

DROP TABLE IF EXISTS `celdas`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `celdas` (
  `idceldas` int NOT NULL,
  `estado` tinyint(1) DEFAULT NULL,
  PRIMARY KEY (`idceldas`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `celdas`
--

LOCK TABLES `celdas` WRITE;
/*!40000 ALTER TABLE `celdas` DISABLE KEYS */;
INSERT INTO `celdas` VALUES (1,1),(2,1),(3,1),(4,1),(5,0),(6,1),(7,1),(8,1),(9,1),(10,1);
/*!40000 ALTER TABLE `celdas` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `contratos`
--

DROP TABLE IF EXISTS `contratos`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `contratos` (
  `tipo_contrato` int NOT NULL AUTO_INCREMENT,
  `valor` int NOT NULL,
  PRIMARY KEY (`tipo_contrato`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `contratos`
--

LOCK TABLES `contratos` WRITE;
/*!40000 ALTER TABLE `contratos` DISABLE KEYS */;
INSERT INTO `contratos` VALUES (1,0),(2,0);
/*!40000 ALTER TABLE `contratos` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `hangares`
--

DROP TABLE IF EXISTS `hangares`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `hangares` (
  `codigo_hangar` int NOT NULL AUTO_INCREMENT,
  `cupos_totales` int NOT NULL,
  `cupos_disponibles` int NOT NULL,
  `cupos_reservados` int NOT NULL,
  PRIMARY KEY (`codigo_hangar`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `hangares`
--

LOCK TABLES `hangares` WRITE;
/*!40000 ALTER TABLE `hangares` DISABLE KEYS */;
INSERT INTO `hangares` VALUES (0,10,9,0);
/*!40000 ALTER TABLE `hangares` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `hangares_aviones`
--

DROP TABLE IF EXISTS `hangares_aviones`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `hangares_aviones` (
  `codigo_hangar` int NOT NULL,
  `matricula_avion` varchar(15) NOT NULL,
  `fecha_ingreso` datetime NOT NULL,
  `numero_celda` int NOT NULL,
  KEY `fk_codigo_hangar` (`codigo_hangar`),
  KEY `fk_matricula_avion` (`matricula_avion`),
  KEY `fk_numero_celda_idx` (`numero_celda`),
  CONSTRAINT `fk_codigo_hangar` FOREIGN KEY (`codigo_hangar`) REFERENCES `hangares` (`codigo_hangar`),
  CONSTRAINT `fk_matricula_avion` FOREIGN KEY (`matricula_avion`) REFERENCES `aviones` (`matricula`),
  CONSTRAINT `fk_numero_celda` FOREIGN KEY (`numero_celda`) REFERENCES `celdas` (`idceldas`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `hangares_aviones`
--

LOCK TABLES `hangares_aviones` WRITE;
/*!40000 ALTER TABLE `hangares_aviones` DISABLE KEYS */;
INSERT INTO `hangares_aviones` VALUES (0,'234das','2021-08-17 10:36:15',5);
/*!40000 ALTER TABLE `hangares_aviones` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `metodos_pago`
--

DROP TABLE IF EXISTS `metodos_pago`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `metodos_pago` (
  `tipo_pago` int NOT NULL AUTO_INCREMENT,
  `nombre` varchar(45) NOT NULL,
  PRIMARY KEY (`tipo_pago`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `metodos_pago`
--

LOCK TABLES `metodos_pago` WRITE;
/*!40000 ALTER TABLE `metodos_pago` DISABLE KEYS */;
INSERT INTO `metodos_pago` VALUES (1,'credito'),(2,'contado');
/*!40000 ALTER TABLE `metodos_pago` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `propietarios`
--

DROP TABLE IF EXISTS `propietarios`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `propietarios` (
  `cedula` varchar(15) NOT NULL,
  `nombres` varchar(45) NOT NULL,
  `metodo_pago` int NOT NULL,
  PRIMARY KEY (`cedula`),
  KEY `fk_metodo_pago` (`metodo_pago`),
  CONSTRAINT `fk_metodo_pago` FOREIGN KEY (`metodo_pago`) REFERENCES `metodos_pago` (`tipo_pago`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `propietarios`
--

LOCK TABLES `propietarios` WRITE;
/*!40000 ALTER TABLE `propietarios` DISABLE KEYS */;
INSERT INTO `propietarios` VALUES ('1018376574','JONATAN RESTREPO',2);
/*!40000 ALTER TABLE `propietarios` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2021-08-17 10:46:02
