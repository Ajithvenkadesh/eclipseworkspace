interface test{
	
    static void display()
    {
        System.out.println("in main interface");
    }
}


interface test2 extends test{
	
    static void display()
    {
        System.out.println("in extended interface");
    }
}


class inherit implements test{

    static void display()
    {
        System.out.println("in implementation class");
    }
}


public class StaticExample {   

    public static void main(String args[]) {
    	test.display();
    	test2.display();
    	inherit obj = new inherit();
        obj.display();
    }
}
