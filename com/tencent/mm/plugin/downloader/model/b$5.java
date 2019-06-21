package com.tencent.mm.plugin.downloader.model;

import com.tencent.matrix.trace.core.AppMethodBeat;

final class b$5
  implements Runnable
{
  b$5(b paramb, long paramLong, int paramInt, boolean paramBoolean)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(2380);
    k[] arrayOfk = b.big();
    int i = arrayOfk.length;
    for (int j = 0; j < i; j++)
      arrayOfk[j].b(this.kMG, this.crd, this.kML);
    if (b.bih() != null)
      b.bih().b(this.kMG, this.crd, this.kML);
    AppMethodBeat.o(2380);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.downloader.model.b.5
 * JD-Core Version:    0.6.2
 */