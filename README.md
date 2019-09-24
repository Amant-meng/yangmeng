# yangmeng
com.springboot.yangmeng.YangmengApplication 是系统启动类。
从Git上clone完项目需要做以下几步操作
1.首先配置数据库
数据库SQL语句位于doc/starter-mysql.sql,目前只提供mysql, oracle, postgresql脚本。
starter-mysql.sql  是MySQL数据库的运行语句
starter-oracle.sql  是oracle数据库的运行语句
starter-sqlserver.sql  是sqlserver数据库的运行语句

这里我用的是MySQL数据库，电脑安装MySQL直接新建数据库名取名ymdb，复制SQL语句直接新建查询
语句运行。

还需要修改SpringBoot配置文件application.properties,修改你的数据库地址和访问用户

spring.datasource.baseDataSource.url=jdbc:mysql://127.0.0.1:3306/ymdb?useUnicode=true&characterEncoding=UTF-8&serverTimezone=GMT%2B8&useSSL=false&useInformationSchema=true
spring.datasource.baseDataSource.username=root
spring.datasource.baseDataSource.password=123456
spring.datasource.baseDataSource.driver-class-name=com.mysql.cj.jdbc.Driver

2.修改端口
#端口配置
server.port=8989
默认端口配置为8080，为了避免冲突修改。这里我修改的端口为8989，也可以随意设置成自己想要的。

3.运行项目
运行YangmengApplication，浏览器输入http://127.0.0.1:8989/ 或者localhost:8989
输入admin/123456 则可以直接登录进入管理系统
如果成功启动后运行报错：变量userId未定义，位于第6行，那是因为你没有启用parameters，启用后，需要clean&build整个工程

如果使用idea编译器，项目右侧会有Maven点击在Lifecycle点击clean项目然后在install
重启项目就可以访问页面了
