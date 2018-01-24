package onExperiments;

public class Messanger {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("ClsLdr : " + ClsLdr.class.getClassLoader().getClass().getName());
		String s  = new String("String");
		Messanger messanger = new Messanger();
		System.out.println("Messanger : " + Messanger.class.getClassLoader().getParent().getClass().getName());
	}
}
