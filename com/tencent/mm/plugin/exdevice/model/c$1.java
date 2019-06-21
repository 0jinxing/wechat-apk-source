package com.tencent.mm.plugin.exdevice.model;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ap.a;

final class c$1
  implements ap.a
{
  private long ftP = 10L;

  c$1(c paramc)
  {
  }

  public final boolean BI()
  {
    boolean bool = true;
    AppMethodBeat.i(19090);
    if (this.lra.lqX == null)
    {
      long l = this.ftP;
      this.ftP = (l - 1L);
      if (l > 0L)
        AppMethodBeat.o(19090);
    }
    while (true)
    {
      return bool;
      ab.i("MicroMsg.exdevice.ExDeviceTaskService", "now retry count = %d", new Object[] { Long.valueOf(this.ftP) });
      if (this.ftP > 0L)
        this.lra.boC();
      AppMethodBeat.o(19090);
      bool = false;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.exdevice.model.c.1
 * JD-Core Version:    0.6.2
 */