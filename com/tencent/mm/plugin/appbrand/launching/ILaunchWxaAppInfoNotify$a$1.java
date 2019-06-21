package com.tencent.mm.plugin.appbrand.launching;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.a;
import com.tencent.mm.plugin.appbrand.config.AppBrandInitConfig;
import com.tencent.mm.plugin.appbrand.i;
import com.tencent.mm.plugin.appbrand.ipc.MMToClientEvent.c;
import com.tencent.mm.plugin.appbrand.jsapi.fakenative.OpenBusinessViewUtil;
import com.tencent.mm.plugin.appbrand.o;
import com.tencent.mm.plugin.appbrand.page.q;
import com.tencent.mm.plugin.appbrand.permission.e;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.ui.MMActivity;

public final class ILaunchWxaAppInfoNotify$a$1
  implements MMToClientEvent.c
{
  public ILaunchWxaAppInfoNotify$a$1(o paramo)
  {
  }

  public final void bk(final Object paramObject)
  {
    AppMethodBeat.i(131826);
    AppBrandLaunchErrorAction localAppBrandLaunchErrorAction;
    Object localObject;
    if ((paramObject instanceof ILaunchWxaAppInfoNotify.LaunchInfoIpcWrapper))
    {
      paramObject = (ILaunchWxaAppInfoNotify.LaunchInfoIpcWrapper)paramObject;
      if ((this.gQw.mAppId.equals(paramObject.appId)) && (this.gQw.gNB.gVs == paramObject.har))
        if (paramObject.ihd != null)
        {
          ab.i("MicroMsg.ILaunchWxaAppInfoNotify[permission]", "try notify update runtime(%s %d), error action %s ", new Object[] { this.gQw.mAppId, Integer.valueOf(this.gQw.gNB.gVs), paramObject.ihd.getClass().getName() });
          localAppBrandLaunchErrorAction = paramObject.ihd;
          localObject = this.gQw;
          paramObject = localObject;
          if (localObject == null)
            paramObject = a.wI(localAppBrandLaunchErrorAction.appId);
          if ((paramObject == null) || (localAppBrandLaunchErrorAction.har != paramObject.yf().gVs))
          {
            OpenBusinessViewUtil.m(this.gQw);
            AppMethodBeat.o(131826);
          }
        }
    }
    while (true)
    {
      return;
      localObject = paramObject.asU();
      paramObject.finish();
      if (localObject == null)
        paramObject = ah.getContext();
      do
      {
        localAppBrandLaunchErrorAction.cQ(paramObject);
        break;
        paramObject = ((i)localObject).asV();
        if (paramObject == null)
          break;
        localObject = (MMActivity)paramObject.getContext();
        if (((MMActivity)localObject).isFinishing())
          break;
        paramObject = localObject;
      }
      while (!((MMActivity)localObject).uiu);
      break;
      localObject = this.gQw.xY();
      if (localObject != null)
      {
        ((e)localObject).a(paramObject.bQt);
        AppMethodBeat.o(131826);
      }
      else if (this.gQw.mFinished)
      {
        ab.e("MicroMsg.ILaunchWxaAppInfoNotify[permission]", "try notify update, runtime(%s %d) finished", new Object[] { this.gQw.mAppId, Integer.valueOf(this.gQw.gNB.gVs) });
        AppMethodBeat.o(131826);
      }
      else
      {
        ab.i("MicroMsg.ILaunchWxaAppInfoNotify[permission]", "try notify update, runtime(%s %d) add deferred action", new Object[] { this.gQw.mAppId, Integer.valueOf(this.gQw.gNB.gVs) });
        this.gQw.A(new Runnable()
        {
          public final void run()
          {
            AppMethodBeat.i(131825);
            ILaunchWxaAppInfoNotify.a.1.this.gQw.xY().a(paramObject.bQt);
            AppMethodBeat.o(131825);
          }
        });
        AppMethodBeat.o(131826);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.launching.ILaunchWxaAppInfoNotify.a.1
 * JD-Core Version:    0.6.2
 */