package com.tencent.mm.plugin.appbrand.jsapi;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.os.Bundle;
import com.tencent.luggage.sdk.config.AppBrandInitConfigLU;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.ai.b.b;
import com.tencent.mm.plugin.appbrand.ipc.AppBrandMainProcessService;
import com.tencent.mm.plugin.appbrand.o;
import com.tencent.mm.plugin.appbrand.page.u;
import com.tencent.mm.plugin.appbrand.q;
import com.tencent.mm.plugin.appbrand.report.AppBrandStatObject;
import com.tencent.mm.plugin.appbrand.ui.n;
import com.tencent.mm.protocal.protobuf.avj;
import com.tencent.mm.protocal.protobuf.avk;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import org.json.JSONException;
import org.json.JSONObject;

public final class JsApiLaunchApplicationDirectly extends JsApiLaunchApplication
{
  private static final int CTRL_INDEX = 620;
  private static final String NAME = "launchApplicationDirectly";

  public final void a(q paramq, JSONObject paramJSONObject, int paramInt)
  {
    AppMethodBeat.i(130478);
    if (paramJSONObject == null)
    {
      ab.e("MicroMsg.JsApiLaunchApplicationDirectly", "data is null");
      paramq.M(paramInt, j("fail:data is null", null));
      AppMethodBeat.o(130478);
    }
    while (true)
    {
      return;
      String str1 = paramJSONObject.optString("appId");
      String str2 = paramJSONObject.optString("schemeUrl");
      String str3 = paramJSONObject.optString("parameter");
      int i = bo.getInt(paramJSONObject.optString("alertType"), 0);
      int j = bo.getInt(paramJSONObject.optString("operateDirectly"), 0);
      String str4 = paramJSONObject.optString("extInfo");
      String str5 = paramJSONObject.optString("packageName");
      String str6 = paramJSONObject.optString("installSchemeUrl");
      String str7 = paramJSONObject.optString("fileMd5");
      String str8 = paramJSONObject.optString("taskName");
      ab.i("MicroMsg.JsApiLaunchApplicationDirectly", "appid : %s, scheme : %s, extinfo:[%s], parameter : %s", new Object[] { str1, str2, str4, str3 });
      if ((bo.isNullOrNil(str1)) && (bo.isNullOrNil(str2)))
      {
        ab.e("MicroMsg.JsApiLaunchApplicationDirectly", "appid and scheme is null or nil");
        paramq.M(paramInt, j("fail:appid and scheme is null or nil", null));
        AppMethodBeat.o(130478);
        continue;
      }
      String str9 = paramq.getAppId();
      paramJSONObject = paramq.getCurrentPageView();
      Bundle localBundle;
      if (paramJSONObject != null)
      {
        paramJSONObject = paramJSONObject.getURL();
        localBundle = new Bundle();
        if (bo.isNullOrNil(paramJSONObject));
      }
      try
      {
        localBundle.putString("current_page_url", URLEncoder.encode(paramJSONObject, "UTF-8"));
        label245: localBundle.putString("current_page_appid", str9);
        b.a locala = new b.a();
        locala.fsJ = new avj();
        locala.fsK = new avk();
        locala.uri = "/cgi-bin/mmbiz-bin/checklaunchapp";
        locala.fsI = 1125;
        avj localavj = (avj)locala.acD().fsG.fsP;
        localavj.csB = str9;
        localavj.wzn = str1;
        localavj.scene = ((o)paramq.getRuntime()).ya().bQn.scene;
        localavj.url = paramJSONObject;
        localavj.wzo = str2;
        localavj.kCo = i;
        localavj.wzp = 1;
        localavj.wzq = j;
        localavj.wzr = str6;
        ab.i("MicroMsg.JsApiLaunchApplicationDirectly", "run cgi to check(appId : %s, toAppId : %s, scene : %s, url : %s, schemeUrl : %s, alertType : %s, operateDirectly : %s)", new Object[] { str9, str1, Integer.valueOf(localavj.scene), localavj.url, localavj.wzo, Integer.valueOf(localavj.kCo), Integer.valueOf(localavj.wzq) });
        com.tencent.mm.ipcinvoker.wx_extension.b.a(locala.acD(), new JsApiLaunchApplicationDirectly.1(this, paramq, paramInt, str5, str6, str1, str8, str7, str2, localBundle, str3, str4));
        AppMethodBeat.o(130478);
        continue;
        ab.e("MicroMsg.JsApiLaunchApplicationDirectly", "getCurrentPageView is null");
        paramJSONObject = null;
      }
      catch (UnsupportedEncodingException localUnsupportedEncodingException)
      {
        break label245;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.JsApiLaunchApplicationDirectly
 * JD-Core Version:    0.6.2
 */