
## 运行方式

* Run 
```
mvn spring-boot:run
```

* 可执行jar
```
    <build>
        <plugins>
            <plugin>
                <groupId>org.springframework.boot</groupId>
                <artifactId>spring-boot-maven-plugin</artifactId>
            </plugin>
        </plugins>
    </build>
```
执行
```
mvn clean package
// 运行
java -jar target/myproject-0.0.1-SNAPSHOT.jar --debug
```
查看生成jar
```
guanxine@gx:~/work/git/learn-spring-boot/1-create-pom$ jar tvf target/myproject-0.0.1-SNAPSHOT.jar
     0 Fri Apr 26 10:35:42 CST 2019 META-INF/
   499 Fri Apr 26 10:35:42 CST 2019 META-INF/MANIFEST.MF
     0 Fri Apr 26 10:35:42 CST 2019 org/
     0 Fri Apr 26 10:35:42 CST 2019 org/springframework/
     0 Fri Apr 26 10:35:42 CST 2019 org/springframework/boot/
     0 Fri Apr 26 10:35:42 CST 2019 org/springframework/boot/loader/
     0 Fri Apr 26 10:35:42 CST 2019 org/springframework/boot/loader/data/
  2688 Thu Apr 04 02:23:16 CST 2019 org/springframework/boot/loader/data/RandomAccessDataFile$DataInputStream.class
     0 Fri Apr 26 10:35:42 CST 2019 org/springframework/boot/loader/jar/
  4976 Thu Apr 04 02:23:16 CST 2019 org/springframework/boot/loader/jar/AsciiBytes.class
   540 Thu Apr 04 02:23:16 CST 2019 org/springframework/boot/loader/jar/CentralDirectoryVisitor.class
  3263 Thu Apr 04 02:23:16 CST 2019 org/springframework/boot/loader/data/RandomAccessDataFile$FileAccess.class
  4015 Thu Apr 04 02:23:16 CST 2019 org/springframework/boot/loader/data/RandomAccessDataFile.class
     0 Fri Apr 26 10:35:42 CST 2019 org/springframework/boot/loader/archive/
   945 Thu Apr 04 02:23:16 CST 2019 org/springframework/boot/loader/archive/Archive.class
   282 Thu Apr 04 02:23:16 CST 2019 org/springframework/boot/loader/data/RandomAccessDataFile$1.class
  1593 Thu Apr 04 02:23:16 CST 2019 org/springframework/boot/loader/jar/JarFileEntries$1.class
   299 Thu Apr 04 02:23:16 CST 2019 org/springframework/boot/loader/jar/JarEntryFilter.class
   485 Thu Apr 04 02:23:16 CST 2019 org/springframework/boot/loader/data/RandomAccessData.class
   616 Thu Apr 04 02:23:16 CST 2019 org/springframework/boot/loader/jar/Bytes.class
   702 Thu Apr 04 02:23:16 CST 2019 org/springframework/boot/loader/jar/JarURLConnection$1.class
  9854 Thu Apr 04 02:23:16 CST 2019 org/springframework/boot/loader/jar/JarURLConnection.class
  1233 Thu Apr 04 02:23:16 CST 2019 org/springframework/boot/loader/jar/JarFile$2.class
  1487 Thu Apr 04 02:23:16 CST 2019 org/springframework/boot/loader/archive/ExplodedArchive$FileEntryIterator$EntryComparator.class
  3837 Thu Apr 04 02:23:16 CST 2019 org/springframework/boot/loader/archive/ExplodedArchive$FileEntryIterator.class
  1102 Thu Apr 04 02:23:16 CST 2019 org/springframework/boot/loader/archive/ExplodedArchive$FileEntry.class
   273 Thu Apr 04 02:23:16 CST 2019 org/springframework/boot/loader/archive/ExplodedArchive$1.class
  5243 Thu Apr 04 02:23:16 CST 2019 org/springframework/boot/loader/archive/ExplodedArchive.class
  1779 Thu Apr 04 02:23:16 CST 2019 org/springframework/boot/loader/archive/JarFileArchive$EntryIterator.class
  1081 Thu Apr 04 02:23:16 CST 2019 org/springframework/boot/loader/archive/JarFileArchive$JarFileEntry.class
  7336 Thu Apr 04 02:23:16 CST 2019 org/springframework/boot/loader/archive/JarFileArchive.class
 19737 Thu Apr 04 02:23:16 CST 2019 org/springframework/boot/loader/PropertiesLauncher.class
  1535 Thu Apr 04 02:23:16 CST 2019 org/springframework/boot/loader/LaunchedURLClassLoader$UseFastConnectionExceptionsEnumeration.class
  4306 Thu Apr 04 02:23:16 CST 2019 org/springframework/boot/loader/jar/JarURLConnection$JarEntryName.class
  5699 Thu Apr 04 02:23:16 CST 2019 org/springframework/boot/loader/LaunchedURLClassLoader.class
  1374 Thu Apr 04 02:23:16 CST 2019 org/springframework/boot/loader/jar/JarFile$JarFileType.class
  2062 Thu Apr 04 02:23:16 CST 2019 org/springframework/boot/loader/jar/JarFile$1.class
  2046 Thu Apr 04 02:23:16 CST 2019 org/springframework/boot/loader/jar/JarFileEntries$EntryIterator.class
 14010 Thu Apr 04 02:23:16 CST 2019 org/springframework/boot/loader/jar/JarFileEntries.class
  3116 Thu Apr 04 02:23:16 CST 2019 org/springframework/boot/loader/jar/CentralDirectoryEndRecord.class
  1813 Thu Apr 04 02:23:16 CST 2019 org/springframework/boot/loader/jar/ZipInflaterInputStream.class
   302 Thu Apr 04 02:23:16 CST 2019 org/springframework/boot/loader/archive/Archive$Entry.class
   437 Thu Apr 04 02:23:16 CST 2019 org/springframework/boot/loader/archive/Archive$EntryFilter.class
  3662 Thu Apr 04 02:23:16 CST 2019 org/springframework/boot/loader/jar/JarEntry.class
  5267 Thu Apr 04 02:23:16 CST 2019 org/springframework/boot/loader/jar/CentralDirectoryFileHeader.class
  4624 Thu Apr 04 02:23:16 CST 2019 org/springframework/boot/loader/jar/CentralDirectoryParser.class
 11548 Thu Apr 04 02:23:16 CST 2019 org/springframework/boot/loader/jar/Handler.class
  3650 Thu Apr 04 02:23:16 CST 2019 org/springframework/boot/loader/jar/StringSequence.class
   345 Thu Apr 04 02:23:16 CST 2019 org/springframework/boot/loader/jar/FileHeader.class
 15076 Thu Apr 04 02:23:16 CST 2019 org/springframework/boot/loader/jar/JarFile.class
  1953 Thu Apr 04 02:23:16 CST 2019 org/springframework/boot/loader/PropertiesLauncher$PrefixMatchingArchiveFilter.class
  1484 Thu Apr 04 02:23:16 CST 2019 org/springframework/boot/loader/PropertiesLauncher$ArchiveEntryFilter.class
   266 Thu Apr 04 02:23:16 CST 2019 org/springframework/boot/loader/PropertiesLauncher$1.class
  4684 Thu Apr 04 02:23:16 CST 2019 org/springframework/boot/loader/Launcher.class
  1502 Thu Apr 04 02:23:16 CST 2019 org/springframework/boot/loader/MainMethodRunner.class
  3608 Thu Apr 04 02:23:16 CST 2019 org/springframework/boot/loader/ExecutableArchiveLauncher.class
  1721 Thu Apr 04 02:23:16 CST 2019 org/springframework/boot/loader/WarLauncher.class
  1585 Thu Apr 04 02:23:16 CST 2019 org/springframework/boot/loader/JarLauncher.class
     0 Fri Apr 26 10:35:42 CST 2019 org/springframework/boot/loader/util/
  5203 Thu Apr 04 02:23:16 CST 2019 org/springframework/boot/loader/util/SystemPropertyUtils.class
     0 Fri Apr 26 10:35:44 CST 2019 META-INF/maven/
     0 Fri Apr 26 10:35:44 CST 2019 META-INF/maven/com.example/
     0 Fri Apr 26 10:35:44 CST 2019 META-INF/maven/com.example/myproject/
     0 Fri Apr 26 10:35:42 CST 2019 BOOT-INF/
     0 Fri Apr 26 10:35:42 CST 2019 BOOT-INF/classes/
   938 Fri Apr 26 10:35:42 CST 2019 BOOT-INF/classes/com.example.Example.class
  1236 Fri Apr 26 10:35:30 CST 2019 META-INF/maven/com.example/myproject/pom.xml
    95 Fri Apr 26 10:35:42 CST 2019 META-INF/maven/com.example/myproject/pom.properties
     0 Fri Apr 26 10:35:42 CST 2019 BOOT-INF/lib/
   405 Thu Apr 04 02:39:26 CST 2019 BOOT-INF/lib/spring-boot-starter-web-2.1.4.RELEASE.jar
   398 Thu Apr 04 02:39:08 CST 2019 BOOT-INF/lib/spring-boot-starter-2.1.4.RELEASE.jar
952263 Thu Apr 04 02:06:22 CST 2019 BOOT-INF/lib/spring-boot-2.1.4.RELEASE.jar
1262787 Thu Apr 04 02:15:42 CST 2019 BOOT-INF/lib/spring-boot-autoconfigure-2.1.4.RELEASE.jar
   407 Thu Apr 04 02:39:06 CST 2019 BOOT-INF/lib/spring-boot-starter-logging-2.1.4.RELEASE.jar
290339 Fri Mar 31 21:27:54 CST 2017 BOOT-INF/lib/logback-classic-1.2.3.jar
471901 Fri Mar 31 21:27:16 CST 2017 BOOT-INF/lib/logback-core-1.2.3.jar
 41139 Tue Feb 19 00:15:54 CST 2019 BOOT-INF/lib/slf4j-api-1.7.26.jar
 17522 Tue Feb 05 18:14:24 CST 2019 BOOT-INF/lib/log4j-to-slf4j-2.11.2.jar
266283 Tue Feb 05 18:11:30 CST 2019 BOOT-INF/lib/log4j-api-2.11.2.jar
  4589 Tue Feb 19 00:20:06 CST 2019 BOOT-INF/lib/jul-to-slf4j-1.7.26.jar
 26586 Wed Feb 21 15:54:16 CST 2018 BOOT-INF/lib/javax.annotation-api-1.3.2.jar
1293481 Sun Mar 31 08:23:40 CST 2019 BOOT-INF/lib/spring-core-5.1.6.RELEASE.jar
 23762 Sun Mar 31 08:23:30 CST 2019 BOOT-INF/lib/spring-jcl-5.1.6.RELEASE.jar
301298 Mon Aug 27 16:23:36 CST 2018 BOOT-INF/lib/snakeyaml-1.23.jar
   404 Thu Apr 04 02:39:26 CST 2019 BOOT-INF/lib/spring-boot-starter-json-2.1.4.RELEASE.jar
1347236 Sat Dec 15 21:59:06 CST 2018 BOOT-INF/lib/jackson-databind-2.9.8.jar
 66519 Sat Jul 29 20:53:26 CST 2017 BOOT-INF/lib/jackson-annotations-2.9.0.jar
325619 Sat Dec 15 13:19:12 CST 2018 BOOT-INF/lib/jackson-core-2.9.8.jar
 33391 Sat Dec 15 23:06:14 CST 2018 BOOT-INF/lib/jackson-datatype-jdk8-2.9.8.jar
100674 Sat Dec 15 23:06:24 CST 2018 BOOT-INF/lib/jackson-datatype-jsr310-2.9.8.jar
  8642 Sat Dec 15 23:06:04 CST 2018 BOOT-INF/lib/jackson-module-parameter-names-2.9.8.jar
   406 Thu Apr 04 02:39:26 CST 2019 BOOT-INF/lib/spring-boot-starter-tomcat-2.1.4.RELEASE.jar
3285915 Wed Mar 13 15:55:58 CST 2019 BOOT-INF/lib/tomcat-embed-core-9.0.17.jar
250080 Wed Mar 13 15:56:00 CST 2019 BOOT-INF/lib/tomcat-embed-el-9.0.17.jar
265197 Wed Mar 13 15:56:00 CST 2019 BOOT-INF/lib/tomcat-embed-websocket-9.0.17.jar
1155778 Thu Mar 21 11:42:20 CST 2019 BOOT-INF/lib/hibernate-validator-6.0.16.Final.jar
 93107 Tue Dec 19 16:23:28 CST 2017 BOOT-INF/lib/validation-api-2.0.1.Final.jar
 66469 Wed Feb 14 13:23:28 CST 2018 BOOT-INF/lib/jboss-logging-3.3.2.Final.jar
 66540 Tue Mar 27 18:35:34 CST 2018 BOOT-INF/lib/classmate-1.4.0.jar
1384999 Sun Mar 31 08:24:34 CST 2019 BOOT-INF/lib/spring-web-5.1.6.RELEASE.jar
673302 Sun Mar 31 08:23:46 CST 2019 BOOT-INF/lib/spring-beans-5.1.6.RELEASE.jar
800016 Sun Mar 31 08:25:10 CST 2019 BOOT-INF/lib/spring-webmvc-5.1.6.RELEASE.jar
369018 Sun Mar 31 08:24:00 CST 2019 BOOT-INF/lib/spring-aop-5.1.6.RELEASE.jar
1099880 Sun Mar 31 08:24:08 CST 2019 BOOT-INF/lib/spring-context-5.1.6.RELEASE.jar
280482 Sun Mar 31 08:24:00 CST 2019 BOOT-INF/lib/spring-expression-5.1.6.RELEASE.jar

```

