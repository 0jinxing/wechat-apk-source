package com.tencent.mm.modelstat;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ap.a;
import com.tencent.mm.sdk.platformtools.bo;

final class o$4
  implements ap.a
{
  public final boolean BI()
  {
    AppMethodBeat.i(78770);
    try
    {
      o.akp();
      if ((o.access$300() < 2000) && (o.access$300() > 1000))
        o.mh(o.access$300());
      while (true)
      {
        AppMethodBeat.o(78770);
        return false;
        o.mi(o.access$300());
      }
    }
    catch (Exception localException)
    {
      while (true)
        ab.e("MicroMsg.NetTypeReporter", "run :%s", new Object[] { bo.l(localException) });
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.modelstat.o.4
 * JD-Core Version:    0.6.2
 */