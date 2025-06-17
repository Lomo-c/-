/*
 Navicat Premium Data Transfer

 Source Server         : localhost
 Source Server Type    : MySQL
 Source Server Version : 80042
 Source Host           : localhost:3306
 Source Schema         : bilibili_user

 Target Server Type    : MySQL
 Target Server Version : 80042
 File Encoding         : 65001

 Date: 17/06/2025 23:28:46
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for menuitems
-- ----------------------------
DROP TABLE IF EXISTS `menuitems`;
CREATE TABLE `menuitems`  (
  `id` int NOT NULL,
  `redirect_url` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `label` varchar(8) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '标签名',
  `icon` varchar(30) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '图标',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of menuitems
-- ----------------------------
INSERT INTO `menuitems` VALUES (1, '/', '首页推荐', '');
INSERT INTO `menuitems` VALUES (2, '/history', '观看历史', '');
INSERT INTO `menuitems` VALUES (3, '/movie', '电影', '');
INSERT INTO `menuitems` VALUES (4, '/tv', '电视剧', '');
INSERT INTO `menuitems` VALUES (5, '/game', '游戏', '');
INSERT INTO `menuitems` VALUES (6, '/tech', '科技', '');
INSERT INTO `menuitems` VALUES (7, '/vlog', 'VLOG', '');
INSERT INTO `menuitems` VALUES (8, '/food', '美食', '');
INSERT INTO `menuitems` VALUES (9, '/variety', '综艺', '');
INSERT INTO `menuitems` VALUES (10, '/kids', '少儿', '');

-- ----------------------------
-- Table structure for user_info
-- ----------------------------
DROP TABLE IF EXISTS `user_info`;
CREATE TABLE `user_info`  (
  `user_id` varchar(10) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '用户id',
  `nick_name` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '昵称',
  `email` varchar(150) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '邮箱',
  `password` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '密码',
  `sex` tinyint(1) NULL DEFAULT NULL COMMENT '0:女 1:男 2:沃尔玛购物袋',
  `birthday` varchar(10) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '出生日期',
  `school` varchar(150) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '学校',
  `person_introduction` varchar(200) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '个人简介',
  `join_time` datetime(0) NOT NULL COMMENT '加入时间',
  `last_login_time` datetime(0) NULL DEFAULT NULL COMMENT '最后登录时间',
  `last_login_ip` varchar(15) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '最后登录IP',
  `status` tinyint(1) NOT NULL COMMENT '0:禁用 1:正常',
  `notice_info` varchar(300) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '空间公告',
  `current_coin_count` int NOT NULL COMMENT '投币总数量',
  `total_coin_count` int NOT NULL COMMENT '当前硬币数',
  `theme` tinyint(1) NOT NULL COMMENT '主题',
  PRIMARY KEY (`user_id`) USING BTREE,
  UNIQUE INDEX `idx_key_email`(`email`) USING BTREE,
  UNIQUE INDEX `idx_nick_name`(`nick_name`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci COMMENT = '用户信息' ROW_FORMAT = DYNAMIC;

-- ----------------------------
-- Records of user_info
-- ----------------------------

-- ----------------------------
-- Table structure for videos
-- ----------------------------
DROP TABLE IF EXISTS `videos`;
CREATE TABLE `videos`  (
  `id` int NOT NULL,
  `thumbnail_url` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `duration` varchar(10) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '格式为HH:MM或MM:SS',
  `title` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `views` int NULL DEFAULT 0,
  `views_display` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '存储显示的格式如\"70.4万次播放\"',
  `upload_date` date NULL DEFAULT NULL,
  `upload_date_display` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '存储显示的格式如\"4天前\"',
  `created_at` timestamp(0) NULL DEFAULT CURRENT_TIMESTAMP(0),
  `updated_at` timestamp(0) NULL DEFAULT CURRENT_TIMESTAMP(0) ON UPDATE CURRENT_TIMESTAMP(0),
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of videos
-- ----------------------------
INSERT INTO `videos` VALUES (1, 'https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTxrCMsn8al18DOSWAaEM-uR1tcivIdNXo3LA&s', '12:11', '曾经的我，低估了这个角色！情场上的千层套路！幼稚园的直男收', 0, '70.4万次播放', NULL, '4天前', '2025-06-17 23:24:47', '2025-06-17 23:24:47');
INSERT INTO `videos` VALUES (2, 'https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTxrCMsn8al18DOSWAaEM-uR1tcivIdNXo3LA&s', '08:32', '从零开始手把手教你学摄影，20节课带你从小白到大师', 0, '12.3万次播放', NULL, '2天前', '2025-06-17 23:24:47', '2025-06-17 23:24:47');
INSERT INTO `videos` VALUES (3, 'https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTxrCMsn8al18DOSWAaEM-uR1tcivIdNXo3LA&s', '23:55', 'AI生成视频竟然发展到这种程度了？AI视频短片《迭代南翔》', 0, '100.2万次播放', NULL, '1周前', '2025-06-17 23:24:47', '2025-06-17 23:24:47');
INSERT INTO `videos` VALUES (4, 'https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTxrCMsn8al18DOSWAaEM-uR1tcivIdNXo3LA&s', '05:19', '【AIGC】极其简单却被忽视的AI三维制作技巧，提高收入的入门场地', 0, '5.6万次播放', NULL, '3天前', '2025-06-17 23:24:47', '2025-06-17 23:24:47');
INSERT INTO `videos` VALUES (5, 'https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTxrCMsn8al18DOSWAaEM-uR1tcivIdNXo3LA&s', '15:01', '【莱斯利】漫威蜘蛛侠2最高难度！决战蜥蜴博士-第12期', 0, '33.8万次播放', NULL, '5天前', '2025-06-17 23:24:47', '2025-06-17 23:24:47');

SET FOREIGN_KEY_CHECKS = 1;
