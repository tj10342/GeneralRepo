
/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.*;
public class Deloitte

{
    
    static void swap ( int [] x, int [] y){
        int [] t;
        t=x;x=y;y=t;
    }
    
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		 int a[] = new int [3];
		 int b[] = new int[3];
		for(int i=0;i<a.length;i++)
		{
		    a[i]= input.nextInt();
		    
		}
		for(int i=0;i<b.length;i++)
		{
		    b[i] = input.nextInt();
		    
		}
		   swap(a,b);
		   System.out.println(a[0]+a[1]+a[2]);
		   
		   
	}
}

