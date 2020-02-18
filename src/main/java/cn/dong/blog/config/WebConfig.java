package cn.dong.blog.config;

import cn.dong.blog.interceptor.LoginInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * 配置类
 *
 * @author : Dong
 * @date : 2019/11/24 11:56
 */
@Configuration
public class WebConfig implements WebMvcConfigurer {

    /**
     * 把那个私人的登陆拦截器注册到拦截器的官方组织里
     *
     * @param registry
     */
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new LoginInterceptor())
                .addPathPatterns("/admin/**")
                .excludePathPatterns("/admin")
                .excludePathPatterns("/admin/login");
    }
}
