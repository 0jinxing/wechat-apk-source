package com.tencent.mm.plugin.appbrand;

import android.content.SharedPreferences;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.l.k.c;
import com.tencent.mm.sdk.platformtools.ah;

public final class af
{
  private static k.c gQD;
  private static k.c gQE;

  static
  {
    AppMethodBeat.i(129165);
    gQD = new af.1();
    gQE = new af.2();
    AppMethodBeat.o(129165);
  }

  private static Boolean auA()
  {
    AppMethodBeat.i(129162);
    Object localObject = ah.doC().getString("appbrandgame_open_wcwss", "");
    if ((localObject != null) && (((String)localObject).equalsIgnoreCase("wcwss")))
    {
      localObject = Boolean.TRUE;
      AppMethodBeat.o(129162);
    }
    while (true)
    {
      return localObject;
      if ((localObject != null) && (((String)localObject).equalsIgnoreCase("websocket")))
      {
        localObject = Boolean.FALSE;
        AppMethodBeat.o(129162);
      }
      else
      {
        localObject = null;
        AppMethodBeat.o(129162);
      }
    }
  }

  public static k.c auy()
  {
    return gQD;
  }

  public static k.c auz()
  {
    return gQE;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.af
 * JD-Core Version:    0.6.2
 */