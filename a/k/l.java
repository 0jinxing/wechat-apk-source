package a.k;

import com.tencent.matrix.trace.core.AppMethodBeat;

@a.l(dWo={1, 1, 13}, dWp={""}, dWq={"Lkotlin/text/ScreenFloatValueRegEx;", "", "()V", "value", "Lkotlin/text/Regex;", "kotlin-stdlib"})
final class l
{
  public static final k BPi;
  public static final l BPj;

  static
  {
    AppMethodBeat.i(56362);
    BPj = new l();
    String str1 = "[eE][+-]?".concat(String.valueOf("(\\p{Digit}+)"));
    String str2 = "(0[xX]" + "(\\p{XDigit}+)" + "(\\.)?)|(0[xX]" + "(\\p{XDigit}+)" + "?(\\.)" + "(\\p{XDigit}+)" + ')';
    str2 = "(" + "(\\p{Digit}+)" + "(\\.)?(" + "(\\p{Digit}+)" + "?)(" + str1 + ")?)|(\\.(" + "(\\p{Digit}+)" + ")(" + str1 + ")?)|((" + str2 + ")[pP][+-]?" + "(\\p{Digit}+)" + ')';
    BPi = new k("[\\x00-\\x20]*[+-]?(NaN|Infinity|((" + str2 + ")[fFdD]?))[\\x00-\\x20]*");
    AppMethodBeat.o(56362);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     a.k.l
 * JD-Core Version:    0.6.2
 */