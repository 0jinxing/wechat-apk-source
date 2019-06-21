package com.tencent.mm.plugin.appbrand.jsapi.o;

import android.text.TextUtils;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.jsapi.a;
import com.tencent.mm.plugin.appbrand.jsapi.c;
import com.tencent.mm.plugin.appbrand.jsapi.m;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.at;
import com.tencent.mm.sdk.platformtools.bo;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import org.json.JSONObject;

public class d extends a
{
  private static final int CTRL_INDEX = 45;
  private static final String NAME = "reportAction";

  public final void a(c paramc, JSONObject paramJSONObject, int paramInt)
  {
    AppMethodBeat.i(73181);
    String str1 = paramJSONObject.optString("key");
    String str2 = paramJSONObject.optString("value");
    ab.i("MicroMsg.JsApiReportAction", "doReportActionInfo, actionKey =  %s, actionValue =  %s", new Object[] { str1, str2 });
    if ((bo.isNullOrNil(str1)) || (bo.isNullOrNil(str2)))
    {
      ab.e("MicroMsg.JsApiReportAction", "doReportActionInfo, actionKey or actionValue is null");
      paramc.M(paramInt, j("fail", null));
      AppMethodBeat.o(73181);
    }
    while (true)
    {
      return;
      if ((str1.length() <= 0) || (str1.length() > 32) || (str2.length() <= 0) || (str2.length() > 1024))
      {
        ab.e("MicroMsg.JsApiReportAction", "doReportActionInfo, actionKey or actionValue size is bad");
        paramc.M(paramInt, j("fail", null));
        AppMethodBeat.o(73181);
        continue;
      }
      String str3 = paramc.getAppId();
      if (TextUtils.isEmpty(str3))
      {
        ab.e("MicroMsg.JsApiReportAction", "doReportActionInfo, appId is empty");
        paramc.M(paramInt, j("fail", null));
        AppMethodBeat.o(73181);
        continue;
      }
      ab.i("MicroMsg.JsApiReportAction", "doReportActionInfo, appId %s", new Object[] { str3 });
      int i = 0;
      int j = 0;
      label245: long l;
      Object localObject1;
      String str4;
      String str5;
      String str6;
      Object localObject2;
      if (at.isConnected(paramc.getContext()))
      {
        if (at.isWifi(paramc.getContext()))
        {
          i = 1;
          ab.i("MicroMsg.JsApiReportAction", "doReportActionInfo, get networkType %d", new Object[] { Integer.valueOf(i) });
        }
      }
      else
      {
        l = bo.anT();
        ab.d("MicroMsg.JsApiReportAction", "report(%s), clickTimestamp : %d, appID %s, networkType %d, userAgent %s, url : %s, sessionID : %s, actionKey : %s, actionValue : %s", new Object[] { Long.valueOf(l), Integer.valueOf(13579), str3, Integer.valueOf(i), "", "", "", str1, str2 });
        paramJSONObject = "";
        localObject1 = "";
        str4 = "";
        str5 = "";
        str6 = str4;
        localObject2 = localObject1;
      }
      try
      {
        Object localObject3 = URLEncoder.encode(bo.nullAsNil(""), "UTF-8");
        str6 = str4;
        localObject2 = localObject1;
        paramJSONObject = (JSONObject)localObject3;
        localObject1 = URLEncoder.encode("", "UTF-8");
        str6 = str4;
        localObject2 = localObject1;
        paramJSONObject = (JSONObject)localObject3;
        str4 = URLEncoder.encode(str1, "UTF-8");
        str6 = str4;
        localObject2 = localObject1;
        paramJSONObject = (JSONObject)localObject3;
        str2 = URLEncoder.encode(str2, "UTF-8");
        localObject2 = str2;
        paramJSONObject = (JSONObject)localObject3;
        str6 = str4;
        localObject3 = localObject2;
        h.pYm.e(13579, new Object[] { str3, Integer.valueOf(i), paramJSONObject, localObject1, "", str6, localObject3, Long.valueOf(l), Long.valueOf(l) });
        paramc.M(paramInt, j("ok", null));
        AppMethodBeat.o(73181);
        continue;
        if (at.is4G(paramc.getContext()))
        {
          i = 4;
          break label245;
        }
        if (at.is3G(paramc.getContext()))
        {
          i = 3;
          break label245;
        }
        i = j;
        if (!at.is2G(paramc.getContext()))
          break label245;
        i = 2;
      }
      catch (UnsupportedEncodingException localUnsupportedEncodingException)
      {
        while (true)
        {
          ab.printErrStackTrace("MicroMsg.JsApiReportAction", localUnsupportedEncodingException, "", new Object[0]);
          String str7 = str5;
          localObject1 = localObject2;
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.o.d
 * JD-Core Version:    0.6.2
 */