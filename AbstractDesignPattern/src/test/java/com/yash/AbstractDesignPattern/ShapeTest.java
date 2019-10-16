package com.yash.AbstractDesignPattern;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ShapeTest  {
	
	@Test
	public void shouldDrawCircle() {
		
		AbstractFactory shapeFactory = FactoryProducer.getAbstractFactory("shape");
		Shape shape = shapeFactory.getShape("circle");
		String expected = "Circle.draw()";
		String actual = shape.draw();
		
		assertEquals(expected,actual);
	}

	@Test
	public void shouldDrawSquare() {
		
		AbstractFactory shapeFactory = FactoryProducer.getAbstractFactory("shape");
		Shape shape = shapeFactory.getShape("square");
		String expected = "Square.draw()";
		String actual = shape.draw();
		
		assertEquals(expected,actual);
	}

	@Test
	public void shouldFillRed() {
		
		AbstractFactory colorFactory = FactoryProducer.getAbstractFactory("color");
		Color color = colorFactory.getColor("red");
		String expected = "Red.fill()";
		String actual = color.fill();
		
		assertEquals(expected,actual);
	}

	@Test
	public void shouldFillGreen() {
		
		AbstractFactory colorFactory = FactoryProducer.getAbstractFactory("color");
		Color color = colorFactory.getColor("green");
		String expected = "Green.fill()";
		String actual = color.fill();
		
		assertEquals(expected,actual);
	}
//	@Test
//	public void shouldDrawnull() {
//		
//		AbstractFactory shapeFactory = FactoryProducer.getAbstractFactory("");
//		Shape shape = shapeFactory.getShape("");
//		String expected = "Square.draw()";
//		String actual = shape.draw();
//		
//		//assertEquals(expected,actual);
//	}
	
}
