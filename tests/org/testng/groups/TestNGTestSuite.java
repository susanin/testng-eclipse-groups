package org.testng.groups;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNGTestSuite {
	
	@Test(groups = "group1")
	public void testGroup1() {
		Assert.assertTrue(true);
	}
	
	@Test(groups = TestConstants.GROUP_2)
	public void testGroup2() {
		Assert.assertTrue(true);
	}
	
	/*@Test(groups = {TestConstants.GROUP_2})
	public void testGroup2WithBrackets() {
		Assert.assertTrue(true);
	}*/
	
}
