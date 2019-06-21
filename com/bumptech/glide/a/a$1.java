package com.bumptech.glide.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.concurrent.Callable;

final class a$1
  implements Callable<Void>
{
  a$1(a parama)
  {
  }

  private Void call()
  {
    AppMethodBeat.i(51805);
    synchronized (this.axH)
    {
      if (a.a(this.axH) == null)
      {
        AppMethodBeat.o(51805);
        return null;
      }
      a.b(this.axH);
      if (a.c(this.axH))
      {
        a.d(this.axH);
        a.e(this.axH);
      }
      AppMethodBeat.o(51805);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.bumptech.glide.a.a.1
 * JD-Core Version:    0.6.2
 */