/*
 Navicat Premium Data Transfer

 Source Server         : charjin.top
 Source Server Type    : MySQL
 Source Server Version : 50726
 Source Host           : charjin.top:3306
 Source Schema         : online_shopping

 Target Server Type    : MySQL
 Target Server Version : 50726
 File Encoding         : 65001

 Date: 18/06/2019 10:33:09
*/

create database online_shopping;
use online_shopping;

set names utf8mb4;
set foreign_key_checks = 0;

-- ----------------------------
-- table structure for os_address
-- ----------------------------
drop table if exists `os_address`;
create table `os_address`
(
    `address_id`     int auto_increment,
    `user_id`        int comment '用户id',
    `receiver`       varchar(20) comment '收件人姓名',
    `phone`          varchar(20) comment '收件人电话号码',
    `province`       varchar(20) comment '省',
    `city`           varchar(20) comment '市',
    `district`       varchar(20) comment '县/区',
    `address_detail` varchar(80) comment '详细地址',
    `is_default`     tinyint(1)  default 0 comment '是否为默认收货地址',
    `create_time`    datetime(0) default current_timestamp comment '记录创建时间',
    `update_time`    datetime(0) default current_timestamp on update current_timestamp(0) comment '记录更新时间',
    primary key (`address_id`) using btree,
    index `os_address_ibfk_1` (`user_id`) using btree,
    constraint `os_address_ibfk_1` foreign key (`user_id`) references `os_user` (`user_id`) on delete cascade on update cascade
) engine = innodb
  auto_increment = 24
  character set = utf8
  collate = utf8_general_ci
  row_format = dynamic;

-- ----------------------------
-- records of os_address
-- ----------------------------
insert into `os_address`
values (1, 1, '金志超', '18267886900', '浙江省', '温州市', '永嘉县', '南城街道 码道西街', 0, '2019-06-01 10:08:54', '2019-06-02 11:30:13');
insert into `os_address`
values (2, 1, '老胡', '18267886900', '四川省', '成都市', '金堂县', '希望未来城10栋', 0, '2019-06-01 10:43:28', '2019-06-03 20:50:25');
insert into `os_address`
values (3, 1, 'charjin', '18123272339', '浙江省', '温州市', '永嘉县', '环城北路 11', 0, '2019-06-02 23:56:52',
        '2019-06-03 19:09:40');
insert into `os_address`
values (4, 1, 'xuhuiaa', '18123272339', '浙江省', '温州市', '永嘉县', '环城北路 1号11', 1, '2019-06-03 00:09:32',
        '2019-06-17 22:24:09');
insert into `os_address`
values (8, 1, '超总', '18123272339', '', '', '', '浙江', 0, '2019-06-03 20:01:10', '2019-06-06 16:51:10');
insert into `os_address`
values (19, 1, 'xuhui', '18123272339', '浙江省', '温州市', '永嘉县', '环城北路 1号11', 0, '2019-06-17 22:20:00',
        '2019-06-17 22:20:00');
insert into `os_address`
values (20, 1, 'xuhui', '18123272339', '浙江省', '温州市', '永嘉县', '环城北路 1号11', 0, '2019-06-17 22:22:15',
        '2019-06-17 22:22:15');
insert into `os_address`
values (21, 9, '金志超', '18267886900', '', '', '', '码道西街113号', 1, '2019-06-18 00:17:27', '2019-06-18 00:17:27');
insert into `os_address`
values (22, 25, 'tfg', '18982410701', '', '', '', '带个好', 0, '2019-06-18 08:47:24', '2019-06-18 08:47:24');
insert into `os_address`
values (23, 25, 'tfg', '18982410701', '', '', '', '带个好', 0, '2019-06-18 08:47:24', '2019-06-18 08:47:24');

