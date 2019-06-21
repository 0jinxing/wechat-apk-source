package a.k;

import a.f.a.b;
import a.h.e;
import a.j.i;
import a.l;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"getIndentFunction", "Lkotlin/Function1;", "", "indent", "getIndentFunction$StringsKt__IndentKt", "indentWidth", "", "indentWidth$StringsKt__IndentKt", "prependIndent", "reindent", "", "resultSizeEstimate", "indentAddFunction", "indentCutFunction", "reindent$StringsKt__IndentKt", "replaceIndent", "newIndent", "replaceIndentByMargin", "marginPrefix", "trimIndent", "trimMargin", "kotlin-stdlib"}, dWr=1)
public class n
{
  private static final int awv(String paramString)
  {
    AppMethodBeat.i(56296);
    CharSequence localCharSequence = (CharSequence)paramString;
    int i = localCharSequence.length();
    int j = 0;
    int k;
    if (j < i)
      if (!a.isWhitespace(localCharSequence.charAt(j)))
      {
        k = 1;
        label40: if (k == 0)
          break label68;
        label45: if (j != -1)
          break label79;
        j = paramString.length();
        AppMethodBeat.o(56296);
      }
    while (true)
    {
      return j;
      k = 0;
      break label40;
      label68: j++;
      break;
      j = -1;
      break label45;
      label79: AppMethodBeat.o(56296);
    }
  }

  public static final String ja(String paramString1, String paramString2)
  {
    AppMethodBeat.i(56295);
    a.f.b.j.p(paramString1, "receiver$0");
    a.f.b.j.p(paramString2, "newIndent");
    Object localObject1 = (CharSequence)paramString1;
    a.f.b.j.p(localObject1, "receiver$0");
    a.f.b.j.p(localObject1, "receiver$0");
    localObject1 = i.c(m.a((CharSequence)localObject1, new String[] { "\r\n", "\n", "\r" }, false, 6));
    Object localObject2 = (Iterable)localObject1;
    Object localObject3 = (Collection)new ArrayList();
    localObject2 = ((Iterable)localObject2).iterator();
    Object localObject4;
    int i;
    label144: 
    while (((Iterator)localObject2).hasNext())
    {
      localObject4 = ((Iterator)localObject2).next();
      if (!m.ar((CharSequence)localObject4));
      for (i = 1; ; i = 0)
      {
        if (i == 0)
          break label144;
        ((Collection)localObject3).add(localObject4);
        break;
      }
    }
    localObject2 = (Iterable)localObject3;
    localObject3 = (Collection)new ArrayList(a.a.j.d((Iterable)localObject2));
    localObject2 = ((Iterable)localObject2).iterator();
    while (((Iterator)localObject2).hasNext())
      ((Collection)localObject3).add(Integer.valueOf(awv((String)((Iterator)localObject2).next())));
    localObject3 = (Integer)a.a.j.s((Iterable)localObject3);
    int j;
    int k;
    int m;
    int n;
    label276: label288: int i1;
    if (localObject3 != null)
    {
      j = ((Integer)localObject3).intValue();
      k = paramString1.length();
      m = paramString2.length();
      n = ((List)localObject1).size();
      if (((CharSequence)paramString2).length() != 0)
        break label407;
      i = 1;
      if (i == 0)
        break label413;
      paramString2 = (b)n.a.BPk;
      i1 = a.a.j.fH((List)localObject1);
      paramString1 = (Iterable)localObject1;
      localObject2 = (Collection)new ArrayList();
      localObject4 = paramString1.iterator();
      i = 0;
    }
    while (true)
    {
      label321: if (!((Iterator)localObject4).hasNext())
        break label552;
      paramString1 = ((Iterator)localObject4).next();
      int i2 = i + 1;
      if (i < 0)
        a.a.j.dWs();
      localObject1 = (String)paramString1;
      if (((i == 0) || (i == i1)) && (m.ar((CharSequence)localObject1)))
        paramString1 = null;
      while (true)
      {
        if (paramString1 == null)
          break label545;
        ((Collection)localObject2).add(paramString1);
        i = i2;
        break label321;
        j = 0;
        break;
        label407: i = 0;
        break label276;
        label413: paramString2 = (b)new n.b(paramString2);
        break label288;
        a.f.b.j.p(localObject1, "receiver$0");
        if (j >= 0);
        for (i = 1; i == 0; i = 0)
        {
          paramString1 = (Throwable)new IllegalArgumentException(("Requested character count " + j + " is less than zero.").toString());
          AppMethodBeat.o(56295);
          throw paramString1;
        }
        paramString1 = ((String)localObject1).substring(e.in(j, ((String)localObject1).length()));
        a.f.b.j.o(paramString1, "(this as java.lang.String).substring(startIndex)");
        if (paramString1 != null)
        {
          localObject3 = (String)paramString2.am(paramString1);
          paramString1 = (String)localObject3;
          if (localObject3 != null);
        }
        else
        {
          paramString1 = (String)localObject1;
        }
      }
      label545: i = i2;
    }
    label552: paramString1 = ((StringBuilder)a.a.j.a((Iterable)localObject2, (Appendable)new StringBuilder(k + m * n), (CharSequence)"\n", null, null, 0, null, null, 124)).toString();
    a.f.b.j.o(paramString1, "mapIndexedNotNull { inde…\"\\n\")\n        .toString()");
    AppMethodBeat.o(56295);
    return paramString1;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     a.k.n
 * JD-Core Version:    0.6.2
 */