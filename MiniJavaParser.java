/* MiniJavaParser.java */
/* Generated By:JavaCC: Do not edit this line. MiniJavaParser.java */
import syntaxtree.*;
public class MiniJavaParser implements MiniJavaParserConstants {

// The following is a simple grammar that will allow you
// to test the generated lexer.

  static final public Program Goal() throws ParseException {MainClass mc;
        ClassDeclList cdl;
    mc = MainClass();
    cdl = ClassDeclarationList();
{if ("" != null) return new Program(mc,cdl);}
    throw new Error("Missing return statement in function");
  }

  static final public MainClass MainClass() throws ParseException {Identifier i1,i2;
        Statement s;
    jj_consume_token(CLASS);
    i1 = Identifier();
    jj_consume_token(LBRACE);
    jj_consume_token(PUBLIC);
    jj_consume_token(STATIC);
    jj_consume_token(VOID);
    jj_consume_token(MAIN);
    jj_consume_token(LPAREN);
    jj_consume_token(STRING);
    jj_consume_token(LCOUCH);
    jj_consume_token(RCOUCH);
    i2 = Identifier();
    jj_consume_token(RPAREN);
    jj_consume_token(LBRACE);
    s = Statement();
    jj_consume_token(RBRACE);
    jj_consume_token(RBRACE);
{if ("" != null) return new MainClass(i1,i2,s);}
    throw new Error("Missing return statement in function");
  }

  static final public Identifier Identifier() throws ParseException {Token t;
    t = jj_consume_token(IDENTIFIER);
{if ("" != null) return new Identifier(t.image);}
    throw new Error("Missing return statement in function");
  }

  static final public ClassDeclList ClassDeclarationList() throws ParseException {ClassDeclList cdl = new ClassDeclList();
        ClassDecl cd;
    label_1:
    while (true) {
      if (jj_2_1(2)) {
        ;
      } else {
        break label_1;
      }
      cd = ClassDeclarationAux();
cdl.addElement(cd);
    }
{if ("" != null) return cdl;}
    throw new Error("Missing return statement in function");
  }

