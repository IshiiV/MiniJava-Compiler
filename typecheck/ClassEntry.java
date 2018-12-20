package typecheck;

import java.util.ArrayList;
import java.util.List;
import syntaxtree.*;
public class ClassEntry  {
	
	String parentName;
	ClassEntry parentClass;
	HashT typesMethods;
	
	public ArrayList<MethodEntry> methods;

	HashT symbols;

	final String className;
	
	public String getClassName() {
		return className;
	}
	
	public ClassEntry (String className, String parentName) {
		methods = new ArrayList<MethodEntry>();
		typesMethods = new HashT();
		symbols = new HashT();
		this.className = className;
		this.parentName = parentName;
		this.parentClass = null;
	}

	public ArrayList<MethodEntry> getMetodos() {
		return methods;
	}

	public void addMethods(MethodEntry method) {
		this.methods.add(method);
		method.setParent(this);
		this.typesMethods.insert(method.getName(), method.getTypeReturn());
	}

	public HashT getSymbols() {
		return symbols;
	}
	public void addSymbol(String s, Type t) {
		symbols.insert(s, t);
	}

	public void setSymbols(HashT variables) {
		this.symbols = variables;
	}
	
	public String getParentName() {
		return parentName;
	}
	
	public ClassEntry getParentClass() {
		return parentClass;
	}
	
	public void setParentClass(ClassEntry parentClass) {
		this.parentClass = parentClass;
	}
	
	public Type lookupVariable(String id) {
		Type field = symbols.lookup(id);
		
		if (field == null && parentClass != null) {
			field = parentClass.lookupVariable(id);
		}
		
		return field;
	}

	public Type lookupMethod(String id) {
		Type methodReturn = typesMethods.lookup(id);
		
		if (methodReturn == null && parentClass != null) {
			methodReturn = parentClass.lookupMethod(id);
		}
		
		return methodReturn;
	}
}