-- ----------------------------
-- table structure for os_cart
-- ----------------------------
drop table if exists `os_cart`;
create table `os_cart`
(
    `user_id`  int comment '主外键,用户id',
    `goods_id` int comment '主外键,商品id',
    `number`   int default 1 comment '该商品的数量',
    `plan`     varchar(50),
    primary key (`user_id`, `goods_id`) using btree,
    index `goods_id` (`goods_id`) using btree,
    constraint `os_cart_ibfk_1` foreign key (`user_id`) references `os_user` (`user_id`) on delete restrict on update restrict,
    constraint `os_cart_ibfk_2` foreign key (`goods_id`) references `os_goods` (`goods_id`) on delete restrict on update restrict
) engine = innodb
  character set = utf8
  collate = utf8_general_ci comment = '商品规格套餐'
  row_format = dynamic;

-- ----------------------------
-- records of os_cart
-- ----------------------------
insert into `os_cart`
values (25, 4, 1, '默认套餐');

-- ----------------------------
-- table structure for os_collection
-- ----------------------------
drop table if exists `os_collection`;
create table `os_collection`
(
    `id`       int auto_increment,
    `user_id`  int comment '外键,用户id',
    `goods_id` int comment '外键,商品id',
    primary key (`id`) using btree,
    index `user_id` (`user_id`) using btree,
    index `goods_id` (`goods_id`) using btree,
    constraint `os_collection_ibfk_1` foreign key (`user_id`) references `os_user` (`user_id`) on delete restrict on update restrict,
    constraint `os_collection_ibfk_2` foreign key (`goods_id`) references `os_goods` (`goods_id`) on delete restrict on update restrict
) engine = innodb
  auto_increment = 1
  character set = utf8
  collate = utf8_general_ci
  row_format = dynamic;

-- ----------------------------
-- table structure for os_goods
-- ----------------------------
drop table if exists `os_goods`;
create table `os_goods`
(
    `goods_id`      int auto_increment,
    `goods_type_id` int comment '商品(id)',
    `shop_id`       int comment '店铺(id)',
    `goods_name`    varchar(80) not null comment '商品名',
    `image`         varchar(300) comment '商品展示图片,存放路径,多图片使用分隔符\"^^^\"',
    `price`         float(6, 2) not null comment '价格',
    `sales_volume`  smallint(6) default 0 comment '销量',
    `region`        varchar(30) not null comment '商品地区',
    `description`   varchar(200) comment '商品描述信息',
    primary key (`goods_id`) using btree,
    index `goods_type_id` (`goods_type_id`) using btree,
    index `shop_id` (`shop_id`) using btree
) engine = innodb
  auto_increment = 23
  character set = utf8
  collate = utf8_general_ci
  row_format = dynamic;

-- ----------------------------
-- records of os_goods
-- ----------------------------
insert into `os_goods`
values (1, 1, 1, '【现货开抢享6期免息】xiaomi/小米 红米redmi k20 pro 4800万三摄骁龙855手机9官方旗舰正品小米9 k20 pro',
        'https://img.alicdn.com/imgextra/i1/2616970884/o1cn01pqzbig1iouebsyxwu_!!2616970884.jpg', 2799.00, 90, '北京',
        '小米公司最新旗舰机手机!');
insert into `os_goods`
values (2, 1, 1, '【6+128g下单低至1299元】xiaomi/小米 小米8 青春版全面屏智能拍照游戏play手机学生机商务机 全网通官方',
        'https://img.alicdn.com/imgextra/i2/1714128138/o1cn0129zfdshbygigqa5_!!1714128138.jpg', 1299.00, 33, '北京',
        '小米手机');
insert into `os_goods`
values (3, 1, 1, '【到手价2799元】xiaomi/小米 小米笔记本15.6吋i3轻薄便携学生游戏电脑笔记本官方旗舰店正品超薄',
        'https://img.alicdn.com/imgextra/i2/1714128138/o1cn01ts5foi29zff6ctlwk_!!1714128138.jpg', 2799.00, 12, '北京',
        '生活用品');
insert into `os_goods`
values (4, 1, 1, '小米手环4代智能运动男女情侣多功能蓝牙手表心率接电话提醒电子跑步游泳计步器手环2代防水感应3代nfc设备',
        'https://img.alicdn.com/imgextra/i3/3002204399/o1cn01trmwsf1immpwtr6mi_!!3002204399.jpg', 169.00, 778, '北京',
        '生活用品');
