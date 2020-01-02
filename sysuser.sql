/*
Navicat MySQL Data Transfer

Source Server         : localhost_3306
Source Server Version : 50562
Source Host           : localhost:3306
Source Database       : test

Target Server Type    : MYSQL
Target Server Version : 50562
File Encoding         : 65001

Date: 2020-01-03 00:38:02
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for sysuser
-- ----------------------------
DROP TABLE IF EXISTS `sysuser`;
CREATE TABLE `sysuser` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `username` varchar(20) DEFAULT NULL,
  `password` int(18) DEFAULT NULL,
  `name` varchar(20) DEFAULT NULL,
  `age` int(11) DEFAULT NULL,
  `sex` varchar(1) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of sysuser
-- ----------------------------
INSERT INTO `sysuser` VALUES ('2', 'zhangf', '12465', '辰辰', '15', null);
INSERT INTO `sysuser` VALUES ('5', 'zhangsan', '132456', '李玲', '11', null);
INSERT INTO `sysuser` VALUES ('6', null, null, null, '0', null);
INSERT INTO `sysuser` VALUES ('7', null, null, null, '0', null);
INSERT INTO `sysuser` VALUES ('8', null, null, null, '0', null);
INSERT INTO `sysuser` VALUES ('9', null, null, null, '0', null);
INSERT INTO `sysuser` VALUES ('10', null, null, null, '0', null);
