
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

## 热加载(Hot Swapping)
1. idea: ctrl+f9
## spring mvc 自动配置
1. ContentNegotiatingViewResolver,BeanNameViewResolver
2. statics resources
3. Converter,GenericConverter,Formatter
4. HttpMessageConverters: convert HTTP requests and responses (包括 bean <-> json)
5. MessageCodesResolver: error code,msg
