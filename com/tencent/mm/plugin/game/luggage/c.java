package com.tencent.mm.plugin.game.luggage;

import com.tencent.luggage.d.k;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.game.report.api.GameWebPerformanceInfo;
import com.tencent.mm.plugin.webview.luggage.permission.LuggageGetA8Key;
import com.tencent.mm.plugin.webview.luggage.permission.b;
import com.tencent.mm.sdk.platformtools.ab;

public final class c
{
  public static void a(k paramk, String paramString, boolean paramBoolean)
  {
    AppMethodBeat.i(135828);
    GameWebPerformanceInfo localGameWebPerformanceInfo = GameWebPerformanceInfo.kU(paramString);
    ab.i("MicroMsg.LuggageGetA8KeyUtil", "getA8Key begin, time: %d", new Object[] { Long.valueOf(System.currentTimeMillis()) });
    localGameWebPerformanceInfo.eCh = System.currentTimeMillis();
    LuggageGetA8Key localLuggageGetA8Key = new LuggageGetA8Key();
    localLuggageGetA8Key.a(paramString, new c.1(localGameWebPerformanceInfo, paramk));
    if (paramBoolean)
      b.a(paramk.hashCode(), localLuggageGetA8Key);
    AppMethodBeat.o(135828);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.game.luggage.c
 * JD-Core Version:    0.6.2
 */