package com.tencent.mm.plugin.topstory.ui.video.list;

import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class TopStoryListVideoUI$3
  implements Runnable
{
  TopStoryListVideoUI$3(TopStoryListVideoUI paramTopStoryListVideoUI)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(2101);
    if (this.sHq.sHm.getVisibility() == 0)
      this.sHq.sHm.setVisibility(8);
    AppMethodBeat.o(2101);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.topstory.ui.video.list.TopStoryListVideoUI.3
 * JD-Core Version:    0.6.2
 */