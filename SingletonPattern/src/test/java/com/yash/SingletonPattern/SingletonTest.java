package com.yash.SingletonPattern;

import static org.junit.Assert.assertEquals;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

public class SingletonTest { 
    
	private Singleton singleton = Singleton.getInstance();
	
	
	@Test
	public void check() throws ClassNotFoundException, IOException {

		ByteArrayOutputStream b = new ByteArrayOutputStream();
        ObjectOutputStream o = new ObjectOutputStream(b);
        o.writeObject(singleton);
        byte[] ser = b.toByteArray();
        
        ByteArrayInputStream bb = new ByteArrayInputStream(ser);
        ObjectInputStream oo = new ObjectInputStream(bb);
        Object obj =oo.readObject();
        
		assertEquals(singleton, obj);
		
	}
	
	@Test
	public void check2() throws ClassNotFoundException, IOException {
 
		Singleton singleton2 = Singleton.getInstance();

		ByteArrayOutputStream b = new ByteArrayOutputStream();
        ObjectOutputStream o = new ObjectOutputStream(b);
        o.writeObject(singleton2);
        byte[] ser = b.toByteArray();
        
        ByteArrayInputStream bb = new ByteArrayInputStream(ser);
        ObjectInputStream oo = new ObjectInputStream(bb);
        Object obj =oo.readObject();
         
		assertEquals(singleton2, obj);
		
	}
	
	
}
