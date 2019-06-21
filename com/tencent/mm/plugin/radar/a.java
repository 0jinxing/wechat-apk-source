package com.tencent.mm.plugin.radar;

import a.f.b.j;
import a.l;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.pluginsdk.m;
import com.tencent.mm.pluginsdk.n;
import com.tencent.mm.pluginsdk.o;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/plugin/radar/RadarApplication;", "Lcom/tencent/mm/pluginsdk/IPluginApplication;", "()V", "regitMMModelCallback", "", "callback", "Lcom/tencent/mm/pluginsdk/IMMModelCallback;", "regitMMUICallback", "Lcom/tencent/mm/pluginsdk/IMMUICallback;", "Companion", "plugin-radar_release"})
public final class a
  implements o
{
  private static n gkE;
  private static m gkF;
  public static final a.a pAG;

  static
  {
    AppMethodBeat.i(102851);
    pAG = new a.a((byte)0);
    AppMethodBeat.o(102851);
  }

  public final void a(m paramm)
  {
    AppMethodBeat.i(102850);
    j.p(paramm, "callback");
    gkF = paramm;
    AppMethodBeat.o(102850);
  }

  public final void a(n paramn)
  {
    AppMethodBeat.i(102849);
    j.p(paramn, "callback");
    gkE = paramn;
    AppMethodBeat.o(102849);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.radar.a
 * JD-Core Version:    0.6.2
 */