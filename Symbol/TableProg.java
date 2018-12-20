package symbol;

import java.util.*;
import syntaxtree.*;

public class TableProg{
	private LinkedHashMap<Symbol, TableClass> TableClass;
	//private HashMap<Symbol, TableClass> TableClass;
	public TableProg(){
		tclass = new LinkedHashMap<Symbol, TableClass>();
		//tclass = new HashMap<Symbol, TableClass>();
	}
	public boolean addClass(Symbol s, TableClass t){
		if (!tclass.containsKey(s)){
			tclass.put(s,t);
			return true;
		}
		return false;
	}
	public void PrettyPrint(){
		Set<Symbol> keys = tclass.keySet();
		for (Symbol i : keys){
			System.out.println("Class "+i.toString()+" {");
			tclass.get(i).PrettyPrint();
			System.out.println("}");
		}
	}
	public TableClass getClass(Symbol s){
		if (tclass.containsKey(s))
			return tclass.get(s);
		return null;
	}
} 