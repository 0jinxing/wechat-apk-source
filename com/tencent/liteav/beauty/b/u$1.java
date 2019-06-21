package com.tencent.liteav.beauty.b;

import com.tencent.matrix.trace.core.AppMethodBeat;

class u$1
  implements Runnable
{
  u$1(u paramu)
  {
  }

  public void run()
  {
    AppMethodBeat.i(66978);
    synchronized (u.a(this.a))
    {
      u.b(this.a);
      u.a(this.a).notify();
      AppMethodBeat.o(66978);
      return;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.liteav.beauty.b.u.1
 * JD-Core Version:    0.6.2
 */