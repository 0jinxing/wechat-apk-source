package com.tencent.mm.vending.h;

import android.os.Handler;
import android.os.Looper;
import com.tencent.matrix.trace.core.AppMethodBeat;

public final class h extends d
{
  Looper b;
  public String c;
  public a zYv;

  public h(Handler paramHandler, String paramString)
  {
    this(new b(paramHandler), paramString);
    AppMethodBeat.i(126118);
    AppMethodBeat.o(126118);
  }

  private h(Looper paramLooper, a parama, String paramString)
  {
    this.b = paramLooper;
    this.zYv = parama;
    this.c = paramString;
  }

  public h(Looper paramLooper, String paramString)
  {
    this(new Handler(paramLooper), paramString);
    AppMethodBeat.i(126120);
    AppMethodBeat.o(126120);
  }

  public h(a parama, String paramString)
  {
    this(parama.getLooper(), parama, paramString);
    AppMethodBeat.i(126119);
    AppMethodBeat.o(126119);
  }

  public final void cancel()
  {
    AppMethodBeat.i(126121);
    this.zYv.eD();
    AppMethodBeat.o(126121);
  }

  public final String getType()
  {
    return this.c;
  }

  public final void l(Runnable paramRunnable, long paramLong)
  {
    AppMethodBeat.i(126123);
    if (paramLong >= 0L)
    {
      this.zYv.d(paramRunnable, paramLong);
      AppMethodBeat.o(126123);
    }
    while (true)
    {
      return;
      this.zYv.f(paramRunnable);
      AppMethodBeat.o(126123);
    }
  }

  public final void o(Runnable paramRunnable)
  {
    AppMethodBeat.i(126122);
    this.zYv.f(paramRunnable);
    AppMethodBeat.o(126122);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.vending.h.h
 * JD-Core Version:    0.6.2
 */