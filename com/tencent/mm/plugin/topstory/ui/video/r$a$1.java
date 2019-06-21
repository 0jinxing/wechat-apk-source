package com.tencent.mm.plugin.topstory.ui.video;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.topstory.a.b.a;
import com.tencent.mm.sdk.platformtools.ab;

final class r$a$1
  implements Runnable
{
  r$a$1(r.a parama, int paramInt1, int paramInt2, String paramString)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(1823);
    if ((this.sFF.sFC.sFt != null) && (this.sFF.sFC.sDo != null))
    {
      a locala = this.sFF.sFC.sDo.cFR().sFp;
      if ((locala != null) && (locala.sAR == 0L))
      {
        locala.sAR = (System.currentTimeMillis() - locala.sAE);
        locala.sAS = this.fzv;
        locala.sAT = (this.fzv + this.fzw);
        ab.i("MicroMsg.TopStory.TopStoryVideoViewMgr", "onMoovReady %d %d %d", new Object[] { Long.valueOf(locala.sAR), Integer.valueOf(this.fzv), Integer.valueOf(this.fzw) });
      }
      this.sFF.sFC.sFt.ml(this.fzv);
    }
    AppMethodBeat.o(1823);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.topstory.ui.video.r.a.1
 * JD-Core Version:    0.6.2
 */