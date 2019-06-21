package com.tencent.mm.network;

import com.tencent.mars.stn.StnLogic;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.bj;

public final class t$12 extends bj<Object>
{
  public t$12(t paramt, String paramString1, String paramString2)
  {
    super(1000L, null, (byte)0);
  }

  public final Object run()
  {
    AppMethodBeat.i(58563);
    StnLogic.setDebugIP(this.gdx, this.gdv);
    AppMethodBeat.o(58563);
    return null;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.network.t.12
 * JD-Core Version:    0.6.2
 */