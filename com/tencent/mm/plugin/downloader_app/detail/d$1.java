package com.tencent.mm.plugin.downloader_app.detail;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.game.luggage.c;
import com.tencent.mm.plugin.game.luggage.d.a;
import com.tencent.mm.sdk.platformtools.ah;

final class d$1
  implements d.a
{
  public final void wM()
  {
    AppMethodBeat.i(136054);
    if (d.biD() != null)
      d.destroy();
    d.a(com.tencent.mm.plugin.game.luggage.d.aq(ah.getContext(), d.access$100()));
    if (d.biD() != null)
      c.a(d.biD(), d.access$100(), false);
    AppMethodBeat.o(136054);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.downloader_app.detail.d.1
 * JD-Core Version:    0.6.2
 */