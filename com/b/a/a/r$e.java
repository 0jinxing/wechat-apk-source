package com.b.a.a;

import com.tencent.matrix.trace.core.AppMethodBeat;

final class r$e extends r.a
{
  private final String bFU;
  private final long bFV;
  private final long bFX;
  private final boolean bFY;
  private final int bFk;

  private r$e(r paramr, String paramString, long paramLong1, long paramLong2, int paramInt)
  {
    super(paramr, (byte)0);
    this.bFU = paramString;
    this.bFV = paramLong1;
    this.bFX = paramLong2;
    this.bFk = paramInt;
    this.bFY = true;
  }

  public final void run()
  {
    AppMethodBeat.i(55544);
    try
    {
      r.a(wn(), this.bFU, this.bFV, this.bFX, this.bFk, this.bFY);
      AppMethodBeat.o(55544);
      return;
    }
    catch (Exception localException)
    {
      while (true)
        AppMethodBeat.o(55544);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.b.a.a.r.e
 * JD-Core Version:    0.6.2
 */