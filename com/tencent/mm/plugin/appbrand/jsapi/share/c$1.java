package com.tencent.mm.plugin.appbrand.jsapi.share;

import android.content.Intent;
import android.content.res.Resources;
import com.tencent.luggage.sdk.b.b;
import com.tencent.luggage.sdk.config.AppBrandInitConfigLU;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.appcache.WxaPkgWrappingInfo;
import com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC;
import com.tencent.mm.plugin.appbrand.config.AppBrandSysConfigWC;
import com.tencent.mm.plugin.appbrand.i;
import com.tencent.mm.plugin.appbrand.ipc.AppBrandMainProcessService;
import com.tencent.mm.plugin.appbrand.jsapi.m;
import com.tencent.mm.plugin.appbrand.jsapi.t.a;
import com.tencent.mm.plugin.appbrand.launching.params.AppBrandWeishiParams;
import com.tencent.mm.plugin.appbrand.n;
import com.tencent.mm.plugin.appbrand.o;
import com.tencent.mm.plugin.appbrand.page.w;
import com.tencent.mm.plugin.appbrand.report.AppBrandStatObject;
import com.tencent.mm.plugin.appbrand.s;
import com.tencent.mm.plugin.appbrand.weishi.e;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.MMActivity.a;
import com.tencent.mm.ui.widget.MMWebView;
import java.util.concurrent.atomic.AtomicInteger;

