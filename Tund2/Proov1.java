public class Proov1{
	public static void main(String[] arg){
		isikukood hendrik=new isikukood("39807179999");
		isikukood toomas=new isikukood("39611196666");
		System.out.println(hendrik.kuunr() + " kuu " + hendrik.kuunimi() + ", Paevanr " + hendrik.paevanr() + " aasta: " + hendrik.aastanr());
		System.out.println(toomas.kuunr() + " kuu " + toomas.kuunimi() + ", Paevanr " + toomas.paevanr() + " aasta: " + toomas.aastanr());
	}
}