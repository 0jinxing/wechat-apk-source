package com.tencent.mm.plugin.topstory.ui.video;

import android.support.v7.widget.RecyclerView.a;
import android.support.v7.widget.RecyclerView.b;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.List;

final class TopStoryBaseVideoUI$6
  implements Runnable
{
  TopStoryBaseVideoUI$6(TopStoryBaseVideoUI paramTopStoryBaseVideoUI, List paramList, boolean paramBoolean)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(1724);
    if (this.sEv.sEt)
    {
      this.sEv.sEd.j(this.sEx, this.sEy);
      this.sEv.sDZ.aop.notifyChanged();
      AppMethodBeat.o(1724);
    }
    while (true)
    {
      return;
      this.sEv.sDZ.j(this.sEx, this.sEy);
      this.sEv.sEd.aop.notifyChanged();
      AppMethodBeat.o(1724);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.topstory.ui.video.TopStoryBaseVideoUI.6
 * JD-Core Version:    0.6.2
 */