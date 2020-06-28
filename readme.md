# aomaomanage

## 获取仓库
* clone 这个项目

    ```
    $ git clone https://gitee.com/kleinlsl/aomaomanage.git
    ``` 
* IDEA工具clone
    * 安装插件gitee
    * clone
    ```
    菜单栏-->VCS-->Get from Version Control-->输入：https://gitee.com/kleinlsl/aomaomanage.git
    ```
## Git版本控制使用
> git命令操作：[见文档](https://gitee.com/all-about-git)

> IDEA集成git操作的基本流程：
* 打开clone的项目
    * 修改、添加项目文件或代码
    * 点VCS-->Git-->ADD ；将文件添加至本地仓库进行管理
    * 点VCS-->Commit ; 将操作记录提交至本地仓库
    * 点VCS-->Git-->Push ; 将本地仓库提交至远程仓库（码云或GitHub）共享
## 项目目录结构
> push只提交以下目录文件
```shell
D:
├─other-resource      #项目相关文档、图片和sql
│  ├─project-doc
│  ├─project-image
│  └─sql-dir
├─src                 #项目源码目录
│  ├─main
│  │  ├─java
│  │  │  └─edu
│  │  │      └─xja   #java文件
│  │  │          ├─config
│  │  │          ├─controller
│  │  │          ├─dao
│  │  │          ├─domin
│  │  │          └─service
│  │  ├─resources   # 项目资源文件
│  │  │  ├─database-conf   # 数据库连接配置
│  │  │  ├─mappings 
│  │  │  ├─mybatis-conf  # mybatis配置文件
│  │  │  └─spring-conf   #spring相关配置文件
│  │  └─webapp           
│  │      └─WEB-INF
│  └─test               # 测试目录
│      └─java
│          └─edu
│              └─xja
│                  └─dao
├─pom.xml           #maven配置文件
└─readme.md
```