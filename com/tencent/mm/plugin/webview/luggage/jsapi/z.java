package com.tencent.mm.plugin.webview.luggage.jsapi;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.a.jc;
import com.tencent.mm.opensdk.modelmsg.WXAppExtendObject;
import com.tencent.mm.opensdk.modelmsg.WXMediaMessage;
import com.tencent.mm.opensdk.modelmsg.WXMediaMessage.IMediaObject;
import com.tencent.mm.plugin.webview.luggage.c.c;
import com.tencent.mm.plugin.webview.luggage.d;
import com.tencent.mm.pluginsdk.m;
import com.tencent.mm.pluginsdk.model.app.aj;
import com.tencent.mm.pluginsdk.model.app.p;
import com.tencent.mm.sdk.b.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bo;
import org.json.JSONObject;

public class z extends bd<d>
{
  public final void a(Context paramContext, String paramString, bc.a parama)
  {
    AppMethodBeat.i(6325);
    ab.i("MicroMsg.JsApiLaunch3RdApp", "invokeInMM");
    Object localObject1 = c.AI(paramString);
    if (localObject1 == null)
    {
      parama.d("invalid_data", null);
      AppMethodBeat.o(6325);
    }
    while (true)
    {
      return;
      int i = ((JSONObject)localObject1).optInt("type");
      paramString = ((JSONObject)localObject1).optString("appID");
      Object localObject2;
      if (i == 0)
      {
        localObject1 = ((JSONObject)localObject1).optString("extInfo");
        ab.i("MicroMsg.JsApiLaunch3RdApp", "appid:[%s], extinfo:[%s]", new Object[] { paramString, localObject1 });
        if (bo.isNullOrNil(paramString))
        {
          ab.e("MicroMsg.JsApiLaunch3RdApp", "appid is null or nil");
          parama.d("fail", null);
          AppMethodBeat.o(6325);
        }
        else if (!com.tencent.mm.plugin.webview.a.a.gkF.u(ah.getContext(), paramString))
        {
          ab.e("MicroMsg.JsApiLaunch3RdApp", "app is not installed, appid:[%s]", new Object[] { paramString });
          parama.d("fail", null);
          AppMethodBeat.o(6325);
        }
        else
        {
          localObject2 = new WXAppExtendObject();
          ((WXAppExtendObject)localObject2).extInfo = ((String)localObject1);
          localObject2 = new WXMediaMessage((WXMediaMessage.IMediaObject)localObject2);
          ((WXMediaMessage)localObject2).sdkVer = 620954368;
          ((WXMediaMessage)localObject2).messageExt = ((String)localObject1);
          localObject1 = new jc();
          ((jc)localObject1).cEj.cEl = ((WXMediaMessage)localObject2);
          ((jc)localObject1).cEj.appId = paramString;
          ((jc)localObject1).cEj.context = paramContext;
          ((jc)localObject1).cEj.cEm = new z.1(this, parama);
          com.tencent.mm.sdk.b.a.xxA.m((b)localObject1);
          AppMethodBeat.o(6325);
        }
      }
      else if (i == 1)
      {
        String str = ((JSONObject)localObject1).optString("signature");
        localObject2 = ((JSONObject)localObject1).optString("packageName");
        paramString = ((JSONObject)localObject1).optString("param");
        ab.i("MicroMsg.JsApiLaunch3RdApp", "doLaunch3RdApp, signature:[%s], packageName:[%s], param:[%s]", new Object[] { str, localObject2, paramString });
        if ((bo.isNullOrNil(str)) || (bo.isNullOrNil((String)localObject2)))
        {
          ab.e("MicroMsg.JsApiLaunch3RdApp", "doLaunch3RdApp invalid_args");
          parama.d("invalid_args", null);
          AppMethodBeat.o(6325);
        }
        else if (!p.u(paramContext, (String)localObject2))
        {
          ab.e("MicroMsg.JsApiLaunch3RdApp", "doLaunch3RdApp not_install");
          parama.d("not_install", null);
          AppMethodBeat.o(6325);
        }
        else
        {
          Object localObject3 = p.bx(paramContext, (String)localObject2);
          if ((localObject3 != null) && (localObject3[0] != null))
          {
            localObject3 = com.tencent.mm.a.g.x(localObject3[0].toByteArray());
            if ((localObject3 != null) && (((String)localObject3).equalsIgnoreCase(str)))
            {
              str = ((JSONObject)localObject1).optString("currentUrl");
              localObject1 = ((JSONObject)localObject1).optString("preVerifyAppId");
              try
              {
                localObject2 = ah.getContext().getPackageManager().getLaunchIntentForPackage((String)localObject2);
                if (localObject2 != null)
                {
                  localObject3 = new android/os/Bundle;
                  ((Bundle)localObject3).<init>();
                  p.j((Bundle)localObject3, paramString);
                  ((Intent)localObject2).putExtras((Bundle)localObject3);
                  ((Intent)localObject2).addFlags(268435456);
                  paramString = new android/os/Bundle;
                  paramString.<init>();
                  paramString.putString("current_page_url", str);
                  paramString.putString("current_page_appid", (String)localObject1);
                  localObject1 = new com/tencent/mm/plugin/webview/luggage/jsapi/z$2;
                  ((z.2)localObject1).<init>(this, parama);
                  com.tencent.mm.pluginsdk.model.app.g.a(paramContext, (Intent)localObject2, null, (aj)localObject1, paramString);
                  AppMethodBeat.o(6325);
                }
              }
              catch (Exception paramContext)
              {
                ab.e("MicroMsg.JsApiLaunch3RdApp", "doLaunch3RdApp getLaunchIntentForPackage, %s", new Object[] { paramContext.getMessage() });
                parama.d("fail", null);
                AppMethodBeat.o(6325);
              }
            }
          }
          else
          {
            ab.e("MicroMsg.JsApiLaunch3RdApp", "doLaunch3RdApp signature_mismatch");
            parama.d("signature_mismatch", null);
            AppMethodBeat.o(6325);
          }
        }
      }
      else
      {
        parama.d("invalid_type", null);
        AppMethodBeat.o(6325);
      }
    }
  }

  public final void b(com.tencent.luggage.d.a<d>.a parama)
  {
  }

  public final int biG()
  {
    return 2;
  }

  public final String name()
  {
    return "launch3rdApp";
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.luggage.jsapi.z
 * JD-Core Version:    0.6.2
 */