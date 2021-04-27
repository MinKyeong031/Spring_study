package kr.hs.study.main;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import kr.hs.study.config.JavaConfig;
import kr.hs.study.dao.LoginDAO;
import kr.hs.study.dto.LoginDTO;

public class MainClass {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(JavaConfig.class);

		LoginDAO dao = ctx.getBean(LoginDAO.class);
//		LoginDTO bean1 = ctx.getBean(LoginDTO.class);
//		bean1.setUserid("kim");
//		bean1.setUserpass(1111);	
//		dao.insert_data(bean1);
//		System.out.println("입력완료");
		
//		LoginDTO bean2 = ctx.getBean(LoginDTO.class);
//		bean2.setUserid("kim");
//		bean2.setUserpass(2222);
//		dao.update_data(bean2);
//		System.out.println("수정완료");
		
//		LoginDTO bean3 = ctx.getBean(LoginDTO.class);
//		bean3.setUserid("kim");
//		bean3.setUserpass(2222);
//		dao.delete_data(bean3);
//		System.out.println("삭제완료");
		
		List<LoginDTO> list = dao.select_data();
		for(LoginDTO dto : list) {
			System.out.println(dto.getUserid());
			System.out.println(dto.getUserpass());
		}
		
		ctx.close();
	}
	
}
