package com.tencent.mm.plugin.exdevice.model;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.exdevice.service.f;
import com.tencent.mm.plugin.exdevice.service.f.a;
import com.tencent.mm.plugin.exdevice.service.k.a;
import com.tencent.mm.sdk.platformtools.ab;

final class h$2 extends k.a
{
  h$2(h paramh, h.a parama)
  {
  }

  public final void a(long paramLong1, int paramInt1, int paramInt2, int paramInt3, long paramLong2)
  {
    AppMethodBeat.i(19275);
    ab.d(h.TAG, "mac=%d, oldState=%d, newState=%d, errCode=%d, profileType=%d", new Object[] { Long.valueOf(paramLong1), Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), Long.valueOf(paramLong2) });
    f.a locala = h.a(this.ltc).hU(paramLong1);
    if (locala != null)
    {
      locala.cxs = paramInt2;
      locala.jGw = paramLong2;
    }
    while (true)
    {
      this.ltd.a(paramLong1, paramInt1, paramInt2, paramInt3, paramLong2);
      AppMethodBeat.o(19275);
      return;
      ab.i(h.TAG, "get connect state faild : %d", new Object[] { Long.valueOf(paramLong1) });
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.exdevice.model.h.2
 * JD-Core Version:    0.6.2
 */