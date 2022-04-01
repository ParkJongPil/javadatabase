package t4_DBTest_VO;

import java.util.Scanner;

public class DBTestRun {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		DBTestService service = new DBTestService();
		
		// 메뉴 생성
		int sel;
		boolean run = true;
		
		while(run) {
			System.out.println("*** 작업선택 ***");
			System.out.print("1.자료입력  2.개별조회  3.전체조회  4.수정  5.삭제  6.종료 ==>> ");
			sel = scanner.nextInt();
			
			switch (sel) {
				case 1:
					service.input();	// 자료등록
					break;
				case 2:
					service.search();		// 개별자료 조회
					break;
				case 3:
					service.list();			// 전체조회
					break;
				case 4:
					service.update();		// 자료수정
					break;
				case 5:
					service.delete();		// 삭제
					break;
				default:
					run = false;
			}
		}
		System.out.println("=================================================");
		System.out.println("작업끝........................");
		scanner.close();
	}
}