  static final public ClassDecl ClassDeclarationAux() throws ParseException {ClassDecl cd;
    if (jj_2_2(3)) {
      cd = ClassDeclarationSimple();
    } else {
      switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
      case CLASS:{
        cd = ClassDeclarationExtends();
        break;
        }
      default:
        jj_la1[0] = jj_gen;
        jj_consume_token(-1);
        throw new ParseException();
      }
    }
{if ("" != null) return cd;}
    throw new Error("Missing return statement in function");
  }

  static final public ClassDeclSimple ClassDeclarationSimple() throws ParseException {Identifier i1;
        VarDeclList vdl;
        MethodDeclList mdl;
    jj_consume_token(CLASS);
    i1 = Identifier();
    jj_consume_token(LBRACE);
    vdl = VarDeclarationList();
    mdl = MethodDeclarationList();
    jj_consume_token(RBRACE);
{if ("" != null) return new ClassDeclSimple(i1,vdl,mdl);}
    throw new Error("Missing return statement in function");
  }

  static final public ClassDeclExtends ClassDeclarationExtends() throws ParseException {Identifier i1,i2;
        VarDeclList vdl;
        MethodDeclList mdl;
    jj_consume_token(CLASS);
    i1 = Identifier();
    jj_consume_token(EXTENDS);
    i2 = Identifier();
    jj_consume_token(LBRACE);
    vdl = VarDeclarationList();
    mdl = MethodDeclarationList();
    jj_consume_token(RBRACE);
{if ("" != null) return new ClassDeclExtends(i1,i2,vdl,mdl);}
    throw new Error("Missing return statement in function");
  }

  static final public VarDeclList VarDeclarationList() throws ParseException {VarDecl vd;
        VarDeclList vdl = new VarDeclList();
    label_2:
    while (true) {
      if (jj_2_3(2)) {
        ;
      } else {
        break label_2;
      }
      vd = VarDeclaration();
vdl.addElement(vd);
    }
{if ("" != null) return vdl;}
    throw new Error("Missing return statement in function");
  }

  static final public VarDecl VarDeclaration() throws ParseException {Type t;
        Identifier i;
    t = Type();
    i = Identifier();
    jj_consume_token(SEMICOLON);
{if ("" != null) return new VarDecl(t,i);}
    throw new Error("Missing return statement in function");
  }

  static final public MethodDeclList MethodDeclarationList() throws ParseException {MethodDecl md;
        MethodDeclList mdl = new MethodDeclList();
    label_3:
    while (true) {
      switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
      case PUBLIC:{
        ;
        break;
        }
      default:
        jj_la1[1] = jj_gen;
        break label_3;
      }
      md = MethodDeclaration();
mdl.addElement(md);
    }
{if ("" != null) return mdl;}
    throw new Error("Missing return statement in function");
  }

  static final public MethodDecl MethodDeclaration() throws ParseException {Type t;
        Identifier i1;
        FormalList fl = null;
        VarDeclList vdl;
        StatementList sl;
        Exp e;
    jj_consume_token(PUBLIC);
    t = Type();
    i1 = Identifier();
    jj_consume_token(LPAREN);
    switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
    case BOOLEAN:
    case INTEGER:
    case IDENTIFIER:{
      fl = FormalList();
      break;
      }
    default:
      jj_la1[2] = jj_gen;
      ;
    }
    jj_consume_token(RPAREN);
    jj_consume_token(LBRACE);
    vdl = VarDeclarationList();
    sl = StatementList();
    jj_consume_token(RETURN);
    e = Exp();
    jj_consume_token(SEMICOLON);
    jj_consume_token(RBRACE);
{if ("" != null) return new MethodDecl(t,i1,fl,vdl,sl,e);}
    throw new Error("Missing return statement in function");
  }

  static final public FormalList FormalList() throws ParseException {Formal f,fe;
        FormalList fl = new FormalList();
    f = Formal();
fl.addElement(f);
    label_4:
    while (true) {
      switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
      case VIRG:{
        ;
        break;
        }
      default:
        jj_la1[3] = jj_gen;
        break label_4;
      }
      fe = FormalExtra();
fl.addElement(fe);
    }
{if ("" != null) return fl;}
    throw new Error("Missing return statement in function");
  }

  static final public Formal Formal() throws ParseException {Type t;
        Identifier i;
    t = Type();
    i = Identifier();
{if ("" != null) return new Formal(t,i);}
    throw new Error("Missing return statement in function");
  }

  static final public Formal FormalExtra() throws ParseException {Type t;
        Identifier i;
    jj_consume_token(VIRG);
    t = Type();
    i = Identifier();
{if ("" != null) return new Formal(t,i);}
    throw new Error("Missing return statement in function");
  }

  static final public Type Type() throws ParseException {Type t;
    if (jj_2_4(2)) {
      t = IntArrayType();
    } else {
      switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
      case BOOLEAN:{
        t = BooleanType();
        break;
        }
      case INTEGER:{
        t = IntegerType();
        break;
        }
      case IDENTIFIER:{
        t = IdentifierType();
        break;
        }
      default:
        jj_la1[4] = jj_gen;
        jj_consume_token(-1);
        throw new ParseException();
      }
    }
{if ("" != null) return t;}
    throw new Error("Missing return statement in function");
  }

  static final public Type IntArrayType() throws ParseException {
    jj_consume_token(INTEGER);
    jj_consume_token(LCOUCH);
    jj_consume_token(RCOUCH);
{if ("" != null) return new IntArrayType();}
    throw new Error("Missing return statement in function");
  }

  static final public Type BooleanType() throws ParseException {
    jj_consume_token(BOOLEAN);
{if ("" != null) return new BooleanType();}
    throw new Error("Missing return statement in function");
  }

  static final public Type IntegerType() throws ParseException {
    jj_consume_token(INTEGER);
{if ("" != null) return new IntegerType();}
    throw new Error("Missing return statement in function");
  }

  static final public Type IdentifierType() throws ParseException {Identifier i;
    i = Identifier();
{if ("" != null) return new IdentifierType(i.s);}
    throw new Error("Missing return statement in function");
  }

  static final public ExpList ExpList() throws ParseException {Exp e,ee;
        ExpList el = new ExpList();
    e = Exp();
el.addElement(e);
    label_5:
    while (true) {
      switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
      case VIRG:{
        ;
        break;
        }
      default:
        jj_la1[5] = jj_gen;
        break label_5;
      }
      ee = ExpExtra();
el.addElement(ee);
    }
{if ("" != null) return el;}
    throw new Error("Missing return statement in function");
  }

  static final public Exp Exp() throws ParseException {Exp e;
    e = ExpFirst();
{if ("" != null) return ExpSecond(e);}
    throw new Error("Missing return statement in function");
  }

  static final public Exp ExpExtra() throws ParseException {Exp e;
    jj_consume_token(VIRG);
    e = ExpFirst();
{if ("" != null) return ExpSecond(e);}
    throw new Error("Missing return statement in function");
  }

  static final public Exp ExpFirst() throws ParseException {Token t;
        Identifier i1;
        Exp e;
    switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
    case INTEGER_LITERAL:{
      t = jj_consume_token(INTEGER_LITERAL);
{if ("" != null) return new IntegerLiteral(Integer.parseInt(t.image));}
      break;
      }
    case TRUE:{
      jj_consume_token(TRUE);
{if ("" != null) return new True();}
      break;
      }
    case FALSE:{
      jj_consume_token(FALSE);
{if ("" != null) return new False();}
      break;
      }
    case IDENTIFIER:{
      i1 = Identifier();
{if ("" != null) return new IdentifierExp(i1.toString());}
      break;
      }
    case THIS:{
      jj_consume_token(THIS);
{if ("" != null) return new This();}
      break;
      }
    default:
      jj_la1[6] = jj_gen;
      if (jj_2_5(3)) {
        jj_consume_token(NEW);
        jj_consume_token(INTEGER);
        jj_consume_token(LCOUCH);
        e = Exp();
        jj_consume_token(RCOUCH);
{if ("" != null) return new NewArray(e);}
      } else if (jj_2_6(3)) {
        jj_consume_token(NEW);
        i1 = Identifier();
        jj_consume_token(LPAREN);
        jj_consume_token(RPAREN);
{if ("" != null) return new NewObject(i1);}
      } else {
        switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
        case NOT:{
          jj_consume_token(NOT);
          e = Exp();
{if ("" != null) return new Not(e);}
          break;
          }
        case LPAREN:{
          jj_consume_token(LPAREN);
          e = Exp();
          jj_consume_token(RPAREN);
{if ("" != null) return ExpSecond(e);}
          break;
          }
        default:
          jj_la1[7] = jj_gen;
          jj_consume_token(-1);
          throw new ParseException();
        }
      }
    }
    throw new Error("Missing return statement in function");
  }

  static final public Exp ExpSecond(Exp e1) throws ParseException {Exp e2;
        Identifier i1;
        ExpList el;
    switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
    case AND:{
      jj_consume_token(AND);
      e2 = Exp();
{if ("" != null) return new And(e1,e2);}
      break;
      }
    case LESS:{
      jj_consume_token(LESS);
      e2 = Exp();
{if ("" != null) return new LessThan(e1,e2);}
      break;
      }
    case PLUS:{
      jj_consume_token(PLUS);
      e2 = Exp();
{if ("" != null) return new Plus(e1,e2);}
      break;
      }
    case SUB:{
      jj_consume_token(SUB);
      e2 = Exp();
{if ("" != null) return new Minus(e1,e2);}
      break;
      }
    case MUL:{
      jj_consume_token(MUL);
      e2 = Exp();
{if ("" != null) return new Times(e1,e2);}
      break;
      }
    case LCOUCH:{
      jj_consume_token(LCOUCH);
      e2 = Exp();
      jj_consume_token(RCOUCH);
{if ("" != null) return ExpSecond(e2);}
      break;
      }
    default:
      jj_la1[8] = jj_gen;
      if (jj_2_7(2)) {
        jj_consume_token(DOT);
        jj_consume_token(LENGTH);
{if ("" != null) return new ArrayLength(e1);}
      } else {
        switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
        case DOT:{
          jj_consume_token(DOT);
          i1 = Identifier();
          jj_consume_token(LPAREN);
          el = ExpList();
          jj_consume_token(RPAREN);
{if ("" != null) return new Call(e1,i1,el);}
          break;
          }
        default:
          jj_la1[9] = jj_gen;
{if ("" != null) return e1;}
        }
      }
    }
    throw new Error("Missing return statement in function");
  }

  static final public StatementList StatementList() throws ParseException {Statement s;
        StatementList sl = new StatementList();
    label_6:
    while (true) {
      switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
      case LBRACE:
      case IF:
      case WHILE:
      case IDENTIFIER:
      case PRINT:{
        ;
        break;
        }
      default:
        jj_la1[10] = jj_gen;
        break label_6;
      }
      s = Statement();
sl.addElement(s);
    }
{if ("" != null) return sl;}
    throw new Error("Missing return statement in function");
  }

  static final public Statement Statement() throws ParseException {Statement s;
    switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
    case LBRACE:{
      jj_consume_token(LBRACE);
      s = Statement();
      jj_consume_token(RBRACE);
      break;
      }
    case IF:{
      s = If();
      break;
      }
    case WHILE:{
      s = While();
      break;
      }
    case PRINT:{
      s = Print();
      break;
      }
    case IDENTIFIER:{
      s = Assign();
      break;
      }
    default:
      jj_la1[11] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
{if ("" != null) return s;}
    throw new Error("Missing return statement in function");
  }

  static final public Statement If() throws ParseException {Exp e;
        Statement s1,s2;
    jj_consume_token(IF);
    jj_consume_token(LPAREN);
    e = Exp();
    jj_consume_token(RPAREN);
    s1 = Statement();
    jj_consume_token(ELSE);
    s2 = Statement();
{if ("" != null) return new If(e,s1,s2);}
    throw new Error("Missing return statement in function");
  }

  static final public Statement While() throws ParseException {Exp e;
        Statement s;
    jj_consume_token(WHILE);
    jj_consume_token(LPAREN);
    e = Exp();
    jj_consume_token(RPAREN);
    s = Statement();
{if ("" != null) return new While(e,s);}
    throw new Error("Missing return statement in function");
  }

  static final public Statement Print() throws ParseException {Exp e;
    jj_consume_token(PRINT);
    jj_consume_token(LPAREN);
    e = Exp();
    jj_consume_token(RPAREN);
    jj_consume_token(SEMICOLON);
{if ("" != null) return new Print(e);}
    throw new Error("Missing return statement in function");
  }

  static final public Statement Assign() throws ParseException {Identifier i;
        Exp e;
    i = Identifier();
    jj_consume_token(ASSIGN);
    e = Exp();
    jj_consume_token(SEMICOLON);
{if ("" != null) return new Assign(i,e);}
    throw new Error("Missing return statement in function");
  }

  static final public Statement ArrayAssign() throws ParseException {Identifier i;
        Exp e1,e2;
    i = Identifier();
    jj_consume_token(LCOUCH);
    e1 = Exp();
    jj_consume_token(RCOUCH);
    jj_consume_token(ASSIGN);
    e2 = Exp();
    jj_consume_token(SEMICOLON);
{if ("" != null) return new ArrayAssign(i,e1,e2);}
    throw new Error("Missing return statement in function");
  }

  static private boolean jj_2_1(int xla)
 {
    jj_la = xla; jj_lastpos = jj_scanpos = token;
    try { return !jj_3_1(); }
    catch(LookaheadSuccess ls) { return true; }
    finally { jj_save(0, xla); }
  }

  static private boolean jj_2_2(int xla)
 {
    jj_la = xla; jj_lastpos = jj_scanpos = token;
    try { return !jj_3_2(); }
    catch(LookaheadSuccess ls) { return true; }
    finally { jj_save(1, xla); }
  }

  static private boolean jj_2_3(int xla)
 {
    jj_la = xla; jj_lastpos = jj_scanpos = token;
    try { return !jj_3_3(); }
    catch(LookaheadSuccess ls) { return true; }
    finally { jj_save(2, xla); }
  }

  static private boolean jj_2_4(int xla)
 {
    jj_la = xla; jj_lastpos = jj_scanpos = token;
    try { return !jj_3_4(); }
    catch(LookaheadSuccess ls) { return true; }
    finally { jj_save(3, xla); }
  }

  static private boolean jj_2_5(int xla)
 {
    jj_la = xla; jj_lastpos = jj_scanpos = token;
    try { return !jj_3_5(); }
    catch(LookaheadSuccess ls) { return true; }
    finally { jj_save(4, xla); }
  }

  static private boolean jj_2_6(int xla)
 {
    jj_la = xla; jj_lastpos = jj_scanpos = token;
    try { return !jj_3_6(); }
    catch(LookaheadSuccess ls) { return true; }
    finally { jj_save(5, xla); }
  }

  static private boolean jj_2_7(int xla)
 {
    jj_la = xla; jj_lastpos = jj_scanpos = token;
    try { return !jj_3_7(); }
    catch(LookaheadSuccess ls) { return true; }
    finally { jj_save(6, xla); }
  }

  static private boolean jj_3_3()
 {
    if (jj_3R_9()) return true;
    return false;
  }

  static private boolean jj_3R_12()
 {
    if (jj_3R_14()) return true;
    return false;
  }

  static private boolean jj_3_4()
 {
    if (jj_3R_10()) return true;
    return false;
  }

  static private boolean jj_3R_13()
 {
    Token xsp;
    xsp = jj_scanpos;
    if (jj_3_4()) {
    jj_scanpos = xsp;
    if (jj_3R_15()) {
    jj_scanpos = xsp;
    if (jj_3R_16()) {
    jj_scanpos = xsp;
    if (jj_3R_17()) return true;
    }
    }
    }
    return false;
  }

  static private boolean jj_3_6()
 {
    if (jj_scan_token(NEW)) return true;
    if (jj_3R_11()) return true;
    if (jj_scan_token(LPAREN)) return true;
    return false;
  }

  static private boolean jj_3_5()
 {
    if (jj_scan_token(NEW)) return true;
    if (jj_scan_token(INTEGER)) return true;
    if (jj_scan_token(LCOUCH)) return true;
    return false;
  }

  static private boolean jj_3R_20()
 {
    if (jj_3R_11()) return true;
    return false;
  }

  static private boolean jj_3_1()
 {
    if (jj_3R_7()) return true;
    return false;
  }

  static private boolean jj_3R_14()
 {
    if (jj_scan_token(CLASS)) return true;
    if (jj_3R_11()) return true;
    return false;
  }

  static private boolean jj_3R_15()
 {
    if (jj_3R_18()) return true;
    return false;
  }

  static private boolean jj_3R_19()
 {
    if (jj_scan_token(INTEGER)) return true;
    return false;
  }

  static private boolean jj_3R_11()
 {
    if (jj_scan_token(IDENTIFIER)) return true;
    return false;
  }

  static private boolean jj_3R_17()
 {
    if (jj_3R_20()) return true;
    return false;
  }

  static private boolean jj_3R_18()
 {
    if (jj_scan_token(BOOLEAN)) return true;
    return false;
  }

  static private boolean jj_3_7()
 {
    if (jj_scan_token(DOT)) return true;
    if (jj_scan_token(LENGTH)) return true;
    return false;
  }

  static private boolean jj_3R_8()
 {
    if (jj_scan_token(CLASS)) return true;
    if (jj_3R_11()) return true;
    if (jj_scan_token(LBRACE)) return true;
    return false;
  }

  static private boolean jj_3R_9()
 {
    if (jj_3R_13()) return true;
    if (jj_3R_11()) return true;
    return false;
  }

  static private boolean jj_3R_10()
 {
    if (jj_scan_token(INTEGER)) return true;
    if (jj_scan_token(LCOUCH)) return true;
    return false;
  }

  static private boolean jj_3_2()
 {
    if (jj_3R_8()) return true;
    return false;
  }

  static private boolean jj_3R_7()
 {
    Token xsp;
    xsp = jj_scanpos;
    if (jj_3_2()) {
    jj_scanpos = xsp;
    if (jj_3R_12()) return true;
    }
    return false;
  }

  static private boolean jj_3R_16()
 {
    if (jj_3R_19()) return true;
    return false;
  }

  static private boolean jj_initialized_once = false;
  /** Generated Token Manager. */
  static public MiniJavaParserTokenManager token_source;
  static JavaCharStream jj_input_stream;
  /** Current token. */
  static public Token token;
  /** Next token. */
  static public Token jj_nt;
  static private int jj_ntk;
  static private Token jj_scanpos, jj_lastpos;
  static private int jj_la;
  static private int jj_gen;
  static final private int[] jj_la1 = new int[12];
  static private int[] jj_la1_0;
  static private int[] jj_la1_1;
  static {
      jj_la1_init_0();
      jj_la1_init_1();
   }
   private static void jj_la1_init_0() {
      jj_la1_0 = new int[] {0x0,0x0,0x0,0x800,0x0,0x800,0x0,0x2080000,0x14258000,0x400,0x40800000,0x40800000,};
   }
   private static void jj_la1_init_1() {
      jj_la1_1 = new int[] {0x2000,0x4000,0x10180,0x0,0x10180,0x0,0x90016,0x0,0x0,0x0,0x110001,0x110001,};
   }
  static final private JJCalls[] jj_2_rtns = new JJCalls[7];
  static private boolean jj_rescan = false;
  static private int jj_gc = 0;

  /** Constructor with InputStream. */
  public MiniJavaParser(java.io.InputStream stream) {
     this(stream, null);
  }
  /** Constructor with InputStream and supplied encoding */
  public MiniJavaParser(java.io.InputStream stream, String encoding) {
    if (jj_initialized_once) {
      System.out.println("ERROR: Second call to constructor of static parser.  ");
      System.out.println("       You must either use ReInit() or set the JavaCC option STATIC to false");
      System.out.println("       during parser generation.");
      throw new Error();
    }
    jj_initialized_once = true;
    try { jj_input_stream = new JavaCharStream(stream, encoding, 1, 1); } catch(java.io.UnsupportedEncodingException e) { throw new RuntimeException(e); }
    token_source = new MiniJavaParserTokenManager(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 12; i++) jj_la1[i] = -1;
    for (int i = 0; i < jj_2_rtns.length; i++) jj_2_rtns[i] = new JJCalls();
  }

  /** Reinitialise. */
  static public void ReInit(java.io.InputStream stream) {
     ReInit(stream, null);
  }
  /** Reinitialise. */
  static public void ReInit(java.io.InputStream stream, String encoding) {
    try { jj_input_stream.ReInit(stream, encoding, 1, 1); } catch(java.io.UnsupportedEncodingException e) { throw new RuntimeException(e); }
    token_source.ReInit(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 12; i++) jj_la1[i] = -1;
    for (int i = 0; i < jj_2_rtns.length; i++) jj_2_rtns[i] = new JJCalls();
  }

  /** Constructor. */
  public MiniJavaParser(java.io.Reader stream) {
    if (jj_initialized_once) {
      System.out.println("ERROR: Second call to constructor of static parser. ");
      System.out.println("       You must either use ReInit() or set the JavaCC option STATIC to false");
      System.out.println("       during parser generation.");
      throw new Error();
    }
    jj_initialized_once = true;
    jj_input_stream = new JavaCharStream(stream, 1, 1);
    token_source = new MiniJavaParserTokenManager(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 12; i++) jj_la1[i] = -1;
    for (int i = 0; i < jj_2_rtns.length; i++) jj_2_rtns[i] = new JJCalls();
  }

  /** Reinitialise. */
  static public void ReInit(java.io.Reader stream) {
    jj_input_stream.ReInit(stream, 1, 1);
    token_source.ReInit(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 12; i++) jj_la1[i] = -1;
    for (int i = 0; i < jj_2_rtns.length; i++) jj_2_rtns[i] = new JJCalls();
  }

  /** Constructor with generated Token Manager. */
  public MiniJavaParser(MiniJavaParserTokenManager tm) {
    if (jj_initialized_once) {
      System.out.println("ERROR: Second call to constructor of static parser. ");
      System.out.println("       You must either use ReInit() or set the JavaCC option STATIC to false");
      System.out.println("       during parser generation.");
      throw new Error();
    }
    jj_initialized_once = true;
    token_source = tm;
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 12; i++) jj_la1[i] = -1;
    for (int i = 0; i < jj_2_rtns.length; i++) jj_2_rtns[i] = new JJCalls();
  }

  /** Reinitialise. */
  public void ReInit(MiniJavaParserTokenManager tm) {
    token_source = tm;
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 12; i++) jj_la1[i] = -1;
    for (int i = 0; i < jj_2_rtns.length; i++) jj_2_rtns[i] = new JJCalls();
  }

  static private Token jj_consume_token(int kind) throws ParseException {
    Token oldToken;
    if ((oldToken = token).next != null) token = token.next;
    else token = token.next = token_source.getNextToken();
    jj_ntk = -1;
    if (token.kind == kind) {
      jj_gen++;
      if (++jj_gc > 100) {
        jj_gc = 0;
        for (int i = 0; i < jj_2_rtns.length; i++) {
          JJCalls c = jj_2_rtns[i];
          while (c != null) {
            if (c.gen < jj_gen) c.first = null;
            c = c.next;
          }
        }
      }
      return token;
    }
    token = oldToken;
    jj_kind = kind;
    throw generateParseException();
  }

  @SuppressWarnings("serial")
  static private final class LookaheadSuccess extends java.lang.Error { }
  static final private LookaheadSuccess jj_ls = new LookaheadSuccess();
  static private boolean jj_scan_token(int kind) {
    if (jj_scanpos == jj_lastpos) {
      jj_la--;
      if (jj_scanpos.next == null) {
        jj_lastpos = jj_scanpos = jj_scanpos.next = token_source.getNextToken();
      } else {
        jj_lastpos = jj_scanpos = jj_scanpos.next;
      }
    } else {
      jj_scanpos = jj_scanpos.next;
    }
    if (jj_rescan) {
      int i = 0; Token tok = token;
      while (tok != null && tok != jj_scanpos) { i++; tok = tok.next; }
      if (tok != null) jj_add_error_token(kind, i);
    }
    if (jj_scanpos.kind != kind) return true;
    if (jj_la == 0 && jj_scanpos == jj_lastpos) throw jj_ls;
    return false;
  }


