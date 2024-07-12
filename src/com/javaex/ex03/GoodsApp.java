package com.javaex.ex03;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import javax.management.PersistentMBean;

public class GoodsApp {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		List<Goods> gList = new ArrayList<Goods>();

		System.out.println("상품을 입력해주세요(종료 q)");
		int sum = 0;
		while (true) {

			String str = sc.nextLine();

			if (str.equals("q")) {
				System.out.println("[입력완료]");
				break;

			} else {
				for (int i = 0; i < 1; i++) {
					String[] sArr = str.split(",");

					String n = sArr[0];
					int p = Integer.parseInt(sArr[1]);
					int c = Integer.parseInt(sArr[2]);
					Goods g01 = new Goods(n, p, c);
					gList.add(g01);
					sum += c;

				}

			}

		}

		for (int a = 0; a < gList.size(); a++) {
			gList.get(a).goodsList();

		}
		System.out.println("모든 상품의 갯수는 " + sum + "개 입니다.");
		sc.close();
	}
}
