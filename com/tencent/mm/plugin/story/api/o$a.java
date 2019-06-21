package com.tencent.mm.plugin.story.api;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.HashMap;
import java.util.Map;

public final class o$a
{
  private static a rQO;
  private Map<Long, o> rQP;

  public o$a()
  {
    AppMethodBeat.i(56493);
    this.rQP = new HashMap();
    AppMethodBeat.o(56493);
  }

  public static a cxg()
  {
    AppMethodBeat.i(56494);
    if (rQO == null)
      rQO = new a();
    a locala = rQO;
    AppMethodBeat.o(56494);
    return locala;
  }

  public final void a(long paramLong, o paramo)
  {
    AppMethodBeat.i(56495);
    this.rQP.put(Long.valueOf(paramLong), paramo);
    AppMethodBeat.o(56495);
  }

  public final o kW(long paramLong)
  {
    AppMethodBeat.i(56496);
    o localo = (o)this.rQP.remove(Long.valueOf(paramLong));
    AppMethodBeat.o(56496);
    return localo;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.story.api.o.a
 * JD-Core Version:    0.6.2
 */