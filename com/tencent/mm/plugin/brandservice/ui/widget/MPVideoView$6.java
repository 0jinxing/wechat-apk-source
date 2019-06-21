package com.tencent.mm.plugin.brandservice.ui.widget;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.jsapi.video.AppBrandDotPercentIndicator;
import com.tencent.mm.plugin.appbrand.jsapi.video.l.b;
import com.tencent.mm.plugin.appbrand.jsapi.video.m;
import com.tencent.mm.plugin.brandservice.ui.timeline.video.a.d;
import com.tencent.mm.sdk.platformtools.ab;

final class MPVideoView$6
  implements l.b
{
  MPVideoView$6(MPVideoView paramMPVideoView)
  {
  }

  public final void aFi()
  {
    AppMethodBeat.i(14492);
    ab.d("MicroMsg.MPVideoView", "onSingleTap");
    if ((MPVideoView.b(this.jZz)) && (!MPVideoView.c(this.jZz)))
      MPVideoView.d(this.jZz).aFG();
    if ((MPVideoView.e(this.jZz).getVisibility() != 0) && (MPVideoView.f(this.jZz)))
      MPVideoView.g(this.jZz);
    AppMethodBeat.o(14492);
  }

  public final void aFj()
  {
    AppMethodBeat.i(14493);
    ab.d("MicroMsg.MPVideoView", "onDoubleTap");
    if (MPVideoView.h(this.jZz))
      if (MPVideoView.i(this.jZz).isPlaying())
      {
        this.jZz.pause();
        AppMethodBeat.o(14493);
      }
    while (true)
    {
      return;
      this.jZz.start();
      AppMethodBeat.o(14493);
    }
  }

  public final void aFk()
  {
    AppMethodBeat.i(14494);
    if (!MPVideoView.j(this.jZz))
      AppMethodBeat.o(14494);
    while (true)
    {
      return;
      MPVideoView.k(this.jZz).setVisibility(0);
      MPVideoView.g(this.jZz);
      AppMethodBeat.o(14494);
    }
  }

  public final void aFl()
  {
    AppMethodBeat.i(14500);
    if (!MPVideoView.r(this.jZz))
      AppMethodBeat.o(14500);
    while (true)
    {
      return;
      MPVideoView.q(this.jZz).setVisibility(8);
      MPVideoView.l(this.jZz);
      AppMethodBeat.o(14500);
    }
  }

  public final void aFm()
  {
    AppMethodBeat.i(14501);
    if (!MPVideoView.r(this.jZz))
      AppMethodBeat.o(14501);
    while (true)
    {
      return;
      MPVideoView.q(this.jZz).setVisibility(8);
      MPVideoView.l(this.jZz);
      AppMethodBeat.o(14501);
    }
  }

  public final boolean aFn()
  {
    AppMethodBeat.i(138509);
    boolean bool = MPVideoView.r(this.jZz);
    AppMethodBeat.o(138509);
    return bool;
  }

  public final boolean aFo()
  {
    AppMethodBeat.i(138510);
    boolean bool = MPVideoView.r(this.jZz);
    AppMethodBeat.o(138510);
    return bool;
  }

  public final boolean aFp()
  {
    AppMethodBeat.i(14504);
    boolean bool = MPVideoView.j(this.jZz);
    AppMethodBeat.o(14504);
    return bool;
  }

  public final void aq(float paramFloat)
  {
    AppMethodBeat.i(14498);
    if (!MPVideoView.r(this.jZz))
      AppMethodBeat.o(14498);
    while (true)
    {
      return;
      ab.d("MicroMsg.MPVideoView", "onAdjustVolume:".concat(String.valueOf(paramFloat)));
      MPVideoView.n(this.jZz).setPercent(paramFloat);
      MPVideoView.o(this.jZz).setText(2131301232);
      MPVideoView.p(this.jZz).setImageResource(2130837784);
      MPVideoView.q(this.jZz).setVisibility(0);
      MPVideoView.g(this.jZz);
      AppMethodBeat.o(14498);
    }
  }

  public final void ar(float paramFloat)
  {
    AppMethodBeat.i(14499);
    if (!MPVideoView.r(this.jZz))
      AppMethodBeat.o(14499);
    while (true)
    {
      return;
      ab.d("MicroMsg.MPVideoView", "onAdjustBrightness:".concat(String.valueOf(paramFloat)));
      MPVideoView.n(this.jZz).setPercent(paramFloat);
      MPVideoView.o(this.jZz).setText(2131301231);
      MPVideoView.p(this.jZz).setImageResource(2130837777);
      MPVideoView.q(this.jZz).setVisibility(0);
      MPVideoView.g(this.jZz);
      AppMethodBeat.o(14499);
    }
  }

  public final int getCurrentPosition()
  {
    AppMethodBeat.i(14497);
    int i = MPVideoView.i(this.jZz).getCurrPosSec();
    AppMethodBeat.o(14497);
    return i;
  }

  public final int i(int paramInt, float paramFloat)
  {
    AppMethodBeat.i(14495);
    if (!MPVideoView.j(this.jZz))
    {
      paramInt = 0;
      AppMethodBeat.o(14495);
    }
    while (true)
    {
      return paramInt;
      ab.i("MicroMsg.MPVideoView", "onDragProgress:" + paramInt + "/" + paramFloat);
      int i = MPVideoView.i(this.jZz).getVideoDurationSec();
      paramInt = com.tencent.mm.plugin.appbrand.jsapi.video.b.c(paramFloat, this.jZz.getMeasuredWidth(), getCurrentPosition(), i);
      String str = m.fQ(i * 1000L);
      MPVideoView.k(this.jZz).setText(m.fQ(paramInt * 1000L) + "/" + str);
      MPVideoView.d(this.jZz).seek(paramInt);
      if (MPVideoView.d(this.jZz).aFF())
        MPVideoView.d(this.jZz).aFE();
      AppMethodBeat.o(14495);
    }
  }

  public final void j(int paramInt, float paramFloat)
  {
    AppMethodBeat.i(14496);
    if (!MPVideoView.j(this.jZz))
      AppMethodBeat.o(14496);
    while (true)
    {
      return;
      MPVideoView.k(this.jZz).setVisibility(8);
      MPVideoView.l(this.jZz);
      ab.i("MicroMsg.MPVideoView", "onEndDragProgress: dragPosition=%d currentPositon=%d totalDistanceX=%s", new Object[] { Integer.valueOf(paramInt), Integer.valueOf(MPVideoView.i(this.jZz).getCurrPosSec()), Float.valueOf(paramFloat) });
      this.jZz.d(paramInt, false);
      MPVideoView.m(this.jZz).jVJ.sE(12);
      AppMethodBeat.o(14496);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.brandservice.ui.widget.MPVideoView.6
 * JD-Core Version:    0.6.2
 */