
public class ConversionData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//double d=23.45;
//int i=(int)d;
//System.out.println(i);
		
		byte i=40;
		short j=i;
		int k=j;
		long l=k;
		float m=l;
		double n=m;
		System.out.println("byte value:"+i);
		System.out.println("short value:"+j);
		System.out.println("int value:"+k);
		System.out.println("float value:"+m);
		System.out.println("long value:"+l);
		System.out.println("double value:"+n);
//explicit conversion
		double d=30.0;
		float f=(float)d;
		long t=(long)f;
		int b=(int)t;
		short s=(short)b;
		byte h=(byte)s;
		System.out.println("byte value:"+h);
		System.out.println("short value:"+s);
		System.out.println("int value:"+b);
		System.out.println("float value:"+f);
		System.out.println("long value:"+t);
		System.out.println("double value:"+d);

		

		
	}

}
