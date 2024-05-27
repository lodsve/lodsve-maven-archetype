# 使用 lodsve-boot 创建项目的 Maven 原型

1. 用法
   ```shell
   ### 1. Quickstart
   mvn archetype:generate
      -DgroupId=com.xxx
      -DartifactId=xxx-project
      -Dversion=1.0-SNAPSHOT
      -Dport=8080
      -DcontextPath=/xxx
      -Dpackage=com.xxx
      -Dauthor=hulk.sun
      -DbootVersion=1.0.0-SNAPSHOT
      -DarchetypeGroupId=com.lodsve.archetype
      -DarchetypeArtifactId=lodsve-archetype-quickstart
      -DarchetypeVersion=${archetypeVersion}
   
   ### 2. Mybatis
   mvn archetype:generate
      -DgroupId=com.xxx
      -DartifactId=xxx-project
      -Dversion=1.0-SNAPSHOT
      -Dport=8080
      -DcontextPath=/xxx
      -Dpackage=com.xxx
      -Dauthor=hulk.sun
      -DbootVersion=1.0.0-SNAPSHOT
      -DarchetypeGroupId=com.lodsve.archetype
      -DarchetypeArtifactId=lodsve-archetype-mybatis
      -DarchetypeVersion=${archetypeVersion}
      
   ### 3. Nacos
   mvn archetype:generate
      -DgroupId=com.xxx
      -DartifactId=xxx-project
      -Dversion=1.0-SNAPSHOT
      -Dport=8080
      -DcontextPath=/xxx
      -Dpackage=com.xxx
      -Dauthor=hulk.sun
      -DbootVersion=1.0.0-SNAPSHOT
      -DarchetypeGroupId=com.lodsve.archetype
      -DarchetypeArtifactId=lodsve-archetype-nacos
      -DarchetypeVersion=${archetypeVersion}   
      
   # ${archetypeVersion}: 此脚手架最新版本号
   ```         

2. 参数解释

   | 参数名 | 描述 | 示例值 |
            |-------------|---------------------|-----------------|
   | groupId | 要创建工程的groupId | com.lodsve |
   | artifactId | 要创建工程的artifactId | demo |
   | version | 要创建工程的version | 1.0.0-SNAPSHOT |
   | port | SpringBoot工程的port | 8080 |
   | contextPath | context path | /demo |
   | package | 要创建工程的base package | com.lodsve.demo |
   | author | 要创建工程的作者 | hulk.sun |
   | bootVersion | 使用`lodsve-boot`的版本号 | 1.0.0-SNAPSHOT |