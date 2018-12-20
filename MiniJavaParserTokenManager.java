/* MiniJavaParserTokenManager.java */
/* Generated By:JavaCC: Do not edit this line. MiniJavaParserTokenManager.java */
import syntaxtree.*;

/** Token Manager. */
@SuppressWarnings("unused")public class MiniJavaParserTokenManager implements MiniJavaParserConstants {

  /** Debug output. */
  public static  java.io.PrintStream debugStream = System.out;
  /** Set debug output. */
  public static  void setDebugStream(java.io.PrintStream ds) { debugStream = ds; }
private static final int jjStopStringLiteralDfa_0(int pos, long active0){
   switch (pos)
   {
      case 0:
         if ((active0 & 0x20080L) != 0L)
            return 0;
         if ((active0 & 0x1f0ffffc0000000L) != 0L)
         {
            jjmatchedKind = 48;
            return 5;
         }
         return -1;
      case 1:
         if ((active0 & 0x1f0ffff80000000L) != 0L)
         {
            jjmatchedKind = 48;
            jjmatchedPos = 1;
            return 5;
         }
         if ((active0 & 0x40000000L) != 0L)
            return 5;
         return -1;
      case 2:
         if ((active0 & 0x170fef780000000L) != 0L)
         {
            jjmatchedKind = 48;
            jjmatchedPos = 2;
            return 5;
         }
         if ((active0 & 0x10800000000L) != 0L)
            return 5;
         return -1;
      case 3:
         if ((active0 & 0x1307ec500000000L) != 0L)
         {
            jjmatchedKind = 48;
            jjmatchedPos = 3;
            return 5;
         }
         if ((active0 & 0x803280000000L) != 0L)
            return 5;
         return -1;
      case 4:
         if ((active0 & 0x305ec000000000L) != 0L)
         {
            jjmatchedKind = 48;
            jjmatchedPos = 4;
            return 5;
         }
         if ((active0 & 0x200500000000L) != 0L)
            return 5;
         return -1;
      case 5:
         if ((active0 & 0x10088000000000L) != 0L)
         {
            jjmatchedKind = 48;
            jjmatchedPos = 5;
            return 5;
         }
         if ((active0 & 0x564000000000L) != 0L)
            return 5;
         return -1;
      case 6:
         if ((active0 & 0x10000000000000L) != 0L)
         {
            if (jjmatchedPos < 5)
            {
               jjmatchedKind = 48;
               jjmatchedPos = 5;
            }
            return -1;
         }
         if ((active0 & 0x88000000000L) != 0L)
            return 5;
         return -1;
      case 7:
         if ((active0 & 0x10000000000000L) != 0L)
         {
            if (jjmatchedPos < 5)
            {
               jjmatchedKind = 48;
               jjmatchedPos = 5;
            }
            return -1;
         }
         return -1;
      case 8:
         if ((active0 & 0x10000000000000L) != 0L)
         {
            if (jjmatchedPos < 5)
            {
               jjmatchedKind = 48;
               jjmatchedPos = 5;
            }
            return -1;
         }
         return -1;
      case 9:
         if ((active0 & 0x10000000000000L) != 0L)
         {
            if (jjmatchedPos < 5)
            {
               jjmatchedKind = 48;
               jjmatchedPos = 5;
            }
            return -1;
         }
         return -1;
      case 10:
         if ((active0 & 0x10000000000000L) != 0L)
         {
            if (jjmatchedPos < 5)
            {
               jjmatchedKind = 48;
               jjmatchedPos = 5;
            }
            return -1;
         }
         return -1;
      case 11:
         if ((active0 & 0x10000000000000L) != 0L)
         {
            if (jjmatchedPos < 5)
            {
               jjmatchedKind = 48;
               jjmatchedPos = 5;
            }
            return -1;
         }
         return -1;
      case 12:
         if ((active0 & 0x10000000000000L) != 0L)
         {
            if (jjmatchedPos < 5)
            {
               jjmatchedKind = 48;
               jjmatchedPos = 5;
            }
            return -1;
         }
         return -1;
      case 13:
         if ((active0 & 0x10000000000000L) != 0L)
         {
            if (jjmatchedPos < 5)
            {
               jjmatchedKind = 48;
               jjmatchedPos = 5;
            }
            return -1;
         }
         return -1;
      case 14:
         if ((active0 & 0x10000000000000L) != 0L)
         {
            if (jjmatchedPos < 5)
            {
               jjmatchedKind = 48;
               jjmatchedPos = 5;
            }
            return -1;
         }
         return -1;
      case 15:
         if ((active0 & 0x10000000000000L) != 0L)
         {
            if (jjmatchedPos < 5)
            {
               jjmatchedKind = 48;
               jjmatchedPos = 5;
            }
            return -1;
         }
         return -1;
      case 16:
         if ((active0 & 0x10000000000000L) != 0L)
         {
            if (jjmatchedPos < 5)
            {
               jjmatchedKind = 48;
               jjmatchedPos = 5;
            }
            return -1;
         }
         return -1;
      default :
         return -1;
   }
}
private static final int jjStartNfa_0(int pos, long active0){
   return jjMoveNfa_0(jjStopStringLiteralDfa_0(pos, active0), pos + 1);
}
static private int jjStopAtPos(int pos, int kind)
{
   jjmatchedKind = kind;
   jjmatchedPos = pos;
   return pos + 1;
}
static private int jjMoveStringLiteralDfa0_0(){
   switch(curChar)
   {
      case 13:
         jjmatchedKind = 3;
         return jjMoveStringLiteralDfa1_0(0x10L);
      case 33:
         return jjStopAtPos(0, 25);
      case 38:
         return jjMoveStringLiteralDfa1_0(0x4000000L);
      case 40:
         return jjStopAtPos(0, 19);
      case 41:
         return jjStopAtPos(0, 20);
      case 42:
         return jjStopAtPos(0, 18);
      case 43:
         return jjStopAtPos(0, 15);
      case 44:
         return jjStopAtPos(0, 11);
      case 45:
         return jjStopAtPos(0, 16);
      case 46:
         return jjStopAtPos(0, 10);
      case 47:
         jjmatchedKind = 17;
         return jjMoveStringLiteralDfa1_0(0x80L);
      case 59:
         return jjStopAtPos(0, 12);
      case 60:
         return jjStopAtPos(0, 28);
      case 61:
         jjmatchedKind = 13;
         return jjMoveStringLiteralDfa1_0(0x4000L);
      case 62:
         return jjStopAtPos(0, 29);
      case 83:
         return jjMoveStringLiteralDfa1_0(0x10020000000000L);
      case 91:
         return jjStopAtPos(0, 21);
      case 93:
         return jjStopAtPos(0, 22);
      case 98:
         return jjMoveStringLiteralDfa1_0(0x20008000000000L);
      case 99:
         return jjMoveStringLiteralDfa1_0(0x200000000000L);
      case 100:
         return jjMoveStringLiteralDfa1_0(0x80000000000000L);
      case 101:
         return jjMoveStringLiteralDfa1_0(0x40080080000000L);
      case 102:
         return jjMoveStringLiteralDfa1_0(0x400000000L);
      case 105:
         return jjMoveStringLiteralDfa1_0(0x10040000000L);
      case 108:
         return jjMoveStringLiteralDfa1_0(0x4000000000L);
      case 109:
         return jjMoveStringLiteralDfa1_0(0x800000000000L);
      case 110:
         return jjMoveStringLiteralDfa1_0(0x800000000L);
      case 112:
         return jjMoveStringLiteralDfa1_0(0x400000000000L);
      case 114:
         return jjMoveStringLiteralDfa1_0(0x100000000000L);
      case 115:
         return jjMoveStringLiteralDfa1_0(0x40000000000L);
      case 116:
         return jjMoveStringLiteralDfa1_0(0x100001200000000L);
      case 118:
         return jjMoveStringLiteralDfa1_0(0x2000000000L);
      case 119:
         return jjMoveStringLiteralDfa1_0(0x100000000L);
      case 123:
         return jjStopAtPos(0, 23);
      case 124:
         return jjMoveStringLiteralDfa1_0(0x8000000L);
      case 125:
         return jjStopAtPos(0, 24);
      default :
         return jjMoveNfa_0(2, 0);
   }
}
static private int jjMoveStringLiteralDfa1_0(long active0){
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(0, active0);
      return 1;
   }
   switch(curChar)
   {
      case 10:
         if ((active0 & 0x10L) != 0L)
            return jjStopAtPos(1, 4);
         break;
      case 38:
         if ((active0 & 0x4000000L) != 0L)
            return jjStopAtPos(1, 26);
         break;
      case 42:
         if ((active0 & 0x80L) != 0L)
            return jjStopAtPos(1, 7);
         break;
      case 61:
         if ((active0 & 0x4000L) != 0L)
            return jjStopAtPos(1, 14);
         break;
      case 97:
         return jjMoveStringLiteralDfa2_0(active0, 0x800400000000L);
      case 101:
         return jjMoveStringLiteralDfa2_0(active0, 0x20104800000000L);
      case 102:
         if ((active0 & 0x40000000L) != 0L)
            return jjStartNfaWithStates_0(1, 30, 5);
         break;
      case 104:
         return jjMoveStringLiteralDfa2_0(active0, 0x100001100000000L);
      case 108:
         return jjMoveStringLiteralDfa2_0(active0, 0x200080000000L);
      case 110:
         return jjMoveStringLiteralDfa2_0(active0, 0x40010000000000L);
      case 111:
         if ((active0 & 0x80000000000000L) != 0L)
            return jjStartNfaWithStates_0(1, 48, 5);
         return jjMoveStringLiteralDfa2_0(active0, 0xa000000000L);
      case 114:
         return jjMoveStringLiteralDfa2_0(active0, 0x200000000L);
      case 116:
         return jjMoveStringLiteralDfa2_0(active0, 0x60000000000L);
      case 117:
         return jjMoveStringLiteralDfa2_0(active0, 0x400000000000L);
      case 120:
         return jjMoveStringLiteralDfa2_0(active0, 0x80000000000L);
      case 121:
         return jjMoveStringLiteralDfa2_0(active0, 0x10000000000000L);
      case 124:
         if ((active0 & 0x8000000L) != 0L)
            return jjStopAtPos(1, 27);
         break;
      default :
         break;
   }
   return jjStartNfa_0(0, active0);
}
static private int jjMoveStringLiteralDfa2_0(long old0, long active0){
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(0, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(1, active0);
      return 2;
   }
   switch(curChar)
   {
      case 97:
         return jjMoveStringLiteralDfa3_0(active0, 0x240000000000L);
      case 98:
         return jjMoveStringLiteralDfa3_0(active0, 0x400000000000L);
      case 100:
         if ((active0 & 0x40000000000000L) != 0L)
            return jjStartNfaWithStates_0(2, 48, 5);
         break;
      case 101:
         return jjMoveStringLiteralDfa3_0(active0, 0x100000000000000L);
      case 103:
         return jjMoveStringLiteralDfa3_0(active0, 0x20000000000000L);
      case 105:
         return jjMoveStringLiteralDfa3_0(active0, 0x803100000000L);
      case 108:
         return jjMoveStringLiteralDfa3_0(active0, 0x400000000L);
      case 110:
         return jjMoveStringLiteralDfa3_0(active0, 0x4000000000L);
      case 111:
         return jjMoveStringLiteralDfa3_0(active0, 0x8000000000L);
      case 114:
         return jjMoveStringLiteralDfa3_0(active0, 0x20000000000L);
      case 115:
         return jjMoveStringLiteralDfa3_0(active0, 0x10000080000000L);
      case 116:
         if ((active0 & 0x10000000000L) != 0L)
            return jjStartNfaWithStates_0(2, 40, 5);
         return jjMoveStringLiteralDfa3_0(active0, 0x180000000000L);
      case 117:
         return jjMoveStringLiteralDfa3_0(active0, 0x200000000L);
      case 119:
         if ((active0 & 0x800000000L) != 0L)
            return jjStartNfaWithStates_0(2, 35, 5);
         break;
      default :
         break;
   }
   return jjStartNfa_0(1, active0);
}
static private int jjMoveStringLiteralDfa3_0(long old0, long active0){
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(1, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(2, active0);
      return 3;
   }
   switch(curChar)
   {
      case 100:
         if ((active0 & 0x2000000000L) != 0L)
            return jjStartNfaWithStates_0(3, 37, 5);
         break;
      case 101:
         if ((active0 & 0x80000000L) != 0L)
            return jjStartNfaWithStates_0(3, 31, 5);
         else if ((active0 & 0x200000000L) != 0L)
            return jjStartNfaWithStates_0(3, 33, 5);
         return jjMoveStringLiteralDfa4_0(active0, 0x80000000000L);
      case 103:
         return jjMoveStringLiteralDfa4_0(active0, 0x4000000000L);
      case 105:
         return jjMoveStringLiteralDfa4_0(active0, 0x20020000000000L);
      case 108:
         return jjMoveStringLiteralDfa4_0(active0, 0x408100000000L);
      case 110:
         if ((active0 & 0x800000000000L) != 0L)
            return jjStartNfaWithStates_0(3, 47, 5);
         else if ((active0 & 0x100000000000000L) != 0L)
            return jjStartNfaWithStates_0(3, 48, 5);
         break;
      case 115:
         if ((active0 & 0x1000000000L) != 0L)
            return jjStartNfaWithStates_0(3, 36, 5);
         return jjMoveStringLiteralDfa4_0(active0, 0x200400000000L);
      case 116:
         return jjMoveStringLiteralDfa4_0(active0, 0x10040000000000L);
      case 117:
         return jjMoveStringLiteralDfa4_0(active0, 0x100000000000L);
      default :
         break;
   }
   return jjStartNfa_0(2, active0);
}
static private int jjMoveStringLiteralDfa4_0(long old0, long active0){
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(2, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(3, active0);
      return 4;
   }
   switch(curChar)
   {
      case 101:
         if ((active0 & 0x100000000L) != 0L)
            return jjStartNfaWithStates_0(4, 32, 5);
         else if ((active0 & 0x400000000L) != 0L)
            return jjStartNfaWithStates_0(4, 34, 5);
         return jjMoveStringLiteralDfa5_0(active0, 0x10008000000000L);
      case 105:
         return jjMoveStringLiteralDfa5_0(active0, 0x440000000000L);
      case 110:
         if ((active0 & 0x20000000000000L) != 0L)
            return jjStartNfaWithStates_0(4, 48, 5);
         return jjMoveStringLiteralDfa5_0(active0, 0xa0000000000L);
      case 114:
         return jjMoveStringLiteralDfa5_0(active0, 0x100000000000L);
      case 115:
         if ((active0 & 0x200000000000L) != 0L)
            return jjStartNfaWithStates_0(4, 45, 5);
         break;
      case 116:
         return jjMoveStringLiteralDfa5_0(active0, 0x4000000000L);
      default :
         break;
   }
   return jjStartNfa_0(3, active0);
}
static private int jjMoveStringLiteralDfa5_0(long old0, long active0){
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(3, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(4, active0);
      return 5;
   }
   switch(curChar)
   {
      case 97:
         return jjMoveStringLiteralDfa6_0(active0, 0x8000000000L);
      case 99:
         if ((active0 & 0x40000000000L) != 0L)
            return jjStartNfaWithStates_0(5, 42, 5);
         else if ((active0 & 0x400000000000L) != 0L)
            return jjStartNfaWithStates_0(5, 46, 5);
         break;
      case 100:
         return jjMoveStringLiteralDfa6_0(active0, 0x80000000000L);
      case 103:
         if ((active0 & 0x20000000000L) != 0L)
            return jjStartNfaWithStates_0(5, 41, 5);
         break;
      case 104:
         if ((active0 & 0x4000000000L) != 0L)
            return jjStartNfaWithStates_0(5, 38, 5);
         break;
      case 109:
         return jjMoveStringLiteralDfa6_0(active0, 0x10000000000000L);
      case 110:
         if ((active0 & 0x100000000000L) != 0L)
            return jjStartNfaWithStates_0(5, 44, 5);
         break;
      default :
         break;
   }
   return jjStartNfa_0(4, active0);
}
static private int jjMoveStringLiteralDfa6_0(long old0, long active0){
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(4, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(5, active0);
      return 6;
   }
   switch(curChar)
   {
      case 46:
         return jjMoveStringLiteralDfa7_0(active0, 0x10000000000000L);
      case 110:
         if ((active0 & 0x8000000000L) != 0L)
            return jjStartNfaWithStates_0(6, 39, 5);
         break;
      case 115:
         if ((active0 & 0x80000000000L) != 0L)
            return jjStartNfaWithStates_0(6, 43, 5);
         break;
      default :
         break;
   }
   return jjStartNfa_0(5, active0);
}
static private int jjMoveStringLiteralDfa7_0(long old0, long active0){
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(5, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(6, active0);
      return 7;
   }
   switch(curChar)
   {
      case 111:
         return jjMoveStringLiteralDfa8_0(active0, 0x10000000000000L);
      default :
         break;
   }
   return jjStartNfa_0(6, active0);
}
static private int jjMoveStringLiteralDfa8_0(long old0, long active0){
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(6, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(7, active0);
      return 8;
   }
   switch(curChar)
   {
      case 117:
         return jjMoveStringLiteralDfa9_0(active0, 0x10000000000000L);
      default :
         break;
   }
   return jjStartNfa_0(7, active0);
}
static private int jjMoveStringLiteralDfa9_0(long old0, long active0){
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(7, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(8, active0);
      return 9;
   }
   switch(curChar)
   {
      case 116:
         return jjMoveStringLiteralDfa10_0(active0, 0x10000000000000L);
      default :
         break;
   }
   return jjStartNfa_0(8, active0);
}
static private int jjMoveStringLiteralDfa10_0(long old0, long active0){
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(8, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(9, active0);
      return 10;
   }
   switch(curChar)
   {
      case 46:
         return jjMoveStringLiteralDfa11_0(active0, 0x10000000000000L);
      default :
         break;
   }
   return jjStartNfa_0(9, active0);
}
static private int jjMoveStringLiteralDfa11_0(long old0, long active0){
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(9, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(10, active0);
      return 11;
   }
   switch(curChar)
   {
      case 112:
         return jjMoveStringLiteralDfa12_0(active0, 0x10000000000000L);
      default :
         break;
   }
   return jjStartNfa_0(10, active0);
}
static private int jjMoveStringLiteralDfa12_0(long old0, long active0){
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(10, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(11, active0);
      return 12;
   }
   switch(curChar)
   {
      case 114:
         return jjMoveStringLiteralDfa13_0(active0, 0x10000000000000L);
      default :
         break;
   }
   return jjStartNfa_0(11, active0);
}
static private int jjMoveStringLiteralDfa13_0(long old0, long active0){
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(11, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(12, active0);
      return 13;
   }
   switch(curChar)
   {
      case 105:
         return jjMoveStringLiteralDfa14_0(active0, 0x10000000000000L);
      default :
         break;
   }
   return jjStartNfa_0(12, active0);
}
static private int jjMoveStringLiteralDfa14_0(long old0, long active0){
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(12, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(13, active0);
      return 14;
   }
   switch(curChar)
   {
      case 110:
         return jjMoveStringLiteralDfa15_0(active0, 0x10000000000000L);
      default :
         break;
   }
   return jjStartNfa_0(13, active0);
}
static private int jjMoveStringLiteralDfa15_0(long old0, long active0){
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(13, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(14, active0);
      return 15;
   }
   switch(curChar)
   {
      case 116:
         return jjMoveStringLiteralDfa16_0(active0, 0x10000000000000L);
      default :
         break;
   }
   return jjStartNfa_0(14, active0);
}
static private int jjMoveStringLiteralDfa16_0(long old0, long active0){
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(14, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(15, active0);
      return 16;
   }
   switch(curChar)
   {
      case 108:
         return jjMoveStringLiteralDfa17_0(active0, 0x10000000000000L);
      default :
         break;
   }
   return jjStartNfa_0(15, active0);
}
static private int jjMoveStringLiteralDfa17_0(long old0, long active0){
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(15, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(16, active0);
      return 17;
   }
   switch(curChar)
   {
      case 110:
         if ((active0 & 0x10000000000000L) != 0L)
            return jjStopAtPos(17, 52);
         break;
      default :
         break;
   }
   return jjStartNfa_0(16, active0);
}
static private int jjStartNfaWithStates_0(int pos, int kind, int state)
{
   jjmatchedKind = kind;
   jjmatchedPos = pos;
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) { return pos + 1; }
   return jjMoveNfa_0(state, pos + 1);
}
static final long[] jjbitVec0 = {
   0xfffffffffffffffeL, 0xffffffffffffffffL, 0xffffffffffffffffL, 0xffffffffffffffffL
};
static final long[] jjbitVec2 = {
   0x0L, 0x0L, 0xffffffffffffffffL, 0xffffffffffffffffL
};
static private int jjMoveNfa_0(int startState, int curPos)
{
   int startsAt = 0;
   jjnewStateCnt = 6;
   int i = 1;
   jjstateSet[0] = startState;
   int kind = 0x7fffffff;
   for (;;)
   {
      if (++jjround == 0x7fffffff)
         ReInitRounds();
      if (curChar < 64)
      {
         long l = 1L << curChar;
         do
         {
            switch(jjstateSet[--i])
            {
               case 2:
                  if ((0x3ff000000000000L & l) != 0L)
                  {
                     if (kind > 51)
                        kind = 51;
                     { jjCheckNAdd(3); }
                  }
                  else if (curChar == 47)
                     jjstateSet[jjnewStateCnt++] = 0;
                  break;
               case 0:
                  if (curChar != 47)
                     break;
                  if (kind > 6)
                     kind = 6;
                  { jjCheckNAdd(1); }
                  break;
               case 1:
                  if ((0xffffffffffffdbffL & l) == 0L)
                     break;
                  if (kind > 6)
                     kind = 6;
                  { jjCheckNAdd(1); }
                  break;
               case 3:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 51)
                     kind = 51;
                  { jjCheckNAdd(3); }
                  break;
               case 5:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 48)
                     kind = 48;
                  jjstateSet[jjnewStateCnt++] = 5;
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      else if (curChar < 128)
      {
         long l = 1L << (curChar & 077);
         do
         {
            switch(jjstateSet[--i])
            {
               case 2:
               case 5:
                  if ((0x7fffffe87fffffeL & l) == 0L)
                     break;
                  if (kind > 48)
                     kind = 48;
                  { jjCheckNAdd(5); }
                  break;
               case 1:
                  if (kind > 6)
                     kind = 6;
                  jjstateSet[jjnewStateCnt++] = 1;
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      else
      {
         int hiByte = (curChar >> 8);
         int i1 = hiByte >> 6;
         long l1 = 1L << (hiByte & 077);
         int i2 = (curChar & 0xff) >> 6;
         long l2 = 1L << (curChar & 077);
         do
         {
            switch(jjstateSet[--i])
            {
               case 1:
                  if (!jjCanMove_0(hiByte, i1, i2, l1, l2))
                     break;
                  if (kind > 6)
                     kind = 6;
                  jjstateSet[jjnewStateCnt++] = 1;
                  break;
               default : if (i1 == 0 || l1 == 0 || i2 == 0 ||  l2 == 0) break; else break;
            }
         } while(i != startsAt);
      }
      if (kind != 0x7fffffff)
      {
         jjmatchedKind = kind;
         jjmatchedPos = curPos;
         kind = 0x7fffffff;
      }
      ++curPos;
      if ((i = jjnewStateCnt) == (startsAt = 6 - (jjnewStateCnt = startsAt)))
         return curPos;
      try { curChar = input_stream.readChar(); }
      catch(java.io.IOException e) { return curPos; }
   }
}
static private int jjMoveStringLiteralDfa0_1(){
   switch(curChar)
   {
      case 42:
         return jjMoveStringLiteralDfa1_1(0x100L);
      default :
         return 1;
   }
}
static private int jjMoveStringLiteralDfa1_1(long active0){
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      return 1;
   }
   switch(curChar)
   {
      case 47:
         if ((active0 & 0x100L) != 0L)
            return jjStopAtPos(1, 8);
         break;
      default :
         return 2;
   }
   return 2;
}
static final int[] jjnextStates = {
};
private static final boolean jjCanMove_0(int hiByte, int i1, int i2, long l1, long l2)
{
   switch(hiByte)
   {
      case 0:
         return ((jjbitVec2[i2] & l2) != 0L);
      default :
         if ((jjbitVec0[i1] & l1) != 0L)
            return true;
         return false;
   }
}

/** Token literal values. */
public static final String[] jjstrLiteralImages = {
"", null, null, null, null, null, null, null, null, null, "\56", "\54", "\73", 
"\75", "\75\75", "\53", "\55", "\57", "\52", "\50", "\51", "\133", "\135", "\173", 
"\175", "\41", "\46\46", "\174\174", "\74", "\76", "\151\146", "\145\154\163\145", 
"\167\150\151\154\145", "\164\162\165\145", "\146\141\154\163\145", "\156\145\167", 
"\164\150\151\163", "\166\157\151\144", "\154\145\156\147\164\150", 
"\142\157\157\154\145\141\156", "\151\156\164", "\123\164\162\151\156\147", "\163\164\141\164\151\143", 
"\145\170\164\145\156\144\163", "\162\145\164\165\162\156", "\143\154\141\163\163", 
"\160\165\142\154\151\143", "\155\141\151\156", null, null, null, null, 
"\123\171\163\164\145\155\56\157\165\164\56\160\162\151\156\164\154\156", "\142\145\147\151\156", "\145\156\144", "\144\157", "\164\150\145\156", };
static protected Token jjFillToken()
{
   final Token t;
   final String curTokenImage;
   final int beginLine;
   final int endLine;
   final int beginColumn;
   final int endColumn;
   String im = jjstrLiteralImages[jjmatchedKind];
   curTokenImage = (im == null) ? input_stream.GetImage() : im;
   beginLine = input_stream.getBeginLine();
   beginColumn = input_stream.getBeginColumn();
   endLine = input_stream.getEndLine();
   endColumn = input_stream.getEndColumn();
   t = Token.newToken(jjmatchedKind, curTokenImage);

   t.beginLine = beginLine;
   t.endLine = endLine;
   t.beginColumn = beginColumn;
   t.endColumn = endColumn;

   return t;
}

static int curLexState = 0;
static int defaultLexState = 0;
static int jjnewStateCnt;
static int jjround;
static int jjmatchedPos;
static int jjmatchedKind;

/** Get the next Token. */
public static Token getNextToken() 
{
  Token matchedToken;
  int curPos = 0;

  EOFLoop :
  for (;;)
  {
   try
   {
      curChar = input_stream.BeginToken();
   }
   catch(java.io.IOException e)
   {
      jjmatchedKind = 0;
      jjmatchedPos = -1;
      matchedToken = jjFillToken();
      return matchedToken;
   }

   switch(curLexState)
   {
     case 0:
       try { input_stream.backup(0);
          while (curChar <= 32 && (0x100000600L & (1L << curChar)) != 0L)
             curChar = input_stream.BeginToken();
       }
       catch (java.io.IOException e1) { continue EOFLoop; }
       jjmatchedKind = 0x7fffffff;
       jjmatchedPos = 0;
       curPos = jjMoveStringLiteralDfa0_0();
       break;
     case 1:
       jjmatchedKind = 0x7fffffff;
       jjmatchedPos = 0;
       curPos = jjMoveStringLiteralDfa0_1();
       if (jjmatchedPos == 0 && jjmatchedKind > 9)
       {
          jjmatchedKind = 9;
       }
       break;
   }
     if (jjmatchedKind != 0x7fffffff)
     {
        if (jjmatchedPos + 1 < curPos)
           input_stream.backup(curPos - jjmatchedPos - 1);
        if ((jjtoToken[jjmatchedKind >> 6] & (1L << (jjmatchedKind & 077))) != 0L)
        {
           matchedToken = jjFillToken();
       if (jjnewLexState[jjmatchedKind] != -1)
         curLexState = jjnewLexState[jjmatchedKind];
           return matchedToken;
        }
        else
        {
         if (jjnewLexState[jjmatchedKind] != -1)
           curLexState = jjnewLexState[jjmatchedKind];
           continue EOFLoop;
        }
     }
     int error_line = input_stream.getEndLine();
     int error_column = input_stream.getEndColumn();
     String error_after = null;
     boolean EOFSeen = false;
     try { input_stream.readChar(); input_stream.backup(1); }
     catch (java.io.IOException e1) {
        EOFSeen = true;
        error_after = curPos <= 1 ? "" : input_stream.GetImage();
        if (curChar == '\n' || curChar == '\r') {
           error_line++;
           error_column = 0;
        }
        else
           error_column++;
     }
     if (!EOFSeen) {
        input_stream.backup(1);
        error_after = curPos <= 1 ? "" : input_stream.GetImage();
     }
     throw new TokenMgrError(EOFSeen, curLexState, error_line, error_column, error_after, curChar, TokenMgrError.LEXICAL_ERROR);
  }
}

static private void jjCheckNAdd(int state)
{
   if (jjrounds[state] != jjround)
   {
      jjstateSet[jjnewStateCnt++] = state;
      jjrounds[state] = jjround;
   }
}
static private void jjAddStates(int start, int end)
{
   do {
      jjstateSet[jjnewStateCnt++] = jjnextStates[start];
   } while (start++ != end);
}
static private void jjCheckNAddTwoStates(int state1, int state2)
{
   jjCheckNAdd(state1);
   jjCheckNAdd(state2);
}

    /** Constructor. */
    public MiniJavaParserTokenManager(JavaCharStream stream){

      if (input_stream != null)
        throw new TokenMgrError("ERROR: Second call to constructor of static lexer. You must use ReInit() to initialize the static variables.", TokenMgrError.STATIC_LEXER_ERROR);

    input_stream = stream;
  }

  /** Constructor. */
  public MiniJavaParserTokenManager (JavaCharStream stream, int lexState){
    ReInit(stream);
    SwitchTo(lexState);
  }

  /** Reinitialise parser. */
  static public void ReInit(JavaCharStream stream)
  {
    jjmatchedPos = jjnewStateCnt = 0;
    curLexState = defaultLexState;
    input_stream = stream;
    ReInitRounds();
  }

  static private void ReInitRounds()
  {
    int i;
    jjround = 0x80000001;
    for (i = 6; i-- > 0;)
      jjrounds[i] = 0x80000000;
  }

  /** Reinitialise parser. */
  static public void ReInit(JavaCharStream stream, int lexState)
  {
    ReInit(stream);
    SwitchTo(lexState);
  }

  /** Switch to specified lex state. */
  static public void SwitchTo(int lexState)
  {
    if (lexState >= 2 || lexState < 0)
      throw new TokenMgrError("Error: Ignoring invalid lexical state : " + lexState + ". State unchanged.", TokenMgrError.INVALID_LEXICAL_STATE);
    else
      curLexState = lexState;
  }

/** Lexer state names. */
public static final String[] lexStateNames = {
   "DEFAULT",
   "ML_COMMENT_STATE",
};

/** Lex State array. */
public static final int[] jjnewLexState = {
   -1, -1, -1, -1, -1, -1, -1, 1, 0, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 
   -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 
   -1, -1, -1, -1, -1, -1, -1, 
};
static final long[] jjtoToken = {
   0x1fdfffffffffc01L, 
};
static final long[] jjtoSkip = {
   0x3feL, 
};
    static protected JavaCharStream  input_stream;

    static private final int[] jjrounds = new int[6];
    static private final int[] jjstateSet = new int[2 * 6];

    
    static protected char curChar;
}
