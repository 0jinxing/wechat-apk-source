package com.tencent.mm.plugin.downloader.model;

import com.tencent.matrix.trace.core.AppMethodBeat;

final class b$1
  implements Runnable
{
  b$1(b paramb, long paramLong, String paramString)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(2376);
    k[] arrayOfk = b.big();
    int i = arrayOfk.length;
    for (int j = 0; j < i; j++)
      arrayOfk[j].onTaskStarted(this.kMG, this.bSt);
    if (b.bih() != null)
      b.bih().onTaskStarted(this.kMG, this.bSt);
    AppMethodBeat.o(2376);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.downloader.model.b.1
 * JD-Core Version:    0.6.2
 */