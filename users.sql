/*
Navicat MySQL Data Transfer

Source Server         : localhost@root
Source Server Version : 50645
Source Host           : localhost:3306
Source Database       : users

Target Server Type    : MYSQL
Target Server Version : 50645
File Encoding         : 65001

Date: 2019-12-07 20:32:08
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `userCode` varchar(20) NOT NULL,
  `passWord` varchar(20) NOT NULL,
  `userName` varchar(20) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES ('1', '2017140109', '123456', '王嘉豪');
INSERT INTO `user` VALUES ('2', '2016143108', '123456', '彭晶星');
INSERT INTO `user` VALUES ('3', '2017140103', '123456', '邵琳洁');
INSERT INTO `user` VALUES ('4', '2016140126', '123456', '孙艳文');
