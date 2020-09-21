CREATE TABLE `driver` (
  `id` int(11) unsigned NOT NULL AUTO_INCREMENT,
  `name` varchar(11) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT '' COMMENT '姓名',
  `car_no` varchar(10) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '车牌号',
  `created_at` datetime DEFAULT NULL,
  `updated_at` datetime DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE `passenger` (
  `id` int(11) unsigned NOT NULL AUTO_INCREMENT,
  `name` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '姓名',
  `phone` varchar(11) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '手机',
  `created_at` datetime DEFAULT NULL,
  `updated_at` datetime DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE `sys_user` (
  `id` int(11) unsigned NOT NULL AUTO_INCREMENT,
  `name` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '姓名',
  `phone` varchar(11) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '手机',
  `category` int(11) DEFAULT NULL COMMENT '用户类型',
  `status` int(11) DEFAULT NULL COMMENT '用户状态',
  `created_at` datetime DEFAULT NULL,
  `updated_at` datetime DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE `order` (
  `id` int(11) unsigned NOT NULL AUTO_INCREMENT,
  `order_no` bigint(20) DEFAULT NULL COMMENT '订单号',
  `start_lat` double DEFAULT NULL COMMENT '起点纬度',
  `start_lon` double DEFAULT NULL COMMENT '起点经度',
  `start_address` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '起点地址',
  `request_time` datetime DEFAULT NULL COMMENT '乘客发起新车需求时间',
  `passenger_id` int(11) DEFAULT NULL COMMENT '乘客编号',
  `end_lat` double DEFAULT NULL COMMENT '终点纬度',
  `end_lon` double DEFAULT NULL COMMENT '终点经度',
  `end_address` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '终点地址',
  `driver_id` int(11) DEFAULT NULL COMMENT '司机编号',
  `status` int(11) DEFAULT NULL COMMENT '订单状态',
  `get_in_lat` double DEFAULT NULL COMMENT '乘客上车纬度',
  `get_in_lon` double DEFAULT NULL COMMENT '乘客上车经度',
  `get_in_address` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '乘客上车地址',
  `get_in_time` datetime DEFAULT NULL COMMENT '乘客上车时间',
  `get_out_lat` double DEFAULT NULL COMMENT '乘客下车纬度',
  `get_out_lon` double DEFAULT NULL COMMENT '乘客下车经度',
  `get_out_address` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '乘客下车地址',
  `get_out_time` datetime DEFAULT NULL COMMENT '乘客下车时间',
  `created_at` datetime DEFAULT NULL,
  `updated_at` datetime DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;