final class c$1
  implements MMActivity.a
{
  c$1(c paramc, s params, int paramInt1, String paramString1, String paramString2, boolean paramBoolean1, String paramString3, String paramString4, String paramString5, String paramString6, int paramInt2, String paramString7, AppBrandSysConfigWC paramAppBrandSysConfigWC, String paramString8, w paramw, boolean paramBoolean2, String paramString9, boolean paramBoolean3, boolean paramBoolean4, String paramString10, int paramInt3, AppBrandInitConfigWC paramAppBrandInitConfigWC, MMActivity paramMMActivity)
  {
  }

  public final void c(int paramInt1, int paramInt2, Intent paramIntent)
  {
    AppMethodBeat.i(131439);
    if (paramInt1 != 1)
    {
      ab.i("MicroMsg.JsApiShareAppMessage", "requestCode(%d) not corrected.", new Object[] { Integer.valueOf(paramInt1) });
      AppMethodBeat.o(131439);
      return;
    }
    String str;
    if (paramInt2 != -1)
    {
      ab.i("MicroMsg.JsApiShareAppMessage", "resultCode is not RESULT_OK(%d)", new Object[] { Integer.valueOf(paramInt2) });
      this.hsj.M(this.eIl, this.hWq.j("cancel", null));
      paramIntent = this.val$appId;
      str = this.hWe;
      if (this.hWf);
      for (paramInt1 = 16; ; paramInt1 = 2)
      {
        c.a(paramIntent, str, paramInt1, "", 3, paramInt2);
        AppMethodBeat.o(131439);
        break;
      }
    }
    if (paramIntent == null)
    {
      str = null;
      label130: if ((str != null) && (str.length() != 0))
        break label221;
      ab.e("MicroMsg.JsApiShareAppMessage", "mmOnActivityResult fail, toUser is null");
      this.hsj.M(this.eIl, this.hWq.j("fail:selected user is nil", null));
      if (!this.hWf)
        break label216;
    }
    label216: for (paramInt1 = 16; ; paramInt1 = 2)
    {
      c.a(this.val$appId, this.hWe, paramInt1, "", 2, paramInt2);
      AppMethodBeat.o(131439);
      break;
      str = paramIntent.getStringExtra("Select_Conv_User");
      break label130;
    }
    label221: ab.i("MicroMsg.JsApiShareAppMessage", "result success toUser : %s ", new Object[] { str });
    paramIntent = paramIntent.getStringExtra("custom_send_text");
    SendAppMessageTask localSendAppMessageTask = new SendAppMessageTask();
    localSendAppMessageTask.hWD = paramIntent;
    localSendAppMessageTask.toUser = str;
    localSendAppMessageTask.appId = this.val$appId;
    o localo = this.hsj.getRuntime();
    if ((localo != null) && (localo.yf() != null) && ((localo.yf() instanceof AppBrandInitConfigWC)))
    {
      localSendAppMessageTask.axy = ((AppBrandInitConfigWC)localo.yf()).axy;
      label324: localSendAppMessageTask.userName = this.fwC;
      localSendAppMessageTask.title = this.chV;
      localSendAppMessageTask.description = this.hWg;
      localSendAppMessageTask.url = this.hWh;
      localSendAppMessageTask.path = this.hWe;
      localSendAppMessageTask.type = this.bVv;
      localSendAppMessageTask.hWE = this.hWi;
      localSendAppMessageTask.iconUrl = this.hIx.hgW;
      localSendAppMessageTask.cBc = this.hIx.hhd.gVt;
      localSendAppMessageTask.hiv = this.hIx.hhd.cvZ;
      localSendAppMessageTask.version = this.hIx.hhd.gVu;
      localSendAppMessageTask.nickname = this.hIx.cwz;
      localSendAppMessageTask.fhu = this.hWj;
      localSendAppMessageTask.hWJ = n.xb(this.val$appId).gPd.getAndIncrement();
      localSendAppMessageTask.hWL = this.hIw.getURL();
      localSendAppMessageTask.hWM = this.hIw.aBg();
      paramIntent = this.hIw.getRuntime().ya().bQn;
      if (paramIntent != null)
      {
        if (paramIntent.scene != 0)
          break label866;
        paramInt1 = 1000;
        label536: localSendAppMessageTask.scene = paramInt1;
        localSendAppMessageTask.cst = bo.nullAsNil(paramIntent.cst);
        localSendAppMessageTask.hWK = bo.nullAsNil(this.hIw.getRuntime().atI().xz());
      }
      localSendAppMessageTask.hIs = this.hWk;
      localSendAppMessageTask.hWF = l.getRealPath(this.hWl);
      localSendAppMessageTask.withShareTicket = this.hWf;
      localSendAppMessageTask.hWN = this.hWm;
      localSendAppMessageTask.hWO = this.hWn;
      localSendAppMessageTask.cacheKey = this.cia;
      localSendAppMessageTask.fmr = this.hWo;
      paramIntent = this.hIw.aJS();
      if (paramIntent != null)
        break label874;
      paramIntent = "";
      label656: localSendAppMessageTask.hWP = paramIntent;
      if (e.E(localo))
      {
        localSendAppMessageTask.hWH = 3;
        if (this.hWp.bQj != null)
        {
          localSendAppMessageTask.hWQ = this.hWp.bQj.appId;
          localSendAppMessageTask.hWR = this.hWp.bQj.appName;
          localSendAppMessageTask.hWS = this.hWp.bQj.ijx;
          localSendAppMessageTask.hWT = this.hWp.bQj.thumbUrl;
          if (bo.isNullOrNil(localSendAppMessageTask.hWE))
          {
            localSendAppMessageTask.hWF = this.hWp.bQj.ijv;
            localSendAppMessageTask.hIs = false;
          }
        }
      }
      if (!this.hWf)
        break label885;
      localSendAppMessageTask.hww = new c.1.1(this, localSendAppMessageTask, str, paramInt2);
      localSendAppMessageTask.aBV();
      AppBrandMainProcessService.a(localSendAppMessageTask);
    }
    while (true)
    {
      if (this.cgq != null)
        com.tencent.mm.ui.base.h.bQ(this.cgq, this.cgq.getResources().getString(2131296555));
      AppMethodBeat.o(131439);
      break;
      ab.w("MicroMsg.JsApiShareAppMessage", "hy: can not retrieve init config");
      localSendAppMessageTask.axy = -1;
      break label324;
      label866: paramInt1 = paramIntent.scene;
      break label536;
      label874: paramIntent = paramIntent.getWebView().getUrl();
      break label656;
      label885: AppBrandMainProcessService.a(localSendAppMessageTask);
      this.hsj.M(this.eIl, this.hWq.j("ok", null));
      paramInt1 = 2;
      if (str.toLowerCase().endsWith("@chatroom"))
        paramInt1 = 9;
      c.a(this.val$appId, this.hWe, paramInt1, "", 1, paramInt2);
      if ("wxfe02ecfe70800f46".equalsIgnoreCase(this.val$appId))
        com.tencent.mm.plugin.report.service.h.pYm.e(16979, new Object[] { this.val$appId, this.hWe, Integer.valueOf(0), Integer.valueOf(3) });
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.share.c.1
 * JD-Core Version:    0.6.2
 */