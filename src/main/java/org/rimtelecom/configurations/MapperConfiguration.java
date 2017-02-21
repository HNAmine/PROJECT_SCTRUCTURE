package org.rimtelecom.configurations;

import org.dozer.DozerBeanMapper;
import org.dozer.Mapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MapperConfiguration {

	@Bean
	public Mapper dozerBeanMapper() {
		return new DozerBeanMapper();
	}

}
