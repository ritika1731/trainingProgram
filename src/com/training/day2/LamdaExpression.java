package com.training.day2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

@FunctionalInterface
abstract interface Operation
{
	int check(int a);
}

class Math{
public static int checker(Operation p,int num){
return p.check(num);
}

Operation checkOdd()
{
Operation p =  (a) -> {return a%2;};

return p;
}

Operation checkPrime ()
{
Operation p =  (a) -> { 
	if (a == 1) return 1;
	for(int i = 2;i<a/2+1;i++){
		if((a%i)==0) return 1; 
	}
	return 0;
};
return p;
}
Operation checkPalindrome()
{
	Operation p =  (a) -> {
		String word = ""+a;
		boolean isPalindrome = true;
		for(int i = 0;i<(int)word.length()/2;i++)
		{
			if(word.charAt(i) != word.charAt(word.length()-1-i)){
				isPalindrome = false;
				break;

			}
		}
		return isPalindrome?0:1;
	};
	return p;
}	
}
	public class LamdaExpression {
		public static void main(String[] args)throws IOException {
			Math ob = new Math();
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			int T=Integer.parseInt(br.readLine());
			Operation op;
			int ret =0;
			String ans=null;
			while(T-->0){
				String s=br.readLine().trim();
				StringTokenizer st=new StringTokenizer(s);
				int ch=Integer.parseInt(st.nextToken());
				int num=Integer.parseInt(st.nextToken());
				//ret = ob.checker(op,num);
				if(ch==1){
					op = ob.checkOdd();  
					ans = (ret == 0)?"EVEN":"ODD";
				}
				else if(ch==2){
					op = ob.checkPrime();
					ans = (ret == 0)?"PRIME":"COMPOSITE";
				}
				else if(ch==3){
					op = ob.checkPalindrome();
					ans = (ret == 0)?"PALINDROME":"NOT PALINDROME";

				}
				System.out.println(ans);
			}
		}          
}
