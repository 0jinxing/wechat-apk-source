package com.tencent.mm.plugin.ipcall.a.e;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.sdk.platformtools.bo;

public final class b extends a
{
  private long nyK;
  public long nyL;
  public long nyM = 0L;
  public long nyN = 0L;
  public long nyO = 0L;

  protected final void bHT()
  {
    AppMethodBeat.i(21884);
    h.pYm.e(12930, new Object[] { Long.valueOf(this.nyK), Long.valueOf(this.nyL), Long.valueOf(this.nyM), Long.valueOf(this.nyN), Long.valueOf(this.nyO) });
    AppMethodBeat.o(21884);
  }

  public final void reset()
  {
    this.nyK = 0L;
    this.nyL = 0L;
    this.nyM = 0L;
    this.nyN = 0L;
    this.nyO = 0L;
  }

  public final void start()
  {
    AppMethodBeat.i(21883);
    super.start();
    this.nyK = bo.anU();
    AppMethodBeat.o(21883);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.ipcall.a.e.b
 * JD-Core Version:    0.6.2
 */