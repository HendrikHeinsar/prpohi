import java.util.*;
public class Proov3{
	public static void main(String[] arg){
		List<isikukood> isikukoodid=new ArrayList<isikukood>();
		Map<String, Integer> kuusagedused=new HashMap<String, Integer>();
		isikukoodid.add(new isikukood("39611196666"));
		isikukoodid.add(new isikukood("39807189999"));
		isikukoodid.add(new isikukood("39607179999"));
		for(isikukood kood: isikukoodid){
			String kuu=kood.kuunimi();
			//System.out.println(kood.aastanr());
			if(kuusagedused.get(kuu)==null){
				kuusagedused.put(kuu, 1);
			}else{
				int kogus=kuusagedused.get(kuu);
				kuusagedused.put(kuu, kogus+1);
			}
		}
		System.out.println(kuusagedused);
		isikukoodid.stream().forEach(System.out::println);
		for(int i=0; i<isikukoodid.size(); i++){
			System.out.println(isikukoodid.get(i));
		}
	}
}