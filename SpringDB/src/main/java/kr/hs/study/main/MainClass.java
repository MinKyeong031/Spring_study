package kr.hs.study.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import kr.hs.study.config.JavaConfig;
import kr.hs.study.dao.LoginDAO;
import kr.hs.study.dto.LoginDTO;

public class MainClass {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(JavaConfig.class);

		LoginDAO dao = ctx.getBean(LoginDAO.class);
		LoginDTO dto = ctx.getBean(LoginDTO.class);
		dto.setUserid("testmk");
		dto.setUserpass(123456);	
		dao.insert_data(dto);
		
		ctx.close();
	}
	
}
