package com.tencent.mm.plugin.downloader.model;

import com.tencent.matrix.trace.core.AppMethodBeat;

final class b$3
  implements Runnable
{
  b$3(b paramb, long paramLong)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(2378);
    k[] arrayOfk = b.big();
    int i = arrayOfk.length;
    for (int j = 0; j < i; j++)
      arrayOfk[j].onTaskRemoved(this.kMG);
    if (b.bih() != null)
      b.bih().onTaskRemoved(this.kMG);
    AppMethodBeat.o(2378);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.downloader.model.b.3
 * JD-Core Version:    0.6.2
 */