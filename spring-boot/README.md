
# Caused by: java.lang.ClassNotFoundException:

> i. 打包 mvn package
> ii. cd target
> iii. java -jar springboot-0.0.1-SNAPSHOT.jar

## 原因分析：

`pom.xml` 配置中忽略了`**/config/**`下的文件，

```
<plugin>
                <groupId>org.apache.maven.plugins</groupId>
                <artifactId>maven-jar-plugin</artifactId>
                <version>2.4</version>
                <configuration>
                    <excludes>
                        <exclude>**/config/**</exclude>
                    </excludes>
                </configuration>
            </plugin>
```

导致打包时 com.workcheng.springboot.**config**.Myproperty 被排除，
启动时报找不到指定类错误
