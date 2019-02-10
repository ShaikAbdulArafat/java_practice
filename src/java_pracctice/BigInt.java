package java_pracctice;

import java.math.BigInteger;

public class BigInt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BigInteger a=new BigInteger("123456789123456789");
        BigInteger b=new BigInteger("100000000000000000");
        System.out.println(a.add(b));
        System.out.println(a.multiply(b));
	}

}
