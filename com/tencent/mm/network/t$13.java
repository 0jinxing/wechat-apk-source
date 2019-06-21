package com.tencent.mm.network;

import com.tencent.mars.BaseEvent;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.bj;

final class t$13 extends bj<Object>
{
  t$13(t paramt, Object paramObject)
  {
    super(3000L, paramObject, (byte)0);
  }

  public final Object run()
  {
    AppMethodBeat.i(58564);
    BaseEvent.onNetworkChange();
    AppMethodBeat.o(58564);
    return null;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.network.t.13
 * JD-Core Version:    0.6.2
 */