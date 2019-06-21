package com.tencent.mm.plugin.brandservice.ui.timeline;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.e;
import com.tencent.mm.kernel.g;
import com.tencent.mm.storage.ac.a;
import com.tencent.mm.storage.z;

public final class c
{
  public static boolean aWu()
  {
    AppMethodBeat.i(14143);
    boolean bool;
    if ((((Integer)g.RP().Ry().get(ac.a.xVm, Integer.valueOf(0))).intValue() & 0x2) > 0)
    {
      bool = true;
      AppMethodBeat.o(14143);
    }
    while (true)
    {
      return bool;
      AppMethodBeat.o(14143);
      bool = false;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.brandservice.ui.timeline.c
 * JD-Core Version:    0.6.2
 */