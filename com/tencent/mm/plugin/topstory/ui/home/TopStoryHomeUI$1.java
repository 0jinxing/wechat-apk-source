package com.tencent.mm.plugin.topstory.ui.home;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

final class TopStoryHomeUI$1
  implements Runnable
{
  TopStoryHomeUI$1(TopStoryHomeUI paramTopStoryHomeUI)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(1554);
    ab.i("MicroMsg.TopStory.TopStoryHomeUI", " finish");
    TopStoryHomeUI.a(this.sBG);
    AppMethodBeat.o(1554);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.topstory.ui.home.TopStoryHomeUI.1
 * JD-Core Version:    0.6.2
 */