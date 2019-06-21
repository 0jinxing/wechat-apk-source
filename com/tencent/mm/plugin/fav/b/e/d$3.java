package com.tencent.mm.plugin.fav.b.e;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ap.a;

final class d$3
  implements ap.a
{
  d$3(d paramd)
  {
  }

  public final boolean BI()
  {
    AppMethodBeat.i(5376);
    try
    {
      d.d(this.mhh);
      AppMethodBeat.o(5376);
      return false;
    }
    catch (Exception localException)
    {
      while (true)
        ab.printErrStackTrace("MicroMsg.Fav.FavModService", localException, "", new Object[0]);
    }
  }

  public final String toString()
  {
    AppMethodBeat.i(5377);
    String str = super.toString() + "|scenePusher";
    AppMethodBeat.o(5377);
    return str;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.fav.b.e.d.3
 * JD-Core Version:    0.6.2
 */