## spring-boot-starter-parent

1. java 8
2. utf-8
3. 忽略依赖 version, 也可以升级某个依赖version: https://github.com/spring-projects/spring-boot/blob/v2.1.4.RELEASE/spring-boot-project/spring-boot-dependencies/pom.xml
4. repackage
5. 资源过滤
6. maven 插件
7. application 配置文件

## 建议
1. ```@SpringBootApplication``` main class (相当于 自动配置```@EnableAutoConfiguration```,bean扫描```@ComponentScan```, 配置```@Configuration```)
2. 主配置使用```@Configuration``` 标记 main class, 其他配置可以使用 ```@Import```
3. 使用基于 java 的配置而不是 xml: ```Enable*```, 如果还是使用 xml 建议使用 ```@ImportResource```
4. 自动配置(Auto-configuration): 使用```@SpringBootApplication```或者```@EnableAutoConfiguration``` 和```@Configuration```的组合

## 代码布局
```$xslt
com
    +- example
        +- myapplication
            +- Application.java ( main method, @SpringBootApplication)
            
            +- customer
                +- Customer.java
                +- CustomerController.java
                +- CustomerService.java
                +- CustomerRepository.java
            +- oder
                +- Order.java
                +- OrderController.java
                +- OrderService.java
                +- OrderRepository.java
```

