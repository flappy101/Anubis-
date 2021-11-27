package anubisbyl;
// Кодировки
import java.io.UnsupportedEncodingException;

import javax.xml.bind.DatatypeConverter;

public class test2 {
	// string - hex
	public static String toHexadecimal(String text) throws UnsupportedEncodingException
	{
	    byte[] myBytes = text.getBytes("UTF-8");

	    return DatatypeConverter.printHexBinary(myBytes);
	}
	
	public static void main(String[] args) throws UnsupportedEncodingException
    {
	    	
		 System.out.println("string in to hex - " + toHexadecimal("Bylichev Nikita 447 group"));
		// hex - string
		String hex = "72";
	    byte[] s = DatatypeConverter.parseHexBinary(hex);
	    System.out.println("hex in to string - " + new String(s));
    }

}
