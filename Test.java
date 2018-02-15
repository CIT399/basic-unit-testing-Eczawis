import static org.junit.Assert.*;

//Chaz Zawislak
//Junit ICE

public class Test {

	@org.junit.Test
	public void test()
	{
		
	String str = "(123)456-7890";
	assertEquals(Telephone.isFormatted(str), true);	
	
	}
	@org.junit.Test
	public void test2()
	{
		
	String str = "(123456-7890";
	assertEquals(Telephone.isFormatted(str), true);	
	
		
	}
	@org.junit.Test
	public void test3()
	{
		
	String str = "(abc)efg-hijk"; //I know it makes sense, but it bothers me that this works	
	assertEquals(Telephone.isFormatted(str), true); 

	}
}