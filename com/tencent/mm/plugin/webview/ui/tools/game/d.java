package com.tencent.mm.plugin.webview.ui.tools.game;

import android.content.Context;
import android.os.Build.VERSION;
import android.os.PowerManager;
import android.webkit.WebResourceResponse;
import com.tencent.luggage.g.i;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bo;
import java.io.ByteArrayInputStream;
import java.util.HashMap;
import java.util.Map;

public final class d
{
  public static WebResourceResponse nX(boolean paramBoolean)
  {
    AppMethodBeat.i(8689);
    if (Build.VERSION.SDK_INT < 21)
      AppMethodBeat.o(8689);
    Object localObject2;
    for (Object localObject1 = null; ; localObject2 = null)
    {
      while (true)
      {
        return localObject1;
        localObject1 = i.p(ah.getContext(), "game.js");
        if (!bo.isNullOrNil((String)localObject1))
        {
          localObject1 = ((String)localObject1).replaceFirst("#__usewepkg__#", String.valueOf(paramBoolean));
          Object localObject3 = (PowerManager)ah.getContext().getSystemService("power");
          if ((localObject3 != null) && (Build.VERSION.SDK_INT >= 21))
          {
            paramBoolean = ((PowerManager)localObject3).isPowerSaveMode();
            localObject3 = ((String)localObject1).replaceFirst("#__lowPowerMode__#", String.valueOf(paramBoolean)).replaceFirst("#__lowPower__#", String.valueOf(BatteryManager.uCS));
          }
          try
          {
            localObject1 = new android/webkit/WebResourceResponse;
            ByteArrayInputStream localByteArrayInputStream = new java/io/ByteArrayInputStream;
            localByteArrayInputStream.<init>(((String)localObject3).getBytes("UTF-8"));
            ((WebResourceResponse)localObject1).<init>("application/javascript", "utf-8", localByteArrayInputStream);
            localObject3 = new java/util/HashMap;
            ((HashMap)localObject3).<init>();
            ((HashMap)localObject3).put("Cache-Control", "no-cache, no-store, must-revalidate");
            ((HashMap)localObject3).put("Pragma", "no-cache");
            ((HashMap)localObject3).put("Expires", "0");
            ((WebResourceResponse)localObject1).setResponseHeaders((Map)localObject3);
            AppMethodBeat.o(8689);
            continue;
            paramBoolean = false;
          }
          catch (Exception localException)
          {
            com.tencent.luggage.g.d.b("MicroMsg.GameScriptManager", "", new Object[] { localException });
          }
        }
      }
      AppMethodBeat.o(8689);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.ui.tools.game.d
 * JD-Core Version:    0.6.2
 */