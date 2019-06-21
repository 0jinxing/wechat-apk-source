package com.tencent.mm.sdk.g;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.g.a.c.a;
import com.tencent.mm.sdk.g.a.e;

public final class c
  implements com.tencent.mm.sdk.g.a.c
{
  private c.a xDA;
  private e xDz;

  public c(e parame)
  {
    this.xDz = parame;
  }

  public final void a(c.a parama)
  {
    this.xDA = parama;
  }

  public final void a(Runnable paramRunnable, String paramString)
  {
    AppMethodBeat.i(52532);
    a(paramRunnable, paramString, 0L);
    AppMethodBeat.o(52532);
  }

  public final void a(Runnable paramRunnable, String paramString, long paramLong)
  {
    AppMethodBeat.i(52533);
    if (0L >= paramLong)
    {
      this.xDz.b(paramRunnable, paramString);
      AppMethodBeat.o(52533);
    }
    while (true)
    {
      return;
      this.xDz.b(paramRunnable, paramString, paramLong);
      AppMethodBeat.o(52533);
    }
  }

  public final void ak(Runnable paramRunnable)
  {
    AppMethodBeat.i(52530);
    o(paramRunnable, 0L);
    AppMethodBeat.o(52530);
  }

  public final void al(Runnable paramRunnable)
  {
    AppMethodBeat.i(52534);
    this.xDz.remove(paramRunnable);
    AppMethodBeat.o(52534);
  }

  public final void o(Runnable paramRunnable, long paramLong)
  {
    AppMethodBeat.i(52531);
    if (0L >= paramLong)
    {
      this.xDz.execute(paramRunnable);
      AppMethodBeat.o(52531);
    }
    while (true)
    {
      return;
      this.xDz.p(paramRunnable, paramLong);
      AppMethodBeat.o(52531);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.sdk.g.c
 * JD-Core Version:    0.6.2
 */