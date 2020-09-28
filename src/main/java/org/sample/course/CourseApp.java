package org.sample.course;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableCaching
public class CourseApp {
	public static void main(String[] args) {
		SpringApplication.run(CourseApp.class, args);
	}

	@Bean
    ModelMapper modelMapper() {
	    return new ModelMapper();
    }
}
