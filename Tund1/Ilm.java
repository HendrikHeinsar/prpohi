import java.io.Console;
public class Ilm{
	public static String kooliminekuHinnang(int temperatuur){
		if(temperatuur<-28){return "Pead külmapüha";}
		return "Lähed kooli";
	}
	public static String riietuseHinnang(int temperatuur, int sademed){
		 if(temperatuur>0){return "Ole leebe!";}
		 if(temperatuur<-10){String[] talveriided={"Sin kasukas", "Punased püksid", "kollane jope"};
		 return talveriided[(int)(Math.random()*talveriided.length)];}
		 return (sademed>0) ? "vihmavari" : "jope";
	}
	public static void main(String[] arg){
		Console console = System.console();
		int temperatuur =-11;
		int sademed=10;
		try{
			if(arg.length>0){temperatuur=Integer.parseInt(arg[0]);}
			if(arg.length>1){sademed=Integer.parseInt(arg[0]);}
		} catch(Exception e){
			System.out.println("Pane temperatuur numbrina");
			System.out.println("java Ilm -15 2");
			return;
		}
		System.out.println(kooliminekuHinnang(temperatuur));
		System.out.println(riietuseHinnang(temperatuur, sademed));
	}
}