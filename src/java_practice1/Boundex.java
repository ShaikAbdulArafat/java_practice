package java_practice1;

public class Boundex {
public static void main(String[] args) {
	Generics1<B2> i=new Generics1<B2>(new B2());
	i.dorunterst();
	Generics1<B1> j=new Generics1<B1>(new B1());
	j.dorunterst();
	Generics1<B> k= new Generics1<B>(new B());
	k.dorunterst();
	
}
}
