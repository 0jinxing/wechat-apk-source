package com.tencent.luggage.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public final class a
  implements c
{
  private static Map<Class<? extends b>, b> bOa;
  private static Map<Class<? extends d>, d> bOb;

  static
  {
    AppMethodBeat.i(90706);
    bOa = new ConcurrentHashMap();
    bOb = new ConcurrentHashMap();
    AppMethodBeat.o(90706);
  }

  public final String getName()
  {
    return "luggage-core";
  }

  public final Map<Class<? extends b>, b> wH()
  {
    return bOa;
  }

  public final Map<Class<? extends d>, d> wI()
  {
    return bOb;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.luggage.a.a
 * JD-Core Version:    0.6.2
 */