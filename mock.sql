CREATE DATABASE IF NOT EXISTS `user`;

USE user;

CREATE TABLE `user` (
  `id` int NOT NULL,
  `name` varchar(50) NOT NULL,
  `address` varchar(200) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

INSERT INTO `user`
(id, name, address)
VALUES(1, '张三', '上海市浦东新区花木路100号');
INSERT INTO `user`
(id, name, address)
VALUES(2, '李四', '浙江省杭州市萧山区无山小区12号301');
INSERT INTO `user`
(id, name, address)
VALUES(3, '王五', '四川省成都市二环东路85号');

CREATE DATABASE IF NOT EXISTS `order`;

USE `order`;

CREATE TABLE `order` (
  `id` int NOT NULL,
  `user_id` int NOT NULL,
  `amount` double,
  `pay_datetime` timestamp,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

INSERT INTO `order`
(id, user_id, amount, pay_datetime)
VALUES(101, 1, 127.2, '2024-01-02 15:32:18');

INSERT INTO `order`
(id, user_id, amount, pay_datetime)
VALUES(102, 1, 325.25, '2024-01-02 16:28:33');

INSERT INTO `order`
(id, user_id, amount, pay_datetime)
VALUES(103, 2, 15.00, '2024-01-08 13:10:05');

INSERT INTO `order`
(id, user_id, amount, pay_datetime)
VALUES(104, 3, 1000.00, '2024-01-02 08:30:58');