package com.tencent.mm.plugin.topstory.ui.webview;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;

public final class a
{
  public static void a(e parame, String paramString1, String paramString2)
  {
    AppMethodBeat.i(2143);
    try
    {
      boolean bool = bo.isNullOrNil(paramString1);
      if (bool)
        AppMethodBeat.o(2143);
      while (true)
      {
        return;
        paramString2 = bo.nullAsNil(paramString2);
        ab.i("MicroMsg.TopStory.TopStoryJsEventNotifier", "lxl notifyJsEvent %s %s", new Object[] { paramString1, paramString2 });
        paramString1 = String.format("javascript:window['%s'] && %s(%s)", new Object[] { paramString1, paramString1, paramString2 });
        if ((parame != null) && (parame.sHG != null))
          parame.sHG.evaluateJavascript(paramString1, null);
        AppMethodBeat.o(2143);
      }
    }
    catch (Exception parame)
    {
      while (true)
      {
        ab.printErrStackTrace("MicroMsg.TopStory.TopStoryJsEventNotifier", parame, "notifyJsEvent", new Object[0]);
        AppMethodBeat.o(2143);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.topstory.ui.webview.a
 * JD-Core Version:    0.6.2
 */