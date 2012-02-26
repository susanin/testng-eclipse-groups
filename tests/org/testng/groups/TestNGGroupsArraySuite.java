package org.testng.groups;

import org.testng.Assert;
import org.testng.annotations.Test;

@Test(groups = {TestConstants.SUITE_ARRAY_GROUP})
public class TestNGGroupsArraySuite {

	@Test(groups = {TestConstants.GROUP_2_ARRAY})
	public void testArrayGroup2() {
		Assert.assertTrue(true);
	}
	
}
