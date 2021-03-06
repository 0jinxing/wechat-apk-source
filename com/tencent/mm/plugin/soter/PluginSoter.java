package com.tencent.mm.plugin.soter;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.e.c;
import com.tencent.mm.plugin.soter.d.m;
import com.tencent.mm.sdk.g.a.e;
import com.tencent.mm.sdk.g.d;
import com.tencent.mm.sdk.platformtools.ab;

public class PluginSoter extends com.tencent.mm.kernel.b.f
  implements com.tencent.mm.kernel.api.bucket.c, com.tencent.mm.plugin.soter.a.a
{
  private static com.tencent.mm.plugin.soter.d.c rNx;
  private static com.tencent.mm.plugin.soter.d.b rNy;
  private com.tencent.mm.vending.b.b gRC;
  private com.tencent.mm.plugin.soter.d.f rNv = null;
  private boolean rNw = false;

  static
  {
    AppMethodBeat.i(59296);
    rNx = new com.tencent.mm.plugin.soter.d.c();
    rNy = new com.tencent.mm.plugin.soter.d.b();
    AppMethodBeat.o(59296);
  }

  private void safeAddListener(com.tencent.mm.sdk.b.c paramc)
  {
    AppMethodBeat.i(59292);
    if (paramc == null)
    {
      ab.w("MicroMsg.PluginSoter", "hy: listener is null or id is invalid");
      AppMethodBeat.o(59292);
    }
    while (true)
    {
      return;
      if (com.tencent.mm.sdk.b.a.xxA.e(paramc))
      {
        ab.w("MicroMsg.PluginSoter", "hy: already has listener");
        AppMethodBeat.o(59292);
      }
      else
      {
        com.tencent.mm.sdk.b.a.xxA.c(paramc);
        AppMethodBeat.o(59292);
      }
    }
  }

  private void safeRemoveListener(com.tencent.mm.sdk.b.c paramc)
  {
    AppMethodBeat.i(59293);
    if (paramc == null)
    {
      ab.w("MicroMsg.PluginSoter", "alvinluo listener is null");
      AppMethodBeat.o(59293);
    }
    while (true)
    {
      return;
      com.tencent.mm.sdk.b.a.xxA.d(paramc);
      AppMethodBeat.o(59293);
    }
  }

  public void execute(com.tencent.mm.kernel.b.g paramg)
  {
    AppMethodBeat.i(59290);
    if (paramg.SG())
    {
      ab.i("MicroMsg.PluginSoter", "alvinluo PluginSoter in process: %s execute and run pipeline", new Object[] { paramg.eHT });
      this.rNw = true;
      ab.v("MicroMsg.PluginSoter", "alvinluo PluginSoter add SoterDynamicConfigUpdatedEventListener");
      this.rNv = new com.tencent.mm.plugin.soter.d.f();
      safeAddListener(this.rNv);
    }
    AppMethodBeat.o(59290);
  }

  public String name()
  {
    return "plugin-soter";
  }

  public void onAccountInitialized(e.c paramc)
  {
    AppMethodBeat.i(59294);
    ab.v("MicroMsg.PluginSoter", "alvinluo onAccountInitialized, isMainProcess: %b", new Object[] { Boolean.valueOf(this.rNw) });
    if (this.rNw)
    {
      m.cvR();
      d.xDG.p(new PluginSoter.1(this), 1500L);
      this.gRC = ((com.tencent.mm.plugin.auth.a.b)com.tencent.mm.kernel.g.M(com.tencent.mm.plugin.auth.a.b.class)).addHandleAuthResponse(new PluginSoter.2(this));
    }
    if (!com.tencent.mm.sdk.b.a.xxA.e(rNx))
      com.tencent.mm.sdk.b.a.xxA.c(rNx);
    if (!com.tencent.mm.sdk.b.a.xxA.e(rNy))
      com.tencent.mm.sdk.b.a.xxA.c(rNy);
    AppMethodBeat.o(59294);
  }

  public void onAccountRelease()
  {
    AppMethodBeat.i(59295);
    ab.v("MicroMsg.PluginSoter", "alvinluo onAccountRelease");
    if (this.rNw)
      this.gRC.dead();
    AppMethodBeat.o(59295);
  }

  public void uninstalled()
  {
    AppMethodBeat.i(59291);
    super.uninstalled();
    safeRemoveListener(this.rNv);
    AppMethodBeat.o(59291);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.soter.PluginSoter
 * JD-Core Version:    0.6.2
 */