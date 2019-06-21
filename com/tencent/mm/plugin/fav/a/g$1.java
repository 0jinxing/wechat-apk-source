package com.tencent.mm.plugin.fav.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

final class g$1
  implements g.a
{
  public final void log(String paramString)
  {
    AppMethodBeat.i(102630);
    ab.d("MicroMsg.FavItemInfo", paramString);
    AppMethodBeat.o(102630);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.fav.a.g.1
 * JD-Core Version:    0.6.2
 */