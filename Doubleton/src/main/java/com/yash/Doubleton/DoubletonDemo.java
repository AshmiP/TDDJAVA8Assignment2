package com.yash.Doubleton;

public class DoubletonDemo {
	private static DoubletonDemo instance[] = new DoubletonDemo[2];
    private static int index = 0;
    
    static {
    
    	instance[0] = new DoubletonDemo();
    	instance[1] = new DoubletonDemo();
    	
    }
	
	public static DoubletonDemo getInstance() {
	       return instance[(index++)%2];	
	}

//	 private static DoubletonDemo instance1;
//     private static DoubletonDemo instance2;
//	private String name;
//	private double weight;
//	private float length;
//
//	private DoubletonDemo(String name, double weight, float length) {
//		this.name = name;
//		this.weight = weight;
//		this.length = length;
//	}
//
//	public static DoubletonDemo getInstance() {
//		if (instance1 == null) {
//			instance1 = new DoubletonDemo("Cheetah", 120, 5.5f);
//			return instance1;
//		} else if (instance2 == null) {
//			instance2 = new DoubletonDemo("Elephant", 300, 7.2f);
//			return instance2;
//		} else {
//			if (Math.random() < 0.5) {
//				return instance1;
//			} else {
//				return instance2;
//			}
//		}
//
//	}
}

