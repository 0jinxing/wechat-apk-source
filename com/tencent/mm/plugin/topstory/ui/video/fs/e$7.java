package com.tencent.mm.plugin.topstory.ui.video.fs;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.topstory.ui.video.b;
import com.tencent.mm.plugin.topstory.ui.video.o;
import com.tencent.mm.plugin.topstory.ui.video.r;
import com.tencent.mm.sdk.platformtools.ab;

final class e$7
  implements View.OnClickListener
{
  e$7(e parame)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(1892);
    if (this.sFU.getFSVideoUIComponent().cFV().sFw)
      if ((!(e.e(this.sFU) instanceof k)) && (e.e(this.sFU).getVideoTotalTime() - e.e(this.sFU).getmPosition() < 2))
      {
        ab.i("MicroMsg.TopStory.TopStoryFSVideoContainer", "cannot change play status in last 2 seconds");
        AppMethodBeat.o(1892);
      }
    while (true)
    {
      return;
      this.sFU.getFSVideoUIComponent().cFR().f(e.T(this.sFU));
      if (this.sFU.getFSVideoUIComponent().cFV().cGZ())
      {
        this.sFU.getFSVideoUIComponent().cFV().cpN();
        e.e(this.sFU).cHd();
      }
      while (true)
      {
        this.sFU.cGp();
        AppMethodBeat.o(1892);
        break;
        this.sFU.getFSVideoUIComponent().cFV().cEf();
        e.e(this.sFU).aFE();
      }
      ab.i("MicroMsg.TopStory.TopStoryFSVideoContainer", "no video play now");
      AppMethodBeat.o(1892);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.topstory.ui.video.fs.e.7
 * JD-Core Version:    0.6.2
 */