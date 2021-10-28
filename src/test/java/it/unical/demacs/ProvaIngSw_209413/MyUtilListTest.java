package it.unical.demacs.ProvaIngSw_209413;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.joda.time.DateTime;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class MyUtilListTest {

	private static MyUtilList myUtilList;
	
	@BeforeClass
	public static void beforeClass() {
		System.out.println(DateTime.now());
		myUtilList = new MyUtilList();
		
		
	}
	
	@AfterClass
	public static void afterClass() {
		System.out.println(DateTime.now());
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void sortThrowsException() {
		myUtilList.sort(null, 2);
		myUtilList.sort(null, -1);
	}
	
	@Test
	public void sortWorks() {
		System.out.println("testing");
		assertEquals(null, myUtilList.sort(null,0));
		assertEquals(null, myUtilList.sort(null,1));
	}
}
