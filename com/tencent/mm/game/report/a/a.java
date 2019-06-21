package com.tencent.mm.game.report.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.game.report.api.c;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.expt.a.a.a;
import com.tencent.mm.sdk.platformtools.ab;
import java.net.URLEncoder;

public final class a
  implements b
{
  private static String kX(String paramString)
  {
    AppMethodBeat.i(59594);
    try
    {
      String str = URLEncoder.encode(paramString, "UTF-8");
      paramString = str;
      AppMethodBeat.o(59594);
      return paramString;
    }
    catch (Exception localException)
    {
      while (true)
        AppMethodBeat.o(59594);
    }
  }

  public final String a(a.a parama, String paramString)
  {
    AppMethodBeat.i(59592);
    String str = ((com.tencent.mm.plugin.expt.a.a)g.K(com.tencent.mm.plugin.expt.a.a.class)).a(parama, paramString);
    if (!str.equals(paramString))
      c.eBG.g(2, parama.name(), kX(str));
    ab.i("MicroMsg.GameExptManager", "key: %s, result: %s", new Object[] { parama.name(), str });
    AppMethodBeat.o(59592);
    return str;
  }

  public final boolean a(a.a parama)
  {
    AppMethodBeat.i(59593);
    boolean bool = ((com.tencent.mm.plugin.expt.a.a)g.K(com.tencent.mm.plugin.expt.a.a.class)).a(parama, false);
    c.eBG.g(2, parama.name(), String.valueOf(bool));
    ab.i("MicroMsg.GameExptManager", "key: %s, result: %b", new Object[] { parama.name(), Boolean.valueOf(bool) });
    AppMethodBeat.o(59593);
    return bool;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.game.report.a.a
 * JD-Core Version:    0.6.2
 */