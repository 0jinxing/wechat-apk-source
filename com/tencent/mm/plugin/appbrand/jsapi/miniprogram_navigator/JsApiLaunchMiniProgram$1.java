package com.tencent.mm.plugin.appbrand.jsapi.miniprogram_navigator;

import android.app.Activity;
import com.tencent.luggage.sdk.config.AppBrandInitConfigLU;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.config.AppBrandLaunchReferrer;
import com.tencent.mm.plugin.appbrand.g;
import com.tencent.mm.plugin.appbrand.g.d;
import com.tencent.mm.plugin.appbrand.ipc.AppBrandMainProcessService;
import com.tencent.mm.plugin.appbrand.ipc.MMToClientEvent;
import com.tencent.mm.plugin.appbrand.ipc.MainProcessTask;
import com.tencent.mm.plugin.appbrand.jsapi.m;
import com.tencent.mm.plugin.appbrand.launching.AppBrandLaunchProxyUI;
import com.tencent.mm.plugin.appbrand.page.u;
import com.tencent.mm.plugin.appbrand.report.AppBrandStatObject;
import junit.framework.Assert;

final class JsApiLaunchMiniProgram$1
  implements Runnable
{
  JsApiLaunchMiniProgram$1(JsApiLaunchMiniProgram paramJsApiLaunchMiniProgram, com.tencent.luggage.sdk.a.a.b paramb, String paramString1, int paramInt1, String paramString2, String paramString3, int paramInt2)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(131323);
    Object localObject1 = this.hQI;
    com.tencent.luggage.sdk.a.a.b localb = this.hQG;
    String str1 = this.val$appId;
    int i = this.hjh;
    String str2 = this.bSt;
    String str3 = this.hQH;
    int j = this.eIl;
    Object localObject2 = new JsApiLaunchMiniProgram.LaunchPreconditionTask();
    JsApiLaunchMiniProgram.LaunchPreconditionTask.a((JsApiLaunchMiniProgram.LaunchPreconditionTask)localObject2, str1);
    JsApiLaunchMiniProgram.LaunchPreconditionTask.a((JsApiLaunchMiniProgram.LaunchPreconditionTask)localObject2, i);
    if (!AppBrandMainProcessService.b((MainProcessTask)localObject2))
    {
      localb.M(j, ((m)localObject1).j("fail precondition error", null));
      AppMethodBeat.o(131323);
    }
    while (true)
    {
      return;
      Object localObject3 = JsApiLaunchMiniProgram.LaunchPreconditionTask.a.ou(JsApiLaunchMiniProgram.LaunchPreconditionTask.a((JsApiLaunchMiniProgram.LaunchPreconditionTask)localObject2));
      localObject2 = localObject3;
      if (localObject3 == null)
        localObject2 = JsApiLaunchMiniProgram.LaunchPreconditionTask.a.hQO;
      if (JsApiLaunchMiniProgram.LaunchPreconditionTask.a.hQQ != localObject2)
      {
        localb.M(j, ((m)localObject1).j(((JsApiLaunchMiniProgram.LaunchPreconditionTask.a)localObject2).bzH, null));
        AppMethodBeat.o(131323);
      }
      else
      {
        g.a(localb.getAppId(), g.d.gNt);
        MMToClientEvent.a(localb.getAppId(), new JsApiLaunchMiniProgram.2((JsApiLaunchMiniProgram)localObject1, str1, i, localb, j));
        if ((localb.getContext() != null) && ((localb.getContext() instanceof Activity)) && (!((Activity)localb.getContext()).isFinishing()))
        {
          localObject3 = new AppBrandStatObject();
          ((AppBrandStatObject)localObject3).scene = 1037;
          localObject2 = localb.xL().ya().bQn;
          if (localObject2 != null)
            ((AppBrandStatObject)localObject3).cOo = ((AppBrandStatObject)localObject2).cOo;
          localObject2 = "";
          localObject1 = localb.xV();
          if (localObject1 != null)
            localObject2 = ((u)localObject1).aBm();
          ((AppBrandStatObject)localObject3).cst = (localb.getAppId() + ":" + localb.xL().ya().xz());
          localObject1 = new AppBrandLaunchReferrer();
          ((AppBrandLaunchReferrer)localObject1).appId = localb.getAppId();
          ((AppBrandLaunchReferrer)localObject1).cFM = str3;
          ((AppBrandLaunchReferrer)localObject1).hgQ = 1;
          ((AppBrandLaunchReferrer)localObject1).url = ((String)localObject2);
          AppBrandLaunchProxyUI.a(localb.getContext(), null, str1, str2, i, -1, (AppBrandStatObject)localObject3, (AppBrandLaunchReferrer)localObject1, null);
          Assert.assertTrue(true);
        }
        AppMethodBeat.o(131323);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.miniprogram_navigator.JsApiLaunchMiniProgram.1
 * JD-Core Version:    0.6.2
 */