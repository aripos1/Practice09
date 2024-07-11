package com.javaex.ex02;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Spliterator;

public class FriendApp {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		List<Friend> fList = new ArrayList<Friend>();
		List<String> str = new ArrayList<String>();
		
		System.out.println("친구를 3명 등록해주세요.");
		
		String s01 = sc.nextLine();
		String s02 = sc.nextLine();
		String s03 = sc.nextLine();
		
		str.add(s01);
		str.add(s02);
		str.add(s03);
		
		String[] sArr01 = s01.split(" ");		
		String[] sArr02 = s02.split(" ");
		String[] sArr03 = s03.split(" ");		
	
		
	}

}
