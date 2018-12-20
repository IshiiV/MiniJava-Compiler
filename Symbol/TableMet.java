package symbol;

import java.util.*;
import syntaxtree.*;

public class TableMet{
	private String Nome;
	private Type t;
	private LinkedHashMap<Symbol, Type> TableVar;
	private LinkedHashMap<Symbol, Type> TablePar;
	public TableMet(String nome, Type t){
		this.t = t;
		Nome = nome;
		TableVar = new LinkedHashMap<Symbol, Type>();
		TablePar = new LinkedHashMap<Symbol, Type>();
	}
	public boolean addVar(Symbol s, Type t){
		if (!TableVar.containsKey(s)){
			TableVar.put(s,t);
			return true;
		}
		else
			return false;
	}
	public boolean addParam(Symbol s, Type t){
		if (!TablePar.containsKey(s)){
			TablePar.put(s,t);
			return true;
		}
		else
			return false;
	}
	public String toString(){
		return Nome;
	}
	public void PrettyPrint(){
		Set<Symbol> keys2 = TablePar.keySet();
		int j = keys2.size();
		System.out.print("(");
		for (Symbol i : keys2){
			if (j > 1)
				System.out.print(i.toString()+", ");
			else
				System.out.print(i.toString());
			j--;
		}
		System.out.print(") {\n");
		Set<Symbol> keys = TableVar.keySet();
		for (Symbol i : keys)
			System.out.println("\t\t"+i.toString());
	}
	public Type getVar(Symbol s){
		if (TableVar.containsKey(s))
			return TableVar.get(s);
		return null;
	}
	public Type getParam(Symbol s){
		if (TablePar.containsKey(s))
			return TablePar.get(s);
		return null;
	}
	public Type getParam(int size){
		Set<Symbol> keys3 = TablePar.keySet();
		int j = 0;
		for (Symbol i : keys3){
			if (j+1 == size)
				return TablePar.get(i);
		}
		return null;
	}
	public int getNumParam(){
		return TablePar.size();
	}
	public Type getType(){
		return t;
	}
} 
