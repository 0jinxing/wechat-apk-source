package com.tencent.mm.network;

import com.tencent.mars.mm.MMLogic;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.bj;

final class t$11 extends bj<Object>
{
  t$11(t paramt, String paramString1, String paramString2)
  {
    super(1000L, null, (byte)0);
  }

  public final Object run()
  {
    AppMethodBeat.i(58562);
    MMLogic.setNewDnsDebugHost(this.gdv, this.gdw);
    AppMethodBeat.o(58562);
    return null;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.network.t.11
 * JD-Core Version:    0.6.2
 */