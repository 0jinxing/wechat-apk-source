package com.tencent.mm.plugin.webview.luggage.jsapi;

import android.content.Context;
import android.os.Bundle;
import com.tencent.luggage.d.a;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.ai.b.b;
import com.tencent.mm.ai.w;
import com.tencent.mm.plugin.webview.luggage.c.c;
import com.tencent.mm.plugin.webview.luggage.d;
import com.tencent.mm.protocal.protobuf.avj;
import com.tencent.mm.protocal.protobuf.avk;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import org.json.JSONObject;

public class aa extends bd<d>
{
  public final void a(Context paramContext, String paramString, bc.a parama)
  {
    AppMethodBeat.i(6329);
    ab.i("MicroMsg.JsApiLaunchApplication", "invokeInMM");
    Object localObject1 = c.AI(paramString);
    if (localObject1 == null)
    {
      ab.e("MicroMsg.JsApiLaunchApplication", "data is null");
      parama.d("fail", null);
      AppMethodBeat.o(6329);
    }
    while (true)
    {
      return;
      String str1 = ((JSONObject)localObject1).optString("appID");
      paramString = ((JSONObject)localObject1).optString("schemeUrl");
      String str2 = ((JSONObject)localObject1).optString("parameter");
      int i = ((JSONObject)localObject1).optInt("alertType");
      String str3 = ((JSONObject)localObject1).optString("extInfo");
      ab.i("MicroMsg.JsApiLaunchApplication", "appid : %s, scheme : %s, extinfo:[%s], parameter : %s", new Object[] { str1, paramString, str3, str2 });
      if ((bo.isNullOrNil(str1)) && (bo.isNullOrNil(paramString)))
      {
        ab.e("MicroMsg.JsApiLaunchApplication", "appid and scheme is null or nil");
        parama.d("fail", null);
        AppMethodBeat.o(6329);
        continue;
      }
      String str4 = ((JSONObject)localObject1).optString("preVerifyAppId");
      localObject1 = ((JSONObject)localObject1).optString("currentUrl");
      Bundle localBundle = new Bundle();
      try
      {
        localBundle.putString("current_page_url", URLEncoder.encode((String)localObject1, "UTF-8"));
        label198: localBundle.putString("current_page_appid", str4);
        Object localObject2 = new b.a();
        ((b.a)localObject2).fsJ = new avj();
        ((b.a)localObject2).fsK = new avk();
        ((b.a)localObject2).uri = "/cgi-bin/mmbiz-bin/checklaunchapp";
        ((b.a)localObject2).fsI = 1125;
        b localb = ((b.a)localObject2).acD();
        localObject2 = (avj)localb.fsG.fsP;
        ((avj)localObject2).csB = str4;
        ((avj)localObject2).wzn = str1;
        ((avj)localObject2).scene = 0;
        ((avj)localObject2).url = ((String)localObject1);
        ((avj)localObject2).wzo = paramString;
        ((avj)localObject2).kCo = i;
        ((avj)localObject2).wzp = 0;
        ab.i("MicroMsg.JsApiLaunchApplication", "run cgi to check(appId : %s, toAppId : %s, scene : %s, url : %s, schemeUrl : %s, alertType : %s)", new Object[] { str4, str1, Integer.valueOf(((avj)localObject2).scene), ((avj)localObject2).url, ((avj)localObject2).wzo, Integer.valueOf(((avj)localObject2).kCo) });
        w.a(localb, new aa.1(this, parama, paramString, paramContext, localBundle, str3, str1, str2));
        AppMethodBeat.o(6329);
      }
      catch (UnsupportedEncodingException localUnsupportedEncodingException)
      {
        break label198;
      }
    }
  }

  public final void b(a<d>.a parama)
  {
  }

  public final int biG()
  {
    return 2;
  }

  public final String name()
  {
    return "launchApplication";
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.luggage.jsapi.aa
 * JD-Core Version:    0.6.2
 */