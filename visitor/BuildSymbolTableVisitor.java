package visitor;

import syntaxtree.*;

public class BuildSymbolTableVisitor implements Visitor{

	private TableClass Classe;
	private TableMet Metodo;
	private TableProg Program;

	@Override
	public void visit(Program n) {
		n.m.accept(this);
	    for ( int i = 0; i < n.cl.size(); i++ ) {
	        n.cl.elementAt(i).accept(this);
	    }	
	}

	@Override
	public void visit(MainClass n) {
	    n.i1.accept(this);
	    TableClass c = new TableClass(n.i1.toString());
		currentClass = c;
	    n.i2.accept(this);
	    TableMet m = new TableMet("main",null);
		currentMethod = m;
		currentMethod.addParam(Symbol.symbol(n.i2.toString()),null);
	    n.s.accept(this);	
	}

	@Override
	public void visit(ClassDeclSimple n) {
	    n.i.accept(this);
	    TableClass c = new TableClass(n.i.toString());
	    currentClass = c;
		currentMethod = null;
	    for ( int i = 0; i < n.vl.size(); i++ ) {
	        n.vl.elementAt(i).accept(this);
	    }
	    for ( int i = 0; i < n.ml.size(); i++ ) {
	        n.ml.elementAt(i).accept(this);
	    }
		
	}

	@Override
	public void visit(ClassDeclExtends n) {
	    n.i.accept(this);
	   	TableClass c = new TableClass(n.i.toString());
	    currentClass = c;
	    currentMethod = null;
	    n.j.accept(this);
	    for ( int i = 0; i < n.vl.size(); i++ ) {
	        n.vl.elementAt(i).accept(this);
	    }
	    for ( int i = 0; i < n.ml.size(); i++ ) {
	        n.ml.elementAt(i).accept(this);
	    }
		
	}

	@Override
	public void visit(VarDecl n) {
	    n.t.accept(this);
	    n.i.accept(this);
		
	}

	@Override
	public void visit(MethodDecl n) {
	    n.t.accept(this);
	    n.i.accept(this);
	    TableMet m = new TableMet(n.i.toString(),n.t);
	    currentMethod = m;
	    for ( int i = 0; i < n.fl.size(); i++ ) {
	        n.fl.elementAt(i).accept(this);
	    }
	    for ( int i = 0; i < n.vl.size(); i++ ) {
	        n.vl.elementAt(i).accept(this);
	    }
	    for ( int i = 0; i < n.sl.size(); i++ ) {
	        n.sl.elementAt(i).accept(this);
	    }
	    n.e.accept(this);
		
	}

	@Override
	public void visit(Formal n) {
	    n.t.accept(this);
	    n.i.accept(this);
		
	}

	@Override
	public void visit(IntArrayType n) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void visit(BooleanType n) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void visit(IntegerType n) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void visit(IdentifierType n) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void visit(Block n) {
	    for ( int i = 0; i < n.sl.size(); i++ ) {
	        n.sl.elementAt(i).accept(this);
	    }		// TODO Auto-generated method stub
		
	}

	@Override
	public void visit(If n) {
	    n.e.accept(this);
	    n.s1.accept(this);
	    n.s2.accept(this);
		
	}

	@Override
	public void visit(While n) {
	    n.e.accept(this);
	    n.s.accept(this);
			
	}

	@Override
	public void visit(Print n) {
	    n.e.accept(this);
		
	}

	@Override
	public void visit(Assign n) {
	    n.i.accept(this);
	    n.e.accept(this);
	}

	@Override
	public void visit(ArrayAssign n) {
		n.i.accept(this);
		n.e1.accept(this);
		n.e2.accept(this);
		
	}

	@Override
	public void visit(And n) {
		n.e1.accept(this);
	 	n.e2.accept(this);
		
	}

	@Override
	public void visit(LessThan n) {
		n.e1.accept(this);
	 	n.e2.accept(this);
		
	}

	@Override
	public void visit(Plus n) {
		n.e1.accept(this);
	 	n.e2.accept(this);
		
	}

	@Override
	public void visit(Minus n) {
		n.e1.accept(this);
	 	n.e2.accept(this);
		
	}

	@Override
	public void visit(Times n) {
		n.e1.accept(this);
	 	n.e2.accept(this);
		
	}

	@Override
	public void visit(ArrayLookup n) {
		n.e1.accept(this);
	 	n.e2.accept(this);
		
	}

	@Override
	public void visit(ArrayLength n) {
   		n.e.accept(this);
	}

	@Override
	public void visit(Call n) {
		n.e.accept(this);
	    n.i.accept(this);
	    for ( int i = 0; i < n.el.size(); i++ ) {
	        n.el.elementAt(i).accept(this);
	    }
		
	}

	@Override
	public void visit(IntegerLiteral n) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void visit(True n) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void visit(False n) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void visit(IdentifierExp n) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void visit(This n) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void visit(NewArray n) {
		n.e.accept(this);
		
	}

	@Override
	public void visit(NewObject n) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void visit(Not n) {
	 	n.e.accept(this);
		
	}

	@Override
	public void visit(Identifier n) {
		// TODO Auto-generated method stub
		
	}

}
