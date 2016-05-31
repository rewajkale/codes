package codes;

import java.util.ArrayList;
import java.util.HashMap;

public class ZigZagConversion {
	public String convert(String s, int numRows) {
		if(numRows==0||numRows==1)
			return s;
		StringBuilder temp=new StringBuilder();
		for(int i=0;i<numRows;i++)
		{
			int index=i;
			int down=1;
		    while(index<s.length())
		    {
		    	temp.append(s.charAt(index));
		    	if(i==0)
		    		index=index+2*((numRows-1)-i);
		    	else if(i==numRows-1)
		    		index=index+2*i;
		    	else
		    	{
		    		if(down==1)
		    		{
		    			index=index+2*((numRows-1)-i);
		    			down=0;
		    		}
		    		else
		    		{
		    			index=index+2*i;
		    			down=1;
		    		}
		    	}
		    }
		}
		return temp.toString();
    }
	public static void main(String[] args)
	{
		ZigZagConversion z=new ZigZagConversion();
		String str=z.convert("PAYPALISHIRING", 18);
		System.out.print(str);
	}
}
