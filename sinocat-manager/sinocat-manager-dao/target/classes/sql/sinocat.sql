/*
SQLyog 企业版 - MySQL GUI v8.14 
MySQL - 5.7.17-log : Database - sinocat
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`sinocat` /*!40100 DEFAULT CHARACTER SET utf8 COLLATE utf8_bin */;

USE `sinocat`;

/*Table structure for table `address` */

DROP TABLE IF EXISTS `address`;

CREATE TABLE `address` (
  `a_id` int(11) NOT NULL,
  `a_address` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  `u_id` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  `a_type` tinyint(1) DEFAULT NULL COMMENT '是否默认地址1是0不是',
  PRIMARY KEY (`a_id`),
  KEY `FK_address` (`u_id`),
  CONSTRAINT `FK_address` FOREIGN KEY (`u_id`) REFERENCES `user` (`u_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

/*Data for the table `address` */

insert  into `address`(`a_id`,`a_address`,`u_id`,`a_type`) values (1,'四川','1',1);

/*Table structure for table `car` */

DROP TABLE IF EXISTS `car`;

CREATE TABLE `car` (
  `c_id` int(11) NOT NULL,
  `parent_id` int(11) DEFAULT NULL,
  `c_type` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  `c_discharge` varchar(255) COLLATE utf8_bin DEFAULT NULL COMMENT '排量',
  PRIMARY KEY (`c_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

/*Data for the table `car` */

insert  into `car`(`c_id`,`parent_id`,`c_type`,`c_discharge`) values (1,-1,'车','0'),(2,1,'大众','1'),(3,1,'本田','1'),(4,1,'法拉利','2'),(5,2,'Polo','1'),(6,2,'辉昂','1'),(7,2,'朗境','1'),(8,2,'朗行','1'),(9,2,'帕萨特','1'),(10,3,'飞度','1'),(11,3,'锋范','1'),(12,3,'雅阁','1'),(13,3,'思迪','1'),(14,4,'812 Superfast','2'),(15,4,'法拉利488','2'),(16,4,'F12berlinetta','2'),(17,4,'GTC4Lusso','2'),(18,4,'LaFerrari','2'),(19,5,'2018款 手动','1.5L'),(20,5,'2018款 自动','1.5L'),(21,6,'2018款 两驱商务','380TSI'),(22,6,'2018款 四驱豪华','480 V6'),(23,7,'2017款 自动','1.6L'),(24,7,'2017款 自动豪华','1.6L'),(25,8,'2017款 手动','1.6L'),(26,8,'2017 自动','1.6L'),(27,9,'2017 尊雅版','280TSI'),(28,9,'2017 旗舰版','280TSI'),(29,10,'2107 手动','1.5L'),(30,10,'2018 CVT','1.5L'),(31,11,'2018 手动','1.5L'),(32,11,'2018 CVT','1.5L'),(33,12,'2108 舒适版','2.0L'),(34,12,'2018 混动','2.0L'),(35,13,'2007 手动','1.3L'),(36,13,'2007 自动','1.5L'),(37,14,'2017 标准版','6.5L'),(38,15,'2018 488 Pista','6.5L'),(39,15,'2015 488 GTB','6.5L'),(40,16,'2013 标准','6.3L'),(41,17,'2017 V8','3.9T'),(42,17,'2016 V12','6.3L'),(43,18,'2014 标准版','6.3L');

/*Table structure for table `car_production` */

DROP TABLE IF EXISTS `car_production`;

CREATE TABLE `car_production` (
  `cp_id` int(11) NOT NULL,
  `c_id` int(11) DEFAULT NULL,
  `p_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`cp_id`),
  KEY `FK_car_production` (`c_id`),
  KEY `FK_car_production2` (`p_id`),
  CONSTRAINT `FK_car_production` FOREIGN KEY (`c_id`) REFERENCES `car` (`c_id`),
  CONSTRAINT `FK_car_production2` FOREIGN KEY (`p_id`) REFERENCES `production` (`p_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

/*Data for the table `car_production` */

insert  into `car_production`(`cp_id`,`c_id`,`p_id`) values (1,1,5),(2,1,6),(3,1,7);

/*Table structure for table `orders` */

DROP TABLE IF EXISTS `orders`;

CREATE TABLE `orders` (
  `o_id` varchar(255) COLLATE utf8_bin NOT NULL,
  `u_id` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  `a_id` int(11) DEFAULT NULL,
  `o_totalprice` float DEFAULT NULL,
  PRIMARY KEY (`o_id`),
  KEY `FK_order` (`a_id`),
  KEY `FK_order2` (`u_id`),
  CONSTRAINT `FK_order` FOREIGN KEY (`a_id`) REFERENCES `address` (`a_id`),
  CONSTRAINT `FK_order1` FOREIGN KEY (`u_id`) REFERENCES `user` (`u_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

/*Data for the table `orders` */

insert  into `orders`(`o_id`,`u_id`,`a_id`,`o_totalprice`) values ('1','1',1,2600);

/*Table structure for table `production` */

DROP TABLE IF EXISTS `production`;

CREATE TABLE `production` (
  `p_id` int(11) NOT NULL,
  `p_name` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  `p_price` float DEFAULT NULL,
  `p_image` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  `p_content` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  `pt_id` int(11) DEFAULT NULL,
  `p_weight` float DEFAULT NULL COMMENT '重量千克',
  `ps_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`p_id`),
  KEY `FK_production` (`pt_id`),
  KEY `FK_production1` (`ps_id`),
  CONSTRAINT `FK_production` FOREIGN KEY (`pt_id`) REFERENCES `production_type` (`pt_id`),
  CONSTRAINT `FK_production1` FOREIGN KEY (`ps_id`) REFERENCES `production_system` (`ps_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

/*Data for the table `production` */

insert  into `production`(`p_id`,`p_name`,`p_price`,`p_image`,`p_content`,`pt_id`,`p_weight`,`ps_id`) values (5,'尾气处理3',1300,'img','优化尾气3',3,15.2,1),(6,'尾气处理3',1300,'img','优化尾气3',3,15.2,1),(7,'尾气处理3',1300,'img','优化尾气3',3,15.2,1),(8,'尾气处理3',1300,'img','优化尾气3',3,15.2,1),(9,'尾气处理3',1300,'img','优化尾气3',3,15.2,1),(10,'尾气处理3',1300,'img','优化尾气3',3,15.2,1),(11,'尾气处理3',1300,'img','优化尾气3',3,15.2,1),(12,'尾气处理3',1300,'img','优化尾气3',3,15.2,1),(13,'尾气处理3',1300,'img','优化尾气3',3,15.2,1);

/*Table structure for table `production_order_relation` */

DROP TABLE IF EXISTS `production_order_relation`;

CREATE TABLE `production_order_relation` (
  `po_id` int(11) NOT NULL,
  `o_id` int(11) DEFAULT NULL,
  `product_id` int(11) DEFAULT NULL,
  `pt_num` int(11) DEFAULT NULL,
  PRIMARY KEY (`po_id`),
  KEY `FK_production_order_relation` (`o_id`),
  KEY `FK_production_order_relation2` (`product_id`),
  CONSTRAINT `FK_production_order_relation2` FOREIGN KEY (`product_id`) REFERENCES `production` (`p_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

/*Data for the table `production_order_relation` */

insert  into `production_order_relation`(`po_id`,`o_id`,`product_id`,`pt_num`) values (1,1,5,2);

/*Table structure for table `production_system` */

DROP TABLE IF EXISTS `production_system`;

CREATE TABLE `production_system` (
  `ps_id` int(11) NOT NULL,
  `system_type` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  PRIMARY KEY (`ps_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

/*Data for the table `production_system` */

insert  into `production_system`(`ps_id`,`system_type`) values (1,'系统一');

/*Table structure for table `production_type` */

DROP TABLE IF EXISTS `production_type`;

CREATE TABLE `production_type` (
  `pt_id` int(11) NOT NULL COMMENT '商品类别',
  `product_type` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  PRIMARY KEY (`pt_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

/*Data for the table `production_type` */

insert  into `production_type`(`pt_id`,`product_type`) values (1,'上汽'),(2,'广汽'),(3,'一汽');

/*Table structure for table `user` */

DROP TABLE IF EXISTS `user`;

CREATE TABLE `user` (
  `u_id` varchar(255) COLLATE utf8_bin NOT NULL,
  `u_password` varchar(255) COLLATE utf8_bin NOT NULL,
  `u_name` varchar(255) COLLATE utf8_bin NOT NULL,
  `u_weuxin_key` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  `a_id` int(11) DEFAULT NULL COMMENT 'address',
  `u_phone` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  PRIMARY KEY (`u_id`),
  KEY `FK_user` (`a_id`),
  CONSTRAINT `FK_user` FOREIGN KEY (`a_id`) REFERENCES `address` (`a_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

/*Data for the table `user` */

insert  into `user`(`u_id`,`u_password`,`u_name`,`u_weuxin_key`,`a_id`,`u_phone`) values ('1','123','123',NULL,NULL,'123');

/*Table structure for table `user_car_relation` */

DROP TABLE IF EXISTS `user_car_relation`;

CREATE TABLE `user_car_relation` (
  `cu_id` int(11) NOT NULL,
  `c_id` int(11) DEFAULT NULL COMMENT 'car',
  `u_id` varchar(255) COLLATE utf8_bin DEFAULT NULL COMMENT 'user',
  PRIMARY KEY (`cu_id`),
  KEY `FK_user_car_relation` (`u_id`),
  KEY `FK_user_car_relation_car` (`c_id`),
  CONSTRAINT `FK_user_car_relation` FOREIGN KEY (`u_id`) REFERENCES `user` (`u_id`),
  CONSTRAINT `FK_user_car_relation_car` FOREIGN KEY (`c_id`) REFERENCES `car` (`c_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

/*Data for the table `user_car_relation` */

insert  into `user_car_relation`(`cu_id`,`c_id`,`u_id`) values (1,19,'1');

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
