package com.tencent.mm.plugin.webview.luggage.permission;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.concurrent.ConcurrentHashMap;

public final class b
{
  private static ConcurrentHashMap<Integer, LuggageGetA8Key> ult;

  static
  {
    AppMethodBeat.i(6489);
    ult = new ConcurrentHashMap();
    AppMethodBeat.o(6489);
  }

  public static LuggageGetA8Key IG(int paramInt)
  {
    AppMethodBeat.i(6488);
    LuggageGetA8Key localLuggageGetA8Key = (LuggageGetA8Key)ult.remove(Integer.valueOf(paramInt));
    AppMethodBeat.o(6488);
    return localLuggageGetA8Key;
  }

  public static void a(int paramInt, LuggageGetA8Key paramLuggageGetA8Key)
  {
    AppMethodBeat.i(6487);
    ult.put(Integer.valueOf(paramInt), paramLuggageGetA8Key);
    AppMethodBeat.o(6487);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.luggage.permission.b
 * JD-Core Version:    0.6.2
 */