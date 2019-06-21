package com.tencent.mm.plugin.appbrand.jsapi.contact;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.ai.b.b;
import com.tencent.mm.plugin.appbrand.appcache.WxaPkgWrappingInfo;
import com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC;
import com.tencent.mm.plugin.appbrand.config.AppBrandSysConfigWC;
import com.tencent.mm.plugin.appbrand.config.WxaExposedParams.a;
import com.tencent.mm.plugin.appbrand.ipc.AppBrandMainProcessService;
import com.tencent.mm.plugin.appbrand.jsapi.a;
import com.tencent.mm.plugin.appbrand.jsapi.c;
import com.tencent.mm.plugin.appbrand.jsapi.m;
import com.tencent.mm.plugin.appbrand.jsapi.share.l;
import com.tencent.mm.plugin.appbrand.o;
import com.tencent.mm.plugin.appbrand.page.u;
import com.tencent.mm.plugin.appbrand.page.w;
import com.tencent.mm.plugin.appbrand.s;
import com.tencent.mm.plugin.appbrand.v;
import com.tencent.mm.protocal.protobuf.aoo;
import com.tencent.mm.protocal.protobuf.aop;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import org.json.JSONObject;

public final class d extends a
{
  public static final int CTRL_INDEX = 145;
  public static final String NAME = "enterContact";
  private String hIm;
  String hIn;
  String hIo;
  String hIp;
  boolean hIq;
  String hIr;
  boolean hIs;
  private String sessionFrom;

  private static String a(u paramu)
  {
    AppMethodBeat.i(131011);
    String str = "";
    if (paramu != null)
      str = paramu.getURL();
    ab.d("MicroMsg.JsApiEnterContact", "getCurrentPageId %s", new Object[] { str });
    AppMethodBeat.o(131011);
    return str;
  }

  private void a(w paramw, AppBrandSysConfigWC paramAppBrandSysConfigWC, d.a parama)
  {
    AppMethodBeat.i(131007);
    String str = paramw.getRuntime().atI().username;
    if ((paramAppBrandSysConfigWC == null) || (bo.isNullOrNil(str)))
    {
      ab.e("MicroMsg.JsApiEnterContact", "doCgiAndEnterChatting username is null, err");
      if (parama != null)
        parama.a(false, "fail:config is null", null);
      AppMethodBeat.o(131007);
    }
    while (true)
    {
      return;
      Object localObject = new b.a();
      ((b.a)localObject).fsJ = new aoo();
      ((b.a)localObject).fsK = new aop();
      ((b.a)localObject).uri = "/cgi-bin/mmbiz-bin/wxausrevent/getsubbusinessinfo";
      ((b.a)localObject).fsI = 1303;
      ((b.a)localObject).fsL = 0;
      ((b.a)localObject).fsM = 0;
      com.tencent.mm.ai.b localb = ((b.a)localObject).acD();
      localObject = (aoo)localb.fsG.fsP;
      ((aoo)localObject).username = str;
      ((aoo)localObject).wsG = this.hIm;
      com.tencent.mm.ipcinvoker.wx_extension.b.a(localb, new d.2(this, parama, paramw, paramAppBrandSysConfigWC));
      AppMethodBeat.o(131007);
    }
  }

  private void a(w paramw, c paramc, JSONObject paramJSONObject, int paramInt)
  {
    AppMethodBeat.i(131005);
    a(paramw, paramJSONObject, new d.1(this, paramc, paramInt));
    AppMethodBeat.o(131005);
  }

  private void a(w paramw, JSONObject paramJSONObject, d.a parama)
  {
    AppMethodBeat.i(131006);
    if (paramJSONObject == null)
    {
      ab.e("MicroMsg.JsApiEnterContact", "enterChatting fail, data is null");
      parama.a(false, "fail:invalid data", null);
      AppMethodBeat.o(131006);
    }
    while (true)
    {
      return;
      AppBrandSysConfigWC localAppBrandSysConfigWC = paramw.getRuntime().atH();
      if (localAppBrandSysConfigWC == null)
      {
        ab.i("MicroMsg.JsApiEnterContact", "enterChatting fail, config is null");
        parama.a(false, "fail:config is null", null);
        AppMethodBeat.o(131006);
      }
      else
      {
        this.sessionFrom = paramJSONObject.optString("sessionFrom");
        if (this.sessionFrom.length() > 1024)
        {
          this.sessionFrom = this.sessionFrom.substring(0, 1024);
          ab.i("MicroMsg.JsApiEnterContact", "sessionFrom length is large than 1024!");
        }
        this.hIm = paramJSONObject.optString("businessId");
        this.hIn = paramJSONObject.optString("sendMessageTitle");
        this.hIo = paramJSONObject.optString("sendMessagePath");
        this.hIp = paramJSONObject.optString("sendMessageImg");
        this.hIq = paramJSONObject.optBoolean("showMessageCard", false);
        this.hIs = l.BK(this.hIp);
        this.hIr = l.a(paramw, this.hIp, true);
        if (bo.isNullOrNil(this.hIm))
        {
          ab.i("MicroMsg.JsApiEnterContact", "businessId is empty, enter to chatting");
          a(paramw, localAppBrandSysConfigWC, "", parama);
          AppMethodBeat.o(131006);
        }
        else
        {
          ab.i("MicroMsg.JsApiEnterContact", "do GetSubBusinessInfo cgi");
          a(paramw, localAppBrandSysConfigWC, parama);
          AppMethodBeat.o(131006);
        }
      }
    }
  }

