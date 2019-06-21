package com.tencent.mm.plugin.luckymoney.sns.b;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.e;
import com.tencent.mm.kernel.g;
import com.tencent.mm.storage.ac.a;
import com.tencent.mm.storage.z;

public final class a
{
  public static int bMi()
  {
    AppMethodBeat.i(42551);
    g.RQ();
    int i = ((Integer)g.RP().Ry().get(ac.a.xNe, Integer.valueOf(0))).intValue();
    AppMethodBeat.o(42551);
    return i;
  }

  public static String bMj()
  {
    AppMethodBeat.i(42553);
    g.RQ();
    String str = (String)g.RP().Ry().get(ac.a.xNj, "");
    AppMethodBeat.o(42553);
    return str;
  }

  public static String bMk()
  {
    AppMethodBeat.i(42554);
    g.RQ();
    String str = (String)g.RP().Ry().get(ac.a.xNk, "");
    AppMethodBeat.o(42554);
    return str;
  }

  public static void xV(int paramInt)
  {
    AppMethodBeat.i(42552);
    g.RQ();
    g.RP().Ry().set(ac.a.xNe, Integer.valueOf(paramInt));
    g.RQ();
    g.RP().Ry().dsb();
    AppMethodBeat.o(42552);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.luckymoney.sns.b.a
 * JD-Core Version:    0.6.2
 */