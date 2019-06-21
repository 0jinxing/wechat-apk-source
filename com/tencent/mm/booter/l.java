package com.tencent.mm.booter;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.a.i;
import com.tencent.mm.m.e;
import com.tencent.mm.m.g;
import com.tencent.mm.model.aw;
import com.tencent.mm.model.c;
import com.tencent.mm.sdk.a.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ar.a;

public final class l
{
  public static void run()
  {
    AppMethodBeat.i(15861);
    int i = g.Nu().getInt("EnableFlockMultiProcSPProb", 0);
    aw.ZK();
    int j = i.bL(c.QF(), 101);
    if ((b.dnO()) || ((i > 0) && (j >= 0) && (j <= i)));
    for (boolean bool = true; ; bool = false)
    {
      ar.a.setValue(ar.a.xAa, bool);
      ab.i("MicroMsg.PostTaskUpdateMultiProcSPSwitchListener", "Update MMImgDecSwitch, userHash:%d, prob:%d, enabled: %b", new Object[] { Integer.valueOf(j), Integer.valueOf(i), Boolean.valueOf(bool) });
      AppMethodBeat.o(15861);
      return;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.booter.l
 * JD-Core Version:    0.6.2
 */