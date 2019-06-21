package com.tencent.mm.plugin.fav.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

final class g$2
  implements g.a
{
  public final void log(String paramString)
  {
    AppMethodBeat.i(102631);
    ab.e("MicroMsg.FavItemInfo", paramString);
    AppMethodBeat.o(102631);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.fav.a.g.2
 * JD-Core Version:    0.6.2
 */