insert into `os_goods`
values (5, 1, 1, '【到手价799】redmi小米 米家8kg公斤全自动家用波轮洗衣机大容量',
        'https://img.alicdn.com/imgextra/i1/1714128138/o1cn016ez6oe29zfhtgrcn7_!!1714128138.jpg', 799.00, 209, '北京',
        '生活用品');
insert into `os_goods`
values (6, 1, 1, '小米充电宝20000毫安超薄便携快充大容量迷你移动电源冲电宝',
        'https://img.alicdn.com/imgextra/i4/1714128138/o1cn0129xnjg29zfillocmg_!!1714128138.gif', 99.00, 76, '北京',
        '生活用品');
insert into `os_goods`
values (7, 2, 2, '奥利奥夹心饼干散装原味500g亿滋休闲饼干儿童零食独立小包装',
        'https://img.alicdn.com/imgextra/i4/167302935/tb26b6dgkgsbunjsspbxxciipxa_!!167302935.jpg', 19.90, 81, '浙江',
        '零食');
insert into `os_goods`
values (8, 2, 2, '乐事薯片清新芥香芥末味75g/袋休闲食品膨化零食【新口味】',
        'https://img.alicdn.com/imgextra/i2/2453049938/o1cn01g2tzlp2nhear9ctpi_!!2453049938.jpg', 26.50, 44, '浙江',
        '零食');
insert into `os_goods`
values (9, 2, 2, '贵州特产开阳馋解香麻辣土豆片土豆丝 洋芋薯片油炸零食小吃包邮',
        'https://img.alicdn.com/imgextra/i1/490374575/o1cn01lq2sll1jfotvt8znn_!!490374575.jpg', 28.80, 76, '浙江', '零食');
insert into `os_goods`
values (10, 2, 2, '好味屋魔芋爽辣条素毛肚50包素食魔芋脆丝麻辣儿时宿舍小包装零食',
        'https://img.alicdn.com/imgextra/i3/2144338924/tb2aysgshsrbknjszfpxxcxhfxa_!!2144338924.png', 18.80, 43, '浙江',
        '零食');
insert into `os_goods`
values (11, 2, 2, '宇仔大刀肉辣条8090后儿时怀旧素零食大礼包麻辣小吃湖南重庆特产',
        'https://img.alicdn.com/imgextra/i3/3624770104/tb2qttzt_dybenksmlyxxxfnvxa_!!3624770104.jpg', 14.90, 33, '浙江',
        '零食');
insert into `os_goods`
values (12, 2, 2, '全聚德烤鸭北京烤鸭中华老字号北京特产百年经典烤鸭礼盒',
        'https://img.alicdn.com/imgextra/i2/729513733/tb2r01gmq8lpufjy0fpxxagrpxa_!!729513733.jpg', 148.80, 88, '浙江',
        '零食');
insert into `os_goods`
values (13, 2, 2, '中街1946网红雪糕冰淇淋巧遇真味半巧7牛乳7冰激凌冷饮冰棍冰棒',
        'http://img006.hc360.cn/k2/m05/0e/41/wkhqxvjcce-efzpsaaaaap9mx5a761.jpg', 20.00, 11, '北京', '零食');
insert into `os_goods`
values (14, 5, 3, '新疆哈密瓜10斤新鲜当季水果网纹瓜西州密瓜一箱应季小香瓜包邮',
        'https://img.alicdn.com/imgextra/i1/1663170428/o1cn01ggawxn1f243m81ywd_!!1663170428.jpg', 36.50, 127, '浙江',
        '水果');
insert into `os_goods`
values (15, 5, 3, '山东烟台大樱桃现货车厘子新鲜水果殷桃车里子5现摘现发3斤10包邮',
        'https://img.alicdn.com/imgextra/i1/3314768299/o1cn01mqali62bazucji83c_!!3314768299.jpg', 48.20, 66, '浙江',
        '水果');
insert into `os_goods`
values (16, 5, 3, '正宗阳山水蜜桃新鲜桃子当季水果礼盒多汁包甜5两12只无锡',
        'https://img.alicdn.com/imgextra/i1/617505097/tb2818vp8mwbunksndvxxcsapxa_!!617505097.jpg', 69.00, 76, '浙江',
        '水果');
