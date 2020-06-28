create table if not exists t_admin
(
    id            int auto_increment comment '主键，自增长'
        primary key,
    admin_account varchar(64)       not null comment '管理员账号',
    admin_pass    varchar(64)       not null comment '管理员密码',
    dict_value    varchar(128)      null comment '字典值',
    enable        tinyint           null comment '是否可用，0可用，1不可用',
    sort          int               null comment '排序',
    description   varchar(256)      null comment '描述，备注也可以写这里',
    create_time   datetime          null comment '创建时间',
    creator       varchar(32)       null comment '创建用户名，引用用户表的用户名',
    operate_time  datetime          null comment '修改时间',
    operator      varchar(32)       null comment '修改用户，应用用户表的用户名',
    delete_flag   tinyint default 0 null comment '删除标识，缺省值0，0为未删除，1为已删除'
)
    comment '管理员信息表';

create table if not exists t_cinema
(
    id                 int auto_increment comment '主键，自增长'
        primary key,
    cinema_name        varchar(128)      not null comment '影院名称',
    cinema_brand       varchar(128)      null comment '影院品牌（取自字典表）(cinema_brand)',
    cinema_city_id     int               not null comment '所在城市id（取自城市表(t_city)）,属于冗余字段',
    cinema_district_id int               not null comment '所在行政区id（取自行政区表t_district）',
    special_hall       varchar(256)      not null comment '影院特殊厅id，取自字典表,specialhall-category,使用逗号分隔',
    cinema_address     varchar(256)      not null comment '影院详细地址',
    cinema_phone       varchar(32)       not null comment '影院电话',
    cinema_longitude   varchar(16)       null comment '地址经度',
    cinema_dimensions  varchar(16)       null comment '地址纬度',
    create_time        datetime          not null comment '创建时间',
    creator            varchar(32)       not null comment '创建用户名，引用用户表的用户名',
    operate_time       datetime          null comment '修改时间',
    operator           varchar(32)       null comment '修改用户，应用用户表的用户名',
    delete_flag        tinyint default 0 not null comment '删除标识，缺省值0，0为未删除，1为已删除'
)
    comment '影院信息表';

create table if not exists t_city
(
    id              int auto_increment comment '主键，自增长'
        primary key,
    city_name       varchar(128)      not null comment '城市名称',
    city_name_spell varchar(128)      null comment '城市名称拼音',
    city_initial    varchar(8)        null comment '城市首字母',
    create_time     datetime          not null comment '创建时间',
    creator         varchar(32)       not null comment '创建用户名，引用用户表的用户名',
    operate_time    datetime          null comment '修改时间',
    operator        varchar(32)       null comment '修改用户，应用用户表的用户名',
    delete_flag     tinyint default 0 not null comment '删除标识，缺省值0，0为未删除，1为已删除'
)
    comment '城市';

create table if not exists t_district
(
    id            int auto_increment comment '主键，自增长'
        primary key,
    district_name varchar(128)      not null comment '行政区名称',
    city_id       varchar(128)      null comment '所属城市的id，引用城市表（t_city）',
    create_time   datetime          not null comment '创建时间',
    creator       varchar(32)       not null comment '创建用户名，引用用户表的用户名',
    operate_time  datetime          null comment '修改时间',
    operator      varchar(32)       null comment '修改用户，应用用户表的用户名',
    delete_flag   tinyint default 0 not null comment '删除标识，缺省值0，0为未删除，1为已删除'
)
    comment '城市行政区表';

create table if not exists t_film
(
    id                   int auto_increment comment '主键，自增长'
        primary key,
    film_name            varchar(128)      not null comment '电影名称',
    film_en_name         varchar(128)      null comment '英文名',
    film_intro           varchar(256)      not null comment '剧情简介',
    film_type            varchar(128)      not null comment '影片类型id，取自字典表(film_type)，多种类型使用逗号分隔',
    film_area            varchar(64)       not null comment '影片所在区域id（影片拍摄方所在区域，取自字典表）(film_area)',
    film_raleasetime     datetime          not null comment '上映时间',
    film_duration        int               not null comment '上映时长（分钟）',
    film_release_address varchar(128)      not null comment '上映地点',
    film_score           double            null comment '影片用户评分（应该是动态计算出来的',
    film_box_office      double            null comment '影片票房',
    film_format          varchar(128)      not null comment '影片格式，可以取自字典表(film_format)',
    film_see             bigint            null comment '想看数',
    film_status          tinyint           not null comment '影片状态（上架、下架）',
    film_description     varchar(256)      not null comment '影片描述',
    create_time          datetime          not null comment '创建时间',
    creator              varchar(32)       not null comment '创建用户名，引用用户表的用户名',
    operate_time         datetime          null comment '修改时间',
    operator             varchar(32)       null comment '修改用户，应用用户表的用户名',
    delete_flag          tinyint default 0 not null comment '删除标识，缺省值0，0为未删除，1为已删除'
)
    comment '影片表';

