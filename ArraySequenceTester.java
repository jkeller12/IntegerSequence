import java.util.ArrayList;
import java.util.NoSuchElementException;
public class ArraySequenceTester {

	public static void main(String[] args) {
		boolean failure = false;
		failure = failure || constructorTester(10);
		failure = failure || lengthTester(10);
		failure = failure || hasNextTester(10);
		failure = failure || nextTester(10);
		failure = failure || resetTester(10);

		System.out.println("\n ~~~ Overall Result ~~~");
		if (failure) {
			System.out.println("Coal for you!");
		} else {
			System.out.println("Happy Holidays!");
		}
	}
}
