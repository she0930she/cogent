package com.cogent.batch65_SpringBootThree.DAO_repo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Repository;


@Repository
@PropertySource("classpath:oracledatabase.properties")
public class MyRepo {
	
	
	@Value("true")
	boolean defaultBoolean;

	@Value("10")
	int info;
	
	 @Value("${db.port}")  //New
	    private String portno;
	    

	public int disp() {
		System.out.println("port number read is "+portno);
		return info;
	}
	


	
	

}
