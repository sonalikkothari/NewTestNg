package com.wbl.newtestng;

import org.testng.annotations.Test;

public class TestNgAnno {

	@Test(groups={"sanity"})
	public void testMethod1() {
		
		System.out.println("This test belongs to sanity test");
	}
	
	@Test
	public void testMethod2() {
		
		System.out.println("This test belongs to regression test");
	}
}
