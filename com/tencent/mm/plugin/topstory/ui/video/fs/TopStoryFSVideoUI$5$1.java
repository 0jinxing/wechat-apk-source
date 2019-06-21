package com.tencent.mm.plugin.topstory.ui.video.fs;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.topstory.a.c.i;
import com.tencent.mm.plugin.topstory.ui.video.e;
import com.tencent.mm.plugin.topstory.ui.video.h;

final class TopStoryFSVideoUI$5$1
  implements Runnable
{
  TopStoryFSVideoUI$5$1(TopStoryFSVideoUI.5 param5, i parami)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(1956);
    h localh = this.sGG.sGF.cGa().b(this.sEz.sAX);
    if ((localh != null) && ((localh instanceof g)))
      ((f)localh.cGA().getControlBar()).h(this.sEz.sAX);
    AppMethodBeat.o(1956);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.topstory.ui.video.fs.TopStoryFSVideoUI.5.1
 * JD-Core Version:    0.6.2
 */