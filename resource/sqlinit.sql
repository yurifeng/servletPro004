/*
Navicat MySQL Data Transfer

Source Server         : mysql80
Source Server Version : 80013
Source Host           : localhost:3306
Source Database       : jsp_servlet

Target Server Type    : MYSQL
Target Server Version : 80013
File Encoding         : 65001

Date: 2018-11-26 22:40:46
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for t_user
-- ----------------------------
DROP TABLE IF EXISTS `t_user`;
CREATE TABLE `t_user` (
  `uid` int(10) NOT NULL AUTO_INCREMENT,
  `uname` varchar(100) NOT NULL,
  `pwd` varchar(100) NOT NULL,
  PRIMARY KEY (`uid`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- ----------------------------
-- Records of t_user
-- ----------------------------
INSERT INTO `t_user` VALUES ('1', 'yuri', 'yuri001');
INSERT INTO `t_user` VALUES ('2', 'jsd', 'jsd002');
INSERT INTO `t_user` VALUES ('3', 'jst', 'jst003');
INSERT INTO `t_user` VALUES ('4', 'catalina', 'catalina004');
INSERT INTO `t_user` VALUES ('5', 'paris', 'paris005');
INSERT INTO `t_user` VALUES ('6', 'alice', 'alice006');
INSERT INTO `t_user` VALUES ('7', 'bob', 'bob007');
INSERT INTO `t_user` VALUES ('8', 'jeff', 'jeff008');
INSERT INTO `t_user` VALUES ('9', 'lisa', 'lisa009');
INSERT INTO `t_user` VALUES ('10', 'harry', 'harry010');
