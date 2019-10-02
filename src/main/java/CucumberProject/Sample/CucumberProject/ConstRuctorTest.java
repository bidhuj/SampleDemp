package CucumberProject.Sample.CucumberProject;

public class ConstRuctorTest {

public  int sum (int x, int y ){
	 x = x+y;
	return x;
}
public  int sum (int x, int y,int z ){
	 x = x+y+z;
	return x;
}
public static void main(String args[]) 
{ 
	ConstRuctorTest s = new ConstRuctorTest(); 
	System.out.println("Coming from Framework-Used For Demo****");
    System.out.println(s.sum(10, 20)); 
    System.out.println(s.sum(10, 20, 30));  
} 
} 

