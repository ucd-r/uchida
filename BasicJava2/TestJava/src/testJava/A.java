package testJava;

public class A {
	protected int a =1;
	  A(int num){
		    System.out.println("クラスAのコンストラクタ");
		    this.a = num;
		  }
	  A(){
		  System.out.println("クラスAの暗黙的コンストラクタ");
	  }

	  public void test(){
		  System.out.println("クラスAのTest");
	  }
}
