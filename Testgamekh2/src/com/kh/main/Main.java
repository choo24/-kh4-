package com.kh.main;

import java.util.Scanner;
import com.kh.main.GangBoonGame;
import com.kh.main.JihuiGame;
import com.kh.main.JiwoongGame;
import com.kh.main.MinKyuGame;
import com.kh.main.YerinGame;

public class Main{
	
	public static void main(String[] args) {
		
		GangBoonGame gb = new GangBoonGame();
		JihuiGame jh= new JihuiGame();
		JiwoongGame jw = new JiwoongGame();
		MinKyuGame mk = new MinKyuGame();
		YerinGame yr = new YerinGame();
		
		boolean a = true;
		Scanner sc = new Scanner(System.in);
		
		while(a)
		{
			System.out.println("===kh 4조 게임 ====");
			System.out.println("1.게임을 선택하세요");
			System.out.println("1.강분님 게임 2. 지웅님 게임 3. 예린님 게임 4.지희님 게임 5. 민규님 게임 ");
			
			int select = sc.nextInt();
			
			switch(select)
			{
			case 1 :
				gb.gangboongame();
				break;
			case 2 :
				jw.jebi();
				break;
			case 3 :
				yr.playRSP();
				break;
			case 4 :
				jh.gameStart();
				break;
			case 5 :
				mk.go();
				break;
			case 6 :
				System.out.println("ㅎㅎ");
			default :
				System.out.println("잘못 선택하셧습니다");
				continue;
			
			}
		}
	}
}
