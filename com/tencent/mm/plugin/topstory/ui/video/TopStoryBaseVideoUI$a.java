package com.tencent.mm.plugin.topstory.ui.video;

import android.support.v7.widget.RecyclerView.v;
import android.support.v7.widget.y;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

final class TopStoryBaseVideoUI$a extends y
{
  private TopStoryBaseVideoUI$a(TopStoryBaseVideoUI paramTopStoryBaseVideoUI)
  {
  }

  public final void E(RecyclerView.v paramv)
  {
    AppMethodBeat.i(1729);
    super.E(paramv);
    this.sEv.cGG();
    this.sEv.sEa.b(this.sEv);
    ab.i("MicroMsg.TopStory.TopStoryBaseVideoUI", "onRemoveFinished %d", new Object[] { Integer.valueOf(paramv.kj()) });
    AppMethodBeat.o(1729);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.topstory.ui.video.TopStoryBaseVideoUI.a
 * JD-Core Version:    0.6.2
 */