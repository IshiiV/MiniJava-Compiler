package FlowGraph;

import java.util.Hashtable;

import inst.*;
import graph.Node;
import Temp.*;

//Implement the AssemFlowGraph class that turns a list of Assem instructions into a flow graph.
//Use the abstract classes Graph.Graph and Flow- Graph.FlowGraph provided in
//$MINIJAVA/chap10 .



public class AssemFlowGraph extends FlowGraph {
	Hashtable<Node, Instr> grafo;
	Hashtable<Instr, Node> graforev;
	Hashtable<Label, Instr>	grafo1;
	Hashtable<Instr, Label>	graforev1;
	
	public Instr instr(Node n)
    {
        return map.get(n);
    }
    
    public Node node(Instr i)
    {
        return revMap.get(i);
    }


	
	public AssemFlowGraph(Assem.InstrList instrs){
        map = new Hashtable<Node, Instr>();
        revMap = new Hashtable<Instr, Node>();
        map1 = new Hashtable<Label, Instr>();
        revMap1 = new Hashtable<Instr,Label>();
        
        BuildGraph(instrs);
    }

	private void BuildGraph(InstrList instrs){ }
}
