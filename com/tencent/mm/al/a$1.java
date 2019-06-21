package com.tencent.mm.al;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.model.ao.a;
import com.tencent.mm.model.ao.e;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ap.a;

final class a$1
  implements ap.a
{
  a$1(a parama)
  {
  }

  public final boolean BI()
  {
    boolean bool = false;
    AppMethodBeat.i(77968);
    if ((a.a(this.fyF) == 0) && (a.b(this.fyF) == 0))
      AppMethodBeat.o(77968);
    while (true)
    {
      return bool;
      ab.i("MicroMsg.CdnTransportEngine", "CdnDataFlowStat id:%s send:%d recv:%d", new Object[] { a.c(this.fyF), Integer.valueOf(a.a(this.fyF)), Integer.valueOf(a.b(this.fyF)) });
      if (ao.a.flv == null)
      {
        ab.e("MicroMsg.CdnTransportEngine", "getNetStat null");
        AppMethodBeat.o(77968);
      }
      else
      {
        ao.a.flv.cm(a.b(this.fyF), a.a(this.fyF));
        a.d(this.fyF);
        a.e(this.fyF);
        AppMethodBeat.o(77968);
        bool = true;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.al.a.1
 * JD-Core Version:    0.6.2
 */