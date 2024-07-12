package com.javaex.ex02;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Spliterator;

public class FriendApp {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		List<Friend> fList = new ArrayList<Friend>();

		System.out.println("친구를 3명 등록해주세요.");

		for (int i = 0; i < 3; i++) {
			String str = sc.nextLine();
			String[] sArr = str.split(" ");

			Friend f01 = new Friend(sArr[0], sArr[1], sArr[2]);
			fList.add(f01);
		}
		for (int i = 0; i<fList.size(); i++) {
			System.out.println(fList.get(i).toString()); 
		}
	sc.close();
	}

}
