package com.b.a.a;

import com.tencent.matrix.trace.core.AppMethodBeat;

final class r$c extends r.a
{
  private final String bFU;
  private final long bFV;
  private final int dataType;

  private r$c(r paramr, String paramString, long paramLong, int paramInt)
  {
    super(paramr, (byte)0);
    this.bFU = paramString;
    this.bFV = paramLong;
    this.dataType = paramInt;
  }

  public final void run()
  {
    AppMethodBeat.i(55541);
    try
    {
      int i = this.dataType;
      switch (i)
      {
      default:
        AppMethodBeat.o(55541);
      case 0:
        while (true)
        {
          return;
          r.a(wn(), this.bFU, this.bFV);
          AppMethodBeat.o(55541);
        }
      case 1:
      }
    }
    catch (Exception localException)
    {
      while (true)
      {
        AppMethodBeat.o(55541);
        continue;
        r.a(wn(), this.bFU);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.b.a.a.r.c
 * JD-Core Version:    0.6.2
 */