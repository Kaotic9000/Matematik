package diskret_matematik;

public class Euclids_udvidede_algoritme {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int q,r1,r2,s1=1,s2=0,t1=0,t2=1,x;
System.out.println("Fremgangs forklaring");
System.out.println("r_i beregnes som r_(i-2) modulo r_(i-1)");
System.out.println("q_i beregnes som r_(i-2) /  (i-1)");
System.out.println("s_i beregnes som s_(i-2)-q_i*s_(i-1)");
System.out.println("s_i beregnes som t_(i-2)-q_i*t_(i-1)");
java.util.Scanner input=new java.util.Scanner(System.in);
System.out.println("Angiv forst den storste vaerdi efterfulgt af den mindste.");
r2=input.nextInt();
r1=input.nextInt();
input.close();
int ra=r2;int rb=r1;
int k=0;
System.out.println("----------------------------------------------------------------------------");
System.out.println("|  I   "+"|"+"\t"+ "r" +"\t"+"|"+"\t" +"q" +"\t"+"|"+"\t" +"s" +"\t"+"|"+"\t"+ "t    |");
System.out.println("----------------------------------------------------------------------------");
System.out.println("| "+-2+"\t"+"\t"+r2+"\t"+"\t"+"\t"+"\t"+"1"+"\t"+"\t"+"0"+"\t"+"  |");
System.out.println("|"+"\t"+"\t"+"\t"+"\t"+"\t"+"\t"+"\t"+"\t"+"\t"+"  |");
System.out.println("| "+-1+"\t"+"\t"+r1+"\t"+"\t"+"\t"+"\t"+"0"+"\t"+"\t"+"1"+"\t"+"  |");
System.out.println("|"+"\t"+"\t"+"\t"+"\t"+"\t"+"\t"+"\t"+"\t"+"\t"+"  |");
while(r2%r1 != 0){
	q=r2/r1;
	x=r2%r1;
	System.out.print("| "+k+"\t"+ "r_"+k+"="+r2+"%"+r1+"="+x+"\t");
	System.out.print("q_"+k+"="+r2+"/"+r1+"="+q+"\t");
	r2=r1;
	r1=x;
	x=s1-q*s2;
	s1=s2;
System.out.print("s_"+k+"="+s1+"-"+q+"*"+s2+"="+x+"\t");
	s2=x;
	x=t1-q*t2;
	t1=t2;	
	System.out.println("t_"+k+"="+t1+"-"+q+"*"+t2+"="+x+"  |");
	t2=x;
	k++;
	System.out.println("|"+"\t"+"\t"+"losningen vil vaere "+r1+" = "+s2+" * "+ra+" + "+t2+" * "+rb+"\t"+"\t"+"  |");
	System.out.println("|"+"\t"+"\t"+"\t"+"\t"+"\t"+"\t"+"\t"+"\t"+"\t"+"  |");
}
System.out.println("----------------------------------------------------------------------------");
q=r2/r1;
x=r2%r1;
System.out.print("| "+k+"\t"+ "r_"+k+"="+r2+"%"+r1+"="+x+"\t");
System.out.print("q_"+k+"="+r2+"/"+r1+"="+q+"\t");
r2=r1;
r1=x;
x=s1-q*s2;
s1=s2;
System.out.print("s_"+k+"="+s1+"-"+q+"*"+s2+"="+x+"\t");
s2=x;
x=t1-q*t2;
t1=t2;	
System.out.println("t_"+k+"="+t1+"-"+q+"*"+t2+"="+x+"  |");
t2=x;
System.out.println("\t"+"\t"+"losningen vil vaere "+r1+" = "+s2+" * "+ra+" + "+t2+" * "+rb+"\t"+"\t"+"  |");
System.out.println("----------------------------------------------------------------------------");
System.out.println("\t"+"\t"+"\t"+"\t"+"GCD=(se I="+(k-1)+") losning");
	}
//løsningsligninger kan tilrettes til opgaven, algoritmen løser til ende.
//vælg en løsning der er tæt på den ønskede og modificer denne
}
