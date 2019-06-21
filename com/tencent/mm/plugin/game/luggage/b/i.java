package com.tencent.mm.plugin.game.luggage.b;

import android.content.Context;
import com.tencent.luggage.d.a;
import com.tencent.luggage.d.a.a;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.game.luggage.d.e;
import com.tencent.mm.plugin.webview.luggage.d;
import com.tencent.mm.plugin.webview.luggage.jsapi.bc.a;
import com.tencent.mm.plugin.webview.luggage.jsapi.bd;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.xweb.c;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class i extends bd<e>
{
  public final void a(Context paramContext, String paramString, bc.a parama)
  {
  }

  public final void b(a<e>.a parama)
  {
    AppMethodBeat.i(135876);
    ab.i("MicroMsg.JsApiGetWePkgAuthResult", "invoke");
    if (((e)parama.bOZ).cWK())
    {
      ab.i("MicroMsg.JsApiGetWePkgAuthResult", "gettingA8Key");
      parama.a("auth_result_not_return", null);
      AppMethodBeat.o(135876);
      return;
    }
    String str1 = ((e)parama.bOZ).mTH;
    boolean bool = ((e)parama.bOZ).mTI;
    if ((bo.isNullOrNil(str1)) && (com.tencent.mm.plugin.game.luggage.b.bDp()))
    {
      str1 = com.tencent.mm.plugin.game.luggage.b.mTH;
      if (com.tencent.mm.plugin.game.luggage.b.mHeaders == null)
        bool = false;
    }
    label92: for (int i = 1; ; i = 0)
    {
      if (bo.isNullOrNil(str1))
      {
        parama.a("full_url_empty", null);
        AppMethodBeat.o(135876);
        break;
        String str2 = "." + bo.anB(com.tencent.mm.plugin.game.luggage.b.mTH);
        String str3 = bo.anB(com.tencent.mm.plugin.game.luggage.b.mTH);
        c.jx(ah.getContext());
        com.tencent.xweb.b localb = com.tencent.xweb.b.dTR();
        localObject = com.tencent.mm.plugin.game.luggage.b.mHeaders.keySet().iterator();
        while (((Iterator)localObject).hasNext())
        {
          String str4 = (String)((Iterator)localObject).next();
          localb.setCookie(str3, str4 + "=" + (String)com.tencent.mm.plugin.game.luggage.b.mHeaders.get(str4));
        }
        localb.setCookie(str3, "httponly");
        localb.setCookie(str2, "httponly");
        c.dTT();
        c.sync();
        ab.i("MicroMsg.LuggageGameUinKeyHolder", "setCookie, cookies:%s", new Object[] { localb.getCookie(str3) });
        bool = true;
        break label92;
      }
      Object localObject = new HashMap();
      if (bool)
        ((HashMap)localObject).put("set_cookie", Integer.valueOf(1));
      while (true)
      {
        if (i != 0)
          ((HashMap)localObject).put("used_cache_uinkey", Integer.valueOf(1));
        ((HashMap)localObject).put("full_url", str1);
        parama.c("", (Map)localObject);
        AppMethodBeat.o(135876);
        break;
        ((HashMap)localObject).put("set_cookie", Integer.valueOf(0));
      }
    }
  }

  public final int biG()
  {
    return 0;
  }

  public final String name()
  {
    return "getWePkgAuthResult";
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.game.luggage.b.i
 * JD-Core Version:    0.6.2
 */