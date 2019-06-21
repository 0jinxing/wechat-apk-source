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
import com.tencent.mm.plugin.appbrand.n;
import com.tencent.mm.plugin.appbrand.o;
import com.tencent.mm.plugin.appbrand.page.w;
import com.tencent.mm.plugin.appbrand.report.AppBrandStatObject;
import com.tencent.mm.plugin.appbrand.s;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.MMActivity.a;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.widget.MMWebView;
import java.util.concurrent.atomic.AtomicInteger;

final class e$1
  implements MMActivity.a
{
  e$1(e parame, s params, int paramInt1, String paramString1, int paramInt2, boolean paramBoolean1, String paramString2, String paramString3, String paramString4, String paramString5, AppBrandSysConfigWC paramAppBrandSysConfigWC, String paramString6, String paramString7, String paramString8, w paramw, boolean paramBoolean2, String paramString9, int paramInt3, MMActivity paramMMActivity)
  {
  }

  public final void c(int paramInt1, int paramInt2, Intent paramIntent)
  {
    AppMethodBeat.i(131447);
    if (1 != paramInt1)
    {
      ab.e("MicroMsg.JsApiShareAppMessageForFakeNative", "requestCode(%d) not corrected.", new Object[] { Integer.valueOf(paramInt1) });
      AppMethodBeat.o(131447);
    }
    while (true)
    {
      return;
      if (-1 == paramInt2)
        break;
      ab.e("MicroMsg.JsApiShareAppMessageForFakeNative", "resultCode is not RESULT_OK(%d).", new Object[] { Integer.valueOf(paramInt2) });
      this.hsj.M(this.eIl, this.hWA.j("cancel", null));
      AppMethodBeat.o(131447);
    }
    if (paramIntent == null);
    for (String str = null; ; str = paramIntent.getStringExtra("Select_Conv_User"))
    {
      if (!bo.isNullOrNil(str))
        break label148;
      ab.e("MicroMsg.JsApiShareAppMessageForFakeNative", "mmOnActivityResult fail, toUser is null.");
      this.hsj.M(this.eIl, this.hWA.j("fail:no selected user", null));
      AppMethodBeat.o(131447);
      break;
    }
    label148: ab.d("MicroMsg.JsApiShareAppMessageForFakeNative", "share app msg success, to: %s ", new Object[] { str });
    paramIntent = paramIntent.getStringExtra("custom_send_text");
    SendAppMessageTask localSendAppMessageTask = new SendAppMessageTask();
    localSendAppMessageTask.hWD = paramIntent;
    localSendAppMessageTask.toUser = str;
    localSendAppMessageTask.appId = this.val$appId;
    paramIntent = this.hsj.getRuntime();
    if ((paramIntent != null) && (paramIntent.yf() != null) && ((paramIntent.yf() instanceof AppBrandInitConfigWC)))
    {
      localSendAppMessageTask.axy = ((AppBrandInitConfigWC)paramIntent.yf()).axy;
      label246: localSendAppMessageTask.hWH = 2;
      localSendAppMessageTask.type = 2;
      localSendAppMessageTask.duk = this.hWx;
      if (!this.hWy)
        break label649;
      paramInt1 = 1;
      label276: localSendAppMessageTask.hWI = paramInt1;
      localSendAppMessageTask.title = this.chV;
      localSendAppMessageTask.description = this.hWg;
      localSendAppMessageTask.hWE = this.hWi;
      localSendAppMessageTask.hWG = this.hWz;
      localSendAppMessageTask.iconUrl = this.hIx.hgW;
      localSendAppMessageTask.userName = this.fwC;
      localSendAppMessageTask.nickname = this.hIx.cwz;
      localSendAppMessageTask.path = this.hWe;
      localSendAppMessageTask.cBc = this.hIx.hhd.gVt;
      localSendAppMessageTask.hiv = this.hIx.hhd.cvZ;
      localSendAppMessageTask.version = this.hIx.hhd.gVu;
      localSendAppMessageTask.url = this.hWh;
      localSendAppMessageTask.hWJ = n.xb(this.val$appId).gPd.getAndIncrement();
      localSendAppMessageTask.hWL = this.hIw.getURL();
      localSendAppMessageTask.hWM = this.hIw.aBg();
      paramIntent = this.hIw.getRuntime().ya().bQn;
      if (paramIntent != null)
      {
        if (paramIntent.scene != 0)
          break label654;
        paramInt1 = 1000;
        label485: localSendAppMessageTask.scene = paramInt1;
        localSendAppMessageTask.cst = bo.nullAsNil(paramIntent.cst);
        localSendAppMessageTask.hWK = bo.nullAsNil(this.hIw.getRuntime().atI().xz());
      }
      localSendAppMessageTask.hIs = this.hWk;
      localSendAppMessageTask.hWF = l.getRealPath(this.hWl);
      localSendAppMessageTask.fmr = this.hWo;
      paramIntent = this.hIw.aJS();
      if (paramIntent != null)
        break label662;
    }
    label649: label654: label662: for (paramIntent = ""; ; paramIntent = paramIntent.getWebView().getUrl())
    {
      localSendAppMessageTask.hWP = paramIntent;
      AppBrandMainProcessService.a(localSendAppMessageTask);
      this.hsj.M(this.eIl, this.hWA.j("ok", null));
      h.bQ(this.cgq, this.cgq.getResources().getString(2131296555));
      AppMethodBeat.o(131447);
      break;
      ab.w("MicroMsg.JsApiShareAppMessageForFakeNative", "can not retrieve init config.");
      localSendAppMessageTask.axy = -1;
      break label246;
      paramInt1 = 0;
      break label276;
      paramInt1 = paramIntent.scene;
      break label485;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.share.e.1
 * JD-Core Version:    0.6.2
 */