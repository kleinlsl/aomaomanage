package edu.xja.config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @project: aomaomanage
 * @description: https://blog.csdn.net/qq1043197615/article/details/83719856
 * @author: dell
 * @date: 2020/6/25 - 13:53
 * @version: 1.0
 * @website: http://localhost:8080/aomaomanage/swagger-ui.html
 */

@Configuration
@EnableSwagger2
public class Swagger2Config {

    @Bean
    public Docket createRestApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .select()
                //为当前包路径
                .apis(RequestHandlerSelectors.basePackage("edu.xja.controller"))
                .paths(PathSelectors.any())
                .build();
    }
    //构建 api文档的详细信息函数
    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                //页面标题
                .title("SSM集成Swagger2构建RESTful API")
                //创建人
                .contact(new Contact("12组", "https://gitee.com/kleinlsl/aomaomanage", "2445859460@qq.com"))
                //版本号
                .version("1.9")
                //描述
                .description("演示系统API描述")
                .build();
    }
}

