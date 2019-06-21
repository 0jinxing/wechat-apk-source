package com.tencent.mm.ui.chatting.c;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.chatting.c.a.a;
import com.tencent.mm.ui.chatting.c.a.a.a;
import java.util.LinkedList;
import java.util.List;

public final class g
{
  private static Class[] yOI = { t.class, q.class, c.class, ae.class, ap.class, f.class, ao.class, ac.class, am.class, o.class, e.class, aj.class, aa.class, as.class, j.class, u.class, s.class, k.class, ar.class, ag.class, z.class, an.class, b.class, ah.class, y.class, m.class, ad.class, ai.class, n.class, aq.class, af.class, ab.class, p.class, d.class, r.class, al.class };
  private static List<g.a> yOJ;

  public static List<g.a> getComponents()
  {
    AppMethodBeat.i(31288);
    if (yOJ == null)
    {
      yOJ = new LinkedList();
      Class[] arrayOfClass = yOI;
      int i = arrayOfClass.length;
      int j = 0;
      if (j < i)
      {
        localObject = arrayOfClass[j];
        a locala;
        if (((Class)localObject).isAnnotationPresent(a.class))
        {
          locala = (a)((Class)localObject).getAnnotation(a.class);
          if (locala.dFp() == a.a.class)
            yOJ.add(new g.a((Class)localObject, (Class)localObject));
        }
        while (true)
        {
          j++;
          break;
          yOJ.add(new g.a(locala.dFp(), (Class)localObject));
          continue;
          yOJ.add(new g.a((Class)localObject, (Class)localObject));
        }
      }
    }
    Object localObject = yOJ;
    AppMethodBeat.o(31288);
    return localObject;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.c.g
 * JD-Core Version:    0.6.2
 */