package com.tencent.mm.plugin.ipcall.a.e;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.sdk.platformtools.bo;

public final class g extends a
{
  private long nyK;
  public long nyL;
  public long nyZ = 0L;
  public String nza = "";
  public String nzb = "";
  public long nzc = 0L;
  public long nzd = 0L;
  public long nze = 0L;
  public String nzf = "";

  protected final void bHT()
  {
    AppMethodBeat.i(21891);
    h.pYm.e(12933, new Object[] { Long.valueOf(this.nyK), Long.valueOf(this.nyL), Long.valueOf(this.nyZ), this.nza, this.nzb, Long.valueOf(this.nzc), Long.valueOf(this.nzd), Long.valueOf(this.nze), this.nzf });
    AppMethodBeat.o(21891);
  }

  public final void reset()
  {
    this.nyK = 0L;
    this.nyL = 0L;
    this.nyZ = 0L;
    this.nza = "";
    this.nzb = "";
    this.nzc = 0L;
    this.nzd = 0L;
    this.nze = 0L;
    this.nzf = "";
  }

  public final void start()
  {
    AppMethodBeat.i(21890);
    super.start();
    this.nyK = bo.anU();
    AppMethodBeat.o(21890);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.ipcall.a.e.g
 * JD-Core Version:    0.6.2
 */