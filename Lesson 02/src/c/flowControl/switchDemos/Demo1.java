package c.flowControl.switchDemos;

public class Demo1 {

	public static void main(String[] args) {

		int mode = (int) (Math.random() * 3);
		System.out.println(mode);

		switch (mode) {
		case 0:
			System.out.println("OFF");
			break;// out of the switch construct
		case 1:
			System.out.println("ON");
			break;
		case 2:
			System.out.println("STAND_BY");
			break;
		default:
			System.out.println("wrong value");
		}

		// out of the switch

	}

}
