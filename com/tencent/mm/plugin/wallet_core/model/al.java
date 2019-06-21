package com.tencent.mm.plugin.wallet_core.model;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.e;
import com.tencent.mm.kernel.g;
import com.tencent.mm.storage.ac.a;
import com.tencent.mm.storage.z;

public final class al
{
  public static boolean aFF()
  {
    AppMethodBeat.i(47002);
    g.RQ();
    boolean bool;
    if (((Boolean)g.RP().Ry().get(ac.a.xUU, Boolean.FALSE)).booleanValue())
    {
      bool = false;
      AppMethodBeat.o(47002);
    }
    while (true)
    {
      return bool;
      bool = true;
      AppMethodBeat.o(47002);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet_core.model.al
 * JD-Core Version:    0.6.2
 */