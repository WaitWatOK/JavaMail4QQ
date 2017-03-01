package com.wat.java;

/**
 * final 类  无法被继承
 * final 方法 无法被重写
 * final  常量  无法重写
 * @author Wutao
 *
 */
public class FinalDemo {

	private final String str = "final 实例常量";
	private final int a = 1;
	public final int b = 2;
	
	public static final int c = 10;
	private static final int d = 11;
	
	
	public static void main(String[] args) {
		FinalDemo demo = new FinalDemo();
	}
	
}
