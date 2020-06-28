create table if not exists t_admin
(
    id            int auto_increment comment '主键'
        primary key,
    admin_account varchar(32)       not null comment '管理员账号',
    admin_pass    varchar(32)       not null comment '管理员密码',
    create_time   datetime          not null comment '创建时间',
    creator       varchar(32)       not null comment '创建人',
    operate_time  datetime          null comment '最后修改时间',
    operator      varchar(32)       null comment '最后修改人',
    delete_flag   tinyint default 0 null comment '删除标志，0未删除，1已删除'
)
    comment '管理员信息表';

create table if not exists t_order_detail
(
    id           int auto_increment comment '主键，自增长'
        primary key,
    o_id         int               not null comment '订单 id,取自t_order_info表',
    p_id         int               not null comment '商品 id,取自(t_product_info)表',
    num          int               not null comment '购买数量',
    create_time  datetime          not null comment '创建时间',
    creator      varchar(32)       not null comment '创建用户名，引用用户表的用户名',
    operate_time datetime          null comment '修改时间',
    operator     varchar(32)       null comment '修改用户，应用用户表的用户名',
    delete_flag  tinyint default 0 not null comment '删除标识，缺省值0，0为未删除，1为已删除'
)
    comment '订单明细表';

create table if not exists t_order_info
(
    id           int auto_increment comment '主键，自增长'
        primary key,
    u_id         int               not null comment '会员 id,取自t_user_info表',
    order_time   datetime          not null comment '下单时间',
    order_price  decimal(8, 2)     not null comment '订单金额',
    orde_status  varchar(32)       null comment '订单状态',
    create_time  datetime          not null comment '创建时间',
    creator      varchar(32)       not null comment '创建用户名，引用用户表的用户名',
    operate_time datetime          null comment '修改时间',
    operator     varchar(32)       null comment '修改用户，应用用户表的用户名',
    delete_flag  tinyint default 0 not null comment '删除标识，缺省值0，0为未删除，1为已删除'
)
    comment '订单信息表';

create table if not exists t_product_info
(
    id           int auto_increment comment '主键,自增长'
        primary key,
    code         varchar(32)       not null comment '商品编码',
    name         varchar(256)      not null comment '商品名称',
    t_id         int               not null comment '商品类别 ID',
    num          int               not null comment '商品数量',
    price        decimal           not null comment '商品价格',
    intro        longtext          null comment '商品描述',
    status       int(4)  default 0 null comment '商品状态，0上架，1下架',
    create_time  datetime          not null comment '创建时间',
    creator      varchar(32)       not null comment '创建用户,引用用户表',
    operate_time datetime          null comment '修改时间',
    operator     varchar(32)       null comment '修改用户，引用用户',
    delete_flag  tinyint default 0 not null comment '删除标识，缺省值 0,0'
)
    comment '商品信息表';

create table if not exists t_type
(
    id           int auto_increment comment '主键，自增长'
        primary key,
    name         varchar(64)       not null comment '商品类别名称',
    create_time  datetime          not null comment '创建时间',
    creator      varchar(32)       not null comment '创建用户名，引用用户表的用户名',
    operate_time datetime          null comment '修改时间',
    operator     varchar(32)       null comment '修改用户，应用用户表的用户名',
    delete_flag  tinyint default 0 not null comment '删除标识，缺省值0，0为未删除，1为已删除'
)
    comment '场次(排片表)';

create table if not exists t_user_comment
(
    id             int auto_increment comment '主键，自增长'
        primary key,
    u_id           int               not null comment '所属会员id，引用自会员信息表(t_user_info)的主键id',
    comment_date   datetime          not null comment '留言时间',
    comment_detail longtext          not null comment '留言内容',
    create_time    datetime          not null comment '创建时间',
    creator        varchar(32)       not null comment '创建用户名，引用用户表的用户名',
    operate_time   datetime          null comment '修改时间',
    operator       varchar(32)       null comment '修改用户，应用用户表的用户名',
    delete_flag    tinyint default 0 not null comment '删除标识，缺省值0，0为未删除，1为已删除'
)
    comment '会员留言表';

create table if not exists t_user_info
(
    id           int auto_increment comment '主键 自增长'
        primary key,
    user_name    varchar(128)      not null comment '登录名',
    password     varchar(128)      not null comment '登录密码',
    real_name    varchar(32)       not null comment '真实姓名',
    nick_name    varchar(128)      not null comment '昵称',
    sex          varchar(4)        null comment '性别',
    telephone    varchar(64)       null comment '联系电话',
    address      varchar(256)      null comment '联系地址',
    email        varchar(64)       null comment '电子邮件',
    reg_date     datetime          null comment '注册时间',
    create_time  datetime          not null comment '创建时间',
    creator      varchar(32)       not null comment '创建用户,引用用户表',
    status       int(4)  default 0 null comment '客户状态，0正常，1锁定',
    operate_time datetime          null comment '修改时间',
    operator     varchar(32)       null comment '修改用户，引用用户',
    delete_flag  tinyint default 0 not null comment '删除标识，缺省值 0,0'
)
    comment '会员信息表';


