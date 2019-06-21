package com.tencent.mm.plugin.fav.b.e;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ap.a;

final class a$5
  implements ap.a
{
  a$5(a parama)
  {
  }

  public final boolean BI()
  {
    AppMethodBeat.i(5329);
    try
    {
      this.mgY.agK();
      AppMethodBeat.o(5329);
      return false;
    }
    catch (Exception localException)
    {
      while (true)
        ab.printErrStackTrace("MicroMsg.Fav.FavCdnService", localException, "", new Object[0]);
    }
  }

  public final String toString()
  {
    AppMethodBeat.i(5330);
    String str = super.toString() + "|scenePusher";
    AppMethodBeat.o(5330);
    return str;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.fav.b.e.a.5
 * JD-Core Version:    0.6.2
 */