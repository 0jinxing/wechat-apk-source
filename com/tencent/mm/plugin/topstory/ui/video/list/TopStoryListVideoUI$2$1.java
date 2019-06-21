package com.tencent.mm.plugin.topstory.ui.video.list;

import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.topstory.ui.video.TopStoryBaseVideoUI;
import com.tencent.mm.plugin.topstory.ui.video.r;
import com.tencent.mm.plugin.topstory.ui.widget.TopStoryCommentFloatDialog.a;

final class TopStoryListVideoUI$2$1
  implements TopStoryCommentFloatDialog.a
{
  TopStoryListVideoUI$2$1(TopStoryListVideoUI.2 param2)
  {
  }

  public final void cHi()
  {
    AppMethodBeat.i(2099);
    this.sHr.sHq.sHm.setVisibility(8);
    this.sHr.sHq.sGz.setVisibility(8);
    AppMethodBeat.o(2099);
  }

  public final void onDismiss()
  {
    AppMethodBeat.i(2098);
    this.sHr.sHq.sEn.cEf();
    AppMethodBeat.o(2098);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.topstory.ui.video.list.TopStoryListVideoUI.2.1
 * JD-Core Version:    0.6.2
 */