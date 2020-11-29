package com.example.demo.config;

import java.util.ArrayList;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import  springfox.documentation.service.Contact ;
import  springfox.documentation.service.VendorExtension ;
import springfox.documentation.spring.web.plugins.Docket;
import static  springfox.documentation.builders.PathSelectors.regex ;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig {
    
	@Bean
    public Docket api() {
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.basePackage ( "com.example.demo" ))
                .paths(regex("/api.*"))
                .build().apiInfo(metaInfo());
    }
	
	private  ApiInfo  metaInfo () {

        ApiInfo apiInfo =  new  ApiInfo (
                "Cadastro de demandas" ,
                " API REST de Cadastro de demandas" ,
                " 1.0 " ,
                " Termos de Serviço " ,
                new  Contact ( "Rafael Campos" , "-" ,
                        "rafaelfiap@fiap.com" ),
                "-" ,
                "-" , new  ArrayList < VendorExtension > ()
        );

        return apiInfo;
    }
}