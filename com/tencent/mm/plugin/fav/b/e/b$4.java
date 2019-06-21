package com.tencent.mm.plugin.fav.b.e;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ap.a;

final class b$4
  implements ap.a
{
  b$4(b paramb)
  {
  }

  public final boolean BI()
  {
    AppMethodBeat.i(5354);
    try
    {
      b.b(this.mhc);
      AppMethodBeat.o(5354);
      return false;
    }
    catch (Exception localException)
    {
      while (true)
        ab.printErrStackTrace("MicroMsg.Fav.FavCheckCdnService", localException, "", new Object[0]);
    }
  }

  public final String toString()
  {
    AppMethodBeat.i(5355);
    String str = super.toString() + "|scenePusher";
    AppMethodBeat.o(5355);
    return str;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.fav.b.e.b.4
 * JD-Core Version:    0.6.2
 */