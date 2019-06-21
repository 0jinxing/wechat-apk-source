package com.tencent.mm.plugin.topstory.ui.video;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.protocal.protobuf.chv;

final class TopStoryBaseVideoUI$2
  implements View.OnClickListener
{
  TopStoryBaseVideoUI$2(TopStoryBaseVideoUI paramTopStoryBaseVideoUI)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(1718);
    paramView = this.sEv;
    if (!paramView.sBa.eif);
    for (boolean bool = true; ; bool = false)
    {
      paramView.me(bool);
      paramView.cFO();
      paramView.cFN();
      AppMethodBeat.o(1718);
      return;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.topstory.ui.video.TopStoryBaseVideoUI.2
 * JD-Core Version:    0.6.2
 */