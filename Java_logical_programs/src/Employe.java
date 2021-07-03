
public class Employe implements Cloneable {
	public static void main(String[] args) throws CloneNotSupportedException {
		Employe e=new Employe();
		Employe e1=new Employe();
		String s="";
		String s1="";
		System.out.println(e.getClass());
		System.out.println(e.hashCode());
		System.out.println(e1.hashCode());
		System.out.println(e.equals(e1));
		System.out.println(s.equals(s1));
		System.out.println(e.clone());
	}

}
