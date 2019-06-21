package com.tencent.mm.plugin.downloader.model;

import com.tencent.matrix.trace.core.AppMethodBeat;

final class b$2
  implements Runnable
{
  b$2(b paramb, long paramLong, String paramString)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(2377);
    k[] arrayOfk = b.big();
    int i = arrayOfk.length;
    for (int j = 0; j < i; j++)
      arrayOfk[j].i(this.kMG, this.bSt);
    if (b.bih() != null)
      b.bih().i(this.kMG, this.bSt);
    AppMethodBeat.o(2377);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.downloader.model.b.2
 * JD-Core Version:    0.6.2
 */