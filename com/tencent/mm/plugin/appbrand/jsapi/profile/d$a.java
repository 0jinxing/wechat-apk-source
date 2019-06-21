package com.tencent.mm.plugin.appbrand.jsapi.profile;

import a.l;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ah.b;
import com.tencent.mm.ah.c;
import com.tencent.mm.ah.o;
import com.tencent.mm.kernel.c.a;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.ao.b.a;
import com.tencent.mm.plugin.appbrand.ipc.AppBrandProxyUIProcessTask.ProcessResult;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.storage.ad;
import com.tencent.mm.storage.bd;
import com.tencent.mm.ui.base.p;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"<anonymous>", "", "username", "", "kotlin.jvm.PlatformType", "succ", "", "getContactCallBack"})
final class d$a
  implements ao.b.a
{
  d$a(d paramd, ProfileResult paramProfileResult, p paramp, int paramInt)
  {
  }

  public final void o(String paramString, boolean paramBoolean)
  {
    AppMethodBeat.i(134706);
    if (d.a(this.hUP) == null)
    {
      ab.w("ProfileTask", "handleRequest, getNow callback, context has already been detached!");
      this.hUQ.bFZ = 0;
      d.a(this.hUP, (AppBrandProxyUIProcessTask.ProcessResult)this.hUQ);
      AppMethodBeat.o(134706);
    }
    while (true)
    {
      return;
      Object localObject = this.hUR;
      if (localObject != null)
        ((p)localObject).dismiss();
      localObject = g.K(com.tencent.mm.plugin.messenger.foundation.a.j.class);
      a.f.b.j.o(localObject, "MMKernel.service(IMessengerStorage::class.java)");
      localObject = ((com.tencent.mm.plugin.messenger.foundation.a.j)localObject).XM().aoO(paramString);
      if ((localObject == null) || (((ad)localObject).Oh() <= 0))
      {
        a locala = g.K(com.tencent.mm.plugin.messenger.foundation.a.j.class);
        a.f.b.j.o(locala, "MMKernel.service(IMessengerStorage::class.java)");
        ((com.tencent.mm.plugin.messenger.foundation.a.j)locala).XM().aoK(paramString);
        paramBoolean = false;
      }
      while (true)
      {
        if (paramBoolean)
          break label184;
        ab.w("ProfileTask", "handleRequest, getNow callback fail");
        this.hUQ.bFZ = 0;
        d.a(this.hUP, (AppBrandProxyUIProcessTask.ProcessResult)this.hUQ);
        AppMethodBeat.o(134706);
        break;
        paramString = ((ad)localObject).getUsername();
      }
      label184: b.U(paramString, 3);
      o.acv().pZ(paramString);
      if (localObject == null)
        a.f.b.j.dWJ();
      if (((ad)localObject).dsf())
      {
        h.pYm.X(10298, ((ad)localObject).getUsername() + "," + this.hUJ);
        this.hUQ.hUO |= 1;
      }
      if (((ad)localObject).NX())
        this.hUQ.hUO |= 2;
      this.hUQ.bFZ = 1;
      d.a(this.hUP, (AppBrandProxyUIProcessTask.ProcessResult)this.hUQ);
      AppMethodBeat.o(134706);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.profile.d.a
 * JD-Core Version:    0.6.2
 */