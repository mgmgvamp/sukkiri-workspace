package main;

import java.util.Random;

public class Cleric {
	String name;
	int hp = 50;
	final int MAX_HP = 50;
	int mp = 10;
	final int MAX_MP = 10;
	
	public void selfAid() {
		if (this.mp < 5) {
			System.out.println("MPが足りない");
			return;
		}
		this.mp -= 5;
		this.hp = MAX_HP;
		System.out.println(this.name + "は、セルフエイドを使った！");
		System.out.println("最大HPまで回復した");
		System.out.println("MPを5消費した");
	}
	public int pray(int sec) {
		int hosei = new Random().nextInt(3);
		int kaihuku = sec + hosei;
		int oldMp = this.mp;
		this.mp += kaihuku;
		if (this.mp > MAX_MP) {
			this.mp = MAX_MP;
			kaihuku = this.mp - oldMp;
		}
		System.out.println(this.name + "は" + sec + "秒祈った");
		return kaihuku;
	}
}
