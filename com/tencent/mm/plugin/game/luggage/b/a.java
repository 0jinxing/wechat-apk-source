package com.tencent.mm.plugin.game.luggage.b;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.LinkedList;

public final class a
{
  private static LinkedList<Class<? extends com.tencent.luggage.d.a>> kOz;

  private static void ao(Class<? extends com.tencent.luggage.d.a> paramClass)
  {
    AppMethodBeat.i(135865);
    kOz.add(paramClass);
    AppMethodBeat.o(135865);
  }

  public static LinkedList<Class<? extends com.tencent.luggage.d.a>> biH()
  {
    try
    {
      AppMethodBeat.i(135864);
      LinkedList localLinkedList = new java/util/LinkedList;
      localLinkedList.<init>();
      kOz = localLinkedList;
      ao(d.class);
      ao(f.class);
      ao(g.class);
      ao(h.class);
      ao(i.class);
      ao(l.class);
      ao(m.class);
      ao(n.class);
      ao(q.class);
      ao(o.class);
      ao(p.class);
      ao(j.class);
      ao(c.class);
      ao(b.class);
      ao(k.class);
      ao(e.class);
      localLinkedList = kOz;
      AppMethodBeat.o(135864);
      return localLinkedList;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.game.luggage.b.a
 * JD-Core Version:    0.6.2
 */