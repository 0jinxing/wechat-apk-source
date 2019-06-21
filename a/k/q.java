package a.k;

import a.f.b.j;
import a.l;
import com.tencent.matrix.trace.core.AppMethodBeat;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"appendln", "Ljava/lang/Appendable;", "Lkotlin/text/Appendable;", "value", "", "", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "Ljava/lang/StringBuffer;", "", "", "", "", "", "", "", "", "", "", "clear", "set", "", "index", "kotlin-stdlib"}, dWr=1)
public class q extends p
{
  public static final StringBuilder h(StringBuilder paramStringBuilder)
  {
    AppMethodBeat.i(56342);
    j.p(paramStringBuilder, "receiver$0");
    paramStringBuilder.setLength(0);
    AppMethodBeat.o(56342);
    return paramStringBuilder;
  }

  public static final StringBuilder i(StringBuilder paramStringBuilder)
  {
    AppMethodBeat.i(56343);
    j.p(paramStringBuilder, "receiver$0");
    paramStringBuilder = paramStringBuilder.append(y.LINE_SEPARATOR);
    j.o(paramStringBuilder, "append(SystemProperties.LINE_SEPARATOR)");
    AppMethodBeat.o(56343);
    return paramStringBuilder;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     a.k.q
 * JD-Core Version:    0.6.2
 */