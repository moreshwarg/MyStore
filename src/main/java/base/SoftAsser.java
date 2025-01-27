package base;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAsser {
	SoftAssert ss = new SoftAssert();
	@Test
	public void m() {
	String a="Method a";
    String b="Method ";

   ss.assertEquals(a, b);
System.out.println("First soft assert pass");

String c="Method a";
String d="Method a";

ss.assertEquals(c, d);
System.out.println("First soft assert pass");
ss.assertAll();
}
}