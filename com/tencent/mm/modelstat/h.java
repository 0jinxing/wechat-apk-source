package com.tencent.mm.modelstat;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;

public final class h
{
  long bZI;
  long beginTime;
  boolean cRY;
  long endTime;
  long fSW;
  long fSX;
  int rtType;

  public h()
  {
  }

  public h(int paramInt, boolean paramBoolean, long paramLong)
  {
    this.rtType = paramInt;
    this.cRY = paramBoolean;
    this.fSW = paramLong;
    this.fSX = 0L;
  }

  public final void akj()
  {
    AppMethodBeat.i(78735);
    if (this.fSX == 0L)
    {
      this.beginTime = bo.anU();
      this.bZI = bo.yz();
    }
    this.fSX += 1L;
    AppMethodBeat.o(78735);
  }

  public final void fS(long paramLong)
  {
    AppMethodBeat.i(78736);
    if (this.fSW == 0L)
      this.fSW = paramLong;
    this.bZI = (bo.yz() - this.bZI);
    this.endTime = bo.anU();
    ab.d("MicroMsg.MultiSceneStat", "FIN: TIME:" + (this.endTime - this.beginTime) + " datalen:" + this.fSW + " Count:" + this.fSX + " type:" + this.rtType);
    WatchDogPushReceiver.a(this);
    AppMethodBeat.o(78736);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.modelstat.h
 * JD-Core Version:    0.6.2
 */