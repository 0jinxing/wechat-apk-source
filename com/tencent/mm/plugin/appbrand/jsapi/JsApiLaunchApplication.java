package com.tencent.mm.plugin.appbrand.jsapi;

import android.os.Bundle;
import android.os.Parcelable.Creator;
import com.tencent.luggage.sdk.config.AppBrandInitConfigLU;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b.b;
import com.tencent.mm.plugin.appbrand.ipc.AppBrandProxyTransparentUIProcessTask.a;
import com.tencent.mm.plugin.appbrand.o;
import com.tencent.mm.plugin.appbrand.page.u;
import com.tencent.mm.plugin.appbrand.q;
import com.tencent.mm.plugin.appbrand.report.AppBrandStatObject;
import com.tencent.mm.protocal.protobuf.avj;
import com.tencent.mm.protocal.protobuf.avk;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import org.json.JSONObject;

public class JsApiLaunchApplication extends a<q>
{
  private static final int CTRL_INDEX = 427;
  private static final String NAME = "launchApplication";

  public void a(final q paramq, JSONObject paramJSONObject, final int paramInt)
  {
    AppMethodBeat.i(130450);
    if (paramJSONObject == null)
    {
      ab.e("MicroMsg.JsApiLaunchApplication", "data is null");
      paramq.M(paramInt, j("fail:data is null", null));
      AppMethodBeat.o(130450);
    }
    while (true)
    {
      return;
      final String str1 = paramJSONObject.optString("appId");
      final String str2 = paramJSONObject.optString("schemeUrl");
      final String str3 = paramJSONObject.optString("parameter");
      int i = bo.getInt(paramJSONObject.optString("alertType"), 0);
      int j = bo.getInt(paramJSONObject.optString("operateDirectly"), 0);
      final String str4 = paramJSONObject.optString("extInfo");
      ab.i("MicroMsg.JsApiLaunchApplication", "appid : %s, scheme : %s, extinfo:[%s], parameter : %s", new Object[] { str1, str2, str4, str3 });
      if ((bo.isNullOrNil(str1)) && (bo.isNullOrNil(str2)))
      {
        ab.e("MicroMsg.JsApiLaunchApplication", "appid and scheme is null or nil");
        paramq.M(paramInt, j("fail:appid and scheme is null or nil", null));
        AppMethodBeat.o(130450);
        continue;
      }
      String str5 = paramq.getAppId();
      paramJSONObject = paramq.getCurrentPageView();
      final Bundle localBundle;
      if (paramJSONObject != null)
      {
        paramJSONObject = paramJSONObject.getURL();
        localBundle = new Bundle();
        if (bo.isNullOrNil(paramJSONObject));
      }
      try
      {
        localBundle.putString("current_page_url", URLEncoder.encode(paramJSONObject, "UTF-8"));
        label213: localBundle.putString("current_page_appid", str5);
        com.tencent.mm.ai.b.a locala = new com.tencent.mm.ai.b.a();
        locala.fsJ = new avj();
        locala.fsK = new avk();
        locala.uri = "/cgi-bin/mmbiz-bin/checklaunchapp";
        locala.fsI = 1125;
        avj localavj = (avj)locala.acD().fsG.fsP;
        localavj.csB = str5;
        localavj.wzn = str1;
        localavj.scene = ((o)paramq.getRuntime()).ya().bQn.scene;
        localavj.url = paramJSONObject;
        localavj.wzo = str2;
        localavj.kCo = i;
        localavj.wzp = 1;
        localavj.wzq = j;
        ab.i("MicroMsg.JsApiLaunchApplication", "run cgi to check(appId : %s, toAppId : %s, scene : %s, url : %s, schemeUrl : %s, alertType : %s, operateDirectly : %s)", new Object[] { str5, str1, Integer.valueOf(localavj.scene), localavj.url, localavj.wzo, Integer.valueOf(localavj.kCo), Integer.valueOf(localavj.wzq) });
        com.tencent.mm.ipcinvoker.wx_extension.b.a(locala.acD(), new com.tencent.mm.ipcinvoker.wx_extension.b.a()
        {
          public final void a(int paramAnonymousInt1, int paramAnonymousInt2, String paramAnonymousString, com.tencent.mm.ai.b paramAnonymousb)
          {
            AppMethodBeat.i(130439);
            ab.i("MicroMsg.JsApiLaunchApplication", "on RunCgi callback errType:%d errCode:%d msg:%s", new Object[] { Integer.valueOf(paramAnonymousInt1), Integer.valueOf(paramAnonymousInt2), paramAnonymousString });
            com.tencent.mm.ce.a.post(new JsApiLaunchApplication.1.1(this, paramAnonymousInt1, paramAnonymousInt2, paramAnonymousb));
            AppMethodBeat.o(130439);
          }
        });
        AppMethodBeat.o(130450);
        continue;
        ab.e("MicroMsg.JsApiLaunchApplication", "getCurrentPageView is null");
        paramJSONObject = null;
      }
      catch (UnsupportedEncodingException localUnsupportedEncodingException)
      {
        break label213;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.JsApiLaunchApplication
 * JD-Core Version:    0.6.2
 */