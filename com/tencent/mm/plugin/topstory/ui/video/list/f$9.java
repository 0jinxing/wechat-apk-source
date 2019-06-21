package com.tencent.mm.plugin.topstory.ui.video.list;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.topstory.ui.video.o;
import com.tencent.mm.plugin.topstory.ui.video.r;
import com.tencent.mm.sdk.platformtools.ab;

final class f$9
  implements View.OnClickListener
{
  f$9(f paramf)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(2052);
    if (this.sGV.getListVideoUIComponent().cFV().sFw)
      if (f.g(this.sGV).getVideoTotalTime() - f.g(this.sGV).getmPosition() < 2)
      {
        ab.i("MicroMsg.TopStory.TopStoryListVideoContainer", "cannot change play status in last 2 seconds");
        AppMethodBeat.o(2052);
      }
    while (true)
    {
      return;
      this.sGV.getListVideoUIComponent().cFR().f(f.M(this.sGV));
      if (this.sGV.getListVideoUIComponent().cFV().cGZ())
      {
        this.sGV.getListVideoUIComponent().cFV().cpN();
        f.g(this.sGV).cHd();
      }
      while (true)
      {
        this.sGV.cGp();
        AppMethodBeat.o(2052);
        break;
        this.sGV.getListVideoUIComponent().cFV().cEf();
        f.g(this.sGV).aFE();
      }
      ab.i("MicroMsg.TopStory.TopStoryListVideoContainer", "no video play now");
      AppMethodBeat.o(2052);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.topstory.ui.video.list.f.9
 * JD-Core Version:    0.6.2
 */