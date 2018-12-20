package typecheck;
import syntaxtree.*;
public class Bucket {
	String key; 
	Type binding; 
	Bucket next;
	Bucket(String k, Type b, Bucket n) 
	{key=k; binding=b; next=n;}
}
