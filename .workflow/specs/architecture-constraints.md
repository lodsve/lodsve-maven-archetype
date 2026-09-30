---
title: "Architecture Constraints"
readMode: required
priority: high
category: arch
keywords:
  - architecture
  - module
  - layer
  - boundary
  - dependency
  - structure
---

# Architecture Constraints

## Module Structure

## Layer Boundaries

## Dependency Rules

## Technology Constraints

## Entries



<spec-entry category="arch" keywords="" date="2026-09-30" sid="S-20260930-45z5" title="模板模块和生成项目边界" sourceRef="pom.xml" relatedPaths="pom.xml">

### 模板模块和生成项目边界

每个 lodsve-archetype-* 模块以 src/main/resources/archetype-resources/ 保存生成内容，META-INF/maven/archetype-metadata.xml 描述打包、过滤和参数。Quickstart/MyBatis/Nacos/RPC 模板各自维护；用参数化依赖连接 Lodsve Boot，不耦合兄弟项目的本地绝对路径。

证据：`pom.xml`。

</spec-entry>
