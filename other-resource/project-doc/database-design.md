# 澳猫团( aomao_manager)数据库表设计 



# *1.管理员信息表(t_admin)*



| 字段名        | 类型     | 长度 | 是否为空   | 说明                                   |
| ------------- | -------- | ---- | ---------- | -------------------------------------- |
| id            | int      |      | NOT   NULL | 主键,自增长                            |
| admin_account | varchar  | 64   | NOT  NULL  | 管理员账号                             |
| admin_pass    | varchar  | 64   | NOT  NULL  | 管理员密码                             |
| create_time   | datatime |      | NOT  NULL  | 创建时间                               |
| creator       | varchar  | 32   | NOT  NULL  | 创建用户,引用用户表的用户名            |
| operate_time  | datatime |      |            | 修改时间                               |
| operator      | varchar  | 32   |            | 修改用户，引用用户表的用户名           |
| delete_flag   | tinyint  | 4    | NOT  NULL  | 删除标识，缺省值0,0为未删除，1为已删除 |

# **2.会员信息表(t_user_info)**



| 字段名       | 类型     | 长度 | 是否为空      | 说明                                   |
| ------------ | -------- | ---- | ------------- | -------------------------------------- |
| id           | int      |      | NOT  NULL     | 主键 自增长                            |
| user_name    | varchar  | 128  | NOT  NULL     | 登录名                                 |
| password     | varchar  | 128  | NOT  NULL     | 登录密码                               |
| real_name    | varchar  | 32   | NOT  NULL     | 真实姓名                               |
| nick_name    | varchar  | 128  | NOT  **NULL** | 昵称                                   |
| sex          | varchar  | 4    |               | 性别                                   |
| telephone    | varchar  | 64   |               | 联系电话                               |
| address      | varchar  | 256  |               | 联系地址                               |
| email        | varchar  | 64   |               | 电子邮件                               |
| reg_date     | datetime |      |               | 注册时间                               |
| create_time  | datetime |      | NOT  NULL     | 创建时间                               |
| status       | int      | 4    |               | 客户状态，0 or 1                       |
| creator      | varchar  | 32   | NOT  NULL     | 创建用户,引用用户表的用户名            |
| operate_time | datetime |      |               | 修改时间                               |
| operator     | varchar  | 32   |               | 修改用户，引用用户表的用户名           |
| delete_flag  | tinyint  | 4    | NOT  NULL     | 删除标识，缺省值0,0为未删除，1为已删除 |

 

# **3.商品信息表(t_product_info)**

| 字段名       | 类型         | 长度       | 是否为空       | 说明                                   |
| ------------ | ------------ | ---------- | -------------- | -------------------------------------- |
| id           | int          |            | NOT  NULL      | 主键,自增长                            |
| **code**     | **varchar**  | **32**     | **NOT   NULL** | **商品编码**                           |
| **name**     | **varchar**  | **256**    | **NOT   NULL** | **商品名称**                           |
| **t_id**     | **int**      |            | **NOT NULL**   | **商品类别ID**                         |
| **num**      | **int**      |            | **NOT NULL**   | **商品数量**                           |
| **price**    | **decimal**  | **(10,0)** | **NOT NULL**   | **商品价格**                           |
| **intro**    | **longtext** |            |                | **商品描述**                           |
| **status**   | **int**      | **4**      |                | **商品状态，0 or 1**                   |
| create_time  | datetime     |            | NOT  NULL      | 创建时间                               |
| creator      | varchar      | 32         | NOT  NULL      | 创建用户,引用用户表的用户名            |
| operate_time | datetime     |            |                | 修改时间                               |
| operator     | varchar      | 32         |                | 修改用户，引用用户表的用户名           |
| delete_flag  | tinyint      | 4          | NOT  NULL      | 删除标识，缺省值0,0为未删除，1为已删除 |

# **4.商品类型表(t_type)**

| 字段名       | 类型     | 长度 | 是否为空  | 说明                                   |
| ------------ | -------- | ---- | --------- | -------------------------------------- |
| id           | int      |      | NOT  NULL | 主键,自增长                            |
| name         | varchar  | 64   | NOT  NULL | 类别名称                               |
| create_time  | datetime |      | NOT  NULL | 创建时间                               |
| creator      | varchar  | 32   | NOT  NULL | 创建用户,引用用户表的用户名            |
| operate_time | datetime |      |           | 修改时间                               |
| operator     | varchar  | 32   |           | 修改用户，引用用户表的用户名           |
| delete_flag  | tinyint  | 4    | NOT  NULL | 删除标识，缺省值0,0为未删除，1为已删除 |

 

# **5.订单信息表(t_order_info)**

| 字段名       | 类型     | 长度  | 是否为空  | 说明                                   |
| ------------ | -------- | ----- | --------- | -------------------------------------- |
| id           | int      |       | NOT  NULL | 主键,自增长                            |
| u_id         | int      |       | NOT  NULL | 会员id                                 |
| order_time   | datetime |       | NOT  NULL | 下单时间                               |
| order_price  | decimal  | (8,2) | NOT  NULL | 订单金额                               |
| orde_status  | varchar  | 32    |           | 订单状态                               |
| create_time  | datetime |       | NOT  NULL | 创建时间                               |
| creator      | varchar  | 32    | NOT  NULL | 创建用户,引用用户表的用户名            |
| operate_time | datetime |       |           | 修改时间                               |
| operator     | varchar  | 32    |           | 修改用户，引用用户表的用户名           |
| delete_flag  | tinyint  | 4     | NOT  NULL | 删除标识，缺省值0,0为未删除，1为已删除 |

 

# **6.订单明细表(t_order_detail)**

| 字段名       | 类型     | 长度 | 是否为空  | 说明                                   |
| ------------ | -------- | ---- | --------- | -------------------------------------- |
| id           | int      |      | NOT  NULL | 主键,自增长                            |
| o_id         | int      |      | NOT  NULL | 订单id,取自order_info表                |
| p_id         | int      |      | NOT  NULL | 商品id                                 |
| num          | int      |      | NOT  NULL | 购买数量                               |
| create_time  | datetime |      | NOT  NULL | 创建时间                               |
| creator      | varchar  | 32   | NOT  NULL | 创建用户,引用用户表的用户名            |
| operate_time | datetime |      |           | 修改时间                               |
| operator     | varchar  | 32   |           | 修改用户，引用用户表的用户名           |
| delete_flag  | tinyint  | 4    | NOT  NULL | 删除标识，缺省值0,0为未删除，1为已删除 |

 

# *7.会员留言表(t_user_comment)*

| 字段名         | 类型     | 长度 | 是否为空  | 说明                                    |
| -------------- | -------- | ---- | --------- | --------------------------------------- |
| id             | int      |      | NOT  NULL | 主键,自增长                             |
| u_id           | int      |      | NOT  NULL | 所属会员id，引用自(t_user_info)的主键id |
| comment_date   | datetime |      | NOT  NULL | 留言时间                                |
| comment_detail | longtext |      | NOT  NULL | 留言内容                                |
| create_time    | datetime |      | NOT  NULL | 创建时间                                |
| creator        | varchar  | 32   | NOT  NULL | 创建用户,引用用户表的用户名             |
| operate_time   | datetime |      |           | 修改时间                                |
| operator       | varchar  | 32   |           | 修改用户，引用用户表的用户名            |
| delete_flag    | tinyint  | 4    | NOT  NULL | 删除标识，缺省值0,0为未删除，1为已删除  |

 