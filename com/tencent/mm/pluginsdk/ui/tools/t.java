package com.tencent.mm.pluginsdk.ui.tools;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.ArrayList;
import java.util.List;

public final class t
{
  private static List<t.a> vvP;

  static
  {
    AppMethodBeat.i(79959);
    vvP = new ArrayList();
    AppMethodBeat.o(79959);
  }

  public static void a(t.a parama)
  {
    AppMethodBeat.i(79957);
    if (parama != null)
    {
      ab.d("MicroMsg.WebViewPluginCenter", "add, plugin name = " + parama.getName());
      if (!vvP.contains(parama))
        vvP.add(parama);
    }
    AppMethodBeat.o(79957);
  }

  public static void clear()
  {
    AppMethodBeat.i(79958);
    ab.d("MicroMsg.WebViewPluginCenter", "clear");
    vvP.clear();
    AppMethodBeat.o(79958);
  }

  public static List<t.a> dlE()
  {
    return vvP;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.ui.tools.t
 * JD-Core Version:    0.6.2
 */