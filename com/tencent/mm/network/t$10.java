package com.tencent.mm.network;

import com.tencent.mars.BaseEvent;
import com.tencent.mars.mm.MMLogic;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.bj;

final class t$10 extends bj<Object>
{
  t$10(t paramt, Object paramObject, String paramString1, String paramString2, String paramString3, String paramString4)
  {
    super(3000L, paramObject, (byte)0);
  }

  public final Object run()
  {
    AppMethodBeat.i(58561);
    MMLogic.setDebugIP(this.gdr, this.gds, this.gdt, this.gdu);
    BaseEvent.onNetworkChange();
    AppMethodBeat.o(58561);
    return null;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.network.t.10
 * JD-Core Version:    0.6.2
 */