package com.tencent.mm.plugin.topstory.ui.video.list;

import android.app.ProgressDialog;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.topstory.ui.video.TopStoryBaseVideoUI;

final class TopStoryListVideoUI$9
  implements Runnable
{
  TopStoryListVideoUI$9(TopStoryListVideoUI paramTopStoryListVideoUI)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(2109);
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
      AppMethodBeat.o(2109);
      return;
      TopStoryListVideoUI.c(this.sHq).setVisibility(4);
      TopStoryListVideoUI.d(this.sHq).setVisibility(4);
      TopStoryListVideoUI.e(this.sHq).a(0, 3, null);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.topstory.ui.video.list.TopStoryListVideoUI.9
 * JD-Core Version:    0.6.2
 */