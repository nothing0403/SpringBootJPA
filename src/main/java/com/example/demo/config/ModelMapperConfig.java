package com.example.demo.config;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration // Springboot 啟動完成前會先進行配置
public class ModelMapperConfig {

	@Bean // 產生的物件交由 Springboot 管理
	ModelMapper modelMapper() {
		return new ModelMapper();
	}

}
