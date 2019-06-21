package com.tencent.mm.plugin.topstory.ui.video.fs;

import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class TopStoryFSVideoUI$8
  implements Runnable
{
  TopStoryFSVideoUI$8(TopStoryFSVideoUI paramTopStoryFSVideoUI)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(1962);
    if (this.sGF.sGz.getVisibility() == 0)
      this.sGF.sGz.setVisibility(8);
    AppMethodBeat.o(1962);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.topstory.ui.video.fs.TopStoryFSVideoUI.8
 * JD-Core Version:    0.6.2
 */