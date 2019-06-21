package com.tencent.mm.plugin.sns.model;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

public final class b$c
{
  final String cFc;
  private final byte[] eMl;
  boolean eTM;
  private int fjN;
  public boolean qHS;
  long startTime;

  public b$c(String paramString, int paramInt)
  {
    AppMethodBeat.i(36104);
    this.eMl = new byte[0];
    this.cFc = paramString;
    this.fjN = paramInt;
    this.startTime = -1L;
    this.qHS = false;
    this.eTM = false;
    ab.d("MicroMsg.DownloadManager", "new reporter, snsId id: %s, picNum: %d, this: %s.", new Object[] { paramString, Integer.valueOf(paramInt), this });
    AppMethodBeat.o(36104);
  }

  public final void cmL()
  {
    synchronized (this.eMl)
    {
      if (this.fjN > 0)
        this.fjN -= 1;
      if (this.fjN == 0)
        this.eTM = true;
      return;
    }
  }

  public final void setStartTime(long paramLong)
  {
    AppMethodBeat.i(138245);
    if (!this.qHS);
    while (true)
    {
      synchronized (this.eMl)
      {
        if (!this.qHS)
        {
          this.qHS = true;
          this.startTime = paramLong;
          ab.d("MicroMsg.DownloadManager", "set start time, snsId id: %s, time: %d, this: %s.", new Object[] { this.cFc, Long.valueOf(this.startTime), this });
        }
        AppMethodBeat.o(138245);
        return;
      }
      AppMethodBeat.o(138245);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.model.b.c
 * JD-Core Version:    0.6.2
 */