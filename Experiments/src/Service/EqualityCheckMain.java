package Service;

import pojoClasses.Country;

public class EqualityCheckMain {

	public static void main(String[] args) {

		Country india1 = new Country();
		india1.setName("India");
		india1.setCapitalName("Delhi");
		Country india2 = new Country();
		india2.setName("India");
		india2.setCapitalName("Delhi");
		
		String name1 = india1.getName();
		String name2 = india2.getName();
		
		System.out.println("Is india1 is equal to india2 Object:" + india1.equals(india2));
		System.out.println("Is india1 is equal to india2 String:" + name1.equals(name2));
		
		
	}
	

}
