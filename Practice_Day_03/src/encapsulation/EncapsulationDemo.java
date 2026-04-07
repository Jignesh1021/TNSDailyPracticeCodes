package encapsulation;

public class EncapsulationDemo {

	public static void main(String[] args) {
		
		//obj creation 
		OopsCanceptsDemo obj=new OopsCanceptsDemo();
		obj.setName("Jignesh");
		obj.setAge(22);
		obj.setSerialNum(101);
		
		System.out.println(obj.getAge());
		System.out.println(obj.getName());
		System.out.println(obj.getSerialNum());
		
		System.out.println(obj);

	}

}