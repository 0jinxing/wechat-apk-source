package com.tencent.mm.plugin.ipcall.a.e;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.bo;

public final class h extends a
{
  private long nyK;
  public long nyL;
  private long nzg = 0L;
  public long nzh = 0L;
  public long nzi = 0L;
  public long nzj = 0L;

  protected final void bHT()
  {
    AppMethodBeat.i(21893);
    com.tencent.mm.plugin.report.service.h.pYm.e(12931, new Object[] { Long.valueOf(this.nyK), Long.valueOf(this.nyL), Long.valueOf(this.nzg), Long.valueOf(this.nzh), Long.valueOf(this.nzi), Long.valueOf(this.nzj) });
    AppMethodBeat.o(21893);
  }

  public final void reset()
  {
    this.nyK = 0L;
    this.nyL = 0L;
    this.nzg = 0L;
    this.nzh = 0L;
    this.nzi = 0L;
    this.nzj = 0L;
  }

  public final void start()
  {
    AppMethodBeat.i(21892);
    super.start();
    this.nyK = bo.anU();
    AppMethodBeat.o(21892);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.ipcall.a.e.h
 * JD-Core Version:    0.6.2
 */