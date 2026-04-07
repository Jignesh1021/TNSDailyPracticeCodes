package firstpackage;

public class Base {

	
	//declare variables
	int vardefault=10;
	public int varPublic=20;
	private int varPrivate=30;
	protected int varProtected=40;
	
	//decalre methods 
	
	void methodDefault()
	{
		System.out.println("Default access Base Class");
		System.out.println("Default Variables : "+ vardefault);
	}
	public void methodPublic()
	{
		System.out.println("public access Base Class");
		System.out.println("public Variables : "+ varPublic);
	}
	
	private void methodPrivate()
	{
		System.out.println("private access Base Class");
		System.out.println("private Variables : "+ varPrivate);
	}
	protected void methodProtected()
	{
		System.out.println("protected access Base Class");
		System.out.println("protected Variables : "+ varProtected);
	}
	
	
	private int varPrivate1;

	public int getVarPrivate1() {
		return varPrivate1;
	}
	public void setVarPrivate1(int varPrivate1) {
		this.varPrivate1 = varPrivate1;
	}
}