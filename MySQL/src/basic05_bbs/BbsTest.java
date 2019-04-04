package basic05_bbs;

import java.util.ArrayList;
import java.util.List;

public class BbsTest {
	public static void main(String[] args) {
		BbsDAO bDao = new BbsDAO();
		List<BbsDTO> bList = new ArrayList<BbsDTO>();
		List<BbsMember> bmList = new ArrayList<BbsMember>();
		int memberID = 100005;		// Login ID라 가정
		
		//bDao.insertBbs(new BbsDTO(100006, "Insert Test2", "콘텐츠 9"));
		/*bList = bDao.selectAll(10);
		for (BbsDTO bDto: bList)
			System.out.println(bDto.toString());*/
		
		//int dbMemberId = bDao.searchMemberId(4);
		/*if (bDao.searchMemberId(13) != memberID) {
			System.out.println("삭제 권한이 없음");
		} else {
			System.out.println("삭제 권한이 있음");
			bDao.deleteBbs(13);
		}
		System.out.println();*/
		
		/*BbsDTO bDto = bDao.selectOne(5);
		System.out.println(bDto.toString());
		if (bDto.getMemberId() != memberID) {
			System.out.println("수정 권한이 없음");
		} else {
			System.out.println("수정 권한이 있음");
			bDto.setTitle("수정 테스트");
			bDto.setContent("수정 테스트 내용입니다.");
			bDao.updateBbs(bDto);
		}*/
		
		bmList = bDao.selectJoinAll(10);
		for (BbsMember bmDto: bmList)
			System.out.println(bmDto.toString());
		
		bDao.close();
	}
}