insert into `os_goods`
values (17, 1, 1, '【低至2199元】xiaomi/小米 小米8屏幕指纹版米9全面屏拍照游戏手机8se学生机9se小米官旗青春note7p',
        'https://img.alicdn.com/imgextra/i2/1714128138/o1cn0129zfdt9bl8bvhi0_!!1714128138.jpg', 2199.00, 33, '北京',
        '小米手机');
insert into `os_goods`
values (18, 5, 3, '云南特产新鲜蓝莓500g 孕妇新鲜水果大理新鲜蓝莓中大果四盒装',
        'https://img.alicdn.com/imgextra/i3/1078699419/o1cn01tiimpj2jrx45fwpnw_!!1078699419.jpg', 89.90, 102, '北京',
        '水果');
insert into `os_goods`
values (19, 5, 3, '现摘现发新鲜马泡瓜500g装马泡瓜籽解酒果迷你小香瓜可做水果吃',
        'https://img.alicdn.com/imgextra/i1/2155194384/o1cn01fmhyww1ifut1mnotx_!!2155194384.jpg', 24.87, 22, '北京',
        '水果');
insert into `os_goods`
values (20, 5, 3, '南非进口西柚6个装蜜柚当季新鲜红心葡萄柚当季新鲜水果300g-350g',
        'https://img.alicdn.com/imgextra/i3/2201272077491/o1cn01i0u0cl25cvskvqvks_!!2201272077491.jpg', 49.90, 111,
        '北京', '水果');
insert into `os_goods`
values (21, 5, 3, '泰国进口山竹带箱6斤 新鲜热带水果孕妇油麻竹5a大果当季批发包邮',
        'https://img.alicdn.com/imgextra/i1/3015214310/o1cn01bitnau1hi1xfcqgms_!!3015214310.jpg', 89.90, 102, '北京',
        '水果');
insert into `os_goods`
values (22, 5, 3, '新疆晓密哈密瓜水果包邮新鲜 当季黄皮果网纹瓜5斤西州蜜银帝甜瓜',
        'https://img.alicdn.com/imgextra/i2/2565219615/o1cn01omtcsd2ktig2luumm_!!2565219615.jpg', 29.90, 102, '北京',
        '水果');

-- ----------------------------
-- table structure for os_goods_review
-- ----------------------------
drop table if exists `os_goods_review`;
create table `os_goods_review`
(
    `id`       int auto_increment,
    `user_id`  int comment '外键,用户id',
    `goods_id` int comment '外键,商品id',
    `content`  varchar(160) comment '评论内容,80个汉字以内',
    primary key (`id`) using btree,
    index `user_id` (`user_id`) using btree,
    index `goods_id` (`goods_id`) using btree,
    constraint `os_goods_review_ibfk_1` foreign key (`user_id`) references `os_user` (`user_id`) on delete restrict on update restrict,
    constraint `os_goods_review_ibfk_2` foreign key (`goods_id`) references `os_goods` (`goods_id`) on delete restrict on update restrict
) engine = innodb
  auto_increment = 1
  character set = utf8
  collate = utf8_general_ci
  row_format = dynamic;

-- ----------------------------
-- table structure for os_goods_type
-- ----------------------------
drop table if exists `os_goods_type`;
create table `os_goods_type`
(
    `id`   int auto_increment,
    `type` varchar(20) comment '商品类型',
    primary key (`id`) using btree
) engine = innodb
  auto_increment = 9
  character set = utf8
  collate = utf8_general_ci
  row_format = dynamic;

-- ----------------------------
-- records of os_goods_type
-- ----------------------------
insert into `os_goods_type`
values (1, '电子');
insert into `os_goods_type`
values (2, '生活');
insert into `os_goods_type`
values (3, '男装');
insert into `os_goods_type`
values (4, '女装');
insert into `os_goods_type`
values (5, '水果');
insert into `os_goods_type`
values (6, '书籍');
insert into `os_goods_type`
values (7, '运动');
insert into `os_goods_type`
values (8, '食品');

