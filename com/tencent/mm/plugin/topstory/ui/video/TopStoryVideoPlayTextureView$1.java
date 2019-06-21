package com.tencent.mm.plugin.topstory.ui.video;

import com.tencent.matrix.trace.core.AppMethodBeat;

final class TopStoryVideoPlayTextureView$1
  implements Runnable
{
  TopStoryVideoPlayTextureView$1(TopStoryVideoPlayTextureView paramTopStoryVideoPlayTextureView)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(1778);
    synchronized (TopStoryVideoPlayTextureView.a(this.sFm))
    {
      TopStoryVideoPlayTextureView.b(this.sFm);
      AppMethodBeat.o(1778);
      return;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.topstory.ui.video.TopStoryVideoPlayTextureView.1
 * JD-Core Version:    0.6.2
 */