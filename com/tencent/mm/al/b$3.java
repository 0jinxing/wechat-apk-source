package com.tencent.mm.al;

import com.tencent.mars.BaseEvent;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.a;
import com.tencent.mm.kernel.g;
import com.tencent.mm.network.n.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ak;

final class b$3 extends n.a
{
  b$3(b paramb)
  {
  }

  public final void gl(int paramInt)
  {
    AppMethodBeat.i(78033);
    ab.d("MicroMsg.CdnTransportService", "cdntra onNetworkChange st:%d ", new Object[] { Integer.valueOf(paramInt) });
    if ((paramInt != 4) && (paramInt != 6))
      AppMethodBeat.o(78033);
    while (true)
    {
      return;
      if (!g.RN().QY())
      {
        AppMethodBeat.o(78033);
      }
      else
      {
        this.fyR.fyH.removeMessages(1);
        BaseEvent.onNetworkChange();
        AppMethodBeat.o(78033);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.al.b.3
 * JD-Core Version:    0.6.2
 */