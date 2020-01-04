目 录

[第一章 问题定义  1](#_Toc28346017)

[1.1 软件性质... 1](#_Toc28346018)

[1.2 软件规模... 1](#_Toc28346019)

[1.3 开发该软件要实现的目标。... 1](#_Toc28346020)

[1.4 题目来源、选题背景... 1](#_Toc28346021)

[第二章 可行性研究  2](#_Toc28346022)

[2.1 可行性研究报告... 2](#_Toc28346023)

[2.1.1 技术可行性... 2](#_Toc28346024)

[2.1.2 经济可行性... 2](#_Toc28346025)

[2.1.3 法律可行性... 2](#_Toc28346026)

[2.1.4 操作可行性... 2](#_Toc28346027)

[2.1.5 结论... 2](#_Toc28346028)

[2.2 项目开发计划... 3](#_Toc28346029)

[2.2.1 系统资源... 3](#_Toc28346030)

[2.2.2 成本预算... 3](#_Toc28346031)

[第三章 面向对象分析  4](#_Toc28346032)

[3.1 业务分析... 4](#_Toc28346033)

[3.1.1 业务描述... 4](#_Toc28346034)

[3.2 功能分析，建立系统的功能参与者行为... 4](#_Toc28346035)

[3.2.1 参与者... 4](#_Toc28346036)

[3.2.2 需求结构... 5](#_Toc28346037)

[3.2.3 功能模型... 5](#_Toc28346038)

[3.3 对象分析，建立系统初步的对象模型（实体类的类图）... 11](#_Toc28346039)

[3.4 用例分析，建立用例分析模型... 12](#_Toc28346040)

[3.4.1 首页浏览用例... 12](#_Toc28346041)

[3.4.2 查看博客用例... 12](#_Toc28346042)

[3.4.3 博客新增用例... 13](#_Toc28346043)

[3.4.4 博客修改用例... 13](#_Toc28346044)

[3.4.5 博客删除用例... 14](#_Toc28346045)

[3.5 扩充和完善，建立系统完整的对象模型... 14](#_Toc28346046)

[3.5.1 实体类... 14](#_Toc28346047)

[3.5.2 控制类... 15](#_Toc28346048)

[3.5.3 业务类... 16](#_Toc28346049)

[3.5.4 边界类... 17](#_Toc28346050)

[3.6 重要类的状态图... 17](#_Toc28346051)

[3.6.1 用户类的状态图... 17](#_Toc28346052)

[第四章 面向对象的总体设计  18](#_Toc28346053)

[4.1 扩充、完善功能模型... 18](#_Toc28346054)

[4.2 软件运行环境... 18](#_Toc28346055)

[4.3 软件架构模型... 18](#_Toc28346056)

[4.3.1 软件架构模式... 18](#_Toc28346057)

[4.3.2 软件逻辑架构... 19](#_Toc28346058)

[4.4 扩充和完善对象模型，建立平台相关对象模型... 19](#_Toc28346059)

[4.4.1 实体类... 19](#_Toc28346060)

[4.4.2 控制类... 20](#_Toc28346061)

[4.4.3 业务类... 21](#_Toc28346062)

[4.4.4 数据访问类... 22](#_Toc28346063)

[4.5 用例设计，建立用例设计模型... 22](#_Toc28346064)

[4.5.1 首页浏览用例... 22](#_Toc28346065)

[4.5.2 查看博客用例... 22](#_Toc28346066)

[4.5.3 博客新增用例... 23](#_Toc28346067)

[4.5.4 博客修改用例... 23](#_Toc28346068)

[4.5.5 博客删除用例... 23](#_Toc28346069)

[4.6 数据库设计模型... 23](#_Toc28346070)

[4.6.1 数据库的表结构... 23](#_Toc28346071)

[4.6.2 数据库的表之间的关系... 26](#_Toc28346072)

[4.7 界面设计原型... 27](#_Toc28346073)

[4.7.1 界面结构模型... 27](#_Toc28346074)

[4.7.2 屏幕界面模型... 27](#_Toc28346075)

[4.8 组件图... 35](#_Toc28346076)

[4.9 部署图... 35](#_Toc28346077)

 




# 第一章 问题定义

## 1.1 软件性质

个人博客系统是一个在网络上表达和传播个人思想、知识等文章的网络日志系统，是一个以网络为载体，能简单快速的发布自己各方面的心得体会与生活日志等内容并进行传播的网络综合软件。

## 1.2 软件规模

该软件属于小型软件，代码的数量在2000行左右。一人用时2-3周的时间完成了这个该软件的开发并进行了简单测试。

## 1.3 开发该软件要实现的目标。

随着互联网的普及和网民的激增，在网络上记录日志、发表看法、分享知识等让更多的人们看到的方式越来越被人认同，随之兴起了许多如CSDN、掘金、博客园等博客论坛，这些论坛虽然功能强大，但其格式固定、不能自定义各种功能的限制也很明显，因此开发了个人博客系统，该系统全部开源，目标为实现大部分博客基础功能，如：对后台的博客管理、对分类管理、对标签管理，对前台的博客展示、分类展示等。管理员在熟悉代码的情况下可以自定义页面样式、新增修改功能，提高开放性，自主性与可扩展性。

## 1.4 题目来源、选题背景

该题目为个人博客系统，由于个人一直希望有一个属于自己的博客系统，又恰巧要完成系统分析与设计的课程设计，所以就萌生了自己开发一个博客系统的念头。

# 第二章 可行性研究

## 2.1 可行性研究报告

### 2.1.1 技术可行性

该项目开发环境为win10，开发工具为IntelliJ IDEA 2019.1.2，页面使用SemanticUI框架、JQuery以及一些插件，后台采用SpringBoot，SpringDataJPA，使用Rustful风格和thymeleaf模板引擎进行前后台数据交互，使用MySQL5.7作为数据库。多数技术都曾接触并使用过，所以技术难点不大。

### 2.1.2 经济可行性

该项目开发所用技术都为开源免费技术，开发平台与工具可自行寻找合适平台与工具。

该项目运行环境为Linux，需要正式上线时需自备服务器和域名。当然在访问人数不多时，对服务器要求并不高，每年费用在200元左右。

综上所述，该项目开发费用基本为零，后期运行维护则视个人情况与使用情况而定。

### 2.1.3 法律可行性

该项目所借助所有技术都为开源免费项目，参考资料也为侵权行为，在法律上可行。

### 2.1.4 操作可行性

项目已尽量实现了管理员对博客的各种常规功能，考虑并尽量简化了管理员的各种操作，且开放源代码，若有不足管理员可自主修改或添加。

### 2.1.5 结论

综上四点所述，该项目在技术、经济、法律、操作上都是可行的，在预计2-3周的开发时间且不出意外的情况下可以如期开发出来。

## 2.2 项目开发计划

### 2.2.1 系统资源

SemanticUI：https://semantic-ui.com/introduction/getting-started.html

JQuery：https://jquery.com/  (学习：https://www.runoob.com/jquery/jquery-tutorial.html)

Markdown编辑器：http://pandao.github.io/editor.md/（可能需翻墙）

排版：typo（https://github.com/sofish/typo.css）

动画：animate（https://github.com/daneden/animate.css）

代码高亮：prism（[https://prismjs.com/download.html](https://prismjs.com/download.html?#themes=prism-okaidia&languages=)） （语言建议全选）

生成目录：tocbot（https://github.com/tscanlin/tocbot）

scrollTo：https://github.com/flesler/jquery.scrollTo （配合tocbot效果好）

监控锚点：waypoint（https://github.com/imakewebthings/waypoints）

JDK：[https://mirrors.huaweicloud.com/java/jdk/](https://mirrors.huaweicloud.com/java/jdk/8u202-b08/) （自行下载合适版本）

 

### 2.2.2 成本预算

开发预算：时间2-3周，经济预算：无

运行维护预算：视浏览人数与个人能力

# 第三章 面向对象分析

## 3.1 业务分析

### 3.1.1 业务描述

个人博客系统提供博客列表展示、分类展示、标签展示、归档展示、关于我等功能，同时为系统后台管理人员提供对应的维护及管理的功能，包括博客管理、分类管理、标签管理等功能。

A． 网站前台

​	a)    博客列表展示：浏览者访问博客首页即为博客列表展示页，显示博客列表、博客分类列表、博客标签列表、最新推荐列表。

​	b)   分类（/标签）标签展示：浏览者点击分类（/标签）进入分类（/标签）博客列表展示页，按分类（/标签）展示博客列表。

​	c)    归档展示：浏览者点击归档进入归档博客列表展示页，按年月顺序展示博客列表

B． 网站后台

​	a)    博客管理：管理员可以添加、修改、删除博客。

​	b)   标签（/分类）管理：管理员可以添加、修改、删除标签（分类）。 

## 3.2 功能分析，建立系统的功能参与者行为

### 3.2.1 参与者

![图3.1参与者](http://github-imgs.oss-cn-beijing.aliyuncs.com/blog/%E5%8F%82%E4%B8%8E%E8%80%85.jpg)

### 3.2.2 需求结构

![图3.2需求结构](http://github-imgs.oss-cn-beijing.aliyuncs.com/blog/%E9%9C%80%E6%B1%82%E7%BB%93%E6%9E%84_%E8%BD%AF%E4%BB%B6%E9%80%BB%E8%BE%91%E6%9E%B6%E6%9E%84.jpg)



### 3.2.3 功能模型

A.  博客浏览

a)    描述：浏览者可分页浏览博客列表，查看博客详细信息

b)   用例图：

![图3.3博客浏览功能模型](http://github-imgs.oss-cn-beijing.aliyuncs.com/blog/%E5%8A%9F%E8%83%BD%E6%A8%A1%E5%9E%8B%E2%80%94%E2%80%94%E5%8D%9A%E5%AE%A2%E6%B5%8F%E8%A7%88.jpg)



c)    用例描述：

l 博客浏览用例描述

用例名：博客浏览

参与者：浏览者

事件流程：

\1.    浏览者访问博客首页地址。

\2.    系统从数据库获取所有博客信息，返回到博客首页。

\3.    浏览者可在博客首页分页浏览博客列表。

\4.    浏览者在分页浏览博客列表时，若单击某博客，则系统查询该博客详细信息，将查询信息显示在首页中

l 博客详情用例描述

用例名：博客详情

参与者：浏览者

事件流程：

\1.   浏览者在浏览博客列表时，单击博客。

\2.   系统查询该博客详细信息，并返回到详细信息页。

\3.   浏览者在查看博客页中，点击“返回”按钮时，返回博客上一层页面。

B.  分类（/标签）浏览

a)    描述：浏览者可按分类（/标签）分页浏览博客

b)   用例图：

![图3.4分类（标签）功能模型](http://github-imgs.oss-cn-beijing.aliyuncs.com/blog/%E5%8A%9F%E8%83%BD%E6%A8%A1%E5%9E%8B%E2%80%94%E2%80%94%E5%88%86%E7%B1%BB%E6%B5%8F%E8%A7%88.jpg)



c)    用例描述：

l 分类（/标签）浏览博客用例描述

用例名：分类（/标签）浏览

参与者：浏览者

事件流程：

\1.   浏览者在首页，点击“分类（/标签）”或在分类（/标签）列表点击“更多”图标。

\2.   系统查询所有分类（/标签），并查询某一分类下所有博客（默认查询排序第一个分类的），将其返回分类列表展示页。

C.  归档浏览

a)    描述：浏览者可按事件（年月）浏览博客列表

b)   用例图：

![图3.5归档浏览功能模型](http://github-imgs.oss-cn-beijing.aliyuncs.com/blog/%E5%8A%9F%E8%83%BD%E6%A8%A1%E5%9E%8B%E2%80%94%E2%80%94%E5%BD%92%E6%A1%A3%E6%B5%8F%E8%A7%88.jpg)



c)    用例描述：

l 归档浏览博客用例描述

用例名：归档浏览

参与者：浏览者

事件流程：

\1.   浏览者在首页点击“归档”。

\2.   系统按事件年份进行分组查询并倒序排序，返回归档浏览页。

D.  分类（/标签）管理

a)    描述：博客管理员可以对分类（/标签）进行增、删、改的管理操作。

b)   用例图： 

![图3.6分类（标签）管理功能模型](http://github-imgs.oss-cn-beijing.aliyuncs.com/blog/%E5%8A%9F%E8%83%BD%E6%A8%A1%E5%9E%8B%E2%80%94%E2%80%94%E5%88%86%E7%B1%BB%E7%AE%A1%E7%90%86.jpg)



c)    用例描述：

l 分类（/标签）添加用例描述

用例名：分类（/标签）添加用例

参与者：博客管理员

事件流程：

\1.   管理员在分类（/标签）展示页点击新增按钮，页面跳转到分类（/标签）新增页。

\2.   管理员填写分类名（标签名），点击提交转发，若点击“返回”则返回。

\3.   系统获取填写相关信息，保存到数据库，并跳转到分类（/标签）展示页。

l 分类（/标签）修改用例描述

用例名：分类（/标签）修改用例

参与者：博客管理员

事件流程：

\1.   管理员在分类（/标签）展示页点击修改按钮

\2.   系统查询该分类（/标签）信息转发到分类（/标签）修改页并显示。

\3.   管理员修改分类名（标签名），点击提交转发，若点击“返回”则返回。

\4.   系统获取填写相关信息，保存到数据库，并跳转到分类（/标签）展示页

l 分类（/标签）删除用例描述

用例名：分类（/标签）删除用例

参与者：博客管理员

事件流程：

\1.   管理员在分类（/标签）展示页点击删除按钮

\2.   系统获取分类（/标签）主键，从数据库删除该分类（/标签），并跳转到分类（/标签）展示页

E.   博客管理

a)    描述：博客管理员可以对博客进行增、删、改的管理操作。

b)   用例图：

![图3.7博客管理功能模型](http://github-imgs.oss-cn-beijing.aliyuncs.com/blog/%E5%8A%9F%E8%83%BD%E6%A8%A1%E5%9E%8B%E2%80%94%E2%80%94%E5%8D%9A%E5%AE%A2%E7%AE%A1%E7%90%86.jpg)



c)    用例描述：

l 博客添加用例描述

用例名：博客添加用例

参与者：博客管理员

事件流程：

\1.   管理员在博客展示页点击新增按钮，页面跳转到博客新增页。

\2.   管理员填写博客详细信息，点击提交转发，若点击“返回”则返回。

\3.   系统获取填写相关信息，保存到数据库，并跳转到博客展示页。

l 博客修改用例描述

用例名：博客修改用例

参与者：博客管理员

事件流程：

\1.   管理员在博客展示页点击修改按钮。

\2.   系统查询该博客信息转发到博客修改页并显示。

\3.   管理员修改博客详细信息，点击提交转发，若点击“返回”则返回。

\4.   系统获取填写相关信息，保存到数据库，并跳转到博客展示页

l 博客删除用例描述

用例名：博客删除用例

参与者：博客管理员

事件流程：

\1.   管理员在博客列表展示页点击删除按钮

\2.   系统获取博客主键，从数据库删除该博客，并跳转到博客列表展示页。

## 3.3  对象分析，建立系统初步的对象模型（实体类的类图）

![图3.8实体类](http://github-imgs.oss-cn-beijing.aliyuncs.com/blog/%E5%AF%B9%E8%B1%A1%E5%88%86%E6%9E%90%E2%80%94%E2%80%94%E5%AE%9E%E4%BD%93%E7%B1%BB%E7%B1%BB%E5%9B%BE.jpg)



## 3.4 用例分析，建立用例分析模型

### 3.4.1 首页浏览用例

![图3.9首页浏览用例](http://github-imgs.oss-cn-beijing.aliyuncs.com/blog/%E7%94%A8%E4%BE%8B%E5%88%86%E6%9E%90%E2%80%94%E2%80%94%E9%A6%96%E9%A1%B5%E6%B5%8F%E8%A7%88%E7%94%A8%E4%BE%8B.jpg)

### 3.4.2 查看博客用例

![图3.10查看博客用例](http://github-imgs.oss-cn-beijing.aliyuncs.com/blog/%E7%94%A8%E4%BE%8B%E5%88%86%E6%9E%90%E2%80%94%E2%80%94%E6%9F%A5%E7%9C%8B%E5%8D%9A%E5%AE%A2%E7%94%A8%E4%BE%8B.jpg)

### 3.4.3 博客新增用例

![图3.11博客新增用例](http://github-imgs.oss-cn-beijing.aliyuncs.com/blog/%E7%94%A8%E4%BE%8B%E5%88%86%E6%9E%90%E2%80%94%E2%80%94%E5%8D%9A%E5%AE%A2%E6%96%B0%E5%A2%9E%E7%94%A8%E4%BE%8B.jpg)

### 3.4.4 博客修改用例

![图3.12博客修改用例](http://github-imgs.oss-cn-beijing.aliyuncs.com/blog/%E7%94%A8%E4%BE%8B%E5%88%86%E6%9E%90%E2%80%94%E2%80%94%E5%8D%9A%E5%AE%A2%E4%BF%AE%E6%94%B9%E7%94%A8%E4%BE%8B.jpg)

### 3.4.5 博客删除用例

![图3.13博客删除用例](http://github-imgs.oss-cn-beijing.aliyuncs.com/blog/%E7%94%A8%E4%BE%8B%E5%88%86%E6%9E%90%E2%80%94%E2%80%94%E5%88%A0%E9%99%A4%E5%8D%9A%E5%AE%A2%E7%94%A8%E4%BE%8B.jpg)

## 3.5 扩充和完善，建立系统完整的对象模型

### 3.5.1 实体类

![图3.14实体类图](http://github-imgs.oss-cn-beijing.aliyuncs.com/blog/%E6%89%A9%E5%85%85%E5%92%8C%E5%AE%8C%E5%96%84%E5%AF%B9%E8%B1%A1%E6%A8%A1%E5%9E%8B%E2%80%94%E2%80%94%E5%AE%9E%E4%BD%93%E7%B1%BB.jpg)

### 3.5.2 控制类

![图3.15控制类图](http://github-imgs.oss-cn-beijing.aliyuncs.com/blog/%E6%89%A9%E5%85%85%E5%92%8C%E5%AE%8C%E5%96%84%E5%AF%B9%E8%B1%A1%E6%A8%A1%E5%9E%8B%E2%80%94%E2%80%94%E6%8E%A7%E5%88%B6%E7%B1%BB%20-%202.jpg)

### 3.5.3 业务类

![图3.16业务类图](http://github-imgs.oss-cn-beijing.aliyuncs.com/blog/%E6%89%A9%E5%85%85%E5%92%8C%E5%AE%8C%E5%96%84%E5%AF%B9%E8%B1%A1%E6%A8%A1%E5%9E%8B%E2%80%94%E2%80%94%E4%B8%9A%E5%8A%A1%E7%B1%BB.jpg)

### 3.5.4 边界类

![图3.17边界类图](http://github-imgs.oss-cn-beijing.aliyuncs.com/blog/%E6%89%A9%E5%85%85%E5%92%8C%E5%AE%8C%E5%96%84%E5%AF%B9%E8%B1%A1%E6%A8%A1%E5%9E%8B%E2%80%94%E2%80%94%E9%A1%B5%E9%9D%A2%E7%B1%BB.jpg)

## 3.6 重要类的状态图

### 3.6.1 用户类的状态图

![图3.18状态图-用户类](http://github-imgs.oss-cn-beijing.aliyuncs.com/blog/%E7%8A%B6%E6%80%81%E5%9B%BE%E2%80%94%E2%80%94%E7%94%A8%E6%88%B7%E7%B1%BB.jpg)

 

# 第四章 面向对象的总体设计

## 4.1 扩充、完善功能模型

暂时无需再扩充。

## 4.2 软件运行环境

浏览器：chrome

应用服务器：tomcat 9.0

开发环境：win10

开发使用语言及版本：Java （JDK1.8+）

集成开发环境：IntelliJ IDEA 2019.1.2

数据库：，MySQL 5.7

开发使用技术：

​    页面：SemanticUI框架、JQuery以及一些插件

后台：SpringBoot，SpringDataJPA

数据交互：使用Rustful风格和thymeleaf模板引擎进行前后台数据交互

## 4.3 软件架构模型

### 4.3.1 软件架构模式

B/S架构模式

### 4.3.2 软件逻辑架构

![图4.1软件逻辑架构图](http://github-imgs.oss-cn-beijing.aliyuncs.com/blog/%E9%9C%80%E6%B1%82%E7%BB%93%E6%9E%84_%E8%BD%AF%E4%BB%B6%E9%80%BB%E8%BE%91%E6%9E%B6%E6%9E%84.jpg)

## 4.4 扩充和完善对象模型，建立平台相关对象模型

### 4.4.1 实体类

![图4.2实体类图](http://github-imgs.oss-cn-beijing.aliyuncs.com/blog/%E6%89%A9%E5%85%85%E5%92%8C%E5%AE%8C%E5%96%84%E5%AF%B9%E8%B1%A1%E6%A8%A1%E5%9E%8B%E2%80%94%E2%80%94%E5%AE%9E%E4%BD%93%E7%B1%BB.jpg)

### 4.4.2 控制类

![图4.3控制类图](http://github-imgs.oss-cn-beijing.aliyuncs.com/blog/%E6%89%A9%E5%85%85%E5%92%8C%E5%AE%8C%E5%96%84%E5%AF%B9%E8%B1%A1%E6%A8%A1%E5%9E%8B%E2%80%94%E2%80%94%E6%8E%A7%E5%88%B6%E7%B1%BB%20-%202.jpg)

### 4.4.3 业务类

![图4.4业务类图](http://github-imgs.oss-cn-beijing.aliyuncs.com/blog/%E6%89%A9%E5%85%85%E5%92%8C%E5%AE%8C%E5%96%84%E5%AF%B9%E8%B1%A1%E6%A8%A1%E5%9E%8B%E2%80%94%E2%80%94%E4%B8%9A%E5%8A%A1%E7%B1%BB%20-%202.jpg)

### 4.4.4 数据访问类

![图4.5数据访问类图](http://github-imgs.oss-cn-beijing.aliyuncs.com/blog/%E6%89%A9%E5%85%85%E5%92%8C%E5%AE%8C%E5%96%84%E5%AF%B9%E8%B1%A1%E6%A8%A1%E5%9E%8B%E2%80%94%E2%80%94%E6%95%B0%E6%8D%AE%E8%AE%BF%E9%97%AE%E7%B1%BB-2.jpg)

## 4.5 用例设计，建立用例设计模型

### 4.5.1 首页浏览用例

![图4.6首页浏览用例](http://github-imgs.oss-cn-beijing.aliyuncs.com/blog/%E7%94%A8%E4%BE%8B%E8%AE%BE%E8%AE%A1%E2%80%94%E2%80%94%E9%A6%96%E9%A1%B5%E6%B5%8F%E8%A7%88%E7%94%A8%E4%BE%8B.jpg)

### 4.5.2 查看博客用例

![图4.7产看博客用例](http://github-imgs.oss-cn-beijing.aliyuncs.com/blog/%E7%94%A8%E4%BE%8B%E8%AE%BE%E8%AE%A1%E2%80%94%E2%80%94%E6%9F%A5%E7%9C%8B%E5%8D%9A%E5%AE%A2%E7%94%A8%E4%BE%8B.jpg)

### 4.5.3 博客新增用例

![图4.8博客新增用例](http://github-imgs.oss-cn-beijing.aliyuncs.com/blog/%E7%94%A8%E4%BE%8B%E8%AE%BE%E8%AE%A1%E2%80%94%E2%80%94%E5%8D%9A%E5%AE%A2%E6%96%B0%E5%A2%9E%E7%94%A8%E4%BE%8B.jpg)

### 4.5.4 博客修改用例

![图4.9博客修改用例](http://github-imgs.oss-cn-beijing.aliyuncs.com/blog/%E7%94%A8%E4%BE%8B%E8%AE%BE%E8%AE%A1%E2%80%94%E2%80%94%E5%8D%9A%E5%AE%A2%E4%BF%AE%E6%94%B9%E7%94%A8%E4%BE%8B.jpg)

### 4.5.5 博客删除用例

![图4.10博客删除用例](http://github-imgs.oss-cn-beijing.aliyuncs.com/blog/%E7%94%A8%E4%BE%8B%E8%AE%BE%E8%AE%A1%E2%80%94%E2%80%94%E5%8D%9A%E5%AE%A2%E4%BF%AE%E5%88%A0%E9%99%A4%E4%BE%8B.jpg)

## 4.6 数据库设计模型

### 4.6.1 数据库的表结构

A.  用户表（t_user）

| 名称        | 描述     | 数据类型 | 大小 | 约束 |
| ----------- | -------- | -------- | ---- | ---- |
| id          | 主键id   | bigint   | 20   | PK   |
| avatar      | 头像     | varchar  | 255  |      |
| create_time | 创建时间 | datetime | 6    |      |
| email       | 邮箱     | varchar  | 255  |      |
| nick_name   | 昵称     | varchar  | 255  |      |
| password    | 密码     | varchar  | 255  |      |
| type        | 类型     | int      | 11   |      |
| update_time | 跟新时间 | datetime | 6    |      |
| username    | 用户名   | varchar  | 255  |      |

 

B.  博客表(t_blog)

| 名称             | 描述     | 数据类型 | 大小 | 约束 |
| ---------------- | -------- | -------- | ---- | ---- |
| id               | 主键id   | bigint   | 20   | PK   |
| content          | 内容     | longtext |      |      |
| create_time      | 创建时间 | datetime | 6    |      |
| description      | 描述     | longtext |      |      |
| first_picture    | 首图     | varchar  | 255  |      |
| flag             | 类别     | varchar  | 255  |      |
| recommend_status | 是否推荐 | bit      | 1    | NN   |
| title            | 标题     | varchar  | 255  |      |
| update_time      | 跟新时间 | datetime | 6    |      |
| views            | 浏览人数 | int      | 11   |      |
| type_id          | 分类id   | bigint   | 20   | FK   |
| user_id          | 用户id   | bigint   | 20   | FK   |

 

C.  博客-标签表(t_blog_tags)

| 名称     | 描述   | 数据类型 | 大小 | 约束 |
| -------- | ------ | -------- | ---- | ---- |
| blogs_id | 博客id | bigint   | 20   | FK   |
| tags_id  | 标签id | bigint   | 20   | FK   |

 

D.  标签表(t_tag)

| 名称 | 描述   | 数据类型 | 大小 | 约束 |
| ---- | ------ | -------- | ---- | ---- |
| id   | 主键id | bigint   | 20   | PK   |
| name | 标签名 | varchar  | 255  |      |

 

E.   分类表(t_type)

| 名称 | 描述   | 数据类型 | 大小 | 约束 |
| ---- | ------ | -------- | ---- | ---- |
| id   | 主键id | bigint   | 20   | PK   |
| name | 分类名 | varchar  | 255  |      |

 

### 4.6.2 数据库的表之间的关系

![图4.11数据库表关系图](http://github-imgs.oss-cn-beijing.aliyuncs.com/blog/%E6%95%B0%E6%8D%AE%E5%BA%93%E7%9A%84%E8%A1%A8%E4%B9%8B%E9%97%B4%E7%9A%84%E5%85%B3%E7%B3%BB.jpg)

## 4.7 界面设计原型

### 4.7.1 界面结构模型

![图4.12界面结构模型图](http://github-imgs.oss-cn-beijing.aliyuncs.com/blog/%E7%95%8C%E9%9D%A2%E7%BB%93%E6%9E%84%E6%A8%A1%E5%9E%8B.jpg)

### 4.7.2 屏幕界面模型

A.  主页

![图4.13界面模型——主页](http://github-imgs.oss-cn-beijing.aliyuncs.com/blog/%E5%B1%8F%E5%B9%95%E7%95%8C%E9%9D%A2%E6%A8%A1%E5%9E%8B-%E4%B8%BB%E9%A1%B5.jpg)

B.  分类列表页

![图4.14界面模型——分类列表页](http://github-imgs.oss-cn-beijing.aliyuncs.com/blog/%E5%B1%8F%E5%B9%95%E7%95%8C%E9%9D%A2%E6%A8%A1%E5%9E%8B-%E5%88%86%E7%B1%BB%E5%88%97%E8%A1%A8%E9%A1%B5.jpg)

C.  标签列表页

![图4.15界面模型——标签列表页](http://github-imgs.oss-cn-beijing.aliyuncs.com/blog/%E5%B1%8F%E5%B9%95%E7%95%8C%E9%9D%A2%E6%A8%A1%E5%9E%8B-%E6%A0%87%E7%AD%BE%E5%88%97%E8%A1%A8%E9%A1%B5.jpg)

D.  博客详情页

![图4.16界面模型——博客详情页](http://github-imgs.oss-cn-beijing.aliyuncs.com/blog/%E5%B1%8F%E5%B9%95%E7%95%8C%E9%9D%A2%E6%A8%A1%E5%9E%8B-%E5%8D%9A%E5%AE%A2%E8%AF%A6%E6%83%85%E9%A1%B5.jpg)

E.   归档页

![图4.17界面模型——归档页](http://github-imgs.oss-cn-beijing.aliyuncs.com/blog/%E5%B1%8F%E5%B9%95%E7%95%8C%E9%9D%A2%E6%A8%A1%E5%9E%8B-%E5%BD%92%E6%A1%A3%E9%A1%B5.jpg)

F.   后台登录页

![图4.18界面模型——后台登陆页](http://github-imgs.oss-cn-beijing.aliyuncs.com/blog/%E5%B1%8F%E5%B9%95%E7%95%8C%E9%9D%A2%E6%A8%A1%E5%9E%8B-%E5%90%8E%E5%8F%B0%E7%99%BB%E5%BD%95%E9%A1%B5.jpg)

G.  博客管理页

![图4.19界面模型——博客浏览页](http://github-imgs.oss-cn-beijing.aliyuncs.com/blog/%E5%B1%8F%E5%B9%95%E7%95%8C%E9%9D%A2%E6%A8%A1%E5%9E%8B-%E5%8D%9A%E5%AE%A2%E7%AE%A1%E7%90%86%E9%A1%B5.jpg)

H.  博客新增/修改页

![图4.20界面模型——博客新增（修改）页](http://github-imgs.oss-cn-beijing.aliyuncs.com/blog/%E5%B1%8F%E5%B9%95%E7%95%8C%E9%9D%A2%E6%A8%A1%E5%9E%8B-%E5%8D%9A%E5%AE%A2%E6%96%B0%E5%A2%9E_%E4%BF%AE%E6%94%B9%E9%A1%B5.jpg)

I.   分类管理页

![图4.21界面模型——分类管理页](http://github-imgs.oss-cn-beijing.aliyuncs.com/blog/%E5%B1%8F%E5%B9%95%E7%95%8C%E9%9D%A2%E6%A8%A1%E5%9E%8B-%E5%88%86%E7%B1%BB%E7%AE%A1%E7%90%86%E9%A1%B5.jpg)

J.   分类新增/修改页

![图4.22界面模型——分类新增（修改）页](http://github-imgs.oss-cn-beijing.aliyuncs.com/blog/%E5%B1%8F%E5%B9%95%E7%95%8C%E9%9D%A2%E6%A8%A1%E5%9E%8B-%E5%88%86%E7%B1%BB%E6%96%B0%E5%A2%9E_%E4%BF%AE%E6%94%B9%E9%A1%B5.jpg)

K.  标签管理页

![图4.23界面模型——标签管理页](http://github-imgs.oss-cn-beijing.aliyuncs.com/blog/%E5%B1%8F%E5%B9%95%E7%95%8C%E9%9D%A2%E6%A8%A1%E5%9E%8B-%E6%A0%87%E7%AD%BE%E7%AE%A1%E7%90%86%E9%A1%B5.jpg)

L.   标签新增/修改页

![图4.24界面模型——标签新增（修改）页](http://github-imgs.oss-cn-beijing.aliyuncs.com/blog/%E5%B1%8F%E5%B9%95%E7%95%8C%E9%9D%A2%E6%A8%A1%E5%9E%8B-%E6%A0%87%E7%AD%BE%E6%96%B0%E5%A2%9E_%E4%BF%AE%E6%94%B9%E9%A1%B5.jpg)

## 4.8 组件图

![图4.25组件图](http://github-imgs.oss-cn-beijing.aliyuncs.com/blog/%E7%BB%84%E4%BB%B6%E5%9B%BE.jpg)

## 4.9 部署图

![图4.26部署图](http://github-imgs.oss-cn-beijing.aliyuncs.com/blog/%E9%83%A8%E7%BD%B2%E5%9B%BE.jpg)

