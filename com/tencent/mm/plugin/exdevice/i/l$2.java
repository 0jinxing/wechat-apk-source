package com.tencent.mm.plugin.exdevice.i;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.exdevice.service.p;

final class l$2
  implements Runnable
{
  l$2(l paraml, long paramLong, int paramInt1, int paramInt2, String paramString, p paramp)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(19747);
    l.c(this.lxN).a(this.lxO, this.crc, this.crd, this.ftO, this.lxP);
    AppMethodBeat.o(19747);
  }

  public final String toString()
  {
    AppMethodBeat.i(19748);
    String str = super.toString() + "|onTaskEnd";
    AppMethodBeat.o(19748);
    return str;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.exdevice.i.l.2
 * JD-Core Version:    0.6.2
 */