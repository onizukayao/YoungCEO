/**
 * 
 */
package com.unicom.ceo.app;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * @ClassName:	app
 * 	  @author:	ink
 *		@Desc:	
 * 		@Date:	2018年10月21日 下午4:37:06
 */
@SpringBootApplication
@ComponentScan(basePackages={"com.unicom.ceo.controller", "com.unicom.ceo.service"})
@MapperScan(value="com.unicom.ceo.mapper")
public class app {

	public static void main(String[] args) {
		SpringApplication.run(app.class, args);
	}
}
