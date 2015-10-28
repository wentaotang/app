这个架子是自己平时项目所采用的架子

###用到的技术
  
  * spring
  * springmvc
  *  mybatis
  * log4jdbc-log4j(打印sql的日志)
  * jetbrick-tempalte(模板引擎)



### 各个模块的依赖关系
   
   1. app-domain 依赖于 app-util
   2. app-repository 依赖于 app-domain
   3. app-service  依赖于  app-repository
  