package com.google.android.exoplayer2.b;

import com.tencent.matrix.trace.core.AppMethodBeat;

final class g$1 extends Thread
{
  g$1(g paramg)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(94745);
    g localg = this.aSv;
    try
    {
      boolean bool;
      do
        bool = localg.qP();
      while (bool);
      AppMethodBeat.o(94745);
      return;
    }
    catch (InterruptedException localInterruptedException)
    {
      IllegalStateException localIllegalStateException = new IllegalStateException(localInterruptedException);
      AppMethodBeat.o(94745);
      throw localIllegalStateException;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.google.android.exoplayer2.b.g.1
 * JD-Core Version:    0.6.2
 */