  private static String cb(String paramString1, String paramString2)
  {
    AppMethodBeat.i(131009);
    if (!bo.isNullOrNil(paramString2))
    {
      paramString1 = "";
      AppMethodBeat.o(131009);
    }
    while (true)
    {
      return paramString1;
      if (!bo.isNullOrNil(paramString1))
      {
        AppMethodBeat.o(131009);
      }
      else
      {
        ab.e("MicroMsg.JsApiEnterContact", "username & subBusinessUsername is null, err");
        paramString1 = "";
        AppMethodBeat.o(131009);
      }
    }
  }

  private static String cc(String paramString1, String paramString2)
  {
    AppMethodBeat.i(131010);
    if (!bo.isNullOrNil(paramString2))
      AppMethodBeat.o(131010);
    while (true)
    {
      return paramString2;
      if (!bo.isNullOrNil(paramString1))
      {
        AppMethodBeat.o(131010);
        paramString2 = paramString1;
      }
      else
      {
        ab.e("MicroMsg.JsApiEnterContact", "username & subBusinessUsername is null, err");
        paramString2 = "";
        AppMethodBeat.o(131010);
      }
    }
  }

  public final void a(c paramc, JSONObject paramJSONObject, int paramInt)
  {
    AppMethodBeat.i(131004);
    w localw;
    if ((paramc instanceof s))
    {
      paramc = (s)paramc;
      localw = paramc.aun();
      if (localw == null)
      {
        ab.i("MicroMsg.JsApiEnterContact", "enterChatting fail, pageView is null");
        paramc.M(paramInt, j("fail:current page do not exist", null));
        AppMethodBeat.o(131004);
      }
    }
    while (true)
    {
      return;
      a(localw, paramc, paramJSONObject, paramInt);
      AppMethodBeat.o(131004);
      continue;
      if ((paramc instanceof u))
      {
        a((w)paramc, paramc, paramJSONObject, paramInt);
        AppMethodBeat.o(131004);
      }
      else
      {
        paramc.M(paramInt, j("fail:internal error invalid js component", null));
        AppMethodBeat.o(131004);
      }
    }
  }

  final void a(w paramw, AppBrandSysConfigWC paramAppBrandSysConfigWC, String paramString, d.a parama)
  {
    AppMethodBeat.i(131008);
    JsApiChattingTask localJsApiChattingTask = new JsApiChattingTask();
    String str = paramw.getRuntime().atI().username;
    WxaExposedParams.a locala = new WxaExposedParams.a();
    locala.appId = paramw.getAppId();
    locala.username = str;
    locala.nickname = paramAppBrandSysConfigWC.cwz;
    locala.iconUrl = paramAppBrandSysConfigWC.hgW;
    locala.gVt = paramAppBrandSysConfigWC.hhd.gVt;
    locala.gVu = paramAppBrandSysConfigWC.hhd.gVu;
    locala.hiv = paramAppBrandSysConfigWC.hhd.cvZ;
    locala.from = 5;
    locala.pageId = a(paramw);
    locala.hiw = v.xh(paramw.getAppId());
    localJsApiChattingTask.username = cc(str, paramString);
    localJsApiChattingTask.nickname = cb(paramAppBrandSysConfigWC.cwz, paramString);
    localJsApiChattingTask.sessionFrom = this.sessionFrom;
    localJsApiChattingTask.hww = new d.3(this, localJsApiChattingTask, locala, paramw, parama);
    localJsApiChattingTask.aBV();
    AppBrandMainProcessService.a(localJsApiChattingTask);
    AppMethodBeat.o(131008);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.contact.d
 * JD-Core Version:    0.6.2
 */