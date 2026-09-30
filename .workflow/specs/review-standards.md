---
title: "Review Standards"
readMode: required
priority: medium
category: review
keywords:
  - review
  - checklist
  - gate
  - approval
  - standard
---

# Review Standards

## Entries



<spec-entry category="review" keywords="" date="2026-09-30" sid="S-20260930-qta2" title="Maven 质量约定" sourceRef="pom.xml" relatedPaths="pom.xml">

### Maven 质量约定

沿用父 POM 的许可证、Checkstyle 与 PMD 检查及 tools/ 下配置，不在接入工作流时升级插件或关闭检查。源码生成需求以 archetype descriptor 为准，模板仓库和生成工程分别验证。

证据：`pom.xml`。

</spec-entry>
