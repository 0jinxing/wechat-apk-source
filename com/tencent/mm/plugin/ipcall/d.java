package com.tencent.mm.plugin.ipcall;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.m.e;
import com.tencent.mm.m.g;
import com.tencent.mm.model.aw;
import com.tencent.mm.model.c;
import com.tencent.mm.storage.ac.a;
import com.tencent.mm.storage.z;

public final class d
{
  public static boolean bGW()
  {
    boolean bool = false;
    AppMethodBeat.i(21702);
    if (aw.RK())
      if (g.Nu().getInt("WCOEntranceSwitch", 0) > 0)
      {
        aw.ZK();
        c.Ry().set(ac.a.xLB, Boolean.TRUE);
        bool = true;
        AppMethodBeat.o(21702);
      }
    while (true)
    {
      return bool;
      aw.ZK();
      c.Ry().set(ac.a.xLB, Boolean.FALSE);
      AppMethodBeat.o(21702);
      continue;
      AppMethodBeat.o(21702);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.ipcall.d
 * JD-Core Version:    0.6.2
 */