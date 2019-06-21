package com.tencent.mm.plugin.webview.luggage;

import android.os.Build.VERSION;
import android.webkit.WebResourceResponse;
import com.tencent.luggage.g.d;
import com.tencent.luggage.g.i;
import com.tencent.luggage.webview.a.c;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ah;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;

public final class b
  implements c
{
  private String uhL = "";

  public b()
  {
  }

  public b(String paramString)
  {
    this.uhL = paramString;
  }

  public final WebResourceResponse bG(String paramString)
  {
    paramString = null;
    AppMethodBeat.i(5979);
    if (Build.VERSION.SDK_INT < 21)
      AppMethodBeat.o(5979);
    while (true)
    {
      return paramString;
      Object localObject1 = i.p(ah.getContext(), "LuggageBridge.js");
      String str = (String)localObject1 + this.uhL;
      try
      {
        localObject1 = new android/webkit/WebResourceResponse;
        Object localObject2 = new java/io/ByteArrayInputStream;
        ((ByteArrayInputStream)localObject2).<init>(str.getBytes("UTF-8"));
        ((WebResourceResponse)localObject1).<init>("application/javascript", "utf-8", (InputStream)localObject2);
        localObject2 = new java/util/HashMap;
        ((HashMap)localObject2).<init>();
        ((HashMap)localObject2).put("Cache-Control", "no-cache, no-store, must-revalidate");
        ((HashMap)localObject2).put("Pragma", "no-cache");
        ((HashMap)localObject2).put("Expires", "0");
        ((WebResourceResponse)localObject1).setResponseHeaders((Map)localObject2);
        AppMethodBeat.o(5979);
        paramString = (String)localObject1;
      }
      catch (Exception localException)
      {
        d.b("MicroMsg.LuggageMMJsBridgeResourceProvider", "", new Object[] { localException });
        AppMethodBeat.o(5979);
      }
    }
  }

  public final String yk()
  {
    return "weixin://bridge.js";
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.luggage.b
 * JD-Core Version:    0.6.2
 */