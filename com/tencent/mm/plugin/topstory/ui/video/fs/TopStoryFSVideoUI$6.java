package com.tencent.mm.plugin.topstory.ui.video.fs;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.topstory.ui.video.e;

final class TopStoryFSVideoUI$6
  implements Runnable
{
  TopStoryFSVideoUI$6(TopStoryFSVideoUI paramTopStoryFSVideoUI)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(1958);
    i locali = this.sGF.sGs;
    int i = locali.getFootersCount();
    int j = locali.getItemCount();
    locali.cGm();
    locali.au(j - i, i);
    AppMethodBeat.o(1958);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.topstory.ui.video.fs.TopStoryFSVideoUI.6
 * JD-Core Version:    0.6.2
 */