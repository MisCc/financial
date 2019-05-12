package com.imooc.manager.error;

import org.springframework.boot.autoconfigure.web.ErrorProperties;
import org.springframework.boot.autoconfigure.web.servlet.error.ErrorViewResolver;
import org.springframework.boot.web.servlet.error.ErrorAttributes;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

/**
 * 错误处理相关配置
 */
@Configuration
public class ErrorConfiguration {

    @Bean
    public MyErrorController basicErrorController(
            ErrorAttributes errorAttributes,
            ErrorProperties errorProperties,
            List<ErrorViewResolver> errorViewResolvers) {
        return new MyErrorController(errorAttributes,errorProperties,errorViewResolvers);

    }
    @Bean
    public ErrorProperties basicErrorController() {
        return new ErrorProperties();

    }
}
