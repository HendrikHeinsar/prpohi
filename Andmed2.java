public class Andmed2{
	
	public static int[] arvudeks(String[] andmed){
		int[] arvud=new int[andmed.length];
		for(int i=0; i<andmed.length; i++){
			arvud[i]=Integer.parseInt(andmed[i]);
		}
		return arvud;
	}
	public static int summa(int[] arvud){
		int summa = 0;
		for(int i=0; i<arvud.length;i++){
			summa = summa + arvud[i];
		}
		return summa;
	}
	public static void main(String[] arg){
		int[] a=arvudeks(arg);
		System.out.println(summa(a));
	}
}