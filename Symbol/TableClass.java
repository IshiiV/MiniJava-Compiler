package symbol;

import java.util.*;
import syntaxtree.*;

public class TableClass{
	private String Nome;
	private LinkedHashMap<Symbol, Type> TableVar;
	private LinkedHashMap<Symbol, TableMet> Tablemet;
	public TableClass(String nome){
		Nome = nome;
		TableVar = new LinkedHashMap<Symbol, Type>();
		Tablemet = new LinkedHashMap<Symbol, TableMet>();
	}
	public boolean addVar(Symbol s, Type t){
		if (!TableVar.containsKey(s)){
			TableVar.put(s,t);
			return true;
		}
		else
			return false;
	}
	public boolean addMethod(Symbol s, TableMet t){
		if (!Tablemet.containsKey(s)){
			Tablemet.put(s,t);
			return true;
		}
		else
			return false;
	}
	public String toString(){
		return Nome;
	}
	public void PrettyPrint(){
		Set<Symbol> keys = TableVar.keySet();
		for (Symbol i : keys)
			System.out.println(i.toString());
		Set<Symbol> keys2 = Tablemet.keySet();
		for (Symbol i : keys2){
			System.out.print("\tMethod "+i.toString());
			Tablemet.get(i).PrettyPrint();
			System.out.println("\t}");
		}
	}
	public TableMet getMethod(Symbol s){
		if (Tablemet.containsKey(s))
			return Tablemet.get(s);
		return null;
	}
	public Type getVar(Symbol s){
		if (TableVar.containsKey(s))
			return TableVar.get(s);
		return null;
	}
} 
