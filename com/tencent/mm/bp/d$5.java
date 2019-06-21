package com.tencent.mm.bp;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

final class d$5
  implements b
{
  d$5(String paramString)
  {
  }

  public final void e(Exception paramException)
  {
    AppMethodBeat.i(114689);
    ab.f("MicroMsg.PluginHelper", "start activity failed, plugin(%s) not loaded", new Object[] { this.vwC });
    ab.e("MicroMsg.PluginHelper", "start activity failed,%s", new Object[] { paramException });
    AppMethodBeat.o(114689);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.bp.d.5
 * JD-Core Version:    0.6.2
 */