package com.b.a.a;

import android.os.Handler;
import com.tencent.matrix.trace.core.AppMethodBeat;

abstract class e
{
  private a bCQ;
  long bCR;
  final Handler handler;

  e(Handler paramHandler)
  {
    if (paramHandler != null);
    while (true)
    {
      this.handler = paramHandler;
      return;
      paramHandler = new Handler();
    }
  }

  final void n(long paramLong1, long paramLong2)
  {
    stop();
    this.bCR = paramLong1;
    this.bCQ = new a((byte)0);
    a.a(this.bCQ, paramLong2);
  }

  final void stop()
  {
    if (this.bCQ != null)
      a.a(this.bCQ);
  }

  abstract void vZ();

  final class a
    implements Runnable
  {
    private boolean bCS;
    private boolean started;

    private a()
    {
    }

    public final void run()
    {
      AppMethodBeat.i(55612);
      if (this.bCS)
        AppMethodBeat.o(55612);
      while (true)
      {
        return;
        e.this.vZ();
        e.this.handler.postDelayed(this, e.this.bCR);
        AppMethodBeat.o(55612);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.b.a.a.e
 * JD-Core Version:    0.6.2
 */