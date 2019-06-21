package com.tencent.mm.bp;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

final class d$3
  implements b
{
  d$3(String paramString)
  {
  }

  public final void e(Exception paramException)
  {
    AppMethodBeat.i(114687);
    ab.f("MicroMsg.PluginHelper", "start activity failed, plugin(%s) not loaded", new Object[] { this.vwC });
    ab.e("MicroMsg.PluginHelper", "start activity failed,%s", new Object[] { paramException });
    AppMethodBeat.o(114687);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.bp.d.3
 * JD-Core Version:    0.6.2
 */