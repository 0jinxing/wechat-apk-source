package com.tencent.mm.plugin.game.luggage.d;

import android.os.Bundle;
import com.tencent.luggage.d.c;
import com.tencent.luggage.d.k;
import com.tencent.luggage.d.n;
import com.tencent.luggage.g.i;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ipcinvoker.l;
import com.tencent.mm.plugin.webview.model.a;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.Map;
import org.json.JSONObject;

public final class f extends e
{
  public f(com.tencent.luggage.d.g paramg, k paramk, Bundle paramBundle)
  {
    super(paramg, paramk, paramBundle);
    AppMethodBeat.i(135996);
    a.c(getWebView());
    l.post(new Runnable()
    {
      public final void run()
      {
        AppMethodBeat.i(135994);
        f.this.bPN.a(new f.1.1(this));
        AppMethodBeat.o(135994);
      }
    });
    l.r(new f.2(this));
    bDK();
    AppMethodBeat.o(135996);
  }

  private void bDK()
  {
    AppMethodBeat.i(136002);
    this.bPN.a(new c()
    {
      public final String name()
      {
        return "onJsApiReady";
      }

      public final JSONObject wQ()
      {
        return null;
      }
    });
    AppMethodBeat.o(136002);
  }

  protected final com.tencent.mm.plugin.webview.ui.tools.game.g NR(String paramString)
  {
    AppMethodBeat.i(136003);
    paramString = com.tencent.mm.plugin.webview.ui.tools.game.g.agh(paramString);
    AppMethodBeat.o(136003);
    return paramString;
  }

  public final boolean NS(String paramString)
  {
    AppMethodBeat.i(136001);
    boolean bool;
    if (paramString.equals(cWL()))
    {
      bool = false;
      AppMethodBeat.o(136001);
    }
    while (true)
    {
      return bool;
      bool = super.NS(paramString);
      AppMethodBeat.o(136001);
    }
  }

  public final void bF(String paramString)
  {
    AppMethodBeat.i(136000);
    super.bF(paramString);
    bDK();
    AppMethodBeat.o(136000);
  }

  public final void e(String paramString1, String paramString2, Map<String, String> paramMap)
  {
    AppMethodBeat.i(135998);
    ab.i("MicroMsg.PreloadGameWebPage", "onUrlRedirect, time: %d", new Object[] { Long.valueOf(System.currentTimeMillis()) });
    AppMethodBeat.o(135998);
  }

  public final void g(String paramString, Bundle paramBundle)
  {
    AppMethodBeat.i(135999);
    super.g(paramString, paramBundle);
    AppMethodBeat.o(135999);
  }

  public final String xt()
  {
    AppMethodBeat.i(135997);
    String str = i.p(this.mContext, "preload_game_adapter.js");
    AppMethodBeat.o(135997);
    return str;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.game.luggage.d.f
 * JD-Core Version:    0.6.2
 */