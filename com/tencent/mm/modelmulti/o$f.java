package com.tencent.mm.modelmulti;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.g;
import com.tencent.mm.platformtools.ae;
import com.tencent.mm.plugin.report.e;
import com.tencent.mm.protocal.protobuf.bek;
import com.tencent.mm.protocal.t.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.al;
import java.util.Queue;

final class o$f
  implements o.c
{
  int fHK;
  long fJB;
  bek fJp;

  public o$f(o paramo, t.b paramb, int paramInt, long paramLong)
  {
    AppMethodBeat.i(58411);
    if (paramb == null);
    for (paramo = null; ; paramo = paramb.vyH)
    {
      this.fJp = paramo;
      this.fJB = paramLong;
      this.fHK = paramInt;
      AppMethodBeat.o(58411);
      return;
    }
  }

  public final boolean c(Queue<o.c> paramQueue)
  {
    AppMethodBeat.i(58412);
    boolean bool;
    if (this.fJp == null)
    {
      e.pXa.a(99L, 40L, 1L, false);
      ab.e("MicroMsg.SyncService", "%s run resp == null", new Object[] { this });
      bool = false;
      AppMethodBeat.o(58412);
    }
    while (true)
    {
      return bool;
      if (10018 == ae.giz)
      {
        ab.e("MicroMsg.SyncService", "%s Give up for test", new Object[] { this });
        bool = false;
        AppMethodBeat.o(58412);
      }
      else
      {
        new o.a(this.fJl, this, true, this.fJp, new o.f.1(this), (byte)0);
        g.RS().m(new o.f.2(this), 100L);
        e.pXa.a(99L, 21L, 1L, false);
        bool = true;
        AppMethodBeat.o(58412);
      }
    }
  }

  public final String toString()
  {
    AppMethodBeat.i(58413);
    String str = "NotifyData[" + hashCode() + "]";
    AppMethodBeat.o(58413);
    return str;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.modelmulti.o.f
 * JD-Core Version:    0.6.2
 */