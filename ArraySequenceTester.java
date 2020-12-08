import java.util.ArrayList;
import java.util.NoSuchElementException;
public class ArraySequenceTester {

  public static void main(String[] args) {
		boolean failure = false;
		failure = failure || constructorTester(10);
	/*	failure = failure || lengthTester(10);
		failure = failure || hasNextTester(10);
		failure = failure || nextTester(10);
		failure = failure || resetTester(10);
*/
		System.out.println("\n ~~~ Overall Result ~~~");
		if (failure) {
			System.out.println("Coal for you!");
		} else {
			System.out.println("Happy Holidays!");
		}
	}

	private static void tester(String test) {
		System.out.println("\n ~~~ " + test + " ~~~\n");
	}

	private static int randInt(int end) {
		return randInt(0, end);
	}

	private static int randInt(int start, int end) {
		return (int)(Math.random()* (end - start)) + start;
	}

	private static void passMessage(int testCase) {
		System.out.println("Test case " + testCase + " passed.");
	}

	private static void passMessage(String testCase) {
		System.out.println("Test case " + testCase + " passed.");
	}

	private static void methodMessage(String method, boolean failure) {
		if (failure) {
			System.out.println("\nAt least one test case failed for " + method);
		} else {
			System.out.println(method + " PASSED");
		}
	}

  public static boolean constructorTester(int tests)
  {
		String method = "constructorTester";
		tester(method);
		boolean fail = false;
		//should return true
		for (int test = 0; test < tests; test++) {
      int a = randInt(-100, 100);
      int b = randInt(-100, 100);
      int c = randInt(-100, 100);
      int d = randInt(-100, 100);
      int e1 = randInt(-100, 100);
      int f = randInt(-100, 100);
      int g = randInt(-100, 100);

      int[] nums = {a, b, c, d, e1, f, g};

			try {
				//tests actually works
				ArraySequence r = new ArraySequence(nums);
				//tests implements IntegerSequence
				IntegerSequence r1 = new ArraySequence(nums);
				//passMessage(test);
			}
      catch (Exception e)
      {
				e.printStackTrace();
				fail = true;
				System.out.println("Nums: " + nums);
			}
		}
    return fail; 
  }
/*
  public static boolean lengthTester(int tests) {
		tester("lengthTester");
		boolean fail = false;
		for (int test = 0; test < tests; test++) {
      int a = randInt(-100, 100);
      int b = randInt(-100, 100);
      int c = randInt(-100, 100);
      int d = randInt(-100, 100);
      int e1 = randInt(-100, 100);
      int f = randInt(-100, 100);
      int g = randInt(-100, 100);

      int[] nums = {a, b, c, d, e1, f, g};

			ArraySequence r = new ArraySequence(nums);
			ArrayList<Integer> equivalent = new ArrayList<Integer>();

			for (int n = 0; n <= nums.length(); n++) {
				equivalent.add(n);
			}

			if (equivalent.size() == r.length()) {
				//passMessage(test);
			} else {
				fail = true;
				System.out.println("Nums: " + nums);
			//	System.out.println("End: " + end);
			//	System.out.println("");
				System.out.println("Expected: " + equivalent.size());
				System.out.println("Actual: " + r.length());
			}
		}

		methodMessage("lengthTester", fail);
		return fail;
	}
  */
}