-- ----------------------------
-- table structure for os_order
-- ----------------------------
drop table if exists `os_order`;
create table `os_order`
(
    `order_id`            int auto_increment,
    `user_id`             int comment '外键,用户id',
    `shop_id`             int comment '外键,商店id，一次提交订单按店铺生成',
    `address_id`          int comment '地址id(来自地址表)',
    `order_no`            varchar(30) not null comment '订单编号(保留字段 不使用,订单时间+用户id+商品id)',
    `order_amount_total`  float          default 0 comment '订单总金额',
    `order_amount_actual` decimal(10, 2) default 0.00 comment '订单实际支付金额',
    `order_freight`       int            default 0 comment '运费',
    `order_create_time`   datetime(0) comment '订单创建时间',
    `order_pay_time`      datetime(0) comment '订单支付时间',
    `order_fulfil_time`   datetime(0) comment '订单完成事件(用户确认收货后)',
    `order_status`        int comment '订单状态(-1:订单被取消 0:待付款 1:待发货 2:待收货 3:待评论)',
    `logistics_no`        varchar(30) comment '物流单号',
    `pay_channel`         int comment 'id 来自支付渠道表,支付方式(支付宝，信用卡，各种银行等)',
    primary key (`order_id`) using btree,
    unique index `os_order_order_number_uindex` (`order_no`) using btree,
    index `os_order_os_address_address_id_fk` (`address_id`) using btree,
    index `os_order_os_shop_id_fk` (`shop_id`) using btree,
    constraint `os_order_os_address_address_id_fk` foreign key (`address_id`) references `os_address` (`address_id`) on delete cascade on update cascade,
    constraint `os_order_os_shop_id_fk` foreign key (`shop_id`) references `os_shop` (`shop_id`) on delete cascade on update cascade
) engine = innodb
  auto_increment = 110
  character set = utf8
  collate = utf8_general_ci
  row_format = dynamic;

-- ----------------------------
-- records of os_order
-- ----------------------------
insert into `os_order`
values (98, 9, 3, 21, '2019061800173300030009', 248.8, 248.80, 0, '2019-06-17 11:17:33', '2019-06-17 11:17:33', null, 1,
        null, 1);
insert into `os_order`
values (99, 9, 2, 21, '2019061805425700020009', 148.8, 148.80, 0, '2019-06-17 16:42:57', '2019-06-17 16:42:59', null, 1,
        null, 1);
insert into `os_order`
values (100, 9, 1, 21, '2019061805430700010009', 2199, 2199.00, 0, '2019-06-17 16:43:07', null, null, 0, null, 1);
insert into `os_order`
values (101, 9, 2, 21, '2019061807500200020009', 19.9, 19.90, 0, '2019-06-17 18:50:02', '2019-06-17 18:50:02', null, 1,
        null, 1);
insert into `os_order`
values (102, 9, 1, 21, '2019061807500200010009', 2898, 2898.00, 0, '2019-06-17 18:50:02', '2019-06-17 18:50:02', null,
        1, null, 1);
insert into `os_order`
values (103, 25, 3, 22, '2019061808472800030025', 36.5, 36.50, 0, '2019-06-17 19:47:28', '2019-06-17 19:47:35', null, 1,
        null, 1);
insert into `os_order`
values (104, 25, 3, 22, '2019061808473600030025', 36.5, 36.50, 0, '2019-06-17 19:47:36', null, '2019-06-18 01:37:24', 3,
        null, 1);
insert into `os_order`
values (105, 25, 2, 22, '2019061811510200020025', 26.5, 26.50, 0, '2019-06-17 22:51:02', '2019-06-17 22:51:03',
        '2019-06-18 01:37:24', 3, null, 1);
insert into `os_order`
values (106, 1, 3, 4, '2019061813000600030001', 89.9, 89.90, 0, '2019-06-18 00:00:06', '2019-06-18 00:00:10', null, 1,
        null, 1);
insert into `os_order`
values (107, 1, 2, 4, '2019061813003300020001', 19.9, 19.90, 0, '2019-06-18 00:00:33', '2019-06-18 00:00:35', null, 1,
        null, 1);
