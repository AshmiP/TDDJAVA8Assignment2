package com.yash.SingletonPattern;

import java.io.Serializable;

public class Singleton implements Serializable {

	private static final long serialVersionUID = 1L;

	private static Singleton instance = null;

	private Singleton() {
	}

	public static Singleton getInstance() {
		
		if (instance == null) {
			synchronized (Singleton.class) {
				if (instance == null)
					instance = new Singleton();

			}
		}
		return instance;
	}

	private Object readResolve() {

		return instance;

	}
}
