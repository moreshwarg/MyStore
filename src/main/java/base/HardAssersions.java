package base;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssersions {
@Test
	public void m() {
	String a="Method a";
    String b="Method a";

Assert.assertEquals(a, b);
System.out.println("First hard assert pass");

String c="Method a";
String d="Method a";

Assert.assertEquals(c, d);
System.out.println("First hard assert pass");

}

}
