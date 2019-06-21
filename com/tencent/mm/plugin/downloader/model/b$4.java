package com.tencent.mm.plugin.downloader.model;

import com.tencent.matrix.trace.core.AppMethodBeat;

final class b$4
  implements Runnable
{
  b$4(b paramb, long paramLong, String paramString, boolean paramBoolean)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(2379);
    k[] arrayOfk = b.big();
    int i = arrayOfk.length;
    for (int j = 0; j < i; j++)
      arrayOfk[j].b(this.kMG, this.bSt, this.kML);
    if (b.bih() != null)
      b.bih().b(this.kMG, this.bSt, this.kML);
    AppMethodBeat.o(2379);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.downloader.model.b.4
 * JD-Core Version:    0.6.2
 */