create table if not exists t_film_image
(
    id                  int auto_increment comment '主键，自增长'
        primary key,
    film_id             int               not null comment '所属影片id，取自t_film表',
    film_banner_flag    int               not null comment '0为否，1为是是否banner标识',
    film_head_flag      int               not null comment '0为否，1为是是否影片集头部标识',
    film_homepage_small int               not null comment '是否首页小图，0为否，1为是',
    image_url           int               not null comment '图片地址',
    create_time         datetime          not null comment '创建时间',
    creator             varchar(32)       not null comment '创建用户名，引用用户表的用户名',
    operate_time        datetime          null comment '修改时间',
    operator            varchar(32)       null comment '修改用户，应用用户表的用户名',
    delete_flag         tinyint default 0 not null comment '删除标识，缺省值0，0为未删除，1为已删除'
)
    comment '影片图集表';

create table if not exists t_film_schedule
(
    id               int auto_increment comment '主键，自增长'
        primary key,
    cinema_id        int               not null comment '所属影院id（可以不要）冗余字段',
    film_id          int               not null comment '影片id',
    hall_id          int               not null comment '影厅id',
    language_version varchar(128)      null comment '语言版本(可以取自字典表，language_version)',
    start_time       datetime          not null comment '放映开始时间',
    end_time         datetime          not null comment '散场时间（取自影片表放映时长自动计算）',
    price            double            not null comment '售价',
    status           int               not null comment '状态（0：已排片；1：已结束）',
    create_time      datetime          not null comment '创建时间',
    creator          varchar(32)       not null comment '创建用户名，引用用户表的用户名',
    operate_time     datetime          null comment '修改时间',
    operator         varchar(32)       null comment '修改用户，应用用户表的用户名',
    delete_flag      tinyint default 0 not null comment '删除标识，缺省值0，0为未删除，1为已删除'
)
    comment '场次(排片表)';

create table if not exists t_hall
(
    id            int auto_increment comment '主键，自增长'
        primary key,
    cinema_id     int               not null comment '所属影院id,取自t_cinema表',
    hall_name     varchar(128)      not null comment '影厅名称',
    hall_categoty varchar(64)       not null comment '影厅类型，取自字典表,specialhall-category',
    hall_rows     tinyint           not null comment '影厅排数（影厅座位总排数）',
    hall_cols     tinyint           not null comment '影厅列数',
    hall_status   tinyint           not null comment '状态（维修中，正常使用）',
    create_time   datetime          not null comment '创建时间',
    creator       varchar(32)       not null comment '创建用户名，引用用户表的用户名',
    operate_time  datetime          null comment '修改时间',
    operator      varchar(32)       null comment '修改用户，应用用户表的用户名',
    delete_flag   tinyint default 0 not null comment '删除标识，缺省值0，0为未删除，1为已删除'
)
    comment '影厅信息表';

create table if not exists t_seat
(
    id           int auto_increment comment '主键，自增长'
        primary key,
    hall_id      int               not null comment '所属影厅id，引用自影厅表(t_hall)的主键id',
    seat_row     tinyint           not null comment '座位行数',
    seat_column  tinyint           not null comment '座位所在列数',
    seat_type    varchar(32)       not null comment '座椅种类，情侣座之类的（这个还需要再考虑）',
    seat_status  tinyint(8)        not null comment '0是可用，1不存在，2损坏，也可取自字典表',
    create_time  datetime          not null comment '创建时间',
    creator      varchar(32)       not null comment '创建用户名，引用用户表的用户名',
    operate_time datetime          null comment '修改时间',
    operator     varchar(32)       null comment '修改用户，应用用户表的用户名',
    delete_flag  tinyint default 0 not null comment '删除标识，缺省值0，0为未删除，1为已删除'
)
    comment '座位信息表';

create table if not exists t_seat_saleinfo
(
    id           int auto_increment comment '主键，自增长'
        primary key,
    schedule_id  int               not null comment '排片id(取自排片表,t_film_schedule)',
    seat_row     int               not null comment '座位id(取自座位表(t_hall_seats))',
    member_id    int               not null comment '会员id取自会员表',
    create_time  datetime          not null comment '创建时间',
    creator      varchar(32)       not null comment '创建用户名，引用用户表的用户名',
    operate_time datetime          null comment '修改时间',
    operator     varchar(32)       null comment '修改用户，应用用户表的用户名',
    delete_flag  tinyint default 0 not null comment '删除标识，缺省值0，0为未删除，1为已删除'
)
    comment '影厅作为售卖表';


