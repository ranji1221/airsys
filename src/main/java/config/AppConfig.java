package config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.annotation.Import;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;
import org.springframework.web.servlet.view.JstlView;
import org.springframework.web.servlet.view.UrlBasedViewResolver;

/**
 * 应用配置 (Spring配置)  
 * 它相当于XML的替代者
 * @author RanJi
 *
 */
@Configuration
@ComponentScan({"dao","service","controller"})
@Import(DBConfig.class)
@EnableAspectJAutoProxy
//-- @EnableWebMvc  切记注释掉这个标注，	
public class AppConfig extends WebMvcConfigurationSupport{
	
	@Bean
	public String hello(){
		return "hello";
	}
	 
	//-- 配置JSP解析器Bean
	@Bean
    public UrlBasedViewResolver setupViewResolver() {
        UrlBasedViewResolver resolver = new UrlBasedViewResolver();
        resolver.setPrefix("/WEB-INF/");
        resolver.setSuffix(".jsp");
        resolver.setViewClass(JstlView.class);
        return resolver;
    }
	
	 /**
	 * 配置处理静态资源
	 */
    @Override
    protected void addResourceHandlers(ResourceHandlerRegistry registry) {
    	registry.addResourceHandler("/assets/**").addResourceLocations("/assets/");
    	super.addResourceHandlers(registry);
    }
}
