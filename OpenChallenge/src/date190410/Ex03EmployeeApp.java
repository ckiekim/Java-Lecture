package date190410;

import java.time.LocalDate;
import java.util.TreeSet;

public class Ex03EmployeeApp {
	public static void main(String[] args) {
		TreeSet<Ex03Employee> ts = new TreeSet<Ex03Employee>();
		ts.add(new Ex03Employee(123, "김자바", "부장", LocalDate.of(1998, 1, 1)));
		ts.add(new Ex03Employee(133, "강자바", "부장", LocalDate.of(2000, 8, 1)));
		ts.add(new Ex03Employee(143, "은전자", "차장", LocalDate.of(2003, 1, 1)));
		ts.add(new Ex03Employee(163, "이마이", "차장", LocalDate.of(2009, 10, 1)));
		ts.add(new Ex03Employee(153, "정마이", "과장", LocalDate.of(2008, 1, 1)));
		ts.add(new Ex03Employee(203, "노전자", "과장", LocalDate.of(2018, 8, 11)));
		ts.add(new Ex03Employee(173, "권표준", "대리", LocalDate.of(2012, 1, 1)));
		ts.add(new Ex03Employee(193, "유표준", "대리", LocalDate.of(2017, 4, 1)));
		ts.add(new Ex03Employee(183, "천디비", "사원", LocalDate.of(2016, 1, 1)));
		ts.add(new Ex03Employee(213, "홍정부", "사원", LocalDate.of(2019, 1, 1)));
		// 다음 행은 직급과 입사일자 첫번째 데이터와 같아서 입력이 안됨
		ts.add(new Ex03Employee(999, "최웨엡", "부장", LocalDate.parse("1998-01-01")));	
		
		for (Ex03Employee emp: ts)
				System.out.println(emp.toString());
	}
}
