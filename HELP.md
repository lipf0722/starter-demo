# Getting Started

### Reference Documentation
For further reference, please consider the following sections:

* [Official Apache Maven documentation](https://maven.apache.org/guides/index.html)

@ConditionalOnBean:容器中有指定的Bean 
@ConditionalOnClass：当类路径下有指定的类
@ConditionalOnExpression:基于SpEL表达式作为判断条件  
@ConditionalOnJava:基于JVM版本作为判断条件  
@ConditionalOnJndi:在JNDI存在的条件下查找指定的位置  
@ConditionalOnMissingBean:当容器中没有指定Bean的情况下  
@ConditionalOnMissingClass:当类路径下没有指定的类
@ConditionalOnNotWebApplication:当前项目不是Web项目
@ConditionalOnProperty:配置文件中指定的属性是否有指定的值  
@ConditionalOnResource:类路径下是否有指定的资源  
@ConditionalOnSingleCandidate:当指定Bean在容器中只有一个，或者虽然有多个但是指定首选Bean
@ConditionalOnWebApplication:当前项目是Web项目的条件下

