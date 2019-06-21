package com.tencent.mm.plugin.appbrand.jsapi.contact;

import android.content.Intent;
import com.tencent.luggage.g.h;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.jsapi.c;
import com.tencent.mm.plugin.appbrand.jsapi.m;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.HashMap;

final class e$1
  implements e.a
{
  e$1(e parame, c paramc, int paramInt)
  {
  }

  public final void a(boolean paramBoolean, String paramString, Intent paramIntent)
  {
    AppMethodBeat.i(131019);
    ab.i("MicroMsg.JsApiPrivateEnterContact", "privateEnterContact page enterChatting isSuccess:%b", new Object[] { Boolean.valueOf(paramBoolean) });
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
      ab.i("MicroMsg.JsApiPrivateEnterContact", "onBackFromContact path:%s, query:%s", new Object[] { paramString, localObject.toString() });
      this.hIt.M(this.eIl, this.hII.j("ok", localHashMap));
      AppMethodBeat.o(131019);
    }
    while (true)
    {
      return;
      this.hIt.M(this.eIl, this.hII.j(paramString, null));
      AppMethodBeat.o(131019);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.contact.e.1
 * JD-Core Version:    0.6.2
 */