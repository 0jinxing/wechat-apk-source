package a.k;

import a.f.b.j;
import com.tencent.matrix.trace.core.AppMethodBeat;

@a.l(dWo={1, 1, 13}, dWp={""}, dWq={"screenFloatValue", "T", "str", "", "parse", "Lkotlin/Function1;", "screenFloatValue$StringsKt__StringNumberConversionsJVMKt", "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "toBigDecimal", "Ljava/math/BigDecimal;", "mathContext", "Ljava/math/MathContext;", "toBigDecimalOrNull", "toBigInteger", "Ljava/math/BigInteger;", "radix", "", "toBigIntegerOrNull", "toBoolean", "", "toByte", "", "toDouble", "", "toDoubleOrNull", "(Ljava/lang/String;)Ljava/lang/Double;", "toFloat", "", "toFloatOrNull", "(Ljava/lang/String;)Ljava/lang/Float;", "toInt", "toLong", "", "toShort", "", "toString", "kotlin-stdlib"}, dWr=1)
public class s extends r
{
  public static final Float aww(String paramString)
  {
    AppMethodBeat.i(56346);
    j.p(paramString, "receiver$0");
    try
    {
      float f;
      if (l.BPi.aq((CharSequence)paramString))
        f = Float.parseFloat(paramString);
      for (paramString = Float.valueOf(f); ; paramString = null)
      {
        AppMethodBeat.o(56346);
        return paramString;
      }
    }
    catch (NumberFormatException paramString)
    {
      while (true)
        paramString = null;
    }
  }

  public static final Double awx(String paramString)
  {
    AppMethodBeat.i(56347);
    j.p(paramString, "receiver$0");
    try
    {
      double d;
      if (l.BPi.aq((CharSequence)paramString))
        d = Double.parseDouble(paramString);
      for (paramString = Double.valueOf(d); ; paramString = null)
      {
        AppMethodBeat.o(56347);
        return paramString;
      }
    }
    catch (NumberFormatException paramString)
    {
      while (true)
        paramString = null;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     a.k.s
 * JD-Core Version:    0.6.2
 */