package test;

import java.util.ArrayList;
import java.util.List;

public class UserApp {

	public static void main(String[] args) {

		User usermaster = new Staff("master", "m7788", "운영자", 3500000);
		User user01 = new Customer("jung-ws", "j1357913579", "정우성", 1000);
		User user02 = new Customer("LeeHR", "a123!!", "이효리", 2500);
		User user03 = new Customer("ms-park", "y2345", "박명수", 1200);
		
		List<User> uList = new ArrayList<User>();
		
		uList.add(usermaster);
		uList.add(user01);
		uList.add(user02);
		uList.add(user03);
		
		
		for (int i = 0; i < uList.size(); i++) {
			System.out.print(i+1 + ".");
			uList.get(i).showInfo();;
		}
		System.out.println();
		System.out.println("운영자의 연봉은 " + ((Staff)uList.get(0)).getSalary() * 12 + "입니다.");
		
		
		
	}

}
