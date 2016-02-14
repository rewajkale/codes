package codes;

import java.util.ArrayList;
import java.util.HashMap;

public class ZigZagConversion {
	public String convert(String s, int numRows) {
		if((numRows==1)||(numRows>s.length()))
			return s;
		else
		{
		HashMap<Integer,ArrayList> h=new HashMap<>();
		ArrayList<Character> arr;
		String str="";
		int nrow=1;
		int incre=1;
		for(int i=0;i<s.length();i++)
		{
			if(nrow==numRows+1)
			{
				incre=0;
				nrow=nrow-2;
			}
			else if(nrow==0)
			{
				incre=1;
				nrow=nrow+2;
			}
			if(h.get(nrow)==null)
			{
				arr=new ArrayList<>();
				arr.add(s.charAt(i));
				h.put(nrow, arr);
			}
			else
			{
				arr=h.get(nrow);
				arr.add(s.charAt(i));
			}
			if(incre==0)
				nrow--;
			else
				nrow++;
		}
		for(int i=1;i<=numRows;i++)
		{
			arr=h.get(i);
			for(char j:arr)
				str=str+j;
		}
        return str;
		}
    }
	public static void main(String[] args)
	{
		ZigZagConversion z=new ZigZagConversion();
		String str=z.convert("PAYPALISHIRING", 4);
		System.out.print(str);
	}
}
