package com.tencent.mm.bp;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

final class d$8
  implements b
{
  d$8(String paramString)
  {
  }

  public final void e(Exception paramException)
  {
    AppMethodBeat.i(114692);
    ab.e("MicroMsg.PluginHelper", "start wizard activity failed, plugin(%s) not loaded", new Object[] { this.vwC });
    ab.e("MicroMsg.PluginHelper", "start wizard activity with exception:%s", new Object[] { paramException });
    AppMethodBeat.o(114692);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.bp.d.8
 * JD-Core Version:    0.6.2
 */