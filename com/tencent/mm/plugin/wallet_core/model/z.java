package com.tencent.mm.plugin.wallet_core.model;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.e;
import com.tencent.mm.kernel.g;
import com.tencent.mm.storage.ac.a;

public final class z
{
  public static String TAG = "MicroMsg.WalletIndexPayMenu";

  public static void acA(String paramString)
  {
    AppMethodBeat.i(46909);
    g.RQ();
    g.RP().Ry().set(ac.a.xSr, paramString);
    AppMethodBeat.o(46909);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet_core.model.z
 * JD-Core Version:    0.6.2
 */