package com.tencent.mm.plugin.appbrand.jsapi.share;

import android.content.Intent;
import android.content.res.Resources;
import android.util.Log;
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
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

final class d$1
  implements MMActivity.a
{
  d$1(d paramd, s params, int paramInt1, String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, String paramString6, int paramInt2, boolean paramBoolean1, String paramString7, AppBrandSysConfigWC paramAppBrandSysConfigWC, String paramString8, w paramw, String paramString9, boolean paramBoolean2, boolean paramBoolean3, boolean paramBoolean4, String paramString10, String paramString11, int paramInt3, MMActivity paramMMActivity)
  {
  }

  public final void c(int paramInt1, int paramInt2, Intent paramIntent)
  {
    AppMethodBeat.i(131444);
    if (paramInt1 != 1)
    {
      ab.i("MicroMsg.JsApiShareAppMessageDirectly", "requestCode(%d) not corrected.", new Object[] { Integer.valueOf(paramInt1) });
      AppMethodBeat.o(131444);
    }
    while (true)
    {
      return;
      if (paramInt2 == -1)
        break;
      ab.i("MicroMsg.JsApiShareAppMessageDirectly", "resultCode is not RESULT_OK(%d)", new Object[] { Integer.valueOf(paramInt2) });
      this.hsj.M(this.eIl, this.hWv.j("cancel", null));
      AppMethodBeat.o(131444);
    }
    if (paramIntent == null);
    for (String str = null; ; str = paramIntent.getStringExtra("Select_Conv_User"))
    {
      if ((str != null) && (str.length() != 0))
        break label153;
      ab.e("MicroMsg.JsApiShareAppMessageDirectly", "mmOnActivityResult fail, toUser is null");
      this.hsj.M(this.eIl, this.hWv.j("fail:selected user is nil", null));
      AppMethodBeat.o(131444);
      break;
    }
    label153: ab.i("MicroMsg.JsApiShareAppMessageDirectly", "result success toUser : %s ", new Object[] { str });
    paramIntent = paramIntent.getStringExtra("custom_send_text");
    final SendAppMessageTask localSendAppMessageTask = new SendAppMessageTask();
    localSendAppMessageTask.hWD = paramIntent;
    localSendAppMessageTask.toUser = str;
    localSendAppMessageTask.appId = this.val$appId;
    paramIntent = this.hsj.getRuntime();
    if ((paramIntent != null) && (paramIntent.yf() != null) && ((paramIntent.yf() instanceof AppBrandInitConfigWC)))
    {
      localSendAppMessageTask.axy = ((AppBrandInitConfigWC)paramIntent.yf()).axy;
      label251: localSendAppMessageTask.userName = this.fwC;
      localSendAppMessageTask.title = this.chV;
      localSendAppMessageTask.description = this.hWg;
      localSendAppMessageTask.url = this.hWh;
      localSendAppMessageTask.path = this.hWe;
      localSendAppMessageTask.type = this.bVv;
      localSendAppMessageTask.hIs = this.hWk;
      localSendAppMessageTask.hWE = this.hWi;
      localSendAppMessageTask.iconUrl = this.hIx.hgW;
      localSendAppMessageTask.cBc = this.hIx.hhd.gVt;
      localSendAppMessageTask.hiv = this.hIx.hhd.cvZ;
      localSendAppMessageTask.version = this.hIx.hhd.gVu;
      localSendAppMessageTask.nickname = this.hIx.cwz;
      localSendAppMessageTask.cOv = this.hWu;
      localSendAppMessageTask.hWJ = n.xb(this.val$appId).gPd.getAndIncrement();
      localSendAppMessageTask.hWL = this.hIw.getURL();
      localSendAppMessageTask.hWM = this.hIw.aBg();
      paramIntent = this.hIw.getRuntime().ya().bQn;
      if (paramIntent != null)
      {
        if (paramIntent.scene != 0)
          break label684;
        paramInt1 = 1000;
        label472: localSendAppMessageTask.scene = paramInt1;
        localSendAppMessageTask.cst = bo.nullAsNil(paramIntent.cst);
        localSendAppMessageTask.hWK = bo.nullAsNil(this.hIw.getRuntime().atI().xz());
      }
      localSendAppMessageTask.hWF = l.getRealPath(this.hWl);
      localSendAppMessageTask.withShareTicket = this.hWf;
      localSendAppMessageTask.hWN = this.hWm;
      localSendAppMessageTask.hWO = this.hWn;
      localSendAppMessageTask.fhu = this.hWj;
      localSendAppMessageTask.cacheKey = this.cia;
      localSendAppMessageTask.fmr = this.hWo;
      paramIntent = this.hIw.aJS();
      if (paramIntent != null)
        break label692;
      paramIntent = "";
      label593: localSendAppMessageTask.hWP = paramIntent;
      if (!this.hWf)
        break label703;
      localSendAppMessageTask.hww = new Runnable()
      {
        public final void run()
        {
          AppMethodBeat.i(131443);
          ab.i("MicroMsg.JsApiShareAppMessageDirectly", "task callback");
          localSendAppMessageTask.aBW();
          HashMap localHashMap = new HashMap();
          JSONArray localJSONArray = new JSONArray();
          try
          {
            if (!bo.ek(localSendAppMessageTask.hWU))
            {
              Iterator localIterator = localSendAppMessageTask.hWU.iterator();
              while (localIterator.hasNext())
              {
                ShareInfo localShareInfo = (ShareInfo)localIterator.next();
                JSONObject localJSONObject = new org/json/JSONObject;
                localJSONObject.<init>();
                localJSONObject.put("shareKey", localShareInfo.bQi);
                localJSONObject.put("shareName", localShareInfo.bQh);
                localJSONArray.put(localJSONObject);
              }
            }
          }
          catch (JSONException localJSONException)
          {
            ab.e("MicroMsg.JsApiShareAppMessageDirectly", Log.getStackTraceString(localJSONException));
            localHashMap.put("shareInfos", localJSONArray);
            d.1.this.hsj.M(d.1.this.eIl, d.1.this.hWv.j("ok", localHashMap));
            AppMethodBeat.o(131443);
          }
        }
      };
      localSendAppMessageTask.aBV();
      AppBrandMainProcessService.a(localSendAppMessageTask);
    }
    while (true)
    {
      if (this.cgq != null)
        h.bQ(this.cgq, this.cgq.getResources().getString(2131296555));
      AppMethodBeat.o(131444);
      break;
      ab.w("MicroMsg.JsApiShareAppMessageDirectly", "hy: can not retrieve init config");
      localSendAppMessageTask.axy = -1;
      break label251;
      label684: paramInt1 = paramIntent.scene;
      break label472;
      label692: paramIntent = paramIntent.getWebView().getUrl();
      break label593;
      label703: AppBrandMainProcessService.a(localSendAppMessageTask);
      this.hsj.M(this.eIl, this.hWv.j("ok", null));
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.share.d.1
 * JD-Core Version:    0.6.2
 */