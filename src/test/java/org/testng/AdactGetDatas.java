package org.testng;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class AdactGetDatas {
	@DataProvider(name="data",indices={0,2})
	public Object[][] sample(){
		
        return new Object[][] {{"user1234","Qwerty@$","Priya","Priya@123"},{"user3456","Qwerty@8","Sugu","Sugu@123"},{"user7891","Qwerty@#","Shoby","Shoby@123"}};
}

@Test(dataProvider="data")
private void test3(String s1,String s2,String s3,String s4)
{
System.out.println(s1);
System.out.println(s2);
System.out.println(s3);
System.out.println(s4);
}
}