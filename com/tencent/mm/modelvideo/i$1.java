package com.tencent.mm.modelvideo;

import com.tencent.matrix.trace.core.AppMethodBeat;

final class i$1
  implements Runnable
{
  i$1(i parami)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(50715);
    if (this.fWc.fWa != null)
      this.fWc.fWa.stop();
    this.fWc.fWa = null;
    AppMethodBeat.o(50715);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.modelvideo.i.1
 * JD-Core Version:    0.6.2
 */