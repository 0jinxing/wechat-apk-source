package com.tencent.mm.plugin.webview.luggage.jsapi;

import android.content.Context;
import android.content.Intent;
import com.tencent.luggage.d.a.a;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bp.d;
import com.tencent.mm.g.c.ap;
import com.tencent.mm.kernel.g;
import com.tencent.mm.n.a;
import com.tencent.mm.plugin.messenger.foundation.a.j;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.ad;
import com.tencent.mm.storage.bd;
import org.json.JSONException;
import org.json.JSONObject;

public class ae extends bc
{
  public final void a(Context paramContext, String paramString, bc.a parama)
  {
    AppMethodBeat.i(6338);
    try
    {
      localObject = new org/json/JSONObject;
      ((JSONObject)localObject).<init>(paramString);
      paramString = ((JSONObject)localObject).optString("username");
      if (bo.isNullOrNil(paramString))
      {
        parama.d("param_err", null);
        AppMethodBeat.o(6338);
        return;
      }
    }
    catch (JSONException paramContext)
    {
      while (true)
      {
        ab.e("MicroMsg.JsApiOpenBizChat", "parase json fail");
        parama.d("fail", null);
        AppMethodBeat.o(6338);
        continue;
        Object localObject = ((j)g.K(j.class)).XM().aoO(paramString);
        if ((localObject == null) || (!((ad)localObject).dsf()))
        {
          parama.d("not biz username", null);
          AppMethodBeat.o(6338);
        }
        else if (!a.jh(((ap)localObject).field_type))
        {
          parama.d("open_biz_chat", null);
          AppMethodBeat.o(6338);
        }
        else
        {
          localObject = new Intent();
          ((Intent)localObject).putExtra("Chat_User", paramString);
          ((Intent)localObject).putExtra("finish_direct", true);
          d.f(paramContext, ".ui.chatting.ChattingUI", (Intent)localObject);
          parama.d(null, null);
          AppMethodBeat.o(6338);
        }
      }
    }
  }

  public final void b(a.a parama)
  {
  }

  public final int biG()
  {
    return 1;
  }

  public final String name()
  {
    return "openBizChat";
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.luggage.jsapi.ae
 * JD-Core Version:    0.6.2
 */