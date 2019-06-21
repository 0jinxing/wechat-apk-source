package com.tencent.mm.plugin.webview.luggage.jsapi;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.a.cl;
import com.tencent.mm.g.a.cl.b;
import com.tencent.mm.plugin.webview.model.c;
import com.tencent.mm.plugin.webview.model.c.a;
import com.tencent.mm.plugin.webview.ui.tools.jsapi.k;
import com.tencent.mm.sdk.b.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.MMActivity;
import java.io.Serializable;
import java.util.HashMap;
import org.json.JSONObject;

public class ap extends bd<com.tencent.mm.plugin.webview.luggage.d>
{
  private static int cSP;

  public static void IF(int paramInt)
  {
    cSP = paramInt;
  }

  public static int cXn()
  {
    return cSP;
  }

  public static void cXo()
  {
    cSP = 0;
  }

  public final void a(Context paramContext, String paramString, bc.a parama)
  {
    AppMethodBeat.i(6369);
    ab.d("MicroMsg.JsApiSendAppMessage", "invokeInMM");
    try
    {
      localObject1 = new org/json/JSONObject;
      ((JSONObject)localObject1).<init>(paramString);
      paramString = (String)localObject1;
      if (paramString == null)
      {
        parama.d("data is null", null);
        AppMethodBeat.o(6369);
        return;
      }
    }
    catch (Exception paramString)
    {
      while (true)
      {
        Object localObject1;
        paramString = null;
        continue;
        Object localObject2;
        switch (paramString.optInt("sendAppMessageScene", 0))
        {
        default:
          k.agC(paramString.optString("img_url"));
          localObject1 = new HashMap();
          ((HashMap)localObject1).put("img_url", paramString.optString("img_url"));
          ((HashMap)localObject1).put("desc", paramString.optString("desc"));
          ((HashMap)localObject1).put("title", paramString.optString("title"));
          ((HashMap)localObject1).put("url", paramString.optString("shareUrl"));
          localObject2 = new Intent();
          ((Intent)localObject2).putExtra("Select_Conv_Type", 3);
          ((Intent)localObject2).putExtra("scene_from", 2);
          ((Intent)localObject2).putExtra("mutil_select_is_ret", true);
          ((Intent)localObject2).putExtra("webview_params", (Serializable)localObject1);
          ((Intent)localObject2).putExtra("Retr_Msg_Type", 2);
          com.tencent.mm.bp.d.a((MMActivity)paramContext, ".ui.transmit.SelectConversationUI", (Intent)localObject2, 1, new ap.2(this, paramString, parama, paramContext));
          AppMethodBeat.o(6369);
          break;
        case 1:
          ab.i("MicroMsg.JsApiSendAppMessage", "favoriteUrl");
          localObject1 = new cl();
          localObject2 = new c.a();
          ((c.a)localObject2).url = paramString.optString("shareUrl");
          ((c.a)localObject2).thumbUrl = paramString.optString("img_url");
          ((c.a)localObject2).title = paramString.optString("title");
          ((c.a)localObject2).desc = paramString.optString("desc");
          ((c.a)localObject2).csB = paramString.optString("appid");
          if ((paramContext != null) && ((paramContext instanceof MMActivity)))
          {
            ((cl)localObject1).cvA.activity = ((Activity)paramContext);
            ((cl)localObject1).cvA.cvH = 36;
          }
          ((cl)localObject1).cvA.cvJ = new ap.1(this, parama);
          c.a((cl)localObject1, (c.a)localObject2);
          com.tencent.mm.sdk.b.a.xxA.m((b)localObject1);
          if (((cl)localObject1).cvB.ret != 0)
            parama.d("fail", null);
          AppMethodBeat.o(6369);
        }
      }
    }
  }

  public final void b(com.tencent.luggage.d.a<com.tencent.mm.plugin.webview.luggage.d>.a parama)
  {
  }

  public final int biG()
  {
    return 2;
  }

  public final String name()
  {
    return "sendAppMessage";
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.luggage.jsapi.ap
 * JD-Core Version:    0.6.2
 */