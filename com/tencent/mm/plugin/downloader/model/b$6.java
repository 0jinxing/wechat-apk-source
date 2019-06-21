package com.tencent.mm.plugin.downloader.model;

import com.tencent.matrix.trace.core.AppMethodBeat;

final class b$6
  implements Runnable
{
  b$6(b paramb, long paramLong)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(2381);
    k[] arrayOfk = b.big();
    int i = arrayOfk.length;
    for (int j = 0; j < i; j++)
      arrayOfk[j].onTaskPaused(this.kMG);
    if (b.bih() != null)
      b.bih().onTaskPaused(this.kMG);
    AppMethodBeat.o(2381);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.downloader.model.b.6
 * JD-Core Version:    0.6.2
 */