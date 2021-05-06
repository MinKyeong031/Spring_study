package kr.hs.study.main;

import java.util.List;
import java.util.Scanner;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import kr.hs.study.config.JavaConfig;
import kr.hs.study.dao.ProductDAO;
import kr.hs.study.dto.ProductDTO;

public class MainClass {

	static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		int choice;
		System.out.println("---------- MK 물류관리 시스템 ----------");
		System.out.println("선택 가능한 기능(0은 종료)");
		System.out.println("1. 상품 추가 / 2. 창고 위치 변경 / 3. 상품 재고 및 가격 변경 / 4. 상품 삭제 / 5. 상품 조회");

		System.out.println("\n=====================================");
		System.out.print("선택할 기능 : ");
		choice = scan.nextInt();
		
		while(choice != 0 ) {
			switch(choice) {
			case 1:
				System.out.println("1번 '상품 추가' 선택!\n");
				InsertPro();
				break;
			case 2:
				System.out.println("2번 '창고 위치 변경' 선택!\n");
				UpdatePlaceNLoca();
				break;
			case 3:
				System.out.println("3번 '상품 재고 및 가격 변경' 선택!\n");
				UpdatePriceNStock();
				break;
			case 4:
				System.out.println("4번 '상품 삭제' 선택!\n");
				DeletePro();
				break;
			case 5:
				System.out.println("5번 '상품 조회' 선택!\n");
				ShowPro();
				break;
			default:
				System.out.println("입력 오류 다시 입력 해주세요.\n");	
			}
			
			System.out.println("=====================================");
			System.out.print("선택할 기능 : ");
			choice = scan.nextInt();
		}
		System.out.println("\n---------- MK 물류관리 시스템이 종료되었습니다. ----------");
	}

	private static void ShowPro() {		
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(JavaConfig.class);
		ProductDAO dao = ctx.getBean(ProductDAO.class);
		List<ProductDTO> list = dao.select_product();
		
		for(ProductDTO dto : list) {
			System.out.println("상품 이름 : " + dto.getPname() + ", 창고 : " + dto.getPlace() + ", 위치 : " + dto.getLoca() + ", 재고 : " + dto.getPcnt() + ", 금액 : " + dto.getPprice() + ", 총 금액 : " + dto.getSprice());
		}
		
		System.out.println();
		
		ctx.close();
	}

	private static void DeletePro() {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(JavaConfig.class);
		ProductDAO dao = ctx.getBean(ProductDAO.class);
		ProductDTO dto = ctx.getBean(ProductDTO.class);
		
		System.out.print("상품 이름, 창고, 위치 : ");
		String pname = scan.next();
		String place = scan.next();
		String loca = scan.next();
		
		dto.setPname(pname);
		dto.setPlace(place);
		dto.setLoca(loca);
		dao.delete_product(dto);

		System.out.println("\n상품 " + pname + "이 삭제 되었습니다.\n");
		
		ctx.close();
	}

	private static void UpdatePriceNStock() {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(JavaConfig.class);
		ProductDAO dao = ctx.getBean(ProductDAO.class);
		ProductDTO dto = ctx.getBean(ProductDTO.class);
		
		System.out.print("상품 이름, 재고, 가격 : ");
		String pname = scan.next();
		int pcnt = scan.nextInt();
		int pprice = scan.nextInt();
		
		dto.setPname(pname);
		dto.setPcnt(pcnt);
		dto.setPprice(pprice);
		dto.setSprice(pprice, pcnt);
		dao.update_priceNstock(dto);

		System.out.println("\n상품 " + pname + "이 수정 되었습니다.\n");

		ctx.close();
	}

	private static void UpdatePlaceNLoca() {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(JavaConfig.class);
		ProductDAO dao = ctx.getBean(ProductDAO.class);
		ProductDTO dto = ctx.getBean(ProductDTO.class);

		System.out.print("상품 이름, 창고 위치, 구역 : ");
		String pname = scan.next();
		String place = scan.next();
		String loca = scan.next();
		
		dto.setPname(pname);
		dto.setPname(pname);
		dto.setPlace(place);
		dto.setLoca(loca);
		dao.update_placeNloca(dto);

		System.out.println("\n상품 " + pname + "이 수정 되었습니다.\n");
		
		ctx.close();
	}

	private static void InsertPro() {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(JavaConfig.class);
		ProductDAO dao = ctx.getBean(ProductDAO.class);
		ProductDTO dto = ctx.getBean(ProductDTO.class);
		
		System.out.print("상품 이름, 창고, 위치, 재고, 가격 : ");
		String pname = scan.next();
		String place = scan.next();
		String loca = scan.next();
		int pcnt = scan.nextInt();
		int pprice = scan.nextInt();
		
		dto.setPname(pname);
		dto.setPlace(place);
		dto.setLoca(loca);
		dto.setPcnt(pcnt);
		dto.setPprice(pprice);
		dto.setSprice(pprice, pcnt);
		dao.insert_product(dto);

		System.out.println("\n상품 " + pname + "이 추가 되었습니다.\n");
		
		ctx.close();
	}
}
