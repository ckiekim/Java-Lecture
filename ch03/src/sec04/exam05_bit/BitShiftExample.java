package sec04.exam05_bit;

public class BitShiftExample {
	public static void main(String[] args) {
		System.out.println("1 << 3 = " + (1<<3));		
		System.out.println("-8 >> 3 = " + (-8>>3));	
		System.out.println("-8 >>> 3 = " + (-8>>>3));
		
		System.out.println(BitLogicExample.toBinaryString(-8));
		System.out.println(">> 3");
		System.out.println(BitLogicExample.toBinaryString(-8 >> 3));
		System.out.println(">>> 3");
		System.out.println(BitLogicExample.toBinaryString(-8 >>> 3));
	}
}