insert into `os_order`
values (108, 25, 1, 22, '2019061815252100010025', 1299, 1299.00, 0, '2019-06-18 02:25:21', '2019-06-18 02:24:54', null,
        1, null, 1);
insert into `os_order`
values (109, 1, 2, 4, '2019161813003300020001', 192.9, 192.90, 0, '2020-04-18 00:00:33', '2020-04-18 00:00:35', null, 3,
        null, 1);

-- ----------------------------
-- table structure for os_order_detail
-- ----------------------------
drop table if exists `os_order_detail`;
create table `os_order_detail`
(
    `order_detail_id`    int auto_increment comment '主键id',
    `order_id`           int comment '外键,来自order表',
    `goods_id`           int comment '外键,商品id',
    `order_no`           varchar(30) comment '订单编号,与商品id构成唯一键',
    `goods_name`         varchar(80) comment '商品名称(商品可能被商家删除,故需做记录)',
    `goods_price`        float comment '商品价格(商品可能被商家删除,故需做记录)',
    `goods_mode`         varchar(100) comment '用户所选的商品的型号，如颜色、规格、包装等(保留字段)',
    `goods_mode_params`  varchar(200) comment 'json格式保存,记录商品完整的规格信息(规格表暂未添加,保留该字段)',
    `goods_num`          int comment '购买的数量',
    `goods_amount_total` float comment '该商品的最终价',
    `remark`             varchar(160) comment '用户备注信息(限定80个中文字符)',
    `is_exists`          tinyint(1) default 1 comment '记录商品是否被店家删除',
    primary key (`order_detail_id`) using btree,
    index `os_order_detail_os_goods_id_fk` (`goods_id`) using btree,
    index `os_order_detail_os_order_order_no_fk` (`order_no`) using btree,
    constraint `os_order_detail_os_goods_id_fk` foreign key (`goods_id`) references `os_goods` (`goods_id`) on delete restrict on update restrict
) engine = innodb
  auto_increment = 150
  character set = utf8
  collate = utf8_general_ci comment = '订单详情表，一个订单对应一个店铺，购买的商品含有多个'
  row_format = dynamic;

-- ----------------------------
-- records of os_order_detail
-- ----------------------------
insert into `os_order_detail`
values (136, null, 16, '2019061800173300030009', '正宗阳山水蜜桃新鲜桃子当季水果礼盒多汁包甜5两12只无锡', 69, '默认套餐', '默认套餐', 1, 69, '', 1);
insert into `os_order_detail`
values (137, null, 21, '2019061800173300030009', '泰国进口山竹带箱6斤 新鲜热带水果孕妇油麻竹5a大果当季批发包邮', 89.9, '默认套餐', '默认套餐', 2, 179.8, '',
        1);
insert into `os_order_detail`
values (138, null, 12, '2019061805425700020009', '全聚德烤鸭北京烤鸭中华老字号北京特产百年经典烤鸭礼盒', 148.8, '默认套餐', '默认套餐', 1, 148.8, '', 1);
insert into `os_order_detail`
values (139, null, 17, '2019061805430700010009', '【低至2199元】xiaomi/小米 小米8屏幕指纹版米9全面屏拍照游戏手机8se学生机9se小米官旗青春note7p', 2199,
        '默认套餐', '默认套餐', 1, 2199, '', 1);
insert into `os_order_detail`
values (140, null, 1, '2019061807500200010009', '【现货开抢享6期免息】xiaomi/小米 红米redmi k20 pro 4800万三摄骁龙855手机9官方旗舰正品小米9 k20 pro',
        2799, '默认套餐', '默认套餐', 1, 2799, '', 1);
insert into `os_order_detail`
values (141, null, 7, '2019061807500200020009', '奥利奥夹心饼干散装原味500g亿滋休闲饼干儿童零食独立小包装', 19.9, '默认套餐', '默认套餐', 1, 19.9, '', 1);
insert into `os_order_detail`
values (142, null, 6, '2019061807500200010009', '小米充电宝20000毫安超薄便携快充大容量迷你移动电源冲电宝', 99, '默认套餐', '默认套餐', 1, 99, '', 1);
insert into `os_order_detail`
values (143, null, 14, '2019061808472800030025', '新疆哈密瓜10斤新鲜当季水果网纹瓜西州密瓜一箱应季小香瓜包邮', 36.5, '默认套餐', '默认套餐', 1, 36.5, '',
        1);
