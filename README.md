# Maven archetypes to create a project with lodsve-boot!

[![LICENSE](https://img.shields.io/github/license/lodsve/lodsve-maven-archetype)](https://github.com/lodsve/lodsve-maven-archetype/blob/master/LICENSE)
[![GitHub stars](https://img.shields.io/github/stars/lodsve/lodsve-maven-archetype.svg)](https://github.com/lodsve/lodsve-maven-archetype/stargazers)
[![GitHub forks](https://img.shields.io/github/forks/lodsve/lodsve-maven-archetype.svg)](https://github.com/lodsve/lodsve-maven-archetype/network)
[![GitHub issues](https://img.shields.io/github/issues/lodsve/lodsve-maven-archetype.svg)](https://github.com/lodsve/lodsve-maven-archetype/issues)
[![GitHub pull requests](https://img.shields.io/github/issues-pr/lodsve/lodsve-maven-archetype.svg)](https://github.com/lodsve/lodsve-maven-archetype/pulls)
[![FOSSA Status](https://app.fossa.com/api/projects/git%2Bgithub.com%2Flodsve%2Flodsve-maven-archetype.svg?type=shield)](https://app.fossa.com/projects/git%2Bgithub.com%2Flodsve%2Flodsve-maven-archetype?ref=badge_shield)

## Component Versions

1. lodsve-archetype-mybatis

   [![Maven Central](https://img.shields.io/maven-central/v/com.lodsve.archetype/lodsve-archetype-mybatis.svg)](https://search.maven.org/artifact/com.lodsve.archetype/lodsve-archetype-mybatis)
2. lodsve-archetype-nacos

   [![Maven Central](https://img.shields.io/maven-central/v/com.lodsve.archetype/lodsve-archetype-nacos.svg)](https://search.maven.org/artifact/com.lodsve.archetype/lodsve-archetype-nacos)

3. lodsve-archetype-quickstart

   [![Maven Central](https://img.shields.io/maven-central/v/com.lodsve.archetype/lodsve-archetype-quickstart.svg)](https://search.maven.org/artifact/com.lodsve.archetype/lodsve-archetype-quickstart)

## Usage

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
      
   ### 4. RPC（顺序：api -> server -> client）
   ### 4.1. RPC-api
   mvn archetype:generate
      -DgroupId=com.xxx
      -DartifactId=xxx-api
      -Dversion=1.0-SNAPSHOT
      -Dpackage=com.xxx
      -Dauthor=hulk.sun
      -DbootVersion=1.0.0-SNAPSHOT
      -DserverAppName=demo-server
      -DserverContextPath=/demo-server
      -DarchetypeGroupId=com.lodsve.archetype
      -DarchetypeArtifactId=lodsve-archetype-rpc-api
      -DarchetypeVersion=${archetypeVersion} 
   ### 4.2. RPC-server
   mvn archetype:generate
      -DgroupId=com.xxx
      -DartifactId=xxx-server
      -Dversion=1.0-SNAPSHOT
      -Dport=8080
      -DcontextPath=/xxx
      -Dpackage=com.xxx
      -Dauthor=haoke.sun
      -DbootVersion=1.0.0-SNAPSHOT
      -DapiGroupId=com.xxx
      -DapiArtifactId=xxx-api
      -DapiVersion=1.0-SNAPSHOT
      -DarchetypeGroupId=com.lodsve.archetype
      -DarchetypeArtifactId=lodsve-archetype-rpc-server
      -DarchetypeVersion=${archetypeVersion}
   ### 4.3. RPC-client
   mvn archetype:generate
      -DgroupId=com.xxx
      -DartifactId=xxx-client
      -Dversion=1.0-SNAPSHOT
      -Dport=8081
      -DcontextPath=/xxx
      -Dpackage=com.xxx
      -Dauthor=haoke.sun
      -DbootVersion=1.0.0-SNAPSHOT
      -DapiGroupId=com.xxx
      -DapiArtifactId=xxx-api
      -DapiVersion=1.0-SNAPSHOT
      -DarchetypeGroupId=com.lodsve.archetype
      -DarchetypeArtifactId=lodsve-archetype-rpc-client
      -DarchetypeVersion=${archetypeVersion}
      
   # ${archetypeVersion}: The latest version number of this scaffold.
   ```         

2. Parameter explanation

| Parameter Name    | Description                                                         | Example Value   |
                     |-------------------|---------------------------------------------------------------------|-----------------|
| groupId           | The groupId for the project to be created                           | com.lodsve      |
| artifactId        | The artifactId for the project to be created                        | demo            |
| version           | The version for the project to be created	                          | 1.0.0-SNAPSHOT  |
| port              | Port for the Spring Boot project	                                   | 8080            |
| contextPath       | Context path	                                                       | /demo           |
| package           | Base package for the project to be created                          | com.lodsve.demo |
| author            | Author of the project to be created                                 | hulk.sun        |
| bootVersion       | Version number of lodsve-boot to be used                            | 1.0.0-SNAPSHOT  |
| apiGroupId        | The groupId for the API package to be created (only used in RPC)    | com.lodsve.demo |
| apiArtifactId     | The artifactId for the API package to be created (only used in RPC) | demo-api        |
| apiVersion        | The version for the API package to be created (only used in RPC)    | 1.0.-SNAPSHOT   |
| serverAppName     | Value of spring.application.name configured on the server side      | demo-server     |
| serverContextPath | Context path for the server side                                    | /demo-server    |