package com.tencent.mm.plugin.appbrand.jsapi.contact;

import android.content.Intent;
import com.tencent.luggage.g.h;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.jsapi.c;
import com.tencent.mm.plugin.appbrand.jsapi.m;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.HashMap;

final class d$1
  implements d.a
{
  d$1(d paramd, c paramc, int paramInt)
  {
  }

  public final void a(boolean paramBoolean, String paramString, Intent paramIntent)
  {
    AppMethodBeat.i(130999);
    ab.i("MicroMsg.JsApiEnterContact", "page enterChatting isSuccess:%b", new Object[] { Boolean.valueOf(paramBoolean) });
    if (paramBoolean)
    {
      HashMap localHashMap = new HashMap();
      paramString = "";
      Object localObject = new HashMap();
      if (paramIntent != null)
      {
        paramIntent = bo.bc(paramIntent.getStringExtra("keyOutPagePath"), "");
        paramString = h.bO(paramIntent);
        localObject = h.bP(paramIntent);
      }
      localHashMap.put("path", paramString);
      localHashMap.put("query", localObject);
      ab.i("MicroMsg.JsApiEnterContact", "onBackFromContact path:%s, query:%s", new Object[] { paramString, localObject.toString() });
      this.hIt.M(this.eIl, this.hIu.j("ok", localHashMap));
      AppMethodBeat.o(130999);
    }
    while (true)
    {
      return;
      this.hIt.M(this.eIl, this.hIu.j(paramString, null));
      AppMethodBeat.o(130999);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.contact.d.1
 * JD-Core Version:    0.6.2
 */