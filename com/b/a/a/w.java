package com.b.a.a;

import android.content.Context;
import android.os.Handler;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class w extends n
{
  private static w bIs;
  private boolean bIt;
  private int bIu;
  private long bIv;
  private long bIw;

  static w wC()
  {
    AppMethodBeat.i(55606);
    if (bIs == null)
      bIs = new w();
    w localw = bIs;
    AppMethodBeat.o(55606);
    return localw;
  }

  final void a(int paramInt, String paramString, long paramLong1, long paramLong2)
  {
    AppMethodBeat.i(55611);
    if (this.bIt)
      stop();
    super.a(paramInt, paramString, paramLong1, paramLong2);
    AppMethodBeat.o(55611);
  }

  final void a(Context paramContext, Handler paramHandler, d.a parama)
  {
    AppMethodBeat.i(55607);
    if (this.bIt)
      if (k.wc().bCM)
        k.wc().vY();
    while (true)
    {
      super.a(paramContext, paramHandler, parama);
      AppMethodBeat.o(55607);
      return;
      if (!k.wc().bCM)
        try
        {
          k.wc().a(paramContext, new m[] { this });
        }
        catch (Exception localException)
        {
        }
    }
  }

  final void a(Handler paramHandler, d.a parama)
  {
    try
    {
      AppMethodBeat.i(55608);
      this.bIt = false;
      super.a(paramHandler, parama);
      AppMethodBeat.o(55608);
      return;
    }
    finally
    {
      paramHandler = finally;
    }
    throw paramHandler;
  }

  public final void a(p paramp)
  {
    AppMethodBeat.i(55609);
    long l = paramp.bFC;
    int i;
    if ((this.bIt) && (l - this.bIw > this.bIv))
    {
      stop();
      i = 1;
      if (i == 0)
        break label55;
      AppMethodBeat.o(55609);
    }
    while (true)
    {
      return;
      i = 0;
      break;
      label55: super.a(paramp);
      AppMethodBeat.o(55609);
    }
  }

  final void a(x paramx, long paramLong1, long paramLong2)
  {
    AppMethodBeat.i(55610);
    if (paramx.bIB == null)
      paramx.bIB = new x.a();
    float f = paramx.bIB.bIE;
    int i;
    if ((this.bIt) && (f >= this.bIu))
    {
      stop();
      i = 1;
      if (i == 0)
        break label74;
      AppMethodBeat.o(55610);
    }
    while (true)
    {
      return;
      i = 0;
      break;
      label74: super.a(paramx, paramLong1, paramLong2);
      AppMethodBeat.o(55610);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.b.a.a.w
 * JD-Core Version:    0.6.2
 */