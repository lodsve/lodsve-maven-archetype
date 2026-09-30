---
title: lodsve-maven-archetype — 构建 Archetype 模板
type: recipe
explicitId: rcp-20260930-build-workflow
created: 2026-09-30T15:42:32.779Z
keywords:
  - workflow
  - build-workflow
  - auto-generated
sourceRef: pom.xml
lifecycleStatus: active
relatedPaths:
  - pom.xml
---

## Goal

构建 Archetype 模板。

## Prerequisites

使用父 POM 对应的 JDK 11 环境，并能访问 Maven 依赖仓库。

## Steps

在项目根目录执行：

```sh
./mvnw clean install
```

## Expected Outcome

模板模块构建并安装到本地 Maven 仓库。

## Common Pitfalls

生成项目的 bootVersion 决定其框架/JDK 要求；模板打包成功不等于生成工程通过构建。本次未执行构建。

## Related

- `pom.xml`
- [[architecture-constraints]]
