package com.tencent.mm.plugin.downloader.model;

import com.tencent.matrix.trace.core.AppMethodBeat;

final class b$7
  implements Runnable
{
  b$7(b paramb, long paramLong)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(2382);
    k[] arrayOfk = b.big();
    int i = arrayOfk.length;
    for (int j = 0; j < i; j++)
      arrayOfk[j].gm(this.kMG);
    AppMethodBeat.o(2382);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.downloader.model.b.7
 * JD-Core Version:    0.6.2
 */