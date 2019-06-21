package com.tencent.mm.plugin.appbrand.appcache;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.appcache.a.a;
import java.util.HashSet;
import java.util.Set;

public final class z
{
  private static final Set<b> gTB;

  static
  {
    AppMethodBeat.i(59444);
    gTB = new HashSet();
    AppMethodBeat.o(59444);
  }

  static z.a a(a parama)
  {
    AppMethodBeat.i(59443);
    while (true)
    {
      int j;
      synchronized (gTB)
      {
        Object[] arrayOfObject = gTB.toArray();
        int i = arrayOfObject.length;
        j = 0;
        if (j >= i)
          break label77;
        ??? = ((b)arrayOfObject[j]).a(parama);
        if (??? != null)
        {
          AppMethodBeat.o(59443);
          parama = (a)???;
          return parama;
        }
      }
      j++;
      continue;
      label77: parama = null;
      AppMethodBeat.o(59443);
    }
  }

  public static void a(b paramb)
  {
    AppMethodBeat.i(59442);
    synchronized (gTB)
    {
      gTB.add(paramb);
      AppMethodBeat.o(59442);
      return;
    }
  }

  public static abstract interface b
  {
    public abstract z.a a(a parama);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.appcache.z
 * JD-Core Version:    0.6.2
 */