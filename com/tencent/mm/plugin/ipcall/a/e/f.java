package com.tencent.mm.plugin.ipcall.a.e;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.report.service.h;

public final class f extends a
{
  public int nyR = 0;
  public int nyS = 0;
  public int nyT = 0;
  public int nyU = 0;
  public int nyV = -9999;
  public String nyW = "";
  public int nyX = 0;
  public int nyY = 0;

  protected final void bHT()
  {
    AppMethodBeat.i(21889);
    h.pYm.e(14182, new Object[] { Integer.valueOf(this.nyR), Integer.valueOf(this.nyS), Integer.valueOf(this.nyT), Integer.valueOf(this.nyU), Integer.valueOf(this.nyV), this.nyW, Integer.valueOf(this.nyX), Integer.valueOf(this.nyY) });
    AppMethodBeat.o(21889);
  }

  public final void reset()
  {
    this.nyR = 0;
    this.nyS = 0;
    this.nyT = 0;
    this.nyU = 0;
    this.nyV = -9999;
    this.nyW = "";
    this.nyX = 0;
    this.nyY = 0;
  }

  public final void start()
  {
    AppMethodBeat.i(21888);
    super.start();
    AppMethodBeat.o(21888);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.ipcall.a.e.f
 * JD-Core Version:    0.6.2
 */