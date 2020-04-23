package work08.work0811;

public class PrintAbsoluteValue {

	public static void main(String[] args) {
		AbsoluteValue intNum = new  AbsoluteValue();

		System.out.println("Int" + intNum.absolute(9));
		System.out.println("double" + intNum.absolute(7.8));
		System.out.println("long" + intNum.absolute(780000000));
		System.out.println("float" + intNum.absolute(7.8));



	}

}
