package typecheck;

import java.util.ArrayList;
import java.util.List;
import java.util.Map.Entry;
import syntaxtree.*;

public class MethodEntry  {
	ClassEntry parent; 
	String nome;
	public ClassEntry getParent() {
		return parent;
	}
	HashT symbols;
	Type typeReturn;
	
	public MethodEntry(String nome, Type tipo) {
		this.typeReturn = tipo;
		this.parent = null;
		this.nome = nome;
		symbols = new HashT();
		typeReturn = null;
	}

	public void addSymbol(String s, Type t) {
		this.symbols.insert(s, t);
	}
	public void setName(String name){
		this.nome = name;
	}
	public String getName() {
		return this.nome;
	}
	public void setParent(ClassEntry c) {
		this.parent = c;
	}
	public HashT getSymbols() {
		return symbols;
	}

	public Type getTypeReturn() {
		return typeReturn;
	}
	
	public void setTypReturn(Type typeReturn) {
		this.typeReturn = typeReturn;
	}
	
	public Type lookupVariable(String id) {
		Type type = symbols.lookup(id);
		ClassEntry classParent = parent;
		if (type == null) {
			type = classParent.lookupVariable(id);
		}
		return type;
	}
	
	public Type lookupMethod(String id) {
		Type methodReturn  = parent.lookupMethod(id);		
		return methodReturn;
	}
}
