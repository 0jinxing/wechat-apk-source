package com.tencent.mm.ipcinvoker.wx_extension;

import android.app.Application;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ipcinvoker.e;
import com.tencent.mm.ipcinvoker.g.1;
import com.tencent.mm.ipcinvoker.g.2;
import com.tencent.mm.ipcinvoker.h.b;
import com.tencent.mm.kernel.b.f;
import com.tencent.mm.kernel.b.h;
import com.tencent.mm.kernel.d;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import junit.framework.Assert;

public class PluginIPC extends f
  implements c
{
  public void execute(com.tencent.mm.kernel.b.g paramg)
  {
    AppMethodBeat.i(126208);
    ab.i("MicroMsg.PluginIPC", "execute(%s)", new Object[] { paramg.eHT });
    Application localApplication = ((h)com.tencent.mm.kernel.g.RM().Rn()).cc;
    paramg = new PluginIPC.1(this);
    Assert.assertNotNull(localApplication);
    e.sContext = localApplication;
    g.1 local1 = new g.1(localApplication);
    paramg.a(local1);
    paramg.a(new g.2());
    paramg.b(local1);
    b.i("IPC.IPCInvokerBoot", "setup IPCInvoker(process : %s, application : %s)", new Object[] { e.PN(), Integer.valueOf(localApplication.hashCode()) });
    if ((ah.doF()) || (ah.doG()))
      com.tencent.mm.ipcinvoker.g.lh("com.tencent.mm");
    AppMethodBeat.o(126208);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ipcinvoker.wx_extension.PluginIPC
 * JD-Core Version:    0.6.2
 */