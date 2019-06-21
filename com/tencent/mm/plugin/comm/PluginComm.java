package com.tencent.mm.plugin.comm;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.b.f;
import com.tencent.mm.kernel.e.c;
import com.tencent.mm.pluginsdk.g.a.c.o;

public class PluginComm extends f
  implements com.tencent.mm.kernel.api.bucket.c, com.tencent.mm.plugin.comm.a.a
{
  public void configure(com.tencent.mm.kernel.b.g paramg)
  {
  }

  public void execute(com.tencent.mm.kernel.b.g paramg)
  {
    AppMethodBeat.i(79088);
    if (paramg.SG())
    {
      pin(com.tencent.mm.plugin.a.aob());
      pin(com.tencent.mm.plugin.g.a.beP());
      pin(com.tencent.mm.plugin.h.a.bic());
      pin(com.tencent.mm.plugin.i.c.bGE());
      pin(com.tencent.mm.plugin.i.b.bGD());
      pin(com.tencent.mm.plugin.t.a.bZt());
      pin(com.tencent.mm.plugin.m.b.bOh());
      pin(com.tencent.mm.plugin.c.a.ask());
      pin(com.tencent.mm.plugin.s.a.bYF());
      pin(com.tencent.mm.plugin.r.a.bVs());
      pin(o.vfu);
      com.tencent.mm.kernel.g.a(com.tencent.mm.plugin.m.a.a.class, new com.tencent.mm.plugin.m.a());
      ((com.tencent.mm.plugin.auth.a.b)com.tencent.mm.kernel.g.M(com.tencent.mm.plugin.auth.a.b.class)).addHandleAuthResponse(com.tencent.mm.plugin.g.a.beP());
      com.tencent.mm.ui.e.a.a.a(new PluginComm.1(this));
    }
    AppMethodBeat.o(79088);
  }

  public void onAccountInitialized(e.c paramc)
  {
  }

  public void onAccountRelease()
  {
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.comm.PluginComm
 * JD-Core Version:    0.6.2
 */