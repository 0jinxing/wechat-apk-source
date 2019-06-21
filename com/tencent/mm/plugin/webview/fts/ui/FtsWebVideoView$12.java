package com.tencent.mm.plugin.webview.fts.ui;

import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.websearch.ui.WebSearchDotPercentIndicator;
import com.tencent.mm.plugin.websearch.ui.WebSearchWebVideoViewControlBar;
import com.tencent.mm.plugin.webview.fts.c.c;
import com.tencent.mm.plugin.webview.fts.c.d;
import com.tencent.mm.sdk.platformtools.ab;

final class FtsWebVideoView$12
  implements a.b
{
  FtsWebVideoView$12(FtsWebVideoView paramFtsWebVideoView)
  {
  }

  public final void aFi()
  {
    AppMethodBeat.i(5837);
    ab.d("MicroMsg.FtsWebVideoView", "onSingleTap");
    if (FtsWebVideoView.e(this.uhl))
      FtsWebVideoView.c(this.uhl).nG(FtsWebVideoView.f(this.uhl));
    AppMethodBeat.o(5837);
  }

  public final void aFj()
  {
    AppMethodBeat.i(5838);
    ab.d("MicroMsg.FtsWebVideoView", "onDoubleTap");
    AppMethodBeat.o(5838);
  }

  public final void aFk()
  {
    AppMethodBeat.i(5839);
    if (FtsWebVideoView.d(this.uhl).isLive())
    {
      ab.i("MicroMsg.FtsWebVideoView", "onStartDragProgress isLive: no seek");
      AppMethodBeat.o(5839);
    }
    while (true)
    {
      return;
      FtsWebVideoView.g(this.uhl).setVisibility(0);
      FtsWebVideoView.c(this.uhl).cHe();
      AppMethodBeat.o(5839);
    }
  }

  public final void aFl()
  {
    AppMethodBeat.i(5846);
    FtsWebVideoView.m(this.uhl).setVisibility(8);
    AppMethodBeat.o(5846);
  }

  public final void aFm()
  {
    AppMethodBeat.i(5847);
    FtsWebVideoView.m(this.uhl).setVisibility(8);
    AppMethodBeat.o(5847);
  }

  public final void aq(float paramFloat)
  {
    AppMethodBeat.i(5844);
    ab.d("MicroMsg.FtsWebVideoView", "onAdjustVolume:".concat(String.valueOf(paramFloat)));
    FtsWebVideoView.j(this.uhl).setPercent(paramFloat);
    FtsWebVideoView.k(this.uhl).setText(2131300158);
    FtsWebVideoView.l(this.uhl).setImageResource(2131231355);
    FtsWebVideoView.m(this.uhl).setVisibility(0);
    AppMethodBeat.o(5844);
  }

  public final void ar(float paramFloat)
  {
    AppMethodBeat.i(5845);
    ab.d("MicroMsg.FtsWebVideoView", "onAdjustBrightness:".concat(String.valueOf(paramFloat)));
    FtsWebVideoView.j(this.uhl).setPercent(paramFloat);
    FtsWebVideoView.k(this.uhl).setText(2131300155);
    FtsWebVideoView.l(this.uhl).setImageResource(2131231347);
    FtsWebVideoView.m(this.uhl).setVisibility(0);
    AppMethodBeat.o(5845);
  }

  public final boolean cGl()
  {
    AppMethodBeat.i(5842);
    boolean bool;
    if (FtsWebVideoView.i(this.uhl))
    {
      bool = false;
      AppMethodBeat.o(5842);
    }
    while (true)
    {
      return bool;
      bool = true;
      AppMethodBeat.o(5842);
    }
  }

  public final int getCurrentPosition()
  {
    AppMethodBeat.i(5843);
    int i = FtsWebVideoView.d(this.uhl).getCurrPosSec();
    AppMethodBeat.o(5843);
    return i;
  }

  public final int i(int paramInt, float paramFloat)
  {
    int i = 0;
    int j = 0;
    AppMethodBeat.i(5840);
    if (FtsWebVideoView.d(this.uhl).isLive())
    {
      ab.i("MicroMsg.FtsWebVideoView", "onDragProgress isLive: no seek");
      AppMethodBeat.o(5840);
      paramInt = j;
      return paramInt;
    }
    ab.i("MicroMsg.FtsWebVideoView", "onDragProgress:" + paramInt + "/" + paramFloat);
    paramFloat /= this.uhl.getMeasuredWidth();
    j = FtsWebVideoView.d(this.uhl).getVideoDurationSec();
    paramInt = getCurrentPosition();
    paramInt = (int)(paramFloat * j) + paramInt;
    if (paramInt < 0)
      paramInt = i;
    while (true)
    {
      String str = c.fQ(j * 1000L);
      FtsWebVideoView.g(this.uhl).setText(c.fQ(paramInt * 1000L) + "/" + str);
      AppMethodBeat.o(5840);
      break;
      if (paramInt > j)
        paramInt = j;
    }
  }

  public final void j(int paramInt, float paramFloat)
  {
    AppMethodBeat.i(5841);
    FtsWebVideoView.c(this.uhl).cHf();
    FtsWebVideoView.g(this.uhl).setVisibility(8);
    ab.i("MicroMsg.FtsWebVideoView", "onEndDragProgress: dragPosition=%d currentPositon=%d totalDistanceX=%s", new Object[] { Integer.valueOf(paramInt), Integer.valueOf(FtsWebVideoView.d(this.uhl).getCurrPosSec()), Float.valueOf(paramFloat) });
    if (FtsWebVideoView.d(this.uhl).isLive())
    {
      ab.i("MicroMsg.FtsWebVideoView", "onEndDragProgress isLive: no seek");
      AppMethodBeat.o(5841);
    }
    while (true)
    {
      return;
      this.uhl.ar(paramInt, false);
      FtsWebVideoView.c(this.uhl).cHf();
      if (FtsWebVideoView.h(this.uhl) != null)
        FtsWebVideoView.h(this.uhl).cWB();
      AppMethodBeat.o(5841);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.fts.ui.FtsWebVideoView.12
 * JD-Core Version:    0.6.2
 */