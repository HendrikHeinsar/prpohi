import java.util.Arrays;
public class Proov2{
	public static void main(String[] arg){
		isikukood[] isikukoodid=new isikukood[2];
		isikukoodid[0]=new isikukood("39807179999");
		isikukoodid[1]=new isikukood("39611196666");
		for(int i=0; i<isikukoodid.length; i++){
			System.out.println(isikukoodid[i].aastanr());
		}
		System.out.println("------------------------------");
		for(isikukood kood: isikukoodid){
			System.out.println(kood.aastanr());
		}
		System.out.println("------------------------------");
		Arrays.stream(isikukoodid).forEach(
			(kood)->{System.out.println(kood.aastanr());});
		System.out.println("------------------------------");
		Arrays.stream(isikukoodid).forEach(System.out::println);
		}
}