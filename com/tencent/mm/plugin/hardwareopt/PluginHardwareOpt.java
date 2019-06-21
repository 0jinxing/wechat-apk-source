package com.tencent.mm.plugin.hardwareopt;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.api.bucket.c;
import com.tencent.mm.kernel.b.f;
import com.tencent.mm.kernel.e.c;
import com.tencent.mm.plugin.hardwareopt.a.b;
import com.tencent.mm.plugin.messenger.foundation.a.p;
import com.tencent.mm.sdk.platformtools.ab;

public class PluginHardwareOpt extends f
  implements c, b
{
  public void configure(com.tencent.mm.kernel.b.g paramg)
  {
    AppMethodBeat.i(59266);
    if (!paramg.SG())
      AppMethodBeat.o(59266);
    while (true)
    {
      return;
      ab.v("MicroMsg.PluginHardwareOpt", "hy: on config");
      com.tencent.mm.kernel.g.a(com.tencent.mm.plugin.hardwareopt.a.a.a.class, new com.tencent.mm.plugin.hardwareopt.a.a());
      AppMethodBeat.o(59266);
    }
  }

  public void dependency()
  {
    AppMethodBeat.i(59265);
    dependsOn(p.class);
    AppMethodBeat.o(59265);
  }

  public void execute(com.tencent.mm.kernel.b.g paramg)
  {
    AppMethodBeat.i(59267);
    if (paramg.SG())
      ab.i("MicroMsg.PluginHardwareOpt", "hy: on execute. ");
    AppMethodBeat.o(59267);
  }

  public void installed()
  {
    AppMethodBeat.i(59264);
    alias(b.class);
    AppMethodBeat.o(59264);
  }

  public void onAccountInitialized(e.c paramc)
  {
    AppMethodBeat.i(59268);
    ab.v("MicroMsg.PluginHardwareOpt", "hy: on onAccountInitialized");
    ((com.tencent.mm.plugin.hardwareopt.a.a.a)com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.hardwareopt.a.a.a.class)).hX(false);
    AppMethodBeat.o(59268);
  }

  public void onAccountRelease()
  {
    AppMethodBeat.i(59269);
    ab.v("MicroMsg.PluginHardwareOpt", "hy: on onAccountRelease");
    AppMethodBeat.o(59269);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.hardwareopt.PluginHardwareOpt
 * JD-Core Version:    0.6.2
 */