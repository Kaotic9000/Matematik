package diskret_matematik;

public class Euclids_udvidede_algoritme {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int q,r1,r2,s1=1,s2=0,t1=0,t2=1,x;
java.util.Scanner input=new java.util.Scanner(System.in);
System.out.println("angiv forst den storste vaerdi efterfulgt af den mindste.");
r2=input.nextInt();
r1=input.nextInt();
input.close();
int ra=r2;int rb=r1;
int k=0;
while(r2%r1 != 0){
	System.out.println("q=" +r2+"/"+r1);
	q=r2/r1;
System.out.println("q_"+k+" = "+q);

System.out.println("r_"+k+"="+r2+" modulo "+r1);
x=r2%r1;
System.out.println("x= "+x);
r2=r1;
r1=x;
System.out.println("r_"+k+" = "+r2+" r_"+(k-1)+" = "+r1);

System.out.println("s_"+k+"="+s1+"-"+q+"*"+s2);
	x=s1-q*s2;
	s1=s2;
	s2=x;
	System.out.println("s_"+k+" = "+s2+" , s_"+(k-1)+" = "+s1);
	
	System.out.println("t_"+k+"="+t1+"-"+q+"*"+t2);
	x=t1-q*t2;
	t1=t2;
	t2=x;
	System.out.println("t_"+k+" = "+t2+" , t_"+(k-1)+" = "+t1);

	k++;
}
System.out.println("losningen vil vaere "+r1+" = "+s2+" * "+ra+" + "+t2+" * "+rb);
	}

}
