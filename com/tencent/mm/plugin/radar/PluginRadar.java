package com.tencent.mm.plugin.radar;

import a.f.b.j;
import a.l;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.b.f;
import com.tencent.mm.kernel.b.g;
import com.tencent.mm.model.q;
import com.tencent.mm.plugin.radar.a.a;
import com.tencent.mm.sdk.platformtools.ab;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/plugin/radar/PluginRadar;", "Lcom/tencent/mm/kernel/plugin/Plugin;", "Lcom/tencent/mm/plugin/radar/api/IPluginRadar;", "()V", "configure", "", "profile", "Lcom/tencent/mm/kernel/plugin/ProcessProfile;", "execute", "Companion", "plugin-radar_release"})
public final class PluginRadar extends f
  implements a
{
  private static final String TAG = "MicroMsg.PluginRadar";
  public static final PluginRadar.a pAF;

  static
  {
    AppMethodBeat.i(102848);
    pAF = new PluginRadar.a((byte)0);
    TAG = "MicroMsg.PluginRadar";
    AppMethodBeat.o(102848);
  }

  public final void configure(g paramg)
  {
    AppMethodBeat.i(102846);
    j.p(paramg, "profile");
    if (paramg.SG())
    {
      ab.i(TAG, "PluginRadar configure");
      pin((com.tencent.mm.kernel.b.c)new q(b.class));
    }
    AppMethodBeat.o(102846);
  }

  public final void execute(g paramg)
  {
    AppMethodBeat.i(102847);
    j.p(paramg, "profile");
    com.tencent.mm.bp.c.aks("radar");
    AppMethodBeat.o(102847);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.radar.PluginRadar
 * JD-Core Version:    0.6.2
 */