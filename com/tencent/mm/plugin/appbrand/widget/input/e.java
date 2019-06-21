package com.tencent.mm.plugin.appbrand.widget.input;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.page.u;
import com.tencent.mm.plugin.appbrand.r.i;
import java.util.Collection;
import java.util.Iterator;

public final class e
{
  private static final i<u, aa> jdy;

  static
  {
    AppMethodBeat.i(123598);
    jdy = new i();
    AppMethodBeat.o(123598);
  }

  public static aa a(u paramu, e.a parama)
  {
    AppMethodBeat.i(123597);
    if (paramu == null)
    {
      AppMethodBeat.o(123597);
      paramu = null;
    }
    while (true)
    {
      return paramu;
      paramu = jdy.bC(paramu);
      if (paramu != null)
      {
        Iterator localIterator = paramu.iterator();
        while (true)
          if (localIterator.hasNext())
          {
            paramu = (aa)localIterator.next();
            if ((paramu != null) && (parama.a(paramu)))
            {
              AppMethodBeat.o(123597);
              break;
            }
          }
      }
      AppMethodBeat.o(123597);
      paramu = null;
    }
  }

  public static void a(u paramu, aa paramaa)
  {
    AppMethodBeat.i(123595);
    jdy.f(paramu, paramaa);
    AppMethodBeat.o(123595);
  }

  public static void t(u paramu)
  {
    AppMethodBeat.i(123596);
    jdy.bD(paramu);
    AppMethodBeat.o(123596);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.widget.input.e
 * JD-Core Version:    0.6.2
 */