package com.tencent.mm.plugin.hp.b;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.a.d;
import com.tencent.mm.g.a.d.a;
import com.tencent.mm.kernel.e;
import com.tencent.mm.kernel.g;
import com.tencent.mm.sdk.b.c;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.storage.ac.a;
import com.tencent.mm.storage.z;
import com.tinkerboots.sdk.a;

public final class f extends c<d>
{
  private static long cbv = 0L;

  public f()
  {
    AppMethodBeat.i(90607);
    this.xxI = d.class.getName().hashCode();
    AppMethodBeat.o(90607);
  }

  private static boolean a(d paramd)
  {
    AppMethodBeat.i(138235);
    if (paramd.crQ.crR)
      AppMethodBeat.o(138235);
    while (true)
    {
      return false;
      if (!g.RK())
      {
        AppMethodBeat.o(138235);
      }
      else
      {
        if (cbv == 0L)
          cbv = ((Long)g.RP().Ry().get(ac.a.xSD, Long.valueOf(0L))).longValue();
        long l = System.currentTimeMillis();
        if ((l - cbv >= 21600000L) && (a.dWj() != null))
        {
          a.dWj().rF(false);
          ab.i("MicroMsg.Tinker.TinkerBootsActivateListener", "callback post task and fetchPatchUpdate false");
          cbv = l;
          g.RP().Ry().set(ac.a.xSD, Long.valueOf(l));
        }
        AppMethodBeat.o(138235);
      }
    }
  }

  public static void iT(long paramLong)
  {
    cbv = paramLong;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.hp.b.f
 * JD-Core Version:    0.6.2
 */