package com.kh.main;

import java.util.Scanner;

import com.kh.main.GangboonGame;
import com.kh.main.MinKyuGame;
import com.kh.main.Random;

public class Main {

	
	
	public static void main(String[] args) {
		
		GangboonGame gb = new GangboonGame();
		
		boolean a= true;
		Scanner sc = new Scanner(System.in);
		
		while(a)
		{
			System.out.println("--- kh4조 게임 ---");
			System.out.println("1.게임을 선택하세요");
			System.out.println("1.강분님 게임 2. 지웅님게임 3.예린님 게임 4.지희님 게임 5. 민규님 게임 6.ㅇㅇ");
			
			int select = sc.nextInt();
			
			switch(select)
			{
			 case 1:
				gb.playGangboonGame();
				break;
			 case 2:
					go.playGangboonGame();
					break;
			 case 3:
					yr.playGangboonGame();
					break;
			 case 4:
					gh.playGangboonGame();
					break;
			 case 5:
					mk.playGangboonGame();
					break;
			 case 6:
				 System.out.println("ㅇㅇ");
			default:
				System.out.println("잘못선택하셧습니다");
				continue;
				
			
			}
			
		}
			
			
		}
		
		
		

	}
