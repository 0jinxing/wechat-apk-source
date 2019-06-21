package com.tencent.mm.plugin.webview.luggage.jsapi;

import android.content.Context;
import android.content.Intent;
import com.tencent.luggage.d.a.a;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.webview.a.a;
import com.tencent.mm.pluginsdk.n;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.MMActivity.a;
import org.json.JSONException;
import org.json.JSONObject;

public class x extends bd
{
  public final void a(Context paramContext, String paramString, final bc.a parama)
  {
    AppMethodBeat.i(6321);
    try
    {
      Object localObject = new org/json/JSONObject;
      ((JSONObject)localObject).<init>(paramString);
      String str1 = ((JSONObject)localObject).optString("tousername");
      paramString = ((JSONObject)localObject).optString("extmsg");
      ab.d("MicroMsg.JsApiJumpToBizProfile", "doJumpToBizProfile %s, %s", new Object[] { str1, paramString });
      String str2 = ((JSONObject)localObject).optString("currentUrl");
      localObject = new Intent();
      ((Intent)localObject).putExtra("toUserName", str1);
      ((Intent)localObject).putExtra("extInfo", paramString);
      ((Intent)localObject).putExtra("fromURL", str2);
      ((Intent)localObject).putExtra("source", 2);
      paramString = new MMActivity.a()
      {
        public final void c(int paramAnonymousInt1, int paramAnonymousInt2, Intent paramAnonymousIntent)
        {
          AppMethodBeat.i(6320);
          if (paramAnonymousInt1 == (x.this.hashCode() & 0xFFFF))
            ab.i("MicroMsg.JsApiJumpToBizProfile", "request jumpToBizProfile, resultCode = ".concat(String.valueOf(paramAnonymousInt2)));
          switch (paramAnonymousInt2)
          {
          case 1:
          default:
            parama.d("fail", null);
            ab.e("MicroMsg.JsApiJumpToBizProfile", "unknown resultCode");
            AppMethodBeat.o(6320);
          case -1:
          case 0:
          case 2:
          case 3:
          }
          while (true)
          {
            return;
            parama.d(null, null);
            AppMethodBeat.o(6320);
            continue;
            parama.d("cancel", null);
            AppMethodBeat.o(6320);
            continue;
            parama.d("check_fail", null);
            AppMethodBeat.o(6320);
          }
        }
      };
      a.gkE.a((Intent)localObject, hashCode() & 0xFFFF, paramString, (MMActivity)paramContext);
      AppMethodBeat.o(6321);
      return;
    }
    catch (JSONException paramContext)
    {
      while (true)
      {
        ab.e("MicroMsg.JsApiJumpToBizProfile", "parase json fail");
        parama.d("fail", null);
        AppMethodBeat.o(6321);
      }
    }
  }

  public final void b(a.a parama)
  {
  }

  public final int biG()
  {
    return 2;
  }

  public final String name()
  {
    return "jumpToBizProfile";
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.luggage.jsapi.x
 * JD-Core Version:    0.6.2
 */