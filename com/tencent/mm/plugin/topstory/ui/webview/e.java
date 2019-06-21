package com.tencent.mm.plugin.topstory.ui.webview;

import android.annotation.TargetApi;
import android.content.Intent;
import android.text.TextUtils;
import android.webkit.JavascriptInterface;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.m;
import com.tencent.mm.ai.p;
import com.tencent.mm.plugin.appbrand.report.AppBrandStatObject;
import com.tencent.mm.plugin.topstory.a.c.f;
import com.tencent.mm.plugin.topstory.a.c.i;
import com.tencent.mm.plugin.websearch.api.aa;
import com.tencent.mm.plugin.websearch.api.w;
import com.tencent.mm.protocal.protobuf.bsj;
import com.tencent.mm.protocal.protobuf.chn;
import com.tencent.mm.protocal.protobuf.cht;
import com.tencent.mm.protocal.protobuf.tn;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.e.m;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class e
{
  chn cPu;
  private c sHF;
  TopStoryWebView sHG;
  private boolean sHH = true;
  public com.tencent.mm.plugin.topstory.ui.home.a sHt;

  public e(TopStoryWebView paramTopStoryWebView, chn paramchn, c paramc)
  {
    this.sHG = paramTopStoryWebView;
    this.cPu = paramchn;
    this.sHF = paramc;
  }

  private static JSONObject cHp()
  {
    AppMethodBeat.i(2214);
    JSONObject localJSONObject = new JSONObject();
    try
    {
      localJSONObject.put("ret", 0);
      label22: AppMethodBeat.o(2214);
      return localJSONObject;
    }
    catch (JSONException localJSONException)
    {
      break label22;
    }
  }

  private static JSONObject cHq()
  {
    AppMethodBeat.i(2215);
    JSONObject localJSONObject = new JSONObject();
    try
    {
      localJSONObject.put("ret", -1);
      label22: AppMethodBeat.o(2215);
      return localJSONObject;
    }
    catch (JSONException localJSONException)
    {
      break label22;
    }
  }

  public final void abD(String paramString)
  {
    AppMethodBeat.i(2199);
    try
    {
      JSONObject localJSONObject = new org/json/JSONObject;
      localJSONObject.<init>();
      localJSONObject.put("json", paramString);
      localJSONObject.put("newQuery", this.sHH);
      localJSONObject.put("isCache", false);
      paramString = new com/tencent/mm/plugin/topstory/ui/webview/e$1;
      paramString.<init>(this, localJSONObject);
      al.d(paramString);
      AppMethodBeat.o(2199);
      return;
    }
    catch (Exception paramString)
    {
      while (true)
        AppMethodBeat.o(2199);
    }
  }

  public final void abM(final String paramString)
  {
    AppMethodBeat.i(2202);
    al.d(new Runnable()
    {
      @TargetApi(7)
      public final void run()
      {
        AppMethodBeat.i(2182);
        a.a(e.this, "onWebCommendEnterFromFindPage", paramString);
        AppMethodBeat.o(2182);
      }
    });
    AppMethodBeat.o(2202);
  }

  public final void abN(String paramString)
  {
    AppMethodBeat.i(2213);
    try
    {
      JSONObject localJSONObject = new org/json/JSONObject;
      localJSONObject.<init>();
      localJSONObject.put("state", paramString);
      localJSONObject.put("sessionId", this.cPu.cvF);
      localJSONObject.put("subSessionId", this.cPu.cIy);
      localJSONObject.put("scene", this.cPu.scene);
      paramString = new com/tencent/mm/plugin/topstory/ui/webview/e$4;
      paramString.<init>(this, localJSONObject);
      al.d(paramString);
      AppMethodBeat.o(2213);
      return;
    }
    catch (Exception paramString)
    {
      while (true)
        AppMethodBeat.o(2213);
    }
  }

  public final void aj(String paramString, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(2203);
    ab.i("MicroMsg.TopStory.TopStoryWebViewJSApi", "onTabSelected: %s, %s, %s", new Object[] { paramString, Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
    JSONObject localJSONObject = new JSONObject();
    try
    {
      localJSONObject.put("tabInfo", paramString);
      localJSONObject.put("contentReddot", paramInt1);
      localJSONObject.put("numberReddot", paramInt2);
      a.a(this, "onTabSelected", localJSONObject.toString());
      AppMethodBeat.o(2203);
      return;
    }
    catch (JSONException paramString)
    {
      while (true)
        ab.w("MicroMsg.TopStory.TopStoryWebViewJSApi", "onTabSelected json exception: " + paramString.getMessage());
    }
  }

  public final void aw(String paramString, long paramLong)
  {
    AppMethodBeat.i(2201);
    try
    {
      JSONObject localJSONObject = new org/json/JSONObject;
      localJSONObject.<init>();
      localJSONObject.put("msgId", paramString);
      localJSONObject.put("latestTimeStamp", paramLong);
      paramString = new com/tencent/mm/plugin/topstory/ui/webview/e$6;
      paramString.<init>(this, localJSONObject);
      al.d(paramString);
      AppMethodBeat.o(2201);
      return;
    }
    catch (JSONException paramString)
    {
      while (true)
      {
        ab.i("MicroMsg.TopStory.TopStoryWebViewJSApi", "notifyReddot " + paramString.getMessage());
        AppMethodBeat.o(2201);
      }
    }
  }

  public final void c(String paramString1, String paramString2, int paramInt1, int paramInt2, int paramInt3, String paramString3)
  {
    AppMethodBeat.i(2200);
    try
    {
      JSONObject localJSONObject = new org/json/JSONObject;
      localJSONObject.<init>();
      localJSONObject.put("beginMsgId", paramString1);
      localJSONObject.put("endMsgId", paramString2);
      localJSONObject.put("beginSeq", paramInt1);
      localJSONObject.put("endSeq", paramInt2);
      localJSONObject.put("reddotNum", paramInt3);
      localJSONObject.put("extInfo", paramString3);
      paramString1 = new com/tencent/mm/plugin/topstory/ui/webview/e$5;
      paramString1.<init>(this, localJSONObject);
      al.d(paramString1);
      AppMethodBeat.o(2200);
      return;
    }
    catch (JSONException paramString1)
    {
      while (true)
      {
        ab.i("MicroMsg.TopStory.TopStoryWebViewJSApi", "notifyNumReddotChange " + paramString1.getMessage());
        AppMethodBeat.o(2200);
      }
    }
  }

  public final void cHo()
  {
    AppMethodBeat.i(2204);
    al.d(new e.3(this));
    AppMethodBeat.o(2204);
  }

  @JavascriptInterface
  public final String doGoToRecVideoList(String paramString)
  {
    AppMethodBeat.i(2196);
    ab.i("MicroMsg.TopStory.TopStoryWebViewJSApi", "doGoToRecVideoList %s", new Object[] { paramString });
    try
    {
      JSONObject localJSONObject = new org/json/JSONObject;
      localJSONObject.<init>(paramString);
      paramString = com.tencent.mm.plugin.topstory.a.g.am(localJSONObject);
      if (this.sHt != null)
        aa.a(this.sHt.bKU(), paramString);
      paramString = cHp().toString();
      AppMethodBeat.o(2196);
      return paramString;
    }
    catch (Exception paramString)
    {
      while (true)
      {
        ab.printErrStackTrace("MicroMsg.TopStory.TopStoryWebViewJSApi", paramString, "doGoToRecVideoList", new Object[0]);
        paramString = cHq().toString();
        AppMethodBeat.o(2196);
      }
    }
  }

  @JavascriptInterface
  public final void doNegFeedback(String paramString)
  {
    AppMethodBeat.i(2217);
    ab.i("MicroMsg.TopStory.TopStoryWebViewJSApi", "doNegFeedback %s", new Object[] { paramString });
    try
    {
      JSONObject localJSONObject = new org/json/JSONObject;
      localJSONObject.<init>(paramString);
      if (localJSONObject.has("filterDocid"))
      {
        boolean bool = localJSONObject.has("category");
        if (bool);
      }
      else
      {
        AppMethodBeat.o(2217);
      }
      while (true)
      {
        return;
        paramString = localJSONObject.getString("filterDocid");
        int i = localJSONObject.getInt("category");
        ((com.tencent.mm.plugin.topstory.ui.a)com.tencent.mm.kernel.g.M(com.tencent.mm.plugin.topstory.ui.a.class)).getWebViewMgr().bq(i, paramString);
        AppMethodBeat.o(2217);
      }
    }
    catch (Exception paramString)
    {
      while (true)
      {
        ab.printErrStackTrace("MicroMsg.TopStory.TopStoryWebViewJSApi", paramString, "doNegFeedback", new Object[0]);
        AppMethodBeat.o(2217);
      }
    }
  }

  @JavascriptInterface
  public final String fetchNumReddot(String paramString)
  {
    AppMethodBeat.i(2205);
    ab.i("MicroMsg.TopStory.TopStoryWebViewJSApi", "lxl fetchNumReddot %s", new Object[] { paramString });
    try
    {
      int i = ((com.tencent.mm.plugin.topstory.a.b)com.tencent.mm.kernel.g.M(com.tencent.mm.plugin.topstory.a.b.class)).getRedDotMgr().cEU();
      paramString = ((com.tencent.mm.plugin.topstory.a.b)com.tencent.mm.kernel.g.M(com.tencent.mm.plugin.topstory.a.b.class)).getRedDotMgr().cEW();
      cht localcht = ((com.tencent.mm.plugin.topstory.a.b)com.tencent.mm.kernel.g.M(com.tencent.mm.plugin.topstory.a.b.class)).getRedDotMgr().cEX();
      c(localcht.cJb, paramString.cJb, localcht.fQi, paramString.fQi, i, paramString.extInfo);
      paramString = cHp().toString();
      AppMethodBeat.o(2205);
      return paramString;
    }
    catch (Exception paramString)
    {
      while (true)
      {
        paramString = cHq().toString();
        AppMethodBeat.o(2205);
      }
    }
  }

  @JavascriptInterface
  public final String fetchReddot(String paramString)
  {
    AppMethodBeat.i(2206);
    ab.i("MicroMsg.TopStory.TopStoryWebViewJSApi", "lxl fetchReddot %s", new Object[] { paramString });
    try
    {
      paramString = ((com.tencent.mm.plugin.topstory.a.b)com.tencent.mm.kernel.g.M(com.tencent.mm.plugin.topstory.a.b.class)).getRedDotMgr().cEP();
      if (paramString != null)
        aw(paramString.cJb, paramString.xgz);
      paramString = cHp().toString();
      AppMethodBeat.o(2206);
      return paramString;
    }
    catch (Exception paramString)
    {
      while (true)
      {
        paramString = cHq().toString();
        AppMethodBeat.o(2206);
      }
    }
  }

  @JavascriptInterface
  public final String getNetworkType(String paramString)
  {
    AppMethodBeat.i(2193);
    ab.i("MicroMsg.TopStory.TopStoryWebViewJSApi", "getNetworkType %s", new Object[] { paramString });
    try
    {
      localJSONObject = cHp();
      paramString = com.tencent.mm.plugin.topstory.a.g.cFq();
      localJSONObject.put("subtype", paramString);
      if (paramString.equals("wifi"))
        localJSONObject.put("err_msg", "network_type:wifi");
      while (true)
      {
        paramString = localJSONObject.toString();
        AppMethodBeat.o(2193);
        return paramString;
        if (!paramString.equals("fail"))
          break;
        localJSONObject.put("err_msg", "network_type:fail");
      }
    }
    catch (Exception paramString)
    {
      while (true)
      {
        JSONObject localJSONObject;
        paramString = cHq().toString();
        AppMethodBeat.o(2193);
        continue;
        localJSONObject.put("err_msg", "network_type:wwan");
      }
    }
  }

  @JavascriptInterface
  public final String getSearchData(String paramString)
  {
    Object localObject1 = null;
    Object localObject2 = null;
    AppMethodBeat.i(2187);
    ab.i("MicroMsg.TopStory.TopStoryWebViewJSApi", "getSearchData %s", new Object[] { paramString });
    if (this.sHt != null)
      this.sHt.cFy();
    com.tencent.mm.plugin.topstory.ui.c.c(this.cPu, "getSearchData", System.currentTimeMillis());
    chn localchn;
    boolean bool;
    try
    {
      Object localObject3 = new org/json/JSONObject;
      ((JSONObject)localObject3).<init>(paramString);
      localchn = new com/tencent/mm/protocal/protobuf/chn;
      localchn.<init>();
      localchn.xgj = this.cPu.xgj;
      localchn.ctj = ((JSONObject)localObject3).optString("query", "");
      localchn.offset = ((JSONObject)localObject3).optInt("offset", 0);
      localchn.scene = ((JSONObject)localObject3).optInt("scene", 21);
      localchn.cvF = ((JSONObject)localObject3).optString("sessionId", "");
      localchn.cIy = ((JSONObject)localObject3).optString("subSessionId", "");
      localchn.hlm = ((JSONObject)localObject3).optString("searchId", "");
      localchn.nQB = ((JSONObject)localObject3).optString("requestId", "");
      localchn.cdf = ((JSONObject)localObject3).optInt("tagId", 0);
      localchn.tZP = ((JSONObject)localObject3).optString("navigationId", "");
      localchn.xgn = aa.bVP();
      bool = ((JSONObject)localObject3).optBoolean("directRequest", false);
      localObject3 = ((JSONObject)localObject3).optString("extReqParams", "");
      if (!bo.isNullOrNil((String)localObject3))
      {
        paramString = new org/json/JSONArray;
        paramString.<init>((String)localObject3);
        for (i = 0; i < paramString.length(); i++)
        {
          JSONObject localJSONObject = paramString.getJSONObject(i);
          localObject3 = new com/tencent/mm/protocal/protobuf/tn;
          ((tn)localObject3).<init>();
          ((tn)localObject3).key = localJSONObject.optString("key", "");
          ((tn)localObject3).waD = localJSONObject.optInt("uintValue", 0);
          ((tn)localObject3).waE = localJSONObject.optString("textValue", "");
          localchn.tZG.add(localObject3);
        }
      }
      if (localchn.cdf == 100)
      {
        localObject3 = this.sHF;
        if (((c)localObject3).sHv == null)
          paramString = localObject2;
        while (true)
        {
          if (bo.isNullOrNil(paramString))
            break label556;
          abD(paramString);
          paramString = cHp().toString();
          AppMethodBeat.o(2187);
          return paramString;
          paramString = localObject1;
          if (((c)localObject3).sHv.sHE.cvF.equals(localchn.cvF))
          {
            paramString = localObject1;
            if (System.currentTimeMillis() - ((c)localObject3).sHv.jKz <= 60000L)
              paramString = ((c)localObject3).sHv.sHD;
          }
          ((c)localObject3).sHv = null;
          if (!bo.isNullOrNil(paramString))
            break;
          ab.i("MicroMsg.TopStory.TopStoryWebData", "load data from cache fail");
        }
      }
    }
    catch (Exception paramString)
    {
      while (true)
      {
        ab.printErrStackTrace("MicroMsg.TopStory.TopStoryWebViewJSApi", paramString, "getSearchData", new Object[0]);
        paramString = cHq().toString();
        AppMethodBeat.o(2187);
        continue;
        ab.i("MicroMsg.TopStory.TopStoryWebData", "load data from cache success %d", new Object[] { Integer.valueOf(paramString.length()) });
      }
      label556: paramString = this.sHF;
      if (this.sHt == null);
      for (i = 0; ; i = this.sHt.cFC())
      {
        paramString.a(localchn, true, false, i);
        break;
      }
      paramString = this.sHF;
      if (this.sHt != null);
    }
    for (int i = 0; ; i = this.sHt.cFC())
    {
      paramString.a(localchn, true, bool, i);
      break;
    }
  }

  @JavascriptInterface
  public final String hideNavBarShadow(String paramString)
  {
    AppMethodBeat.i(2212);
    ab.i("MicroMsg.TopStory.TopStoryWebViewJSApi", "lxl hideNavBarShadow %s", new Object[] { paramString });
    try
    {
      this.sHt.cFA();
      paramString = cHp().toString();
      AppMethodBeat.o(2212);
      return paramString;
    }
    catch (Exception paramString)
    {
      while (true)
      {
        paramString = cHq().toString();
        AppMethodBeat.o(2212);
      }
    }
  }

  @JavascriptInterface
  public final String log(String paramString)
  {
    AppMethodBeat.i(2192);
    ab.i("MicroMsg.TopStory.TopStoryWebViewJSApi", "log: %s", new Object[] { paramString });
    paramString = cHp().toString();
    AppMethodBeat.o(2192);
    return paramString;
  }

  @JavascriptInterface
  public final String openProfileWithOpenId(String paramString)
  {
    AppMethodBeat.i(2194);
    ab.i("MicroMsg.TopStory.TopStoryWebViewJSApi", "openProfileWithOpenId %s", new Object[] { paramString });
    try
    {
      JSONObject localJSONObject = new org/json/JSONObject;
      localJSONObject.<init>(paramString);
      paramString = localJSONObject.getString("openId");
      if (!bo.isNullOrNil(paramString))
        com.tencent.mm.plugin.topstory.ui.c.abC(paramString);
      paramString = cHp().toString();
      AppMethodBeat.o(2194);
      return paramString;
    }
    catch (Exception paramString)
    {
      while (true)
      {
        paramString = cHq().toString();
        AppMethodBeat.o(2194);
      }
    }
  }

  @JavascriptInterface
  public final String openSearchWebView(String paramString)
  {
    AppMethodBeat.i(2216);
    ab.i("MicroMsg.TopStory.TopStoryWebViewJSApi", "openSearchWebView %s", new Object[] { paramString });
    try
    {
      localObject1 = new org/json/JSONObject;
      ((JSONObject)localObject1).<init>(paramString);
      i = ((JSONObject)localObject1).optInt("actionType");
      localObject2 = ((JSONObject)localObject1).optString("extParams", "");
      paramString = ((JSONObject)localObject1).optString("publishId", "");
      switch (i)
      {
      case 4:
      case 5:
      default:
      case 2:
        while (true)
        {
          paramString = cHp().toString();
          AppMethodBeat.o(2216);
          return paramString;
          localObject2 = new android/content/Intent;
          ((Intent)localObject2).<init>();
          localObject1 = ((JSONObject)localObject1).optString("jumpUrl", "");
          ((Intent)localObject2).putExtra("rawUrl", (String)localObject1);
          ((Intent)localObject2).putExtra("KPublisherId", paramString);
          ab.i("MicroMsg.TopStory.TopStoryWebViewJSApi", "jump url = %s, publishId = %s", new Object[] { localObject1, paramString });
          com.tencent.mm.bp.d.b(this.sHt.bKU(), "webview", ".ui.tools.WebViewUI", (Intent)localObject2);
        }
      case 3:
      case 6:
      }
    }
    catch (Exception paramString)
    {
      while (true)
      {
        Object localObject2;
        paramString = cHq().toString();
        AppMethodBeat.o(2216);
        continue;
        String str1 = ((JSONObject)localObject1).optString("query", "");
        int i = ((JSONObject)localObject1).optInt("scene", 0);
        String str2 = ((JSONObject)localObject1).optString("sessionId", "");
        String str3 = aa.HP(i);
        int j = ((JSONObject)localObject1).optInt("tagId", 0);
        Object localObject3 = ((JSONObject)localObject1).optString("nativeConfig", "");
        Object localObject1 = null;
        boolean bool = TextUtils.isEmpty((CharSequence)localObject3);
        paramString = (String)localObject1;
        if (!bool);
        try
        {
          JSONObject localJSONObject = new org/json/JSONObject;
          localJSONObject.<init>((String)localObject3);
          paramString = (String)localObject1;
          if (localJSONObject.has("title"))
            paramString = localJSONObject.optString("title");
          localObject1 = String.valueOf(System.currentTimeMillis());
          localObject3 = new java/util/HashMap;
          ((HashMap)localObject3).<init>();
          ((HashMap)localObject3).put("scene", String.valueOf(i));
          ((HashMap)localObject3).put("query", str1);
          ((HashMap)localObject3).put("sessionId", str2);
          ((HashMap)localObject3).put("extParams", localObject2);
          ((HashMap)localObject3).put("subSessionId", str3);
          ((HashMap)localObject3).put("requestId", localObject1);
          ((HashMap)localObject3).put("pRequestId", localObject1);
          ((HashMap)localObject3).put("seq", localObject1);
          localObject2 = new com/tencent/mm/protocal/protobuf/chn;
          ((chn)localObject2).<init>();
          ((chn)localObject2).xgj = com.tencent.mm.plugin.topstory.ui.c.cFx();
          ((chn)localObject2).scene = i;
          ((chn)localObject2).hlm = "";
          ((chn)localObject2).ctj = str1;
          ((chn)localObject2).cvF = str2;
          ((chn)localObject2).cIy = str2;
          ((chn)localObject2).xgl = 2;
          ((chn)localObject2).url = com.tencent.mm.plugin.topstory.a.g.o((HashMap)localObject3);
          ((chn)localObject2).xgm = paramString;
          ((chn)localObject2).cdf = j;
          ((chn)localObject2).nQB = ((String)localObject1);
          ((chn)localObject2).xgn = aa.bVP();
          paramString = new com/tencent/mm/protocal/protobuf/tn;
          paramString.<init>();
          paramString.key = "rec_category";
          paramString.waD = j;
          paramString.waE = String.valueOf(j);
          ((chn)localObject2).tZG.add(paramString);
          com.tencent.mm.plugin.topstory.ui.c.a(ah.getContext(), (chn)localObject2, (String)localObject1);
        }
        catch (JSONException paramString)
        {
          while (true)
          {
            ab.printErrStackTrace("MicroMsg.TopStory.TopStoryWebViewJSApi", paramString, "", new Object[0]);
            paramString = (String)localObject1;
          }
        }
        j = ((JSONObject)localObject1).optInt("scene", 53);
        i = ((JSONObject)localObject1).optInt("subScene", 5);
        this.sHt.fR(j, i);
      }
    }
  }

  @JavascriptInterface
  public final String openWeAppPage(String paramString)
  {
    AppMethodBeat.i(2218);
    ab.i("MicroMsg.TopStory.TopStoryWebViewJSApi", "openWeAppPage %s", new Object[] { paramString });
    try
    {
      JSONObject localJSONObject = new org/json/JSONObject;
      localJSONObject.<init>(paramString);
      paramString = new com/tencent/mm/plugin/appbrand/report/AppBrandStatObject;
      paramString.<init>();
      paramString.scene = 1115;
      ((com.tencent.mm.plugin.appbrand.service.e)com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.appbrand.service.e.class)).a(ah.getContext(), localJSONObject.getString("userName"), localJSONObject.getString("appid"), 0, 0, localJSONObject.getString("path"), paramString);
      paramString = cHp().toString();
      AppMethodBeat.o(2218);
      return paramString;
    }
    catch (Exception paramString)
    {
      while (true)
      {
        ab.printErrStackTrace("MicroMsg.TopStory.TopStoryWebViewJSApi", paramString, "openWeAppPage", new Object[0]);
        paramString = cHq().toString();
        AppMethodBeat.o(2218);
      }
    }
  }

  @JavascriptInterface
  public final String openWowColikeSetting(String paramString)
  {
    AppMethodBeat.i(138033);
    ab.i("MicroMsg.TopStory.TopStoryWebViewJSApi", "openWowColikeSetting %s", new Object[] { paramString });
    try
    {
      com.tencent.mm.plugin.topstory.ui.c.eZ(ah.getContext());
      paramString = cHp().toString();
      AppMethodBeat.o(138033);
      return paramString;
    }
    catch (Exception paramString)
    {
      while (true)
      {
        ab.printErrStackTrace("MicroMsg.TopStory.TopStoryWebViewJSApi", paramString, "openWowColikeSetting", new Object[0]);
        paramString = cHq().toString();
        AppMethodBeat.o(138033);
      }
    }
  }

  @JavascriptInterface
  public final String postComments(String paramString)
  {
    AppMethodBeat.i(2210);
    ab.i("MicroMsg.TopStory.TopStoryWebViewJSApi", "lxl postComments %s", new Object[] { paramString });
    try
    {
      JSONObject localJSONObject = new org/json/JSONObject;
      localJSONObject.<init>(paramString);
      paramString = new com/tencent/mm/plugin/topstory/a/c/f;
      paramString.<init>(localJSONObject);
      com.tencent.mm.kernel.g.Rg().a(paramString, 0);
      paramString = cHp().toString();
      AppMethodBeat.o(2210);
      return paramString;
    }
    catch (Exception paramString)
    {
      while (true)
      {
        paramString = cHq().toString();
        AppMethodBeat.o(2210);
      }
    }
  }

  @JavascriptInterface
  public final String queryWebCommCgi(String paramString)
  {
    AppMethodBeat.i(2207);
    ab.i("MicroMsg.TopStory.TopStoryWebViewJSApi", "lxl queryWebCommCgi %s", new Object[] { paramString });
    try
    {
      Object localObject = new org/json/JSONObject;
      ((JSONObject)localObject).<init>(paramString);
      paramString = ((JSONObject)localObject).optString("requestId", "");
      String str = ((JSONObject)localObject).optString("commReq", "");
      localObject = new com/tencent/mm/plugin/topstory/a/c/a;
      ((com.tencent.mm.plugin.topstory.a.c.a)localObject).<init>(paramString, str);
      com.tencent.mm.kernel.g.Rg().a((m)localObject, 0);
      paramString = cHp().toString();
      AppMethodBeat.o(2207);
      return paramString;
    }
    catch (Exception paramString)
    {
      while (true)
      {
        paramString = cHq().toString();
        AppMethodBeat.o(2207);
      }
    }
  }

  @JavascriptInterface
  public final String renderFinish(String paramString)
  {
    AppMethodBeat.i(2198);
    ab.i("MicroMsg.TopStory.TopStoryWebViewJSApi", "renderFinish %s", new Object[] { paramString });
    try
    {
      this.sHt.cFB();
      paramString = cHp().toString();
      AppMethodBeat.o(2198);
      return paramString;
    }
    catch (Exception paramString)
    {
      while (true)
        ab.printErrStackTrace("MicroMsg.TopStory.TopStoryWebViewJSApi", paramString, "renderFinish error", new Object[0]);
    }
  }

  @JavascriptInterface
  public final String reportSearchRealTimeStatistics(String paramString)
  {
    AppMethodBeat.i(2189);
    ab.i("MicroMsg.TopStory.TopStoryWebViewJSApi", "reportSearchRealTimeStatistics %s", new Object[] { paramString });
    try
    {
      Object localObject = new org/json/JSONObject;
      ((JSONObject)localObject).<init>(paramString);
      paramString = new com/tencent/mm/protocal/protobuf/bsj;
      paramString.<init>();
      paramString.wUu = ((JSONObject)localObject).optString("logString", "");
      localObject = new com/tencent/mm/plugin/websearch/api/w;
      ((w)localObject).<init>(paramString);
      com.tencent.mm.kernel.g.Rg().a((m)localObject, 0);
      paramString = cHp().toString();
      AppMethodBeat.o(2189);
      return paramString;
    }
    catch (Exception paramString)
    {
      while (true)
      {
        ab.printErrStackTrace("MicroMsg.TopStory.TopStoryWebViewJSApi", paramString, "reportSearchRealTimeStatistics", new Object[0]);
        paramString = cHq().toString();
        AppMethodBeat.o(2189);
      }
    }
  }

  @JavascriptInterface
  public final String reportSearchStatistics(String paramString)
  {
    AppMethodBeat.i(2188);
    ab.i("MicroMsg.TopStory.TopStoryWebViewJSApi", "reportSearchStatistics %s", new Object[] { paramString });
    try
    {
      JSONObject localJSONObject = new org/json/JSONObject;
      localJSONObject.<init>(paramString);
      int i = localJSONObject.optInt("logId", 0);
      if (i != 14904)
      {
        paramString = localJSONObject.optString("logString", "");
        com.tencent.mm.plugin.report.e.pXa.X(i, paramString);
      }
      paramString = cHp().toString();
      AppMethodBeat.o(2188);
      return paramString;
    }
    catch (Exception paramString)
    {
      while (true)
      {
        ab.printErrStackTrace("MicroMsg.TopStory.TopStoryWebViewJSApi", paramString, "reportSearchStatistics", new Object[0]);
        paramString = cHq().toString();
        AppMethodBeat.o(2188);
      }
    }
  }

  @JavascriptInterface
  public final String setComments(String paramString)
  {
    AppMethodBeat.i(2209);
    ab.i("MicroMsg.TopStory.TopStoryWebViewJSApi", "lxl setComments %s", new Object[] { paramString });
    try
    {
      JSONObject localJSONObject = new org/json/JSONObject;
      localJSONObject.<init>(paramString);
      paramString = new com/tencent/mm/plugin/topstory/a/c/i;
      paramString.<init>(localJSONObject);
      com.tencent.mm.kernel.g.Rg().a(paramString, 0);
      paramString = cHp().toString();
      AppMethodBeat.o(2209);
      return paramString;
    }
    catch (Exception paramString)
    {
      while (true)
      {
        paramString = cHq().toString();
        AppMethodBeat.o(2209);
      }
    }
  }

  @JavascriptInterface
  public final String showNavBarShadow(String paramString)
  {
    AppMethodBeat.i(2211);
    ab.i("MicroMsg.TopStory.TopStoryWebViewJSApi", "lxl showNavBarShadow %s", new Object[] { paramString });
    try
    {
      JSONObject localJSONObject = new org/json/JSONObject;
      localJSONObject.<init>(paramString);
      paramString = localJSONObject.getString("color");
      paramString = paramString.substring(1, paramString.length());
      int i = (int)(localJSONObject.getDouble("alpha") * 255.0D);
      int j = Integer.parseInt(paramString, 16);
      this.sHt.fQ(j, i);
      paramString = cHp().toString();
      AppMethodBeat.o(2211);
      return paramString;
    }
    catch (Exception paramString)
    {
      while (true)
      {
        paramString = cHq().toString();
        AppMethodBeat.o(2211);
      }
    }
  }

  @JavascriptInterface
  public final String stage(String paramString)
  {
    AppMethodBeat.i(2190);
    try
    {
      ab.i("MicroMsg.TopStory.TopStoryWebViewJSApi", "stage %s", new Object[] { paramString });
      JSONObject localJSONObject = new org/json/JSONObject;
      localJSONObject.<init>(paramString);
      if (localJSONObject.keys() != null)
      {
        Iterator localIterator = localJSONObject.keys();
        while (localIterator.hasNext())
        {
          paramString = (String)localIterator.next();
          long l = localJSONObject.optLong(paramString);
          com.tencent.mm.plugin.topstory.ui.c.c(this.cPu, paramString, l);
        }
      }
    }
    catch (Exception paramString)
    {
      ab.printErrStackTrace("MicroMsg.TopStory.TopStoryWebViewJSApi", paramString, "stage", new Object[0]);
      paramString = cHq().toString();
      AppMethodBeat.o(2190);
    }
    while (true)
    {
      return paramString;
      paramString = cHp().toString();
      AppMethodBeat.o(2190);
    }
  }

  @JavascriptInterface
  public final String startSearchItemDetailPage(String paramString)
  {
    AppMethodBeat.i(2191);
    ab.i("MicroMsg.TopStory.TopStoryWebViewJSApi", "startSearchItemDetailPage %s", new Object[] { paramString });
    try
    {
      JSONObject localJSONObject = new org/json/JSONObject;
      localJSONObject.<init>(paramString);
      String str = localJSONObject.optString("jumpUrl", "");
      paramString = localJSONObject.optString("publishId", "");
      Intent localIntent = new android/content/Intent;
      localIntent.<init>();
      localIntent.putExtra("rawUrl", str);
      localIntent.putExtra("KPublisherId", paramString);
      ab.i("MicroMsg.TopStory.TopStoryWebViewJSApi", "jump url = %s, publishId = %s", new Object[] { str, paramString });
      int i = localJSONObject.optInt("openScene", 10000);
      int j = localJSONObject.optInt("subScene", -1);
      int k = localJSONObject.optInt("itemType", -1);
      localIntent.putExtra(e.m.ygo, k);
      int m = k;
      if (ab.getLogLevel() > 0)
      {
        m = k;
        if (k == -1)
          m = 0;
      }
      ab.i("MicroMsg.TopStory.TopStoryWebViewJSApi", "openScene:%s, subScene:%s, itemType:%s", new Object[] { Integer.valueOf(i), Integer.valueOf(j), Integer.valueOf(m) });
      if ((((com.tencent.mm.plugin.brandservice.a.b)com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.brandservice.a.b.class)).rW(7)) && (((com.tencent.mm.plugin.brandservice.a.b)com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.brandservice.a.b.class)).a(this.sHt.bKU(), str, m, i, j, localIntent)))
        ab.i("MicroMsg.TopStory.TopStoryWebViewJSApi", "startSearchItemDetailPage jump to TmplWebview");
      while (true)
      {
        paramString = cHp().toString();
        AppMethodBeat.o(2191);
        return paramString;
        ab.i("MicroMsg.TopStory.TopStoryWebViewJSApi", "startSearchItemDetailPage jump to WebViewUI");
        com.tencent.mm.bp.d.b(this.sHt.bKU(), "webview", ".ui.tools.WebViewUI", localIntent);
      }
    }
    catch (Exception paramString)
    {
      while (true)
      {
        ab.printErrStackTrace("MicroMsg.TopStory.TopStoryWebViewJSApi", paramString, "reportSearchRealTimeReport", new Object[0]);
        paramString = cHq().toString();
        AppMethodBeat.o(2191);
      }
    }
  }

  @JavascriptInterface
  public final String updateNumReddot(String paramString)
  {
    AppMethodBeat.i(2208);
    ab.i("MicroMsg.TopStory.TopStoryWebViewJSApi", "lxl updateNumReddot %s", new Object[] { paramString });
    try
    {
      JSONObject localJSONObject = new org/json/JSONObject;
      localJSONObject.<init>(paramString);
      long l = localJSONObject.getLong("latestTimeStamp");
      int i = localJSONObject.getInt("seq");
      ((com.tencent.mm.plugin.topstory.a.b)com.tencent.mm.kernel.g.M(com.tencent.mm.plugin.topstory.a.b.class)).getRedDotMgr().i(l, i, false);
      paramString = cHp().toString();
      AppMethodBeat.o(2208);
      return paramString;
    }
    catch (Exception paramString)
    {
      while (true)
      {
        ab.printErrStackTrace("MicroMsg.TopStory.TopStoryWebViewJSApi", paramString, "lxl updateNumReddot", new Object[0]);
        paramString = cHq().toString();
        AppMethodBeat.o(2208);
      }
    }
  }

  @JavascriptInterface
  public final String updateReddotTimeStamps(String paramString)
  {
    AppMethodBeat.i(2195);
    ab.i("MicroMsg.TopStory.TopStoryWebViewJSApi", "updateReddotTimeStamps %s", new Object[] { paramString });
    try
    {
      JSONObject localJSONObject = new org/json/JSONObject;
      localJSONObject.<init>(paramString);
      ((com.tencent.mm.plugin.topstory.a.b)com.tencent.mm.kernel.g.M(com.tencent.mm.plugin.topstory.a.b.class)).getRedDotMgr().lC(localJSONObject.optLong("reddotTimeStamps", 0L));
      paramString = cHp().toString();
      AppMethodBeat.o(2195);
      return paramString;
    }
    catch (Exception paramString)
    {
      while (true)
      {
        ab.printErrStackTrace("MicroMsg.TopStory.TopStoryWebViewJSApi", paramString, "updateReddotTimeStamps", new Object[0]);
        paramString = cHq().toString();
        AppMethodBeat.o(2195);
      }
    }
  }

  @JavascriptInterface
  public final String webViewUIReady(String paramString)
  {
    AppMethodBeat.i(2197);
    try
    {
      if (this.sHH)
      {
        this.sHH = false;
        if (this.sHt != null)
          this.sHt.cFz();
        com.tencent.mm.plugin.topstory.ui.c.c(this.cPu, "webViewUIReady", System.currentTimeMillis());
        ab.i("MicroMsg.TopStory.TopStoryWebViewJSApi", "traceResult:\n%s", new Object[] { com.tencent.mm.plugin.topstory.ui.c.a(this.cPu) });
      }
      paramString = cHp().toString();
      AppMethodBeat.o(2197);
      return paramString;
    }
    catch (Exception paramString)
    {
      while (true)
      {
        paramString = cHq().toString();
        AppMethodBeat.o(2197);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.topstory.ui.webview.e
 * JD-Core Version:    0.6.2
 */