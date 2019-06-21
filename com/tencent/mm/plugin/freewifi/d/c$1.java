package com.tencent.mm.plugin.freewifi.d;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.f;
import com.tencent.mm.network.q;

final class c$1
  implements Runnable
{
  c$1(c paramc, int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(20778);
    this.mwx.b(this.fuc, this.crc, this.crd, this.ftO);
    if (this.mwx.ehi != null)
      this.mwx.ehi.onSceneEnd(this.crc, this.crd, this.ftO, this.mwx);
    AppMethodBeat.o(20778);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.freewifi.d.c.1
 * JD-Core Version:    0.6.2
 */