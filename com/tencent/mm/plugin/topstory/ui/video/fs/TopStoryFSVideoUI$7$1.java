package com.tencent.mm.plugin.topstory.ui.video.fs;

import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.topstory.ui.video.r;
import com.tencent.mm.plugin.topstory.ui.widget.TopStoryCommentFloatDialog.a;

final class TopStoryFSVideoUI$7$1
  implements TopStoryCommentFloatDialog.a
{
  TopStoryFSVideoUI$7$1(TopStoryFSVideoUI.7 param7)
  {
  }

  public final void cHi()
  {
    AppMethodBeat.i(1960);
    this.sGH.sGF.sGz.setVisibility(8);
    AppMethodBeat.o(1960);
  }

  public final void onDismiss()
  {
    AppMethodBeat.i(1959);
    this.sGH.sGF.sEn.cEf();
    TopStoryFSVideoUI.b(this.sGH.sGF);
    AppMethodBeat.o(1959);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.topstory.ui.video.fs.TopStoryFSVideoUI.7.1
 * JD-Core Version:    0.6.2
 */