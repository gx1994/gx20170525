/*
Navicat MySQL Data Transfer

Source Server         : bishe
Source Server Version : 50523
Source Host           : localhost:3360
Source Database       : bew

Target Server Type    : MYSQL
Target Server Version : 50523
File Encoding         : 65001

Date: 2017-05-25 20:34:01
*/

SET FOREIGN_KEY_CHECKS=0;
-- ----------------------------
-- Table structure for `bd_buyer_company`
-- ----------------------------
DROP TABLE IF EXISTS `bd_buyer_company`;
CREATE TABLE `bd_buyer_company` (
  `company_id` int(10) NOT NULL DEFAULT '0',
  `buy_from_company_id` int(10) NOT NULL AUTO_INCREMENT,
  PRIMARY KEY (`buy_from_company_id`)
) ENGINE=InnoDB AUTO_INCREMENT=221 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of bd_buyer_company
-- ----------------------------
INSERT INTO `bd_buyer_company` VALUES ('110', '220');

-- ----------------------------
-- Table structure for `bd_company_information`
-- ----------------------------
DROP TABLE IF EXISTS `bd_company_information`;
CREATE TABLE `bd_company_information` (
  `company_id` int(10) NOT NULL AUTO_INCREMENT,
  `company_name` varchar(256) NOT NULL,
  `company_address` varchar(256) DEFAULT NULL,
  `company_tel` varchar(32) NOT NULL,
  `company_mail` varchar(256) NOT NULL,
  PRIMARY KEY (`company_id`)
) ENGINE=InnoDB AUTO_INCREMENT=111 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of bd_company_information
-- ----------------------------
INSERT INTO `bd_company_information` VALUES ('110', '好厉害公司', '好厉害公司在哪里', '18820035167', '188@163.com');

-- ----------------------------
-- Table structure for `bd_personal_forecast`
-- ----------------------------
DROP TABLE IF EXISTS `bd_personal_forecast`;
CREATE TABLE `bd_personal_forecast` (
  `personal_forecast_id` int(10) NOT NULL AUTO_INCREMENT,
  `project_id` int(10) NOT NULL,
  `staff_id` int(10) NOT NULL DEFAULT '0',
  `Bforecast` decimal(10,0) DEFAULT NULL,
  `Sforecast` decimal(10,0) DEFAULT NULL,
  `year` int(10) DEFAULT NULL,
  `month` int(10) DEFAULT NULL,
  PRIMARY KEY (`personal_forecast_id`)
) ENGINE=InnoDB AUTO_INCREMENT=1005 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of bd_personal_forecast
-- ----------------------------
INSERT INTO `bd_personal_forecast` VALUES ('1', '0', '1', '10000', '222222', null, null);
INSERT INTO `bd_personal_forecast` VALUES ('1001', '3001', '2', '4000', '5000', '2015', '3');
INSERT INTO `bd_personal_forecast` VALUES ('1002', '3002', '2', '5000', '6000', '2015', '5');
INSERT INTO `bd_personal_forecast` VALUES ('1003', '3003', '3', '5000', '7000', '2016', '4');
INSERT INTO `bd_personal_forecast` VALUES ('1004', '3004', '3', '8000', '10000', '2015', '3');