## 热加载(Hot Swapping)
1. idea: ctrl+f9
## spring mvc 自动配置
1. ContentNegotiatingViewResolver,BeanNameViewResolver
2. statics resources
3. Converter,GenericConverter,Formatter
4. HttpMessageConverters: convert HTTP requests and responses (包括 bean <-> json)
5. MessageCodesResolver: error code,msg


## k8s
```
1. kubectl apply -f test-k8s-deployment.yaml
2. kubectl get pods -l app=test-k8s
    NAME                        READY   STATUS    RESTARTS   AGE
    test-k8s-57bcfb7598-4lpgp   1/1     Running   0          8m20s
    test-k8s-57bcfb7598-rr6fx   1/1     Running   0          8m20s
3. kubectl describe pod test-k8s-57bcfb7598-4lpgp

```

## application event and listener
Some listener triggered before the ApplicationContext. 不能使用 @bean, 使用 SpringApplication.addListeners(..)

## external configuration
可以从 properties,yaml 文件, env, 命令行 读取配置.可以通过以下两种方式
1. @Value
2. @ConfigurationProperties 是个对象

### property file
ConfigFileApplicationListener: file:/config ->(覆盖) file: -> classpath:/config -> classpath:

+ profile-specific file
profile-specific files always overriding the non-specific ones

