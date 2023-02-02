package com.kh.main;

public class JiwoongGame {
	
	System.out.println("=====랜덤 조원 뽑기=====");
	
	String[] team4 = {"강분", "예린", "지희", "민규", "지웅", "명훈"};
	
	int num = (int)(Math.random()*6+1);
	String winner = team4[num-1];
	
	System.out.println("당첨자는 " + winner + " !!");
	System.out.println("\\(^p^)/ ㅊㅋㅊㅋ \\(^q^)/");

}
