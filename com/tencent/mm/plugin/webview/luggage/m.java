package com.tencent.mm.plugin.webview.luggage;

import android.os.Looper;
import com.tencent.luggage.d.k;
import com.tencent.luggage.g.d;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.webview.luggage.permission.LuggageGetA8Key;
import com.tencent.mm.plugin.webview.luggage.permission.b;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.al;
import java.util.HashMap;

public final class m
{
  private static HashMap<String, Integer> ujr;

  static
  {
    AppMethodBeat.i(6218);
    ujr = new HashMap();
    AppMethodBeat.o(6218);
  }

  public static int a(k paramk, LuggageGetA8Key paramLuggageGetA8Key)
  {
    AppMethodBeat.i(6216);
    int i = com.tencent.luggage.d.m.a(ah.getContext(), paramk).intValue();
    b.a(paramk.hashCode(), paramLuggageGetA8Key);
    AppMethodBeat.o(6216);
    return i;
  }

  public static void remove(int paramInt)
  {
    AppMethodBeat.i(6217);
    k localk = com.tencent.luggage.d.m.b(Integer.valueOf(paramInt));
    if (localk != null)
    {
      b.IG(localk.hashCode());
      if (Thread.currentThread().getId() != Looper.getMainLooper().getThread().getId());
    }
    while (true)
    {
      try
      {
        localk.destroy();
        AppMethodBeat.o(6217);
        return;
      }
      catch (Exception localException)
      {
        d.printErrStackTrace("MicroMsg.LuggageWebCoreStash", localException, "", new Object[0]);
        AppMethodBeat.o(6217);
        continue;
      }
      al.d(new m.1(localException));
      AppMethodBeat.o(6217);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.luggage.m
 * JD-Core Version:    0.6.2
 */