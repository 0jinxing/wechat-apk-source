package com.tencent.mm.plugin.appbrand.jsapi.contact;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.config.AppBrandSysConfigWC;
import com.tencent.mm.plugin.appbrand.i;
import com.tencent.mm.plugin.appbrand.ipc.AppBrandMainProcessService;
import com.tencent.mm.plugin.appbrand.jsapi.a;
import com.tencent.mm.plugin.appbrand.jsapi.c;
import com.tencent.mm.plugin.appbrand.jsapi.m;
import com.tencent.mm.plugin.appbrand.page.u;
import com.tencent.mm.plugin.appbrand.q;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import org.json.JSONObject;

public final class e extends a
{
  public static final int CTRL_INDEX = 550;
  public static final String NAME = "privateEnterContact";
  String hID;
  String hIE;
  String hIF;
  String hIG;
  String hIH;
  private String sessionFrom;

  private void a(u paramu, c paramc, JSONObject paramJSONObject, int paramInt)
  {
    AppMethodBeat.i(131023);
    a(paramu, paramJSONObject, new e.1(this, paramc, paramInt));
    AppMethodBeat.o(131023);
  }

  private void a(u paramu, e.a parama)
  {
    AppMethodBeat.i(131025);
    JsApiChattingTask localJsApiChattingTask = new JsApiChattingTask();
    localJsApiChattingTask.username = this.hIE;
    localJsApiChattingTask.sessionFrom = this.sessionFrom;
    localJsApiChattingTask.hww = new e.2(this, localJsApiChattingTask, paramu, parama);
    localJsApiChattingTask.aBV();
    AppBrandMainProcessService.a(localJsApiChattingTask);
    AppMethodBeat.o(131025);
  }

  private void a(u paramu, JSONObject paramJSONObject, e.a parama)
  {
    AppMethodBeat.i(131024);
    if (paramJSONObject == null)
    {
      ab.e("MicroMsg.JsApiPrivateEnterContact", "privateEnterContact enterChatting fail, data is null");
      parama.a(false, "fail:invalid data", null);
      AppMethodBeat.o(131024);
    }
    while (true)
    {
      return;
      if ((AppBrandSysConfigWC)paramu.getRuntime().ye() == null)
      {
        ab.e("MicroMsg.JsApiPrivateEnterContact", "privateEnterContact enterChatting fail, config is null");
        parama.a(false, "fail:config is null", null);
        AppMethodBeat.o(131024);
      }
      else
      {
        this.sessionFrom = paramJSONObject.optString("sessionFrom");
        if (this.sessionFrom.length() > 1024)
        {
          this.sessionFrom = this.sessionFrom.substring(0, 1024);
          ab.i("MicroMsg.JsApiPrivateEnterContact", "privateEnterContact sessionFrom length is large than 1024!");
        }
        this.hID = paramJSONObject.optString("appId");
        if (!bo.isNullOrNil(this.hID))
        {
          this.hIE = paramJSONObject.optString("userName");
          this.hIF = paramJSONObject.optString("title");
          this.hIG = paramJSONObject.optString("subTitle");
          this.hIH = paramJSONObject.optString("headimgUrl");
          a(paramu, parama);
        }
        AppMethodBeat.o(131024);
      }
    }
  }

  public final void a(c paramc, JSONObject paramJSONObject, int paramInt)
  {
    AppMethodBeat.i(131022);
    u localu;
    if ((paramc instanceof q))
    {
      paramc = (q)paramc;
      localu = paramc.getCurrentPageView();
      if (localu == null)
      {
        ab.i("MicroMsg.JsApiPrivateEnterContact", "privateEnterContact enterChatting fail, pageView is null");
        paramc.M(paramInt, j("fail:current page do not exist", null));
        AppMethodBeat.o(131022);
      }
    }
    while (true)
    {
      return;
      a(localu, paramc, paramJSONObject, paramInt);
      AppMethodBeat.o(131022);
      continue;
      if ((paramc instanceof u))
      {
        a((u)paramc, paramc, paramJSONObject, paramInt);
        AppMethodBeat.o(131022);
      }
      else
      {
        ab.w("MicroMsg.JsApiPrivateEnterContact", "privateEnterContact not support");
        AppMethodBeat.o(131022);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.contact.e
 * JD-Core Version:    0.6.2
 */