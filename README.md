# design_pattern

![design_pattern](https://img.shields.io/badge/design__pattern-YYDCYY-green)

索引: 
[design_pattern](#design_pattern)
[自述](#自述)
[背景](#背景)
[安装](#安装)
[用法](#用法)
[目录](#目录)
[ToDolist](#ToDolist)
[维护者](#维护者)
## 自述

![自述](https://img.shields.io/badge/自述-YYDCYY-green)

```
设计模式是解决问题的方案，学习现有的设计模式可以做到经验复用。拥有设计模式词汇，在沟通时就能用更少的词汇来讨论，并且不需要了解底层细节
```

## 背景

![背景](https://img.shields.io/badge/背景-YYDCYY-yellowgreen)

该项目优点：

> 
>
> 1. 24 中设计模式, 并按照三种类型分类, 便于查找
> 2. 用例选择简明, 避免"冗长"代码例子, 重点关注阐述设计模式思想
> 3. 每种设计模式案例皆可直接运行查看结果. 避免空讲理论不知所云.
> 4. 注解详实, 编写前明确任务目标, 便于实施和复习.



文档说明:  每种"设计模式"皆由如下几部分组成.

"Intent" : 该设计模式定义

"Class Diagram" : 该设计模式类图

"Implementation" : 该设计模式代码实现

"JDK" : Java 开发工具包中该设计模式经典应用.

## 安装

![https://img.shields.io/badge/%E5%AE%89%E8%A3%85-YYDCYY-red](https://img.shields.io/badge/安装-YYDCYY-red)

环境 JDK1.8. 操作系统无要求( Java 跨平台嘛 ),编译器无要求 

笔者在 MAC 下 IDEA2019 版本, JDK1.8 环境 测试无误. 

## 用法

![https://img.shields.io/badge/%E7%94%A8%E6%B3%95-YYDCYY-lightgrey](https://img.shields.io/badge/用法-YYDCYY-lightgrey)

使用说明 : 无论 Windows / MAC / DeepIn OS 等, 无论是 IDEA / Eclipse 等编译器, 在 DownLoad 该项目后, 在cn.yydcyy.design 包下找到想验证的设计模式,  运行对应 Client.java 即可查看结果.

## 目录

![https://img.shields.io/badge/%E7%9B%AE%E5%BD%95-YYDCYY-blue](https://img.shields.io/badge/目录-YYDCYY-blue)

### 一、创建型

#### 1. 单例

#### 2. 简单工厂

##### Intent

在创建一个对象时不向客户暴露内部细节，并提供一个创建对象的通用接口。

##### Class Diagram

简单工厂把实例化的操作单独放到一个类中，这个类就成为简单工厂类，让简单工厂类来决定应该用哪个具体子类来实例化。

这样做能把客户类和具体子类的实现解耦，客户类不再需要知道有哪些子类以及应当实例化哪个子类。客户类往往有多个，如果不使用简单工厂，那么所有的客户类都要知道所有子类的细节。而且一旦子类发生改变，例如增加子类，那么所有的客户类都要进行修改。



![img](http://qin.yydcyy.top/Typora/2019-12-07-041746.png)

##### Implementation



![img](http://qin.yydcyy.top/Typora/2019-12-07-41750.png)

#### 3. 工厂方法 Factory Method

##### Intent

定义了一个创建对象的接口，但由子类决定要实例化哪个类。工厂方法把实例化操作推迟到子类。

##### Class Diagram

- 在简单工厂中，创建对象的是另一个类，而在工厂方法中，是由子类来创建对象。

- 下图中，Factory 有一个 doSomething() 方法，这个方法需要用到一个产品对象，这个产品对象由 factoryMethod() 方法创建。该方法是抽象的，需要由子类去实现。

- 

	![img](http://qin.yydcyy.top/Typora/2019-12-07-041739.png)

##### Implementation



![img](http://qin.yydcyy.top/Typora/2019-12-07-041756.png)

JDK

java.util.Calendar

- http://docs.oracle.com/javase/8/docs/api/java/util/Calendar.html#getInstance--

java.util.ResourceBundle

- # http://docs.oracle.com/javase/8/docs/api/java/util/ResourceBundle.html#getBundle-java.lang.String-

java.text.NumberFormat

- http://docs.oracle.com/javase/8/docs/api/java/text/NumberFormat.html#getInstance--

java.nio.charset.Charset

- http://docs.oracle.com/javase/8/docs/api/java/nio/charset/Charset.html#forName-java.lang.String-

java.net.URLStreamHandlerFactory

- http://docs.oracle.com/javase/8/docs/api/java/net/URLStreamHandlerFactory.html#createURLStreamHandler-java.lang.String-

java.util.EnumSet

- https://docs.oracle.com/javase/8/docs/api/java/util/EnumSet.html#of-E-

javax.xml.bind.JAXBContext

- https://docs.oracle.com/javase/8/docs/api/javax/xml/bind/JAXBContext.html#createMarshaller--

#### 4. 抽象工厂

##### Intent

- 提供一个接口，用于创建 相关的对象家族 。

##### Class Diagram

- **抽象工厂模式创建的是对象家族，也就是很多对象而不是一个对象，并且这些对象是相关的，也就是说必须一起创建出来**。而工厂方法模式只是用于创建一个对象，这和抽象工厂模式有很大不同。

- 抽象工厂模式用到了工厂方法模式来创建单一对象，AbstractFactory 中的 createProductA() 和 createProductB() 方法都是让子类来实现，这两个方法单独来看就是在创建一个对象，这符合工厂方法模式的定义。

- 至于创建对象的家族这一概念是在 Client 体现，Client 要通过 AbstractFactory 同时调用两个方法来创建出两个对象，在这里这两个对象就有很大的相关性，Client 需要同时创建出这两个对象。

- 从高层次来看，抽象工厂使用了组合，即 Cilent 组合了 AbstractFactory，而工厂方法模式使用了继承。

- 

	![img](http://qin.yydcyy.top/Typora/2019-12-07-41741.png)

##### Implementation

- 

	![img](http://qin.yydcyy.top/Typora/2019-12-07-041757.png)

- JDK

	- javax.xml.parsers.DocumentBuilderFactory
		- http://docs.oracle.com/javase/8/docs/api/javax/xml/parsers/DocumentBuilderFactory.html
	- javax.xml.transform.TransformerFactory
		- http://docs.oracle.com/javase/8/docs/api/javax/xml/transform/TransformerFactory.html#newInstance--
	- javax.xml.xpath.XPathFactory
		- http://docs.oracle.com/javase/8/docs/api/javax/xml/xpath/XPathFactory.html#newInstance--

#### 5. 生成器

##### Intent

- 封装一个对象的构造过程，并允许按步骤构造。

##### Class Diagram

- 

	![img](http://qin.yydcyy.top/Typora/2019-12-07-041744.png)

##### Implementation

- 以下是一个简易的 StringBuilder 实现，参考了 JDK 1.8 源码。

	![img](http://qin.yydcyy.top/Typora/2019-12-07-41747.png)

##### JDK

- java.lang.StringBuilder
	-  http://docs.oracle.com/javase/8/docs/api/java/lang/StringBuilder.html
- java.nio.ByteBuffer
	- \# http://docs.oracle.com/javase/8/docs/api/java/nio/ByteBuffer.html#put-byte-
- java.lang.StringBuffer
	- \# http://docs.oracle.com/javase/8/docs/api/java/lang/StringBuffer.html#append-boolean-
- java.lang.Appendable
	- \# http://docs.oracle.com/javase/8/docs/api/java/lang/Appendable.html
- Apache Camel builders
	- \# https://github.com/apache/camel/tree/0e195428ee04531be27a0b659005e3aa8d159d23/camel-core/src/main/java/org/apache/camel/builder

#### 6. 原型模式

##### Intent

- 使用原型实例指定要创建对象的类型，通过复制这个原型来创建新对象。
- [ 原型模式涉及"深浅复制"概念, 具体是深复制还是浅复制, 看自己业务逻辑实现 ]

##### Class Diagram

- 

	![img](http://qin.yydcyy.top/Typora/2019-12-07-041750.png)

#####Implementation

- 

	![img](http://qin.yydcyy.top/Typora/2019-12-07-041752.png)

##### JDK

- java.lang.Object#clone()
	- \# [http://docs.oracle.com/javase/8/docs/api/java/lang/Object.html#clone%28%29](http://docs.oracle.com/javase/8/docs/api/java/lang/Object.html#clone())

### 二、行为型

#### 1. 责任链 Chain Of Responsibility

#####Intent

- 使多个对象都有机会处理请求，从而避免请求的发送者和接收者之间的耦合关系。将这些对象连成一条链，并沿着这条链发送该请求，直到有一个对象处理它为止。

##### Class Diagram

- Handler：定义处理请求的接口，并且实现后继链（successor）

##### UML

- 

	![img](https://img.mubu.com/document_image/c9523bde-1dda-49f6-af37-9d556d2f3484-4484563.jpg)

##### 实现

- 

	![img](http://qin.yydcyy.top/Typora/2019-12-07-041803.png)

##### JDK

- java.util.logging.Logger#log()
	- \# [http://docs.oracle.com/javase/8/docs/api/java/util/logging/Logger.html#log%28java.util.logging.Level,%20java.lang.String%29](http://docs.oracle.com/javase/8/docs/api/java/util/logging/Logger.html#log(java.util.logging.Level, java.lang.String))
- Apache Commons Chain
	- \# https://commons.apache.org/proper/commons-chain/index.html
- javax.servlet.Filter#doFilter()
	- \# http://docs.oracle.com/javaee/7/api/javax/servlet/Filter.html#doFilter-javax.servlet.ServletRequest-javax.servlet.ServletResponse-javax.servlet.FilterChain-

#### 2. 命令

#####Intent

- 将命令封装成对象中，具有以下作用：
	- 使用命令来参数化其它对象
	- 将命令放入队列中进行排队
	- 将命令的操作记录到日志中
	- 支持可撤销的操作

#####Class Diagram

- Command：命令

- Receiver：命令接收者，也就是命令真正的执行者

- Invoker：通过它来调用命令

- Client：可以设置命令与命令的接收者

- 

	![img](http://qin.yydcyy.top/Typora/2019-12-07-41753.png)

#####Implementation

- 设计一个遥控器，可以控制电灯开关。

- 

	![img](http://qin.yydcyy.top/Typora/2019-12-07-041738.png)

#####JDK

- java.lang.Runnable
	- http://docs.oracle.com/javase/8/docs/api/java/lang/Runnable.html
- Netflix Hystrix
	- https://github.com/Netflix/Hystrix/wiki
- javax.swing.Action
	- http://docs.oracle.com/javase/8/docs/api/javax/swing/Action.html

#### 3. 解释器

#####Intent

- 为语言创建解释器，通常由语言的**语法和语法**分析来定义。

#####Class Diagram

- TerminalExpression：终结符表达式，每个终结符都需要一 个TerminalExpression。

- Context：上下文，包含解释器之外的一些全局信息。

- 

	![img](https://img.mubu.com/document_image/5797353e-bdfc-421e-81e9-d2b264909f61-4484563.jpg)

#####Implementation

- 以下是一个规则检验器实现，具有 and 和 or 规则，通过规则可以构建一颗解析树，用来检验一个文本是否满足解析树定义的规则。

- 例如一颗解析树为 D And (A Or (B C))，文本 "D A" 满足该解析树定义的规则。

- 这里的 Context 指的是 String。

- 

	![img](http://qin.yydcyy.top/Typora/2019-12-07-41735.png)

#####JDK

java.util.Pattern

- http://docs.oracle.com/javase/8/docs/api/java/util/regex/Pattern.html

java.text.Normalizer

- http://docs.oracle.com/javase/8/docs/api/java/text/Normalizer.html

All subclasses of java.text.Format

- http://docs.oracle.com/javase/8/docs/api/java/text/Format.html

javax.el.ELResolver

- http://docs.oracle.com/javaee/7/api/javax/el/ELResolver.html

####4. 迭代器

#####Intent

提供一种顺序访问聚合对象元素的方法，并且不暴露聚合对象的内部表示。

Class Diagram

- Aggregate 是聚合类，其中 createIterator() 方法可以产生一个 Iterator；

- Iterator 主要定义了 hasNext() 和 next() 方法。

- Client 组合了 Aggregate，为了迭代遍历 Aggregate，也需要组合 Iterator。

- 

	![img](https://img.mubu.com/document_image/ebba064d-193b-4e06-9ea2-bf604253ecda-4484563.jpg)

##### Implementation

- 

	![img](http://qin.yydcyy.top/Typora/2019-12-07-041802.png)

##### JDK

java.util.Iterator

- http://docs.oracle.com/javase/8/docs/api/java/util/Iterator.html

java.util.Enumeration

- http://docs.oracle.com/javase/8/docs/api/java/util/Enumeration.html

#### 5. 中介者

##### Intent

- 集中相关对象之间复杂的沟通和控制方式。

##### Class Diagram

- Mediator：中介者，定义一个接口用于与各同事（Colleague）对象通信。

- Colleague：同事，相关对象

- 

	![img](http://qin.yydcyy.top/Typora/2019-12-07-041758.png)

##### Implementation

- Alarm（闹钟）、CoffeePot（咖啡壶）、Calendar（日历）、Sprinkler（喷头）是一组相关的对象，在某个对象的事件产生时需要去操作其它对象，形成了下面这种依赖结构：

	- 

		![img](http://qin.yydcyy.top/Typora/2019-12-07-41802.png)

- **使用中介者模式可以将复杂的依赖结构变成星形结构：**

	- 

		![img](http://qin.yydcyy.top/Typora/2019-12-07-041747.png)

- 

	![img](http://qin.yydcyy.top/Typora/2019-12-07-41738.png)

##### JDK

- All scheduleXXX() methods of java.util.Timer
	- http://docs.oracle.com/javase/8/docs/api/java/util/Timer.html
- java.util.concurrent.Executor#execute()
	- http://docs.oracle.com/javase/8/docs/api/java/util/concurrent/Executor.html#execute-java.lang.Runnable-
- submit() and invokeXXX() methods of java.util.concurrent.ExecutorService
	- http://docs.oracle.com/javase/8/docs/api/java/util/concurrent/ExecutorService.html
- scheduleXXX() methods of java.util.concurrent.ScheduledExecutorService
	- http://docs.oracle.com/javase/8/docs/api/java/util/concurrent/ScheduledExecutorService.html
- java.lang.reflect.Method#invoke()
	- http://docs.oracle.com/javase/8/docs/api/java/lang/reflect/Method.html#invoke-java.lang.Object-java.lang.Object...-

#### 6. 备忘录

##### Intent

- 在不违反封装的情况下获得对象的内部状态，从而在需要时可以将对象恢复到最初状态。

##### Class Diagram

- Originator：原始对象

- Caretaker：负责保存好备忘录

- Menento：备忘录，存储原始对象的的状态。备忘录实际上有两个接口，一个是提供给 Caretaker 的窄接口：它只能将备忘录传递给其它对象；一个是提供给 Originator 的宽接口，允许它访问到先前状态所需的所有数据。理想情况是只允许 Originator 访问本备忘录的内部状态。

- 

	![img](https://img.mubu.com/document_image/2f5bd9b7-cd54-407a-82fa-23d57a68ffca-4484563.jpg)

##### Implementation

- 以下实现了一个简单计算器程序，可以输入两个值，然后计算这两个值的和。备忘录模式允许将这两个值存储起来，然后在某个时刻用存储的状态进行恢复。

- 

	![img](http://qin.yydcyy.top/Typora/2019-12-07-041754.png)

#### 7. 观察者

##### Intent

- 定义对象之间的一对多依赖，当一个对象状态改变时，它的所有依赖都会收到通知并且自动更新状态。

- 主题（Subject）是被观察的对象，而其所有依赖者（Observer）称为观察者。

- 

	![img](http://qin.yydcyy.top/Typora/2019-12-07-041804.png)

##### Class Diagram

主题（Subject）具有注册和移除观察者、并通知所有观察者的功能，主题是通过维护一张观察者列表来实现这些操作的。

- 观察者（Observer）的注册功能需要调用主题的 registerObserver() 方法。

- 

	![img](http://qin.yydcyy.top/Typora/2019-12-07-041742.png)

##### Implementation

- 天气数据布告板会在天气信息发生改变时更新其内容，布告板有多个，并且在将来会继续增加。

- 

	![img](https://img.mubu.com/document_image/3637ae76-77fe-413a-b5fc-32a99b4f556b-4484563.jpg)

##### JDK

- java.util.Observer
	- http://docs.oracle.com/javase/8/docs/api/java/util/Observer.html
- java.util.EventListener
	- http://docs.oracle.com/javase/8/docs/api/java/util/EventListener.html
- javax.servlet.http.HttpSessionBindingListener
	- http://docs.oracle.com/javaee/7/api/javax/servlet/http/HttpSessionBindingListener.html
- RxJava
	- https://github.com/ReactiveX/RxJava

#### 8. 状态

##### Intent

- 允许对象在内部状态改变时改变它的行为，对象看起来好像修改了它所属的类。

##### Class Diagram

- 

	![img](http://qin.yydcyy.top/Typora/2019-12-07-041743.png)

##### Implementation

- 糖果销售机有多种状态，每种状态下销售机有不同的行为，状态可以发生转移，使得销售机的行为也发生改变。

- 

	![img](http://qin.yydcyy.top/Typora/2019-12-07-041753.png)

- 

	![img](http://qin.yydcyy.top/Typora/2019-12-07-041741.png)

#### 9. 策略

##### Intent

- 定义一系列算法，封装每个算法，并使它们可以互换。
- 策略模式可以让算法独立于使用它的客户端。

##### Class Diagram

- Strategy 接口定义了一个算法族，它们都实现了 behavior() 方法。

- Context 是使用到该算法族的类，其中的 doSomething() 方法会调用 behavior()，setStrategy(Strategy) 方法可以动态地改变 strategy 对象，也就是说能动态地改变 Context 所使用的算法。

- 

	![img](http://qin.yydcyy.top/Typora/2019-12-07-041735.png)

- 与状态模式的比较

	![img](http://qin.yydcyy.top/Typora/2019-12-07-041737.png)

	- 状态模式的类图和策略模式类似，并且都是能够动态改变对象的行为。但是状态模式是通过状态转移来改变 Context 所组合的 State 对象，而策略模式是通过 Context 本身的决策来改变组合的 Strategy 对象。所谓的状态转移，是指 Context 在运行过程中由于一些条件发生改变而使得 State 对象发生改变，注意必须要是在运行过程中。
	- 状态模式主要是用来解决状态转移的问题，当状态发生转移了，那么 Context 对象就会改变它的行为；而策略模式主要是用来封装一组可以互相替代的算法族，并且可以根据需要动态地去替换 Context 使用的算法。

	##### Implementation

	- 设计一个鸭子，它可以动态地改变叫声。这里的算法族是鸭子的叫声行为。

	- 

		![img](http://qin.yydcyy.top/Typora/2019-12-07-041736.png)

	##### JDK

	- java.util.Comparator#compare()
	- javax.servlet.http.HttpServlet
	- javax.servlet.Filter#doFilter()

#### 10. 模板方法

##### Intent

- 定义算法框架，并将一些步骤的实现延迟到子类。
- 通过模板方法，子类可以重新定义算法的某些步骤，而不用改变算法的结构。

##### Class Diagram

- 

	![img](http://qin.yydcyy.top/Typora/2019-12-07-041751.png)

##### Implementation

- 冲咖啡和冲茶都有类似的流程，但是某些步骤会有点不一样，要求复用那些相同步骤的代码。

- 

	![img](http://qin.yydcyy.top/Typora/2019-12-07-41759.png)

- 

	![img](http://qin.yydcyy.top/Typora/2019-12-07-41805.png)

##### JDK

- java.util.Collections#sort()
- java.io.InputStream#skip()
- java.io.InputStream#read()
- java.util.AbstractList#indexOf()

#### 11. 访问者 **[ 不懂 ]**

##### Intent

为一个对象结构（比如组合结构）增加新能力。

##### Class Diagram

- Visitor：访问者，为每一个 ConcreteElement 声明一个 visit 操作

- ConcreteVisitor：具体访问者，存储遍历过程中的累计结果

- ObjectStructure：对象结构，可以是组合结构，或者是一个集合。

- 

	![img](http://qin.yydcyy.top/Typora/2019-12-07-041748.png)

##### Implementation



![img](http://qin.yydcyy.top/Typora/2019-12-07-041800.png)

##### JDK

- javax.lang.model.element.Element and javax.lang.model.element.ElementVisitor
- javax.lang.model.type.TypeMirror and javax.lang.model.type.TypeVisitor

#### 12. 空对象

##### Intent

- 使用什么都不做
- 的空对象来代替 NULL。
- 一个方法返回 NULL，意味着方法的调用端需要去检查返回值是否是 NULL，这么做会导致非常多的冗余的检查代码。并且如果某一个调用端忘记了做这个检查返回值，而直接使用返回的对象，那么就有可能抛出空指针异常。

##### Class Diagram

- 

	![img](http://qin.yydcyy.top/Typora/2019-12-07-041755.png)

##### Implementation

### 三、结构型

#### 1. 适配器

##### Intent

- 把一个类接口转换成另一个用户需要的接口。

- 

	![img](http://qin.yydcyy.top/Typora/2019-12-07-41744.png)

##### Class Diagram

- 

	![img](http://qin.yydcyy.top/Typora/2019-12-07-041740.png)

##### Implementation

- 鸭子（Duck）和火鸡（Turkey）拥有不同的叫声，Duck 的叫声调用 quack() 方法，而 Turkey 调用 gobble() 方法。
- 要求将 Turkey 的 gobble() 方法适配成 Duck 的 quack() 方法，从而让火鸡冒充鸭子！

##### JDK

- java.util.Arrays#asList()
- java.util.Collections#list()
- java.util.Collections#enumeration()
- javax.xml.bind.annotation.adapters.XMLAdapter

#### 2. 桥接

##### Intent

- 将抽象与实现分离开来，使它们可以独立变化。

##### Class Diagram

- Abstraction：定义抽象类的接口

- Implementor：定义实现类接口

- 

	![img](http://qin.yydcyy.top/Typora/2019-12-07-041745.png)

##### Implementation

- RemoteControl 表示遥控器，指代 Abstraction。

- TV 表示电视，指代 Implementor。

- 桥接模式将遥控器和电视分离开来，从而可以独立改变遥控器或者电视的实现。

- 

	![img](http://qin.yydcyy.top/Typora/2019-12-07-41756.png)

##### JDK

- AWT (It provides an abstraction layer which maps onto the native OS the windowing support.)
- JDBC

#### 3. 组合 **[ 不懂 ]**

#### 4. 装饰

##### Intent

- 为对象动态添加功能。

##### Class Diagram

- 装饰者（Decorator）和具体组件（ConcreteComponent）都继承自组件（Component），具体组件的方法实现不需要依赖于其它对象，而装饰者组合了一个组件，这样它可以装饰其它装饰者或者具体组件。所谓装饰，就是把这个装饰者套在被装饰者之上，从而动态扩展被装饰者的功能。装饰者的方法有一部分是自己的，这属于它的功能，然后调用被装饰者的方法实现，从而也保留了被装饰者的功能。可以看到，具体组件应当是装饰层次的最低层，因为只有具体组件的方法实现不需要依赖于其它对象。

- 

	![img](http://qin.yydcyy.top/Typora/2019-12-07-041801.png)

##### Implementation

- 设计不同种类的饮料，饮料可以添加配料，比如可以添加牛奶，并且支持动态添加新配料。每增加一种配料，该饮料的价格就会增加，要求计算一种饮料的价格。

- 下图表示在 DarkRoast 饮料上新增新添加 Mocha 配料，之后又添加了 Whip 配料。DarkRoast 被 Mocha 包裹，Mocha 又被 Whip 包裹。它们都继承自相同父类，都有 cost() 方法，外层类的 cost() 方法调用了内层类的 cost() 方法。

- 

	![img](http://qin.yydcyy.top/Typora/2019-12-07-041759.png)

- 

	![img](http://qin.yydcyy.top/Typora/2019-12-07-041749.png)

##### JDK

- java.io.BufferedInputStream(InputStream)
- java.io.DataInputStream(InputStream)
- java.io.BufferedOutputStream(OutputStream)
- java.util.zip.ZipOutputStream(OutputStream)
- java.util.Collections#checkedList|Map|Set|SortedSet|SortedMap

#### 5. 外观

#### 6. 享元

#### 7. 代理




## ToDolist



## 维护者

![https://img.shields.io/badge/%E7%BB%B4%E6%8A%A4%E8%80%85-YYDCYY-orange](https://img.shields.io/badge/维护者-YYDCYY-orange)

[@YYDCYY01](https://github.com/yydcyy01)

[yydcyy@qq.com](mailto:yydcyy@qq.com)

https://blog.csdn.net/azitl
