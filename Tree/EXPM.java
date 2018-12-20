package tree;
import temp.Label;
import temp.Temp;
public class EXPM extends Stm {
  public Exp exp; 
  public EXPM(Exp e) {exp=e;}
  public ExpList kids() {return new ExpList(exp,null);}
  public Stm build(ExpList kids) {
    return new EXPM(kids.head);
  }
}
