package com.tencent.mm.plugin.downloader.model;

import com.tencent.matrix.trace.core.AppMethodBeat;

final class b$8
  implements Runnable
{
  b$8(b paramb, long paramLong)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(2383);
    k[] arrayOfk = b.big();
    int i = arrayOfk.length;
    for (int j = 0; j < i; j++)
      arrayOfk[j].gn(this.kMG);
    AppMethodBeat.o(2383);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.downloader.model.b.8
 * JD-Core Version:    0.6.2
 */