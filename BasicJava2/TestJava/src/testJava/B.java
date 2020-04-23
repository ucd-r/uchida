package testJava;

public class B extends A{

	 private int b =2;

	  B(){super(2);
		    System.out.println("クラスBのコンストラクタ");
		  }

	  @Override
	  public void test(){
		  System.out.println("Btest");
	  }

	  public void getB() {
		  System.out.println(this.b);
	  }
	  

}
