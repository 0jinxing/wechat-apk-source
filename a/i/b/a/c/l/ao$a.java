package a.i.b.a.c.l;

import a.a.ad;
import a.i.b.a.c.b.ar;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public final class ao$a
{
  public static as a(an paraman, List<? extends ap> paramList)
  {
    AppMethodBeat.i(122654);
    a.f.b.j.p(paraman, "typeConstructor");
    a.f.b.j.p(paramList, "arguments");
    Object localObject = paraman.getParameters();
    a.f.b.j.o(localObject, "typeConstructor.parameters");
    ar localar = (ar)a.a.j.fM((List)localObject);
    boolean bool;
    if (localar != null)
      bool = localar.dZb();
    while (bool)
    {
      paraman = paraman.getParameters();
      a.f.b.j.o(paraman, "typeConstructor.parameters");
      localObject = (Iterable)paraman;
      paraman = (Collection)new ArrayList(a.a.j.d((Iterable)localObject));
      localObject = ((Iterable)localObject).iterator();
      while (true)
        if (((Iterator)localObject).hasNext())
        {
          localar = (ar)((Iterator)localObject).next();
          a.f.b.j.o(localar, "it");
          paraman.add(localar.dXY());
          continue;
          bool = false;
          break;
        }
      paraman = (as)bf(ad.v((Iterable)a.a.j.a((Iterable)paraman, (Iterable)paramList)));
      AppMethodBeat.o(122654);
    }
    while (true)
    {
      return paraman;
      paraman = (as)new u((List)localObject, paramList);
      AppMethodBeat.o(122654);
    }
  }

  public static as au(w paramw)
  {
    AppMethodBeat.i(122653);
    a.f.b.j.p(paramw, "kotlinType");
    paramw = a(paramw.ejw(), paramw.ejt());
    AppMethodBeat.o(122653);
    return paramw;
  }

  public static ao bf(Map<an, ? extends ap> paramMap)
  {
    AppMethodBeat.i(122652);
    a.f.b.j.p(paramMap, "map");
    paramMap = (ao)new ao.a.a(paramMap);
    AppMethodBeat.o(122652);
    return paramMap;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     a.i.b.a.c.l.ao.a
 * JD-Core Version:    0.6.2
 */