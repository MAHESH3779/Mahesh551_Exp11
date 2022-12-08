package Devops.Mahesh551_Exp11;

import static org.junit.Assert.*;

import org.junit.Test;

public class AppTest 
{
	@Test
	public void test()
	{
		App p=new App();
		assertEquals(20,p.add(10,10));
	}
}
