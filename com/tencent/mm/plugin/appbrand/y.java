package com.tencent.mm.plugin.appbrand;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.al;
import java.util.HashSet;
import java.util.Set;

public class y
{
  private static volatile boolean gQm;
  private static volatile boolean gQn;
  private static final Set<y.a> gQo;

  static
  {
    AppMethodBeat.i(129141);
    gQm = false;
    gQn = false;
    gQo = new HashSet();
    AppMethodBeat.o(129141);
  }

  public static void a(y.a parama)
  {
    AppMethodBeat.i(129138);
    while (true)
    {
      try
      {
        boolean bool1 = gQm;
        boolean bool2 = gQn;
        if (!bool2)
        {
          gQo.add(parama);
          gQm = true;
          gQn = false;
        }
        if (bool1)
          return;
        if (bool2)
        {
          parama.atR();
          AppMethodBeat.o(129138);
          continue;
        }
      }
      finally
      {
        AppMethodBeat.o(129138);
      }
      parama = new y.1();
      new al().aa(new y.2(parama));
      AppMethodBeat.o(129138);
    }
  }

  public static boolean auw()
  {
    try
    {
      boolean bool = gQn;
      return bool;
    }
    finally
    {
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.y
 * JD-Core Version:    0.6.2
 */