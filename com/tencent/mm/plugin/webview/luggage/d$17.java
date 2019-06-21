package com.tencent.mm.plugin.webview.luggage;

import android.net.Uri;
import android.os.Bundle;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import com.tencent.luggage.d.e;
import com.tencent.luggage.d.n;
import com.tencent.luggage.d.n.a;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.cj.c;
import com.tencent.mm.sdk.platformtools.ab;

final class d$17 extends n.a
{
  d$17(d paramd)
  {
  }

  public final WebResourceResponse a(WebResourceRequest paramWebResourceRequest, Bundle paramBundle)
  {
    AppMethodBeat.i(6039);
    if (c.iv(this.uiy.mContext));
    try
    {
      int i = paramBundle.getInt("resourceType");
      if ((i == 1) || (i == 7))
      {
        ab.i("MicroMsg.LuggageMMWebPage", "get resoutce type is iframe : %d, start geta8key", new Object[] { Integer.valueOf(i) });
        this.uiy.aed(paramWebResourceRequest.getUrl().toString());
      }
      AppMethodBeat.o(6039);
      return null;
    }
    catch (Exception paramWebResourceRequest)
    {
      while (true)
        ab.w("MicroMsg.LuggageMMWebPage", "get resource type failed Exception ; %s", new Object[] { paramWebResourceRequest.getMessage() });
    }
    catch (Throwable paramWebResourceRequest)
    {
      while (true)
        ab.w("MicroMsg.LuggageMMWebPage", "get resource type failed Throwable ; %s", new Object[] { paramWebResourceRequest.getMessage() });
    }
  }

  public final void a(n paramn, String paramString)
  {
    AppMethodBeat.i(6037);
    this.uiy.bE(paramString);
    AppMethodBeat.o(6037);
  }

  public final void b(n paramn, String paramString)
  {
    AppMethodBeat.i(6038);
    this.uiy.bF(paramString);
    AppMethodBeat.o(6038);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.luggage.d.17
 * JD-Core Version:    0.6.2
 */