package com.tencent.mm.plugin.topstory.ui.video;

import com.tencent.matrix.trace.core.AppMethodBeat;

final class r$a$4
  implements Runnable
{
  r$a$4(r.a parama, String paramString, int paramInt)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(1826);
    if ((this.sFF.sFC.sFt != null) && (this.sFF.sFC.sDo != null))
    {
      com.tencent.mm.plugin.topstory.a.b.a locala = this.sFF.sFC.sDo.cFR().sFp;
      if ((locala != null) && (locala.sAQ == 0L))
        locala.sAQ = (System.currentTimeMillis() - locala.sAE);
      this.sFF.sFC.sFt.ad(this.IN, this.rcK);
      if (this.rcK != 0)
      {
        com.tencent.mm.plugin.websearch.api.a.a.kT(9);
        AppMethodBeat.o(1826);
      }
    }
    while (true)
    {
      return;
      com.tencent.mm.plugin.websearch.api.a.a.kT(27);
      AppMethodBeat.o(1826);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.topstory.ui.video.r.a.4
 * JD-Core Version:    0.6.2
 */