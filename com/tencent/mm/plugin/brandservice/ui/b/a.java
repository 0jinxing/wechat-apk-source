package com.tencent.mm.plugin.brandservice.ui.b;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.brandservice.ui.timeline.offenread.d;
import com.tencent.mm.plugin.messenger.foundation.a.j;
import com.tencent.mm.storage.ad;
import com.tencent.mm.storage.bd;
import com.tencent.mm.storage.q;

public final class a
{
  public static int jYZ = 180;
  private static long jZa = 43200000L;
  private static long jZb = 0L;

  public static long aYQ()
  {
    if (jZa <= 0L)
      jZa = 43200000L;
    return jZa;
  }

  public static boolean e(q paramq)
  {
    AppMethodBeat.i(14446);
    boolean bool;
    if (paramq == null)
    {
      AppMethodBeat.o(14446);
      bool = false;
    }
    while (true)
    {
      return bool;
      paramq.xHU = d.FG(paramq.field_talker);
      if ((paramq.field_bitFlag & 0x1) != 0);
      for (int i = 1; ; i = 0)
      {
        if (i == 0)
          break label62;
        AppMethodBeat.o(14446);
        bool = true;
        break;
      }
      label62: if ((sG(2)) && (paramq.xHU))
      {
        AppMethodBeat.o(14446);
        bool = true;
      }
      else if (sG(1))
      {
        paramq = ((j)g.K(j.class)).XM().aoO(paramq.field_talker);
        if ((paramq != null) && (paramq.Oe()))
        {
          AppMethodBeat.o(14446);
          bool = true;
        }
      }
      else
      {
        AppMethodBeat.o(14446);
        bool = false;
      }
    }
  }

  public static void gP(long paramLong)
  {
    jZa = paramLong;
  }

  public static void gQ(long paramLong)
  {
    jZb = paramLong;
  }

  public static boolean sG(int paramInt)
  {
    if ((jZb & paramInt) != 0L);
    for (boolean bool = true; ; bool = false)
      return bool;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.brandservice.ui.b.a
 * JD-Core Version:    0.6.2
 */