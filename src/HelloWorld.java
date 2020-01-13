import java.lang.reflect.Array;

/**
 * Fist Class Testing
 * @author Eduardo
 *
 */
public class HelloWorld {
	public static void main(String[] args) {
		System.out.println("Hello World");
		
		if(Array.getLength(args) > 0) {
			System.out.println("Hello " + args[0] + " and the world!");
		} else {
			System.out.println("Hello World!");
		}
	}

}
