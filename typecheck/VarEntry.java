package typecheck;
import syntaxtree.*;
public class VarEntry {
	String nameVariable;
	Type typeVariable;
	public VarEntry(String s, Type t) {
		this.nameVariable = s;
		this.typeVariable = t;
	}
	public String getName() {
		return nameVariable;
	}
	public Type getType(){
		return typeVariable;
	}
}
