package codes;

public class ReverseString {
	public int reverse(int x) {
		String str=Math.abs(x)+"";
		String s="";
		for(int i=str.length()-1;i>=0;i--)
		{
			if(str.charAt(i)=='-')
				continue;
			else
				s=s+str.charAt(i);
		}
		if(x<0)
			return -(Long.parseLong(s))<Integer.MIN_VALUE?0:-(Integer.parseInt(s));
		else
			return (Long.parseLong(s))>Integer.MAX_VALUE?0:(Integer.parseInt(s));
    }
	public static void main(String[] args)
	{
		ReverseString r=new ReverseString();
		int a=r.reverse(-2147483648);
		System.out.println(a);
	}
}