insert into `os_order_detail`
values (144, null, 14, '2019061808473600030025', '新疆哈密瓜10斤新鲜当季水果网纹瓜西州密瓜一箱应季小香瓜包邮', 36.5, '默认套餐', '默认套餐', 1, 36.5, '',
        1);
insert into `os_order_detail`
values (145, null, 8, '2019061811510200020025', '乐事薯片清新芥香芥末味75g/袋休闲食品膨化零食【新口味】', 26.5, '默认套餐', '默认套餐', 1, 26.5, '', 1);
insert into `os_order_detail`
values (146, null, 18, '2019061813000600030001', '云南特产新鲜蓝莓500g 孕妇新鲜水果大理新鲜蓝莓中大果四盒装', 89.9, '默认套餐', '默认套餐', 1, 89.9, '',
        1);
insert into `os_order_detail`
values (147, null, 7, '2019061813003300020001', '奥利奥夹心饼干散装原味500g亿滋休闲饼干儿童零食独立小包装', 19.9, '默认套餐', '默认套餐', 1, 19.9, '', 1);
insert into `os_order_detail`
values (148, null, 2, '2019061815252100010025', '【6+128g下单低至1299元】xiaomi/小米 小米8 青春版全面屏智能拍照游戏play手机学生机商务机 全网通官方', 1299,
        '默认套餐', '默认套餐', 1, 1299, '', 1);
insert into `os_order_detail`
values (149, null, 7, '2019061813003300020001', '奥利奥夹心饼干散装原味500g亿滋休闲饼干儿童零食独立小包装', 19.9, '默认套餐', '默认套餐', 1, 19.9, '', 1);

-- ----------------------------
-- table structure for os_pay_business
-- ----------------------------
drop table if exists `os_pay_business`;
create table `os_pay_business`
(
    `pay_id` int auto_increment comment '自增id',
    `name`   varchar(20) comment '支付商户名称',
    primary key (`pay_id`) using btree,
    unique index `os_pay_business_name_uindex` (`name`) using btree
) engine = innodb
  auto_increment = 4
  character set = utf8
  collate = utf8_general_ci comment = '支付提供商户'
  row_format = dynamic;

-- ----------------------------
-- records of os_pay_business
-- ----------------------------
insert into `os_pay_business`
values (2, '农行银行信用卡');
insert into `os_pay_business`
values (3, '工商银行信用卡');
insert into `os_pay_business`
values (1, '支付宝');

-- ----------------------------
-- table structure for os_recommend
-- ----------------------------
drop table if exists `os_recommend`;
create table `os_recommend`
(
    `id`      int auto_increment,
    `content` varchar(20) comment '推荐搜索内容',
    primary key (`id`) using btree
) engine = innodb
  auto_increment = 13
  character set = utf8
  collate = utf8_general_ci
  row_format = dynamic;

-- ----------------------------
-- records of os_recommend
-- ----------------------------
insert into `os_recommend`
values (1, '小米');
insert into `os_recommend`
values (2, '西瓜');
insert into `os_recommend`
values (3, '法国兰蔻');
insert into `os_recommend`
values (4, '冰镇西瓜');
insert into `os_recommend`
values (5, '笔记本');
insert into `os_recommend`
values (6, '雅马哈钢琴');
insert into `os_recommend`
values (7, '毕加索钢笔');
insert into `os_recommend`
values (8, '手机');
insert into `os_recommend`
values (9, '水蜜桃');
insert into `os_recommend`
values (10, '哈密瓜');
insert into `os_recommend`
values (11, '土豆');
insert into `os_recommend`
values (12, '大刀肉');

