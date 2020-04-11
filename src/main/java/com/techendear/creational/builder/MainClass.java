package com.techendear.creational.builder;

public class MainClass {

	public static void main(String[] args) {
		LunchOrder.Builder builder = new LunchOrder.Builder();
		
		builder.bread("Wheat")
				.condiments("Lettuce")
				.dressing("Moyo")
				.meat("Turkey");
		LunchOrder orderBean = builder.build();
		System.out.println(orderBean.getBread());
		System.out.println(orderBean.getCondiments());
		System.out.println(orderBean.getDressing());
		System.out.println(orderBean.getMeat());
	}
}
