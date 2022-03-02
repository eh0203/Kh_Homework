package com.thread.sleep;

public class SleepTest {

	public static void main(String[] args) {
		SleepTest test = new SleepTest();
		test.sendAphorism();
	}
	
	public void sendAphorism() {
		String[] favline = new String[10];
		
		favline[0] = ("모르는게 아니야, 알 때 까지 시간이 걸리는거야 -보노보노-"); 
		favline[1] = ("사람이 언제 죽는다고 생각하나? 사람들에게서 잊혀졌을떄다 -Dr.히루루크-"); 
		favline[2] = ("잘 쉬는게 혁신이야 -펭수-");
		favline[3] = ("모든 모험을 첫걸음을 필요로 한다 -화이트 래빗-"); 
		favline[4] = ("과거를 바꿀 순 없지만 교훈은 얻을 수 있다 -앨리스-"); 
		favline[5] = ("하쿠나 마타타 -티몬-");
		favline[6] = ("세상에서 가장 어려운 일은 사람이 사람의 마음을 얻는 일 -어린왕자-"); 
		favline[7] = ("삶은 실수투성이야, 우리는 늘 실수를 하곤 하지 -닉-"); 
		favline[8] = ("어른이 놀고있다라고 말하면 멋있지않잖아, 그래서 취미라고 말하는거야 -너부리-");
		favline[9] = ("헛소리하지마 임마. -보노보노-");
		
		for(int i = 0; i < favline.length; i++) {
			int rnd = (int)(Math.random()*10);
			System.out.println(favline[rnd]);
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("종료");
	
	}
	
}