-- ----------------------------
-- table structure for os_search_history
-- ----------------------------
drop table if exists `os_search_history`;
create table `os_search_history`
(
    `id`      int auto_increment,
    `user_id` int comment '外键,用户id',
    `content` varchar(50) comment '搜索内容',
    `weight`  int(6) default 0 comment '搜索权重',
    primary key (`id`) using btree,
    index `user_id` (`user_id`) using btree,
    constraint `os_search_history_ibfk_1` foreign key (`user_id`) references `os_user` (`user_id`) on delete restrict on update restrict
) engine = innodb
  auto_increment = 1
  character set = utf8
  collate = utf8_general_ci
  row_format = dynamic;

-- ----------------------------
-- table structure for os_shop
-- ----------------------------
drop table if exists `os_shop`;
create table `os_shop`
(
    `shop_id`      int auto_increment,
    `shop_name`    varchar(30) not null,
    `shop_type_id` int comment '商品类型(id)',
    primary key (`shop_id`) using btree,
    unique index `os_shop_name_uindex` (`shop_name`) using btree,
    index `shop_type_id` (`shop_type_id`) using btree,
    constraint `os_shop_ibfk_1` foreign key (`shop_type_id`) references `os_shop_type` (`id`) on delete restrict on update restrict
) engine = innodb
  auto_increment = 4
  character set = utf8
  collate = utf8_general_ci
  row_format = dynamic;

-- ----------------------------
-- records of os_shop
-- ----------------------------
insert into `os_shop`
values (1, '小米之家', 1);
insert into `os_shop`
values (2, '生活超市', 2);
insert into `os_shop`
values (3, '水果之家', 2);

-- ----------------------------
-- table structure for os_shop_type
-- ----------------------------
drop table if exists `os_shop_type`;
create table `os_shop_type`
(
    `id`   int auto_increment,
    `type` varchar(20) comment '商品类型',
    primary key (`id`) using btree
) engine = innodb
  auto_increment = 3
  character set = utf8
  collate = utf8_general_ci
  row_format = dynamic;

-- ----------------------------
-- records of os_shop_type
-- ----------------------------
insert into `os_shop_type`
values (1, '电子');
insert into `os_shop_type`
values (2, '生活');

-- ----------------------------
-- table structure for os_user
-- ----------------------------
drop table if exists `os_user`;
create table `os_user`
(
    `user_id`       int auto_increment,
    `head_portrait` varchar(300) comment '网络链接',
    `username`      varchar(30) not null comment '用户名',
    `nickname`      varchar(20) comment '用户昵称',
    `password`      varchar(20) not null comment '密码',
    `real_name`     varchar(15) comment '真实姓名',
    `sex`           varchar(2) comment '性别,为了便于读取存为男,女',
    `phone`         varchar(20) comment '联系方式',
    primary key (`user_id`) using btree,
    unique index `os_user_username_uindex` (`username`) using btree
) engine = innodb
  auto_increment = 26
  character set = utf8
  collate = utf8_general_ci
  row_format = dynamic;

-- ----------------------------
-- records of os_user
-- ----------------------------
insert into `os_user`
values (1,
        'https://ss0.bdstatic.com/94ojfd_baact8t7mm9gukt-xh_/timg?image&quality=100&size=b4000_4000&sec=1560250049&di=e65699d97d41f679e3a114c09f95b743&src=http://imglf2.ph.126.net/ogtewo7j8vynaehok--sma==/6599321566470093089.jpg',
        'char', 'charjin', '123', '金志超', '男', '18267886900');
insert into `os_user`
values (9, 'https://cn.bing.com/th?id=oip.812nt7movoohpzacvekqpgaaaa&pid=api&rs=1&p=0', 'root', 'i\'m root', 'root',
        '超级管理员', '男', '17289897672');
insert into `os_user`
values (24, 'https://ss3.bdstatic.com/70cfv8sh_q1ynxgkpowk1hf6hhy/it/u=120606963,1622152554&fm=26&gp=0.jpg', '123',
        null, '123', null, null, null);
insert into `os_user`
values (25, 'https://ss3.bdstatic.com/70cfv8sh_q1ynxgkpowk1hf6hhy/it/u=120606963,1622152554&fm=26&gp=0.jpg',
        '18982410701', null, '123', null, null, null);

set foreign_key_checks = 1;
