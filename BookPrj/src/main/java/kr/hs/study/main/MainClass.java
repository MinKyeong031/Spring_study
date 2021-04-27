package kr.hs.study.main;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import kr.hs.study.config.JavaConfig;
import kr.hs.study.dao.BookDAO;
import kr.hs.study.dto.BookDTO;

public class MainClass {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(JavaConfig.class);

		BookDAO dao = ctx.getBean(BookDAO.class);
		
//		BookDTO bean1 = ctx.getBean(BookDTO.class);
//		bean1.setTitle("사학루등");
//		bean1.setAuthor("강하늘");
//		bean1.setPrice(999999);
//		bean1.setEmail("luciper@gmail.com");
//		dao.insert_data(bean1);
//		System.out.println("입력완료");
		
//		BookDTO bean2 = ctx.getBean(BookDTO.class);
//		bean2.setTitle("사학루등");
//		bean2.setAuthor("강스카이");
//		bean2.setPrice(1000000);
//		bean2.setEmail("fntlvj@gmail.com");
//		dao.update_data(bean2);
//		System.out.println("수정완료");
		
//		BookDTO bean3 = ctx.getBean(BookDTO.class);
//		bean3.setTitle("사학루등");
//		bean3.setAuthor("강스카이");
//		bean3.setPrice(1000000);
//		bean3.setEmail("fntlvj@gmail.com");
//		dao.delete_data(bean3);
//		System.out.println("삭제완료");
		
		List<BookDTO> list = dao.select_data();
		for(BookDTO dto : list) {
			System.out.println(dto.getTitle());
			System.out.println(dto.getAuthor());
			System.out.println(dto.getPrice());
			System.out.println(dto.getEmail());
		}
		
		ctx.close();
	}
	
}
