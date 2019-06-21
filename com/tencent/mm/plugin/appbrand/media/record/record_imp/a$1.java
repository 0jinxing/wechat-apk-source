package com.tencent.mm.plugin.appbrand.media.record.record_imp;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.audio.b.c.a;
import com.tencent.mm.sdk.platformtools.ab;

final class a$1
  implements c.a
{
  a$1(a parama)
  {
  }

  public final void bN(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(105657);
    ab.e("MicroMsg.Record.AppBrandRecorder", "state:%d, detailState:%d", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
    if (this.imj.imh != null)
      this.imj.imh.bN(paramInt1, paramInt2);
    AppMethodBeat.o(105657);
  }

  public final void u(byte[] paramArrayOfByte, int paramInt)
  {
    AppMethodBeat.i(105656);
    ab.i("MicroMsg.Record.AppBrandRecorder", "onRecPcmDataReady()");
    if (this.imj.imh != null)
      this.imj.imh.u(paramArrayOfByte, paramInt);
    AppMethodBeat.o(105656);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.media.record.record_imp.a.1
 * JD-Core Version:    0.6.2
 */