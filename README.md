mvn package

jar zvf jar包

java -jar jar包 --spring-config-name
                --spring.config.location=classpath:/default.properties,classpath:/override.properties

spring boot devtools 热部署
dependency>
<groupId>org.springframework.boot</groupId>
<artifactId>spring-boot-devtools</artifactId>
<optional>true</optional>
</dependency>


配置文件的生效顺序
A /config subdirectory of the current directory.
The current directory
A classpath /config package
The classpath root

日志
SLF4J

日志格式:
日志级别:trace(查找) debug(调试 ),info(消息),warn(警告),error(错误),fatal(严重错误)

management.security.enabled=false默认有一部分信息需要安全验证之后才可以查看，如果去掉这些安全认证，直接设置
