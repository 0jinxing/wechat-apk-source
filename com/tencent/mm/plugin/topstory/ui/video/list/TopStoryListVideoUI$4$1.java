package com.tencent.mm.plugin.topstory.ui.video.list;

import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.topstory.ui.video.TopStoryBaseVideoUI;
import com.tencent.mm.plugin.topstory.ui.video.r;
import com.tencent.mm.plugin.topstory.ui.widget.TopStoryCommentFloatDialog.a;

final class TopStoryListVideoUI$4$1
  implements TopStoryCommentFloatDialog.a
{
  TopStoryListVideoUI$4$1(TopStoryListVideoUI.4 param4)
  {
  }

  public final void cHi()
  {
    AppMethodBeat.i(2103);
    this.sHs.sHq.sHm.setVisibility(8);
    this.sHs.sHq.sGz.setVisibility(8);
    AppMethodBeat.o(2103);
  }

  public final void onDismiss()
  {
    AppMethodBeat.i(2102);
    this.sHs.sHq.sEn.cEf();
    AppMethodBeat.o(2102);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.topstory.ui.video.list.TopStoryListVideoUI.4.1
 * JD-Core Version:    0.6.2
 */