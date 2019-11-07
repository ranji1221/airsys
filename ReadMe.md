1.分页框架：
	100个
	分页更加简单，我们做到不需要程序员写一行，就很好的实现分页效果
需求：
      程序员 
   class UserService{
        @Pager
   		public List<User> findAll(){}
   }
     框架能够自动分页 
      	标注和AOP : 写标注和切面来实现这个框架
     目标：
          就是让程序员只关注自己该做的事情，若想分页的话就加几个简单标注就行 
          线程池     
 2. MiniPager框架
       100元买个服务器（香港、美国）
       MiniPager
       Jquery.js  
       Vue.js
       Hibernate :  持久化  servlet  2年   WPS(1月)
     目标：
      (1) 使用标注来实现分页
      (2) 解放程序员编写重复的分页代码
      (3) 纯的Dao代码
       实现：
               分析：以结果为导向去分析，或者以程序员用例来分析
        UserDao
           List<User> findAll();
           @MiniPager(tableName="t_user")   => Pager<User>
           List<User> findPaged(int offset, int pageSize){
           		return jdbcTemlate.query(
           			"select * from user limit ?,?"
           			new Object[]{offset,pageSize});
           }                      
        编写步骤：
      (1). 编写自定义标注
           @MiniPager : 至少应该有个表名属性
      (2). 编写切面：(核心框架代码)
           a. 配置类中启动AOP的功能
              @EnableAspectJAutoProxy
              @ComponentScan({"dao","service","util"})
           b. 编写自定义切面：
              util: PagerAspect (分页切面)
              @Aspect
			  @Component
              class PagerAspect{}
           c. 自定义切面中的切点：
           	  //-- 检测service包及子包下的所有方法 	
              @Pointcut("execution(* service..*(..))")  
			  public void selfPointcut(){}
		   d. 自定义通知 (AroundAdvice)
		      @Around("selfPointcut()")
			  public List aroundAdvice(ProceedingJoinPoint jp){
			  		System.out.println("hello pager");
			  		jp.proceed();
			  		return null;
			  }
			  测试：只要是调用service包下的类的方法，都应该输出hello pager这句话。
		   e. 编写通知体里面的核心代码 (实现通用分页的核心代码)
		      i. 只有在加入@MinPager标注的方法上实现拦截功能
		               思路： 
		               拿到被调用的方法对象Method对象，然后判断该方法上有没有@MiniPager标注
		               若有就加入切面功能，否则不加。
		      ii. 这里就可以实现真正的分页逻辑
总结：
     编写的东西：
     MiniPager标注   Pager类(List)   PagerAspect类
     技术：
     Spring IOC/AOP  反射技术   标注技术   面向对象的编程思想  
     
     
  项目协同开发的步骤：
    （1). 在代码托管平台上-[新建Repository]
       github 翻墙
   (2). 在本地把自己的项目先进行初始化工作
       git init
	   git add README.md
	   git commit -m "first commit"
	   git remote add origin https://github.com/ranji1221/airsys.git
	   git push -u origin master 
		                     
		       
		   
		      
              

      