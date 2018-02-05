public class isikukood{
	protected String andmed;
	public isikukood(String uusKood){
		andmed=uusKood;
	}
	public int kuunr(){
		return Integer.parseInt(andmed.substring(3,5));
	}
	public int paevanr(){
		return Integer.parseInt(andmed.substring(5,7));
	}
	public String kuunimi(){
		String[] kuunimed={"","jaanuar","veebruar","märts","aprill","mai","juuni","juuli","august","september","oktoober","november","detsember"};
		return kuunimed[kuunr()];
	}
	public int aastanr(){
		int[] aastanr = new int[4];
		aastanr[0] = 1;
		aastanr[2] = Integer.parseInt(andmed.substring(1,2));
		aastanr[3] = Integer.parseInt(andmed.substring(2,3));
		if(Integer.parseInt(andmed.substring(0,1)) > 0 && Integer.parseInt(andmed.substring(0,1)) < 3 ){
			aastanr[1] = 8;
		}else if(Integer.parseInt(andmed.substring(0,1)) > 2 && Integer.parseInt(andmed.substring(0,1)) < 5 ){
			aastanr[1] = 9;
		}else if(Integer.parseInt(andmed.substring(0,1)) > 4 && Integer.parseInt(andmed.substring(0,1)) < 7 ){
			aastanr[0] = 2;
			aastanr[1] = 0;
		}
		int aasta = aastanr[0]*1000 + aastanr[1]*100 + aastanr[2]*10 + aastanr[3];
		return aasta;
	}
	@Override
	public String toString(){
		return paevanr()+". "+kuunimi()+" "+aastanr();
	}
	}