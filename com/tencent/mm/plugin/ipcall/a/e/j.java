package com.tencent.mm.plugin.ipcall.a.e;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.sdk.platformtools.bo;

public final class j extends a
{
  private long nyK;
  public long nyL;
  public long nzk = 0L;
  public long nzl = 0L;
  public long nzm = 0L;

  protected final void bHT()
  {
    AppMethodBeat.i(21896);
    h.pYm.e(12934, new Object[] { Long.valueOf(this.nyK), Long.valueOf(this.nyL), Long.valueOf(this.nzk), Long.valueOf(this.nzl), Long.valueOf(this.nzm) });
    AppMethodBeat.o(21896);
  }

  public final void reset()
  {
    this.nyK = 0L;
    this.nyL = 0L;
    this.nzk = 0L;
    this.nzl = 0L;
    this.nzm = 0L;
  }

  public final void start()
  {
    AppMethodBeat.i(21895);
    super.start();
    this.nyK = bo.anU();
    AppMethodBeat.o(21895);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.ipcall.a.e.j
 * JD-Core Version:    0.6.2
 */