/** Get the next Token. */
  static final public Token getNextToken() {
    if (token.next != null) token = token.next;
    else token = token.next = token_source.getNextToken();
    jj_ntk = -1;
    jj_gen++;
    return token;
  }

/** Get the specific Token. */
  static final public Token getToken(int index) {
    Token t = token;
    for (int i = 0; i < index; i++) {
      if (t.next != null) t = t.next;
      else t = t.next = token_source.getNextToken();
    }
    return t;
  }

  static private int jj_ntk_f() {
    if ((jj_nt=token.next) == null)
      return (jj_ntk = (token.next=token_source.getNextToken()).kind);
    else
      return (jj_ntk = jj_nt.kind);
  }

  static private java.util.List<int[]> jj_expentries = new java.util.ArrayList<int[]>();
  static private int[] jj_expentry;
  static private int jj_kind = -1;
  static private int[] jj_lasttokens = new int[100];
  static private int jj_endpos;

  static private void jj_add_error_token(int kind, int pos) {
    if (pos >= 100) return;
    if (pos == jj_endpos + 1) {
      jj_lasttokens[jj_endpos++] = kind;
    } else if (jj_endpos != 0) {
      jj_expentry = new int[jj_endpos];
      for (int i = 0; i < jj_endpos; i++) {
        jj_expentry[i] = jj_lasttokens[i];
      }
      jj_entries_loop: for (java.util.Iterator<?> it = jj_expentries.iterator(); it.hasNext();) {
        int[] oldentry = (int[])(it.next());
        if (oldentry.length == jj_expentry.length) {
          for (int i = 0; i < jj_expentry.length; i++) {
            if (oldentry[i] != jj_expentry[i]) {
              continue jj_entries_loop;
            }
          }
          jj_expentries.add(jj_expentry);
          break jj_entries_loop;
        }
      }
      if (pos != 0) jj_lasttokens[(jj_endpos = pos) - 1] = kind;
    }
  }

  /** Generate ParseException. */
  static public ParseException generateParseException() {
    jj_expentries.clear();
    boolean[] la1tokens = new boolean[57];
    if (jj_kind >= 0) {
      la1tokens[jj_kind] = true;
      jj_kind = -1;
    }
    for (int i = 0; i < 12; i++) {
      if (jj_la1[i] == jj_gen) {
        for (int j = 0; j < 32; j++) {
          if ((jj_la1_0[i] & (1<<j)) != 0) {
            la1tokens[j] = true;
          }
          if ((jj_la1_1[i] & (1<<j)) != 0) {
            la1tokens[32+j] = true;
          }
        }
      }
    }
    for (int i = 0; i < 57; i++) {
      if (la1tokens[i]) {
        jj_expentry = new int[1];
        jj_expentry[0] = i;
        jj_expentries.add(jj_expentry);
      }
    }
    jj_endpos = 0;
    jj_rescan_token();
    jj_add_error_token(0, 0);
    int[][] exptokseq = new int[jj_expentries.size()][];
    for (int i = 0; i < jj_expentries.size(); i++) {
      exptokseq[i] = jj_expentries.get(i);
    }
    return new ParseException(token, exptokseq, tokenImage);
  }

  /** Enable tracing. */
  static final public void enable_tracing() {
  }

  /** Disable tracing. */
  static final public void disable_tracing() {
  }

  static private void jj_rescan_token() {
    jj_rescan = true;
    for (int i = 0; i < 7; i++) {
    try {
      JJCalls p = jj_2_rtns[i];
      do {
        if (p.gen > jj_gen) {
          jj_la = p.arg; jj_lastpos = jj_scanpos = p.first;
          switch (i) {
            case 0: jj_3_1(); break;
            case 1: jj_3_2(); break;
            case 2: jj_3_3(); break;
            case 3: jj_3_4(); break;
            case 4: jj_3_5(); break;
            case 5: jj_3_6(); break;
            case 6: jj_3_7(); break;
          }
        }
        p = p.next;
      } while (p != null);
      } catch(LookaheadSuccess ls) { }
    }
    jj_rescan = false;
  }

  static private void jj_save(int index, int xla) {
    JJCalls p = jj_2_rtns[index];
    while (p.gen > jj_gen) {
      if (p.next == null) { p = p.next = new JJCalls(); break; }
      p = p.next;
    }
    p.gen = jj_gen + xla - jj_la; p.first = token; p.arg = xla;
  }

  static final class JJCalls {
    int gen;
    Token first;
    int arg;
    JJCalls next;
  }

                             }
