package ß166;
/** §1
 * User:        Mik
 * Date:        14 11 2013
 * Time:        58 20
 */
/**
 * §2 </code>S</code> is a <code>class</code> containing basic static factory methods from
 * <code>System</code> and <code>Runtime</code> that allows for more convinient
 * invocations thereof.
 * @author Mik
 */
public class S {
	public static void print(Object o) {
		System.out.print(o);
	}
	public static void line(Object o) {
		System.out.println(o);
	}
	public static int processors() {
		return Runtime.getRuntime().availableProcessors();
	}
	public static long time() {
		return System.currentTimeMillis();
	}
	public static long memory() {
		return Runtime.getRuntime().freeMemory();
	}
	public static void end() {
		System.exit(0);
	}
}
