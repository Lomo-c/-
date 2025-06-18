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

 Date: 18/06/2025 00:00:00
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for menu_items
-- ----------------------------
DROP TABLE IF EXISTS `menu_items`;
CREATE TABLE `menu_items`  (
  `id` int NOT NULL AUTO_INCREMENT,
  `name` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '名称',
  `path` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '路由地址',
  `component` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '组件路径',
  `icon` text CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL COMMENT 'SVG图标代码',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 11 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of menu_items
-- ----------------------------
INSERT INTO `menu_items` VALUES (1, '首页推荐', '/', 'Home', '<svg xmlns=\"http://www.w3.org/2000/svg\" class=\"h-5 w-5\" viewBox=\"0 0 20 20\" fill=\"currentColor\"><path d=\"M10.707 2.293a1 1 0 00-1.414 0l-7 7a1 1 0 001.414 1.414L4 10.414V17a1 1 0 001 1h2a1 1 0 001-1v-2a1 1 0 011-1h2a1 1 0 011 1v2a1 1 0 001 1h2a1 1 0 001-1v-6.586l.293.293a1 1 0 001.414-1.414l-7-7z\" /></svg>');
INSERT INTO `menu_items` VALUES (2, '观看历史', '/history', 'History', '<svg xmlns=\"http://www.w3.org/2000/svg\" class=\"h-5 w-5\" viewBox=\"0 0 20 20\" fill=\"currentColor\"><path fill-rule=\"evenodd\" d=\"M10 18a8 8 0 100-16 8 8 0 000 16zm1-12a1 1 0 10-2 0v4a1 1 0 00.293.707l2.828 2.829a1 1 0 101.414-1.414L11 10.586V6z\" clip-rule=\"evenodd\" /></svg>');


-- ----------------------------
-- Table structure for user_info
-- ----------------------------
DROP TABLE IF EXISTS `user_info`;
CREATE TABLE `user_info`  (
  `id` bigint NOT NULL AUTO_INCREMENT COMMENT '主键ID',
  `user_id` varchar(10) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '用户id',
  `nick_name` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '昵称',
  `avatar` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '头像',
  `email` varchar(150) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '邮箱',
  `password` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '密码',
  `sex` tinyint(1) NULL DEFAULT NULL COMMENT '0:女 1:男 2:保密',
  `birthday` date NULL DEFAULT NULL COMMENT '出生日期',
  `school` varchar(150) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '学校',
  `person_introduction` varchar(200) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '个人简介',
  `join_time` datetime(0) NOT NULL COMMENT '加入时间',
  `last_login_time` datetime(0) NULL DEFAULT NULL COMMENT '最后登录时间',
  `status` tinyint(1) NOT NULL DEFAULT 1 COMMENT '0:禁用 1:正常',
  `current_coin_count` int NOT NULL DEFAULT 0 COMMENT '当前硬币数',
  `total_coin_count` int NOT NULL DEFAULT 0 COMMENT '投币总数量',
  PRIMARY KEY (`id`) USING BTREE,
  UNIQUE INDEX `idx_user_id`(`user_id`) USING BTREE,
  UNIQUE INDEX `idx_key_email`(`email`) USING BTREE,
  UNIQUE INDEX `idx_nick_name`(`nick_name`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci COMMENT = '用户信息' ROW_FORMAT = DYNAMIC;


-- ----------------------------
-- Table structure for videos
-- ----------------------------
DROP TABLE IF EXISTS `videos`;
CREATE TABLE `videos`  (
  `id` int NOT NULL AUTO_INCREMENT,
  `title` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `thumbnail_url` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `duration` int NOT NULL COMMENT '视频时长，单位：秒',
  `views` int NULL DEFAULT 0,
  `author_id` bigint NULL COMMENT '视频作者ID，关联user_info表',
  `upload_date` datetime(0) NOT NULL DEFAULT CURRENT_TIMESTAMP(0) COMMENT '上传时间',
  `created_at` timestamp(0) NULL DEFAULT CURRENT_TIMESTAMP(0),
  `updated_at` timestamp(0) NULL DEFAULT CURRENT_TIMESTAMP(0) ON UPDATE CURRENT_TIMESTAMP(0),
   PRIMARY KEY (`id`) USING BTREE,
   CONSTRAINT `fk_author_id` FOREIGN KEY (`author_id`) REFERENCES `user_info` (`id`) ON DELETE SET NULL ON UPDATE CASCADE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of videos
-- ----------------------------
INSERT INTO `videos` (`id`, `title`, `thumbnail_url`, `duration`, `views`, `author_id`, `upload_date`) VALUES
(1, '曾经的我，低估了这个角色！情场上的千层套路！幼稚园的直男收', 'https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTxrCMsn8al18DOSWAaEM-uR1tcivIdNXo3LA&s', 731, 704000, NULL, '2025-06-14 00:00:00'),
(2, '从零开始手把手教你学摄影，20节课带你从小白到大师', 'https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTxrCMsn8al18DOSWAaEM-uR1tcivIdNXo3LA&s', 512, 123000, NULL, '2025-06-16 00:00:00'),
(3, 'AI生成视频竟然发展到这种程度了？AI视频短片《迭代南翔》', 'https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTxrCMsn8al18DOSWAaEM-uR1tcivIdNXo3LA&s', 1435, 1002000, NULL, '2025-06-11 00:00:00'),
(4, '【AIGC】极其简单却被忽视的AI三维制作技巧，提高收入的入门场地', 'https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTxrCMsn8al18DOSWAaEM-uR1tcivIdNXo3LA&s', 319, 56000, NULL, '2025-06-15 00:00:00'),
(5, '【莱斯利】漫威蜘蛛侠2最高难度！决战蜥蜴博士-第12期', 'https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTxrCMsn8al18DOSWAaEM-uR1tcivIdNXo3LA&s', 901, 338000, NULL, '2025-06-13 00:00:00');

SET FOREIGN_KEY_CHECKS = 1; 