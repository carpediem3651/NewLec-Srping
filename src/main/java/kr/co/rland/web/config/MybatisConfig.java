package kr.co.rland.web.config;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

// myBatis Session Factory를 IoC 컨테이너에 Bean으로 설정
@Configuration
public class MybatisConfig {
	
	@Bean
	SqlSessionFactory sqlSessionFatory() {
		String resource = "mybatis-config.xml";
		InputStream inputStream;
		SqlSessionFactory sqlSessionFactory = null;
		
		try {
			inputStream = Resources.getResourceAsStream(resource);
			sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("마이바티스 세션 팩토리 생성과 콩자루에 담기");
		return sqlSessionFactory;
	}
}
