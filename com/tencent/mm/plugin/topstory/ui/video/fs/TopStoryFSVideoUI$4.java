package com.tencent.mm.plugin.topstory.ui.video.fs;

import android.app.ProgressDialog;
import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class TopStoryFSVideoUI$4
  implements Runnable
{
  TopStoryFSVideoUI$4(TopStoryFSVideoUI paramTopStoryFSVideoUI, String paramString)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(1955);
    TopStoryFSVideoUI.e(this.sGF).setVisibility(4);
    TopStoryFSVideoUI.f(this.sGF).setVisibility(4);
    if (TopStoryFSVideoUI.g(this.sGF) != null)
    {
      TopStoryFSVideoUI.g(this.sGF).dismiss();
      TopStoryFSVideoUI.h(this.sGF);
    }
    TopStoryFSVideoUI.a(this.sGF, this.bOC);
    AppMethodBeat.o(1955);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.topstory.ui.video.fs.TopStoryFSVideoUI.4
 * JD-Core Version:    0.6.2
 */