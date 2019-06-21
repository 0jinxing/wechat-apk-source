package com.tencent.mm.plugin.appbrand.jsapi.video;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

final class AppBrandVideoView$10
  implements l.b
{
  AppBrandVideoView$10(AppBrandVideoView paramAppBrandVideoView)
  {
  }

  public final void aFi()
  {
    AppMethodBeat.i(126452);
    ab.d("MicroMsg.AppBrandVideoView", "onSingleTap");
    if ((AppBrandVideoView.f(this.hZx)) && (AppBrandVideoView.g(this.hZx).getVisibility() != 0))
    {
      AppBrandVideoView.h(this.hZx).aFG();
      if (AppBrandVideoView.i(this.hZx))
        AppBrandVideoView.j(this.hZx);
    }
    AppMethodBeat.o(126452);
  }

  public final void aFj()
  {
    AppMethodBeat.i(126453);
    ab.d("MicroMsg.AppBrandVideoView", "onDoubleTap");
    if (AppBrandVideoView.k(this.hZx))
      if (AppBrandVideoView.b(this.hZx).isPlaying())
      {
        this.hZx.pause();
        AppMethodBeat.o(126453);
      }
    while (true)
    {
      return;
      this.hZx.start();
      AppMethodBeat.o(126453);
    }
  }

  public final void aFk()
  {
    AppMethodBeat.i(126454);
    if (!AppBrandVideoView.l(this.hZx))
      AppMethodBeat.o(126454);
    while (true)
    {
      return;
      AppBrandVideoView.m(this.hZx).setVisibility(0);
      AppBrandVideoView.j(this.hZx);
      AppMethodBeat.o(126454);
    }
  }

  public final void aFl()
  {
    AppMethodBeat.i(126460);
    if (!AppBrandVideoView.s(this.hZx))
      AppMethodBeat.o(126460);
    while (true)
    {
      return;
      AppBrandVideoView.r(this.hZx).setVisibility(8);
      AppBrandVideoView.n(this.hZx);
      AppMethodBeat.o(126460);
    }
  }

  public final void aFm()
  {
    AppMethodBeat.i(126461);
    if (!AppBrandVideoView.s(this.hZx))
      AppMethodBeat.o(126461);
    while (true)
    {
      return;
      AppBrandVideoView.r(this.hZx).setVisibility(8);
      AppBrandVideoView.n(this.hZx);
      AppMethodBeat.o(126461);
    }
  }

  public final boolean aFn()
  {
    AppMethodBeat.i(138539);
    boolean bool = AppBrandVideoView.s(this.hZx);
    AppMethodBeat.o(138539);
    return bool;
  }

  public final boolean aFo()
  {
    AppMethodBeat.i(138540);
    boolean bool = AppBrandVideoView.s(this.hZx);
    AppMethodBeat.o(138540);
    return bool;
  }

  public final boolean aFp()
  {
    AppMethodBeat.i(126464);
    boolean bool = AppBrandVideoView.l(this.hZx);
    AppMethodBeat.o(126464);
    return bool;
  }

  public final void aq(float paramFloat)
  {
    AppMethodBeat.i(126458);
    if (!AppBrandVideoView.s(this.hZx))
      AppMethodBeat.o(126458);
    while (true)
    {
      return;
      ab.d("MicroMsg.AppBrandVideoView", "onAdjustVolume:".concat(String.valueOf(paramFloat)));
      AppBrandVideoView.o(this.hZx).setPercent(paramFloat);
      AppBrandVideoView.p(this.hZx).setText(2131301232);
      AppBrandVideoView.q(this.hZx).setImageResource(2130837784);
      AppBrandVideoView.r(this.hZx).setVisibility(0);
      AppBrandVideoView.j(this.hZx);
      AppMethodBeat.o(126458);
    }
  }

  public final void ar(float paramFloat)
  {
    AppMethodBeat.i(126459);
    if (!AppBrandVideoView.s(this.hZx))
      AppMethodBeat.o(126459);
    while (true)
    {
      return;
      ab.d("MicroMsg.AppBrandVideoView", "onAdjustBrightness:".concat(String.valueOf(paramFloat)));
      AppBrandVideoView.o(this.hZx).setPercent(paramFloat);
      AppBrandVideoView.p(this.hZx).setText(2131301231);
      AppBrandVideoView.q(this.hZx).setImageResource(2130837777);
      AppBrandVideoView.r(this.hZx).setVisibility(0);
      AppBrandVideoView.j(this.hZx);
      AppMethodBeat.o(126459);
    }
  }

  public final int getCurrentPosition()
  {
    AppMethodBeat.i(126457);
    int i = AppBrandVideoView.b(this.hZx).getCurrPosSec();
    AppMethodBeat.o(126457);
    return i;
  }

  public final int i(int paramInt, float paramFloat)
  {
    AppMethodBeat.i(126455);
    if (!AppBrandVideoView.l(this.hZx))
    {
      paramInt = 0;
      AppMethodBeat.o(126455);
    }
    while (true)
    {
      return paramInt;
      ab.i("MicroMsg.AppBrandVideoView", "onDragProgress:" + paramInt + "/" + paramFloat);
      int i = AppBrandVideoView.b(this.hZx).getVideoDurationSec();
      paramInt = b.c(paramFloat, this.hZx.getMeasuredWidth(), getCurrentPosition(), i);
      String str = m.fQ(i * 1000L);
      AppBrandVideoView.m(this.hZx).setText(m.fQ(paramInt * 1000L) + "/" + str);
      AppBrandVideoView.h(this.hZx).seek(paramInt);
      if (AppBrandVideoView.h(this.hZx).aFF())
        AppBrandVideoView.h(this.hZx).aFE();
      AppMethodBeat.o(126455);
    }
  }

  public final void j(int paramInt, float paramFloat)
  {
    AppMethodBeat.i(126456);
    if (!AppBrandVideoView.l(this.hZx))
      AppMethodBeat.o(126456);
    while (true)
    {
      return;
      AppBrandVideoView.m(this.hZx).setVisibility(8);
      AppBrandVideoView.n(this.hZx);
      ab.i("MicroMsg.AppBrandVideoView", "onEndDragProgress: dragPosition=%d currentPositon=%d totalDistanceX=%s", new Object[] { Integer.valueOf(paramInt), Integer.valueOf(AppBrandVideoView.b(this.hZx).getCurrPosSec()), Float.valueOf(paramFloat) });
      this.hZx.d(paramInt, false);
      AppMethodBeat.o(126456);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.video.AppBrandVideoView.10
 * JD-Core Version:    0.6.2
 */