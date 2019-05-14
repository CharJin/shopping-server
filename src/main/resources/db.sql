use online_shopping;
-- 用户表
create table os_user
(
    id            int primary key auto_increment,
    head_portrait varchar(50) comment ' -- 头像在服务器的路径',
    username      varchar(30) not null comment '用户名',
    password      varchar(20) not null comment '密码',
    real_name     varchar(15) comment '真实姓名',
    sex           varchar(2) comment '性别,为了便于读取存为男,女',
    phone         varchar(20) comment '联系方式',
    address       varchar(100) comment '收货地址'
);

-- 商店类型
create table os_shop_type
(
    id   int primary key auto_increment,
    type varchar(20) comment '商品类型'
);

-- 商店表
create table os_shop
(
    id           int primary key auto_increment,
    shop_type_id int comment '商品类型(id)',
    name         varchar(30) not null unique comment '店铺名称',
    foreign key (shop_type_id) references os_shop_type (id) -- 设置外键
);

-- 商品类型表
create table os_commodity_type
(
    id   int primary key auto_increment,
    type varchar(20) comment '商品类型'
);

-- 商品表
create table os_commodity
(
    id                int primary key auto_increment,
    commodity_type_id int comment '商品(id)',
    shop_id           int comment '店铺(id)',
    name              varchar(30) not null comment '商品名',
    image             varchar(100) comment '商品展示图片,存放路径,多图片使用分隔符"^^^"',
    price             float(6, 2) not null comment '价格',
    sales_volume      smallint default 0 comment '销量',
    region            varchar(30) not null comment '商品地区',
    description       varchar(200) comment '商品描述信息',
    foreign key (commodity_type_id) references os_goods (id),
    foreign key (shop_id) references os_shop_type (id) -- 设置外键
);


-- 商品评价表
create table os_commodity_review
(
    id           int primary key auto_increment,
    user_id      int comment '外键,用户id',
    commodity_id int comment '外键,商品id',
    content      varchar(160) comment '评论内容,80个汉字以内',
    foreign key (user_id) references os_user (id),
    foreign key (commodity_id) references os_goods (id)
);

-- 购物车表
create table os_cart
(
    id           int primary key auto_increment,
    user_id      int comment '外键,用户id',
    commodity_id int comment '外键,商品id',
    number       int not null default 1 comment '该商品的数量', #设默认值为1 便于添加测试数据
    foreign key (user_id) references os_user (id),
    foreign key (commodity_id) references os_goods (id)
);

-- 订单表
create table os_order
(
    id           int primary key auto_increment,
    user_id      int comment '外键,用户id',
    commodity_id int comment '外键,商品id',
    order_date   datetime comment '订单建立时间',
    is_paid      tinyint(1) comment '订单是否支付'
);

/*
    搜索记录表: 此表存在Android本地数据库
    根据淘宝搜索记录的设计,搜索记录是存在顺序的
    1.新搜索的内容会排在第一位
    2.点击了之前旧的搜索记录,旧的记录又会重新排到第一位
    solution: 搜索权重默认为0,新添加的搜索记录其权重
    置为该用户所有搜索记录最高权重值+1,
 */
create table os_search_history
(
    id      int primary key auto_increment,
    user_id int comment '外键,用户id',
    content varchar(50) comment '搜索内容',
    weight  smallint default 0 comment '搜索权重',
    foreign key (user_id) references os_user (id)
);

-- 收藏表
create table os_collection
(
    id           int primary key auto_increment,
    user_id      int comment '外键,用户id',
    commodity_id int comment '外键,商品id',
    foreign key (user_id) references os_user (id),
    foreign key (commodity_id) references os_goods (id)
);



# 基本查询
# 插入商品类型
insert into os_goods_type
values (null, '电子');
insert into os_goods_type
values (null, '生活');
insert into os_goods_type
values (null, '男装');
insert into os_goods_type
values (null, '女装');
insert into os_goods_type
values (null, '水果');
insert into os_goods_type
values (null, '书籍');
insert into os_goods_type
values (null, '运动');

# 插入商品
# insert into os_commodity ()
# values ();

# 便于数据的表示,数据做两次查询 先查店铺, 再查商品

select distinct *
from os_cart,
     os_goods,
     os_shop
where os_cart.commodity_id = os_goods.id
  and os_shop.id = os_goods.shop_id
  and user_id = 1
