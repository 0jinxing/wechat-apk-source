package com.tencent.mm.plugin.appbrand.jsapi.profile;

import a.l;
import android.content.Context;
import android.content.DialogInterface.OnCancelListener;
import android.content.Intent;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.a.qh;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.ao.a;
import com.tencent.mm.model.ao.b;
import com.tencent.mm.model.ao.b.a;
import com.tencent.mm.plugin.appbrand.ipc.AppBrandProxyUIProcessTask;
import com.tencent.mm.plugin.appbrand.ipc.AppBrandProxyUIProcessTask.ProcessRequest;
import com.tencent.mm.plugin.appbrand.ipc.AppBrandProxyUIProcessTask.ProcessResult;
import com.tencent.mm.sdk.b.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.storage.ad;
import com.tencent.mm.storage.bd;
import com.tencent.mm.ui.MMActivity;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/plugin/appbrand/jsapi/profile/ProfileTask;", "Lcom/tencent/mm/plugin/appbrand/ipc/AppBrandProxyUIProcessTask;", "()V", "handleRequest", "", "request", "Lcom/tencent/mm/plugin/appbrand/ipc/AppBrandProxyUIProcessTask$ProcessRequest;", "plugin-appbrand-integration_release"})
public final class d extends AppBrandProxyUIProcessTask
{
  public final void a(AppBrandProxyUIProcessTask.ProcessRequest paramProcessRequest)
  {
    AppMethodBeat.i(134708);
    a.f.b.j.p(paramProcessRequest, "request");
    ProfileResult localProfileResult = new ProfileResult();
    if (!(paramProcessRequest instanceof ProfileRequest))
    {
      ab.w("ProfileTask", "handleRequest, request not instance of ProfileRequest");
      localProfileResult.bFZ = 0;
      a((AppBrandProxyUIProcessTask.ProcessResult)localProfileResult);
      AppMethodBeat.o(134708);
    }
    while (true)
    {
      return;
      g.RN();
      if (!com.tencent.mm.kernel.a.QX())
      {
        ab.e("ProfileTask", "handleRequest, MMKernel.account().hasLogin() is false");
        localProfileResult.bFZ = 0;
        a((AppBrandProxyUIProcessTask.ProcessResult)localProfileResult);
        AppMethodBeat.o(134708);
      }
      else
      {
        int i = ((ProfileRequest)paramProcessRequest).scene;
        String str = ((ProfileRequest)paramProcessRequest).username;
        paramProcessRequest = g.K(com.tencent.mm.plugin.messenger.foundation.a.j.class);
        a.f.b.j.o(paramProcessRequest, "MMKernel.service(IMessengerStorage::class.java)");
        Object localObject = ((com.tencent.mm.plugin.messenger.foundation.a.j)paramProcessRequest).XM().aoO(str);
        if (localObject != null)
        {
          paramProcessRequest = (AppBrandProxyUIProcessTask.ProcessRequest)localObject;
          if (((ad)localObject).Oh() > 0);
        }
        else
        {
          paramProcessRequest = g.K(com.tencent.mm.plugin.messenger.foundation.a.j.class);
          a.f.b.j.o(paramProcessRequest, "MMKernel.service(IMessengerStorage::class.java)");
          paramProcessRequest = ((com.tencent.mm.plugin.messenger.foundation.a.j)paramProcessRequest).XM().aoK(str);
        }
        if ((paramProcessRequest != null) && (paramProcessRequest.Oh() > 0))
        {
          localObject = new Intent();
          ((Intent)localObject).putExtra("Contact_User", str);
          localProfileResult.username = paramProcessRequest.getUsername();
          if (paramProcessRequest.dsf())
          {
            com.tencent.mm.plugin.report.service.h.pYm.X(10298, paramProcessRequest.getUsername() + "," + i);
            localProfileResult.hUO |= 1;
            ((Intent)localObject).putExtra("Contact_Scene", i);
          }
          if (paramProcessRequest.NX())
          {
            localProfileResult.hUO |= 2;
            paramProcessRequest = new qh();
            paramProcessRequest.cMw.intent = ((Intent)localObject);
            paramProcessRequest.cMw.username = str;
            com.tencent.mm.sdk.b.a.xxA.m((b)paramProcessRequest);
          }
          localProfileResult.bFZ = 1;
          a((AppBrandProxyUIProcessTask.ProcessResult)localProfileResult);
          AppMethodBeat.o(134708);
        }
        else
        {
          ab.i("ProfileTask", "handleRequest, request contact info");
          paramProcessRequest = (Context)aBQ();
          aBQ().getString(2131297061);
          paramProcessRequest = com.tencent.mm.ui.base.h.b(paramProcessRequest, aBQ().getString(2131297086), true, (DialogInterface.OnCancelListener)new d.b(this, str, localProfileResult));
          ao.a.Zu().a(str, "", (ao.b.a)new d.a(this, localProfileResult, paramProcessRequest, i));
          AppMethodBeat.o(134708);
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.profile.d
 * JD-Core Version:    0.6.2
 */