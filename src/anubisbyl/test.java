package anubisbyl;
import java.util.*;

import javax.xml.bind.DatatypeConverter;

import java.io.*;
public class test {
	

	  public static void main(String[] args) throws UnsupportedEncodingException
	    {
		  int i = 0;
		  String text = new String();
		  Scanner read = new Scanner(System.in);System.out.println("������� �����: ");
		  text = read.nextLine();
		  for(int val:text.toCharArray())
		  {
			  i++;
		  }
		  System.out.println("����� �������� " + i);
		  System.out.println("�� �����: " + text);
	
		  byte[] byteArray = text.getBytes("UTF-8");
		  String hexText = new String();
		  hexText = DatatypeConverter.printHexBinary(byteArray);
		  System.out.println("������ � ������ ���� : " + hexText);
		 byte[] array;
		 array = new byte[16];
		 for(int val:hexText.toCharArray())
		 {
			 for (int q = 0; q < array.length; q++)
	            {
	                array[q] = ;
	            }
		 }
		
		
	    }
	  
	
}
