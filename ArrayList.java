

public class ArrayList<T extends itemObject> extends java.util.ArrayList<T>{

	
	public itemObject getCatByCode(String code){
		//NasaSpaceShips apollo = new NasaSpaceShips();
		for(T i: this){
			if(i.getCode().equals(code)) return i;
		}return null;
	}
	
}
