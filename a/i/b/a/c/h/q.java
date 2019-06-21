package a.i.b.a.c.h;

import a.f.b.j;
import a.i.b.a.c.f.c;
import a.i.b.a.c.f.f;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public final class q
{
  public static final String fZ(List<f> paramList)
  {
    AppMethodBeat.i(121917);
    j.p(paramList, "pathSegments");
    StringBuilder localStringBuilder = new StringBuilder();
    Iterator localIterator = paramList.iterator();
    while (localIterator.hasNext())
    {
      paramList = (f)localIterator.next();
      if (localStringBuilder.length() > 0)
        localStringBuilder.append(".");
      localStringBuilder.append(y(paramList));
    }
    paramList = localStringBuilder.toString();
    j.o(paramList, "StringBuilder().apply(builderAction).toString()");
    AppMethodBeat.o(121917);
    return paramList;
  }

  public static final String g(c paramc)
  {
    AppMethodBeat.i(121916);
    j.p(paramc, "receiver$0");
    paramc = paramc.ehM();
    j.o(paramc, "pathSegments()");
    paramc = fZ(paramc);
    AppMethodBeat.o(121916);
    return paramc;
  }

  public static final String y(f paramf)
  {
    AppMethodBeat.i(121914);
    j.p(paramf, "receiver$0");
    if (z(paramf))
    {
      StringBuilder localStringBuilder = new StringBuilder();
      paramf = paramf.name;
      j.o(paramf, "asString()");
      paramf = "`".concat(String.valueOf(paramf)) + '`';
      AppMethodBeat.o(121914);
    }
    while (true)
    {
      return paramf;
      paramf = paramf.name;
      j.o(paramf, "asString()");
      AppMethodBeat.o(121914);
    }
  }

  private static final boolean z(f paramf)
  {
    boolean bool = false;
    AppMethodBeat.i(121915);
    if (paramf.ByZ)
      AppMethodBeat.o(121915);
    while (true)
    {
      return bool;
      paramf = paramf.name;
      j.o(paramf, "asString()");
      label51: int j;
      if (!l.BDt.contains(paramf))
      {
        paramf = (CharSequence)paramf;
        i = 0;
        if (i >= paramf.length())
          break label118;
        char c = paramf.charAt(i);
        if ((Character.isLetterOrDigit(c)) || (c == '_'))
          break label106;
        j = 1;
        label85: if (j == 0)
          break label112;
      }
      label106: label112: label118: for (int i = 1; ; i = 0)
      {
        if (i == 0)
          break label123;
        AppMethodBeat.o(121915);
        bool = true;
        break;
        j = 0;
        break label85;
        i++;
        break label51;
      }
      label123: AppMethodBeat.o(121915);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     a.i.b.a.c.h.q
 * JD-Core Version:    0.6.2
 */