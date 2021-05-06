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
		System.out.println("---------- MK �������� �ý��� ----------");
		System.out.println("���� ������ ���(0�� ����)");
		System.out.println("1. ��ǰ �߰� / 2. â�� ��ġ ���� / 3. ��ǰ ��� �� ���� ���� / 4. ��ǰ ���� / 5. ��ǰ ��ȸ");

		System.out.println("\n=====================================");
		System.out.print("������ ��� : ");
		choice = scan.nextInt();
		
		while(choice != 0 ) {
			switch(choice) {
			case 1:
				System.out.println("1�� '��ǰ �߰�' ����!\n");
				InsertPro();
				break;
			case 2:
				System.out.println("2�� 'â�� ��ġ ����' ����!\n");
				UpdatePlaceNLoca();
				break;
			case 3:
				System.out.println("3�� '��ǰ ��� �� ���� ����' ����!\n");
				UpdatePriceNStock();
				break;
			case 4:
				System.out.println("4�� '��ǰ ����' ����!\n");
				DeletePro();
				break;
			case 5:
				System.out.println("5�� '��ǰ ��ȸ' ����!\n");
				ShowPro();
				break;
			default:
				System.out.println("�Է� ���� �ٽ� �Է� ���ּ���.\n");	
			}
			
			System.out.println("=====================================");
			System.out.print("������ ��� : ");
			choice = scan.nextInt();
		}
		System.out.println("\n---------- MK �������� �ý����� ����Ǿ����ϴ�. ----------");
	}

	private static void ShowPro() {		
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(JavaConfig.class);
		ProductDAO dao = ctx.getBean(ProductDAO.class);
		List<ProductDTO> list = dao.select_product();
		
		for(ProductDTO dto : list) {
			System.out.println("��ǰ �̸� : " + dto.getPname() + ", â�� : " + dto.getPlace() + ", ��ġ : " + dto.getLoca() + ", ��� : " + dto.getPcnt() + ", �ݾ� : " + dto.getPprice() + ", �� �ݾ� : " + dto.getSprice());
		}
		
		System.out.println();
		
		ctx.close();
	}

	private static void DeletePro() {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(JavaConfig.class);
		ProductDAO dao = ctx.getBean(ProductDAO.class);
		ProductDTO dto = ctx.getBean(ProductDTO.class);
		
		System.out.print("��ǰ �̸�, â��, ��ġ : ");
		String pname = scan.next();
		String place = scan.next();
		String loca = scan.next();
		
		dto.setPname(pname);
		dto.setPlace(place);
		dto.setLoca(loca);
		dao.delete_product(dto);

		System.out.println("\n��ǰ " + pname + "�� ���� �Ǿ����ϴ�.\n");
		
		ctx.close();
	}

	private static void UpdatePriceNStock() {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(JavaConfig.class);
		ProductDAO dao = ctx.getBean(ProductDAO.class);
		ProductDTO dto = ctx.getBean(ProductDTO.class);
		
		System.out.print("��ǰ �̸�, ���, ���� : ");
		String pname = scan.next();
		int pcnt = scan.nextInt();
		int pprice = scan.nextInt();
		
		dto.setPname(pname);
		dto.setPcnt(pcnt);
		dto.setPprice(pprice);
		dto.setSprice(pprice, pcnt);
		dao.update_priceNstock(dto);

		System.out.println("\n��ǰ " + pname + "�� ���� �Ǿ����ϴ�.\n");

		ctx.close();
	}

	private static void UpdatePlaceNLoca() {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(JavaConfig.class);
		ProductDAO dao = ctx.getBean(ProductDAO.class);
		ProductDTO dto = ctx.getBean(ProductDTO.class);

		System.out.print("��ǰ �̸�, â�� ��ġ, ���� : ");
		String pname = scan.next();
		String place = scan.next();
		String loca = scan.next();
		
		dto.setPname(pname);
		dto.setPname(pname);
		dto.setPlace(place);
		dto.setLoca(loca);
		dao.update_placeNloca(dto);

		System.out.println("\n��ǰ " + pname + "�� ���� �Ǿ����ϴ�.\n");
		
		ctx.close();
	}

	private static void InsertPro() {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(JavaConfig.class);
		ProductDAO dao = ctx.getBean(ProductDAO.class);
		ProductDTO dto = ctx.getBean(ProductDTO.class);
		
		System.out.print("��ǰ �̸�, â��, ��ġ, ���, ���� : ");
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

		System.out.println("\n��ǰ " + pname + "�� �߰� �Ǿ����ϴ�.\n");
		
		ctx.close();
	}
}
