package t4_DBTest_VO_copy;

import java.util.ArrayList;
import java.util.Scanner;

public class DBTestService {
	Scanner sc = new Scanner(System.in);
	String name;

	DBTestDAO dao = new DBTestDAO();
	DBTestVO vo = new DBTestVO();
	
	// 자료 등록
	public void input() {
		System.out.print("성명 : "); vo.setName(sc.next());
		System.out.print("나이 : "); vo.setAge(sc.nextInt());
		System.out.print("성별 : "); vo.setGender(sc.next());
		System.out.print("회원가입 일자 : "); vo.setJoinday(sc.next());
		dao.input(vo);
	}

	// 개별자료 검색
	public void search() {
		System.out.print("검색할 성명을 입력하세요? ");
		name = sc.next();
		vo = dao.search(name);
		
		System.out.println("-----------------------------------");
		if(vo.getName() == null) {
			System.out.println("검색하신 "+name+"(이)가 없습니다.");
		}
		else {
			System.out.println("검색하신 성명은? " + name);
			System.out.println("고유번호 : " + vo.getIdx());
			System.out.println("나이 : " + vo.getAge());
			System.out.println("성별 : " + vo.getGender());
			System.out.println("입사일 : " + vo.getJoinday().substring(0,10));
		}
		System.out.println("-----------------------------------");
		
	}

	// 전체자료 검색후 출력처리하는곳
	public void list() {
		ArrayList<DBTestVO> vos = dao.list();
		
		// 전체자료 출력처리하는곳
		System.out.println("============================================");
		System.out.println("번호\t성 명\t나이\t성별\t 가입일자");
		System.out.println("--------------------------------------------");
		
		for(int i=0; i<vos.size(); i++) {
			vo = vos.get(i);
			System.out.println(vo.getIdx()+"\t"+vo.getName()+"\t"+vo.getAge()+"\t"+vo.getGender()+"\t"+vo.getJoinday().substring(0,10));
		}
		System.out.println("============================================");
	}

	// 자료 수정
	public void update() {
		System.out.print("수정할 회원의 고유번호를 입력하세요? ");
		int idx = sc.nextInt();
		dao.Update(idx);
	}

	// 자료 삭제
	public void delete() {
		System.out.print("삭제할 성명을 입력하세요? ");
		name = sc.next();
		int res = dao.delete(name);
		if(res == 1) System.out.println("자료가 삭제되었습니다.");
		else System.out.println("자료 삭제 실패!!");
	}

}
