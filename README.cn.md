# 使用 lodsve-boot 创建项目的 Maven 原型

[![LICENSE](https://img.shields.io/github/license/lodsve/lodsve-maven-archetype)](https://github.com/lodsve/lodsve-maven-archetype/blob/master/LICENSE)
[![GitHub stars](https://img.shields.io/github/stars/lodsve/lodsve-maven-archetype.svg)](https://github.com/lodsve/lodsve-maven-archetype/stargazers)
[![GitHub forks](https://img.shields.io/github/forks/lodsve/lodsve-maven-archetype.svg)](https://github.com/lodsve/lodsve-maven-archetype/network)
[![GitHub issues](https://img.shields.io/github/issues/lodsve/lodsve-maven-archetype.svg)](https://github.com/lodsve/lodsve-maven-archetype/issues)
[![GitHub pull requests](https://img.shields.io/github/issues-pr/lodsve/lodsve-maven-archetype.svg)](https://github.com/lodsve/lodsve-maven-archetype/pulls)
[![FOSSA Status](https://app.fossa.com/api/projects/git%2Bgithub.com%2Flodsve%2Flodsve-maven-archetype.svg?type=shield)](https://app.fossa.com/projects/git%2Bgithub.com%2Flodsve%2Flodsve-maven-archetype?ref=badge_shield)

## 组件版本

1. lodsve-archetype-mybatis

   [![Maven Central](https://img.shields.io/maven-central/v/com.lodsve.archetype/lodsve-archetype-mybatis.svg)](https://search.maven.org/artifact/com.lodsve.archetype/lodsve-archetype-mybatis)
2. lodsve-archetype-nacos

   [![Maven Central](https://img.shields.io/maven-central/v/com.lodsve.archetype/lodsve-archetype-nacos.svg)](https://search.maven.org/artifact/com.lodsve.archetype/lodsve-archetype-nacos)

3. lodsve-archetype-quickstart

   [![Maven Central](https://img.shields.io/maven-central/v/com.lodsve.archetype/lodsve-archetype-quickstart.svg)](https://search.maven.org/artifact/com.lodsve.archetype/lodsve-archetype-quickstart)

## 用法

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