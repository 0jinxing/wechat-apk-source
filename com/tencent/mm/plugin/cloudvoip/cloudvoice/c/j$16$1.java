package com.tencent.mm.plugin.cloudvoip.cloudvoice.c;

import com.tencent.matrix.trace.core.AppMethodBeat;

final class j$16$1
  implements Runnable
{
  j$16$1(j.16 param16, int paramInt)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(135539);
    j.i(this.kBb.kAJ);
    j.a(this.kBb.kAJ, this.kBb.kAR, -10086, -5, "join room callback failed: " + this.crd);
    AppMethodBeat.o(135539);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.cloudvoip.cloudvoice.c.j.16.1
 * JD-Core Version:    0.6.2
 */