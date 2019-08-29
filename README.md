# Maven archetypes to create a project with lodsve-framework!
[![FOSSA Status](https://app.fossa.io/api/projects/git%2Bgithub.com%2Flodsve%2Flodsve-maven-archetype.svg?type=shield)](https://app.fossa.io/projects/git%2Bgithub.com%2Flodsve%2Flodsve-maven-archetype?ref=badge_shield)

1. lodsve-maven-archetype-webapp
    
         mvn archetype:generate 
            -DgroupId=com.project 
            -DartifactId=project-test
            -Dversion=1.0-SNAPSHOT
            -DwebappPort=8080
            -DwebappContextPath=/
            -DlodsveVersion=2.6.7-RELEASE
            -DbasePackage=com.project
            -Dauthor=sunhao
            -DarchetypeGroupId=com.lodsve
            -DarchetypeArtifactId=lodsve-maven-archetype-webapp 
            -DarchetypeVersion=1.0.0-RELEASE     
    parameters：
    - groupId: the group id for new project
    - artifactId: the artifact id for new project
    - version: the version for new project
    - webappPort: the jetty web context's port
    - webappContextPath: context path
    - lodsveVersion: the version of Lodsve's version
    - basePackage: base package
    - author: author of this project

## License
[![FOSSA Status](https://app.fossa.io/api/projects/git%2Bgithub.com%2Flodsve%2Flodsve-maven-archetype.svg?type=large)](https://app.fossa.io/projects/git%2Bgithub.com%2Flodsve%2Flodsve-maven-archetype?ref=badge_large)