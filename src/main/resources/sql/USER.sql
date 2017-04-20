/*
Navicat MySQL Data Transfer

Source Server         : 로컬
Source Server Version : 50505
Source Host           : localhost:3306
Source Database       : springboot

Target Server Type    : MYSQL
Target Server Version : 50505
File Encoding         : 65001

Date: 2017-04-13 12:55:22
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `ID` int(11) DEFAULT NULL,
  `USER_ID` varchar(255) DEFAULT NULL,
  `USER_EMAIL` varchar(255) DEFAULT NULL,
  `USER_NAME` varchar(255) DEFAULT NULL,
  `CREATE_TIME` timestamp NULL DEFAULT NULL,
  `UPDATE_TIME` timestamp NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES ('1', 'park7777', '123@gmail.com', '박기진', '2017-03-23 14:51:03', '2017-04-13 12:55:12');