## Logging
1. --debug: java -jar myapp.jar --debug
2. application.properties: logging.*
3. 建议使用 -spring 命名的log配置(logback-spring.xml 比 logback.xml 好)

## 国际化

## JSON
Jackson is part of spring-boot-starter-json
Jackson is preferred and default library

## web
### mvc
spring-boot-starter-web


## security

## sql db

```
spring.datasource.url=jdbc:mysql://localhost/test
spring.datasource.username=dbuser
spring.datasource.password=dbpass
spring.datasource.driver-class-name=com.mysql.jdbc.Driver

```


1. spring-boot-starter-jdbc or spring-boot-starter-data-jpa(Hibernate, Spring Data JPA, Spring ORMs)
2. HikariCP
3. 至少指定 spring.datasource.url , 否则会使用 embedded database. 
4. 也可以不指定 spring.datasource.driver-class-name 可以根据 url 推断出来
5. DataSourceProperties 前缀 spring.datasource.hikari.*, spring.datasource.tomcat.*, and spring.datasource.dbcp2.*
6. spring data jdbc,h2,JOOQ

## nosql
1. redis
    - cache, key-value store
    - spring-boot-starter-data-redis(java client: lettuce(default)/jedis)
2. mongoDB
3. Neo4j
4. Gemfire
5. Solr
6. elasticsearch
    - spring-boot-starter-data-elasticsearch
    - connecting by rest client
    - connecting by Jest(Elasticsearch Java Rest client)
    - connecting by spring data
  
