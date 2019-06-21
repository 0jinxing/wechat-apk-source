package com.tencent.mm.plugin.topstory.ui.video;

import com.tencent.matrix.trace.core.AppMethodBeat;

final class r$a$3
  implements Runnable
{
  r$a$3(r.a parama, String paramString, int paramInt1, int paramInt2)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(1825);
    if (this.sFF.sFC.sFt != null)
      this.sFF.sFC.sFt.h(this.IN, this.fzv, this.fFn);
    if (r.ab(this.fzv * 100 / this.fFn, this.fzv))
      this.sFF.cHa();
    AppMethodBeat.o(1825);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.topstory.ui.video.r.a.3
 * JD-Core Version:    0.6.2
 */