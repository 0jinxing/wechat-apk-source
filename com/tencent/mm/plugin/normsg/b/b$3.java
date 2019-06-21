package com.tencent.mm.plugin.normsg.b;

import com.tencent.matrix.trace.core.AppMethodBeat;

final class b$3
  implements Runnable
{
  b$3(b paramb, Throwable paramThrowable, boolean[] paramArrayOfBoolean)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(10391);
    b.b(this.oUG, this.oUH);
    synchronized (this.oUF)
    {
      this.oUF[0] = true;
      this.oUF.notifyAll();
      AppMethodBeat.o(10391);
      return;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.normsg.b.b.3
 * JD-Core Version:    0.6.2
 */