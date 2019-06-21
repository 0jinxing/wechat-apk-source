package com.tencent.mm.network;

import com.tencent.mars.BaseEvent;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.an.a;
import com.tencent.mm.sdk.a.b;
import com.tencent.mm.sdk.platformtools.bj;

final class t$8 extends bj<Object>
{
  t$8(t paramt, Object paramObject, boolean paramBoolean)
  {
    super(3000L, paramObject, (byte)0);
  }

  public final Object run()
  {
    AppMethodBeat.i(58559);
    BaseEvent.onForeground(this.gdm);
    a.cL(this.gdm);
    b.cE(this.gdm);
    AppMethodBeat.o(58559);
    return null;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.network.t.8
 * JD-Core Version:    0.6.2
 */