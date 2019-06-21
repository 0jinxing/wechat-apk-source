package a.k;

import a.f.a.b;
import a.f.b.j;
import a.l;
import com.tencent.matrix.trace.core.AppMethodBeat;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"buildString", "", "capacity", "", "builderAction", "Lkotlin/Function1;", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "", "Lkotlin/ExtensionFunctionType;", "append", "T", "Ljava/lang/Appendable;", "Lkotlin/text/Appendable;", "value", "", "", "(Ljava/lang/Appendable;[Ljava/lang/CharSequence;)Ljava/lang/Appendable;", "", "(Ljava/lang/StringBuilder;[Ljava/lang/Object;)Ljava/lang/StringBuilder;", "(Ljava/lang/StringBuilder;[Ljava/lang/String;)Ljava/lang/StringBuilder;", "appendElement", "element", "transform", "(Ljava/lang/Appendable;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)V", "kotlin-stdlib"}, dWr=1)
public class r extends q
{
  public static final StringBuilder a(StringBuilder paramStringBuilder, String[] paramArrayOfString)
  {
    AppMethodBeat.i(56298);
    j.p(paramStringBuilder, "receiver$0");
    j.p(paramArrayOfString, "value");
    for (int i = 0; i < 3; i++)
      paramStringBuilder.append(paramArrayOfString[i]);
    AppMethodBeat.o(56298);
    return paramStringBuilder;
  }

  public static final <T> void a(Appendable paramAppendable, T paramT, b<? super T, ? extends CharSequence> paramb)
  {
    AppMethodBeat.i(56299);
    j.p(paramAppendable, "receiver$0");
    if (paramb != null)
    {
      paramAppendable.append((CharSequence)paramb.am(paramT));
      AppMethodBeat.o(56299);
    }
    while (true)
    {
      return;
      if (paramT != null);
      for (boolean bool = paramT instanceof CharSequence; ; bool = true)
      {
        if (!bool)
          break label75;
        paramAppendable.append((CharSequence)paramT);
        AppMethodBeat.o(56299);
        break;
      }
      label75: if ((paramT instanceof Character))
      {
        paramAppendable.append(((Character)paramT).charValue());
        AppMethodBeat.o(56299);
      }
      else
      {
        paramAppendable.append((CharSequence)String.valueOf(paramT));
        AppMethodBeat.o(56299);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     a.k.r
 * JD-Core Version:    0.6.2
 */