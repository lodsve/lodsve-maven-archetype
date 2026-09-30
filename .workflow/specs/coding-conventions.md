---
title: "Coding Conventions"
readMode: required
priority: high
category: coding
keywords:
  - style
  - naming
  - import
  - pattern
  - convention
  - formatting
---

# Coding Conventions

## Formatting

## Naming

## Imports

## Patterns

## Entries



<spec-entry category="coding" keywords="" date="2026-09-30" sid="S-20260930-7yhb" title="模板源码约定" sourceRef="lodsve-archetype-quickstart/src/main/resources/META-INF/maven/archetype-metadata.xml" relatedPaths="lodsve-archetype-quickstart/src/main/resources/META-INF/maven/archetype-metadata.xml">

### 模板源码约定

模板源码以相邻实现的 4 空格缩进、PascalCase 类名与 camelCase 成员为参照，保留 Apache 许可证头。${package}、${bootVersion} 等是模板输入，不作为待清理占位符；修改模板内容时同步核对 archetype-metadata.xml 的 requiredProperties/fileSets。根目录未发现 .editorconfig，不写成统一已配置的 formatter。

证据：`lodsve-archetype-quickstart/src/main/resources/META-INF/maven/archetype-metadata.xml`。

</spec-entry>