7. cassandra
8. LDAP
9. InfluxDB

## caching
1. Generic
2. JCache(JSR-107)
3. EhCache 2.x
4. Hazelcast
5. Infinispan
6. Couchbase
7. Redis
8. Caffeine
9. Simple
10. None

## Messaging
1. JMS
2. AMQP
3. Kafka

## RestTemplate & WebCient

## Validation

## Email

## Distributed Transactions with JTA

## Hazelcast

## Quartz Scheduler

## Task Execution and Scheduling

## Spring integration

## 

## spring cloud
- Distributed/versioned configuration
- Service registration and discovery
- Routing
- Service-to-service calls
- Load balancing
- Circuit Breakers
- Distributed messagingi 

### 12-factor applications
1. Codebase
- 代码要有代码库, 一个服务对应一个代码库(一份代码库可以部署多个服务，不同环境部署不同版本也是可以的，但是不允许多个服务使用一个代码库), 多个服务靠依赖管理
2. Dependencies
- 依赖要显示声明(开发人员从代码库获取代码后, 只需要安装代码运行环境和依赖工具, 然后安装依赖包, 即可开始工作)
3. Config
- 配置(不同的部署环境配置可能不同)要和代码分离, 配置文件(散落在各个地方，格式不同，不太好), 环境变量(推荐)
4. Backing services
- 依赖的服务(db/mq/cache)都是一种资源(url)
5. Build,release,run
- 严格区分 build(可执行包), release(build + config), run
6. Processes
- 服务是一个进程, 必须无状态(例如不要使用"粘性session", session 中的数据应该保存在 memcached 和 redis 这样的带有过期时间的缓存中)
7. Port binding
- 通过端口暴露服务, 可以让任何应用通过作为 backing services 让另一个应用使用。
8. Concurrency
- 通过进程模型进行扩展
9. Disposability
- 快速启动和优雅关闭(SIGTERM)
- web-process: 拒绝所有请求, 并执行当前已经接收的请求, 然后退出。
- work-process: 将当前任务从队列中退出
10. Dev/prod parity
- 保持  dev,staging,prod 环境尽可能一样
11. Logs
- 把日志当作时间流, 服务本身不考虑存储自己的输出流。使用标准使出流(开发,实时的看); 线上,输出流通过运行环境截获,一并发处理程序
- 可以终端实时看, 可义输出到文档. 可以使用 splunk 这样的日志系统索引及分析系统或 Hadoop/Hive 这样的通用数据存储系统
    + 过去一段时间的特殊时间
    + 图形化大规模趋势
    + 根据用户定义的条件实时出发警报
12. Admin processes


### Spring Cloud Context
Application Context Services

### Spring Cloud Commons

###  Spring Cloud Config