-- ----------------------------
-- Table structure for `bd_personal_project`
-- ----------------------------
DROP TABLE IF EXISTS `bd_personal_project`;
CREATE TABLE `bd_personal_project` (
  `personal_project_id` int(10) NOT NULL AUTO_INCREMENT,
  `personal_forecast_id` int(10) NOT NULL,
  `Bmonthly` decimal(10,0) NOT NULL,
  `Bprice` decimal(10,0) NOT NULL,
  `Btask_time` decimal(10,0) NOT NULL,
  `Smonthly` decimal(10,0) NOT NULL,
  `Sprice` decimal(10,0) NOT NULL,
  `Stask_time` decimal(10,0) NOT NULL,
  `monthly_profit` decimal(10,0) NOT NULL,
  PRIMARY KEY (`personal_project_id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of bd_personal_project
-- ----------------------------
INSERT INTO `bd_personal_project` VALUES ('1', '100000', '20000', '300000', '0', '222000', '2929292', '222', '2222');

-- ----------------------------
-- Table structure for `bd_project_information`
-- ----------------------------
DROP TABLE IF EXISTS `bd_project_information`;
CREATE TABLE `bd_project_information` (
  `project_id` int(11) NOT NULL AUTO_INCREMENT,
  `project_name` varchar(32) NOT NULL,
  `start_date` date NOT NULL,
  `end_date` date NOT NULL,
  `sale_to_company_id` int(10) NOT NULL,
  `buy_from_company_id` int(10) NOT NULL,
  `project_place` text,
  `salesman_name` varchar(128) DEFAULT NULL,
  `salesman_tel` varchar(32) NOT NULL,
  `Osalesman_name` varchar(128) NOT NULL,
  `Osalesman_tel` varchar(32) NOT NULL,
  PRIMARY KEY (`project_id`)
) ENGINE=InnoDB AUTO_INCREMENT=100001 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of bd_project_information
-- ----------------------------
INSERT INTO `bd_project_information` VALUES ('3002', '项目名称1', '2017-05-03', '2017-05-25', '111', '221', '日本', '高煦', '18829351526', '高效', '1992534263');
INSERT INTO `bd_project_information` VALUES ('3003', '项目名称2', '2017-02-16', '2017-05-01', '111', '222', '中国', '搞笑', '17728351526', '高校', '2333142637');
INSERT INTO `bd_project_information` VALUES ('100000', '我要烦死了', '2017-05-02', '2017-05-25', '110', '220', '这个我不知道', '早川', '早川的电话我怎么知道', '晚川', '晚川的电话估计早川知道');

-- ----------------------------
-- Table structure for `bd_seller_company`
-- ----------------------------
DROP TABLE IF EXISTS `bd_seller_company`;
CREATE TABLE `bd_seller_company` (
  `company_id` int(10) NOT NULL DEFAULT '0',
  `sale_to_company_id` int(10) NOT NULL AUTO_INCREMENT,
  PRIMARY KEY (`sale_to_company_id`)
) ENGINE=InnoDB AUTO_INCREMENT=331 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of bd_seller_company
-- ----------------------------
INSERT INTO `bd_seller_company` VALUES ('110', '330');

-- ----------------------------
-- Table structure for `gad_personal_information`
-- ----------------------------
DROP TABLE IF EXISTS `gad_personal_information`;
CREATE TABLE `gad_personal_information` (
  `staff_id` int(10) NOT NULL,
  `staff_name` varchar(256) NOT NULL,
  `sex` varchar(256) NOT NULL,
  `birthday` date NOT NULL,
  `staff_tel` varchar(32) NOT NULL,
  `nationality` varchar(128) NOT NULL,
  `staff_mail` varchar(128) NOT NULL,
  `staff_address` text,
  `company_id` int(10) NOT NULL,
  `department` varchar(64) NOT NULL,
  `position` varchar(64) NOT NULL,
  `profile_url` text NOT NULL,
  `avatar_url` text NOT NULL,
  PRIMARY KEY (`staff_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of gad_personal_information
-- ----------------------------
INSERT INTO `gad_personal_information` VALUES ('1', '心死的高雪', '男', '1994-12-17', '18829351526', '中国', '18829351526@163.com', '在那遥远的地方', '110', '无', '扫地', 'lalaalal', '啦啦啦啦');
INSERT INTO `gad_personal_information` VALUES ('2', '何山', '女', '2009-06-10', '18829352222', '中国', '18829352222@163.com', '河北省唐山市', '111', '营业部', '主任', 'xxxxxx', 'xxxxxxx');
INSERT INTO `gad_personal_information` VALUES ('3', '吕晶晶', '女', '2011-03-04', '18122223333', '中国', '18122223333@163.com', '山西省', '112', '营业部', '职员', 'xxxxx', 'xxxxxx');
INSERT INTO `gad_personal_information` VALUES ('4', '赵德强', '男', '1999-01-13', '18825360142', '中国', '18825360142@163.com', '新疆省塔城地区', '113', '软件部', '主任', 'xxxxx', 'xxxxxx');
INSERT INTO `gad_personal_information` VALUES ('5', '张坤', '男', '1994-12-02', '13345674567', '中国', '13345674567@163.com', '新疆省', '114', '农业部', '主任', 'xxxxxx', 'xxxxxx');

-- ----------------------------
-- Table structure for `pmd_user_information`
-- ----------------------------
DROP TABLE IF EXISTS `pmd_user_information`;
CREATE TABLE `pmd_user_information` (
  `login_id` int(10) NOT NULL,
  `user_name` varchar(128) NOT NULL,
  `password` varchar(64) NOT NULL,
  `privilege_id` int(10) NOT NULL,
  `privilege_name` varchar(128) NOT NULL,
  `avatar_url` text NOT NULL,
  PRIMARY KEY (`login_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of pmd_user_information
-- ----------------------------
INSERT INTO `pmd_user_information` VALUES ('2013013233', '高雪', '111111', '1', '管理员', 'lalala');
