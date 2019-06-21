package com.tencent.mm.plugin.topstory.ui.video.list;

import android.app.ProgressDialog;
import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.topstory.ui.video.TopStoryBaseVideoUI;

final class TopStoryListVideoUI$10
  implements Runnable
{
  TopStoryListVideoUI$10(TopStoryListVideoUI paramTopStoryListVideoUI, String paramString)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(2110);
    if (!this.sHq.sEt)
    {
      TopStoryListVideoUI.a(this.sHq).setVisibility(4);
      TopStoryListVideoUI.b(this.sHq).setVisibility(4);
    }
    while (true)
    {
      if (TopStoryListVideoUI.f(this.sHq) != null)
      {
        TopStoryListVideoUI.f(this.sHq).dismiss();
        TopStoryListVideoUI.g(this.sHq);
      }
      TopStoryListVideoUI.a(this.sHq, this.bOC);
      AppMethodBeat.o(2110);
      return;
      TopStoryListVideoUI.c(this.sHq).setVisibility(4);
      TopStoryListVideoUI.d(this.sHq).setVisibility(4);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.topstory.ui.video.list.TopStoryListVideoUI.10
 * JD-Core Version:    0.6.2
 */