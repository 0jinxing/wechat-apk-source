package com.tencent.mm.plugin.brandservice.ui.widget;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.jsapi.video.d.b;
import com.tencent.mm.plugin.appbrand.jsapi.video.l;
import com.tencent.mm.plugin.brandservice.ui.timeline.video.a.d;
import com.tencent.mm.plugin.brandservice.ui.timeline.video.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ap;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.q;

final class MPVideoView$7
  implements d.b
{
  MPVideoView$7(MPVideoView paramMPVideoView)
  {
  }

  public final void H(String paramString, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(14505);
    ab.i("MicroMsg.MPVideoView", "onError errorMsg=%s what=%d extra=%d", new Object[] { paramString, Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
    MPVideoView.m(this.jZz).jVJ.jYA = paramString;
    MPVideoView.m(this.jZz).jVJ.sE(11);
    MPVideoView.s(this.jZz);
    if (MPVideoView.t(this.jZz) != null)
      MPVideoView.t(this.jZz).Gf(paramString);
    MPVideoView.a(this.jZz, 4);
    AppMethodBeat.o(14505);
  }

  public final void aFq()
  {
    AppMethodBeat.i(14506);
    ab.i("MicroMsg.MPVideoView", "onPrepared");
    MPVideoView.u(this.jZz).aFY();
    AppMethodBeat.o(14506);
  }

  public final void aFr()
  {
    AppMethodBeat.i(14507);
    ab.i("MicroMsg.MPVideoView", "onVideoEnded");
    MPVideoView.s(this.jZz);
    MPVideoView.k(this.jZz).setVisibility(8);
    if (MPVideoView.c(this.jZz))
    {
      MPVideoView.e(this.jZz).setVisibility(0);
      if (MPVideoView.d(this.jZz).aFF())
        MPVideoView.d(this.jZz).setVisibility(8);
      if (MPVideoView.v(this.jZz).getVisibility() == 0)
        MPVideoView.v(this.jZz).setVisibility(8);
      if ((!MPVideoView.w(this.jZz)) && (MPVideoView.c(this.jZz)))
        break label221;
      MPVideoView.x(this.jZz).setVisibility(8);
      label135: if (!MPVideoView.A(this.jZz))
        break label268;
      this.jZz.d(0.0D, true);
    }
    while (true)
    {
      MPVideoView.a(this.jZz, 4);
      MPVideoView.m(this.jZz).jVJ.sE(7);
      AppMethodBeat.o(14507);
      return;
      MPVideoViewControlBar localMPVideoViewControlBar = MPVideoView.d(this.jZz);
      if (localMPVideoViewControlBar.hZK != null)
        localMPVideoViewControlBar.hZK.stopTimer();
      MPVideoView.d(this.jZz).setVisibility(0);
      break;
      label221: if (MPVideoView.y(this.jZz) <= 0)
        MPVideoView.z(this.jZz).setText(MPVideoView.sI(MPVideoView.i(this.jZz).getVideoDurationSec()));
      MPVideoView.x(this.jZz).setVisibility(0);
      break label135;
      label268: this.jZz.d(0.0D, false);
      if ((MPVideoView.B(this.jZz)) && ((this.jZz.getContext() instanceof MMActivity)))
        ((MMActivity)this.jZz.getContext()).mController.showTitleView();
    }
  }

  public final void aFs()
  {
    AppMethodBeat.i(14509);
    ab.i("MicroMsg.MPVideoView", "onVideoPause");
    if (MPVideoView.D(this.jZz) == 2)
      MPVideoView.m(this.jZz).jVJ.sE(8);
    MPVideoView.a(this.jZz, 3);
    MPVideoView.s(this.jZz);
    AppMethodBeat.o(14509);
  }

  public final void aFt()
  {
    int i = 3;
    AppMethodBeat.i(14510);
    ab.i("MicroMsg.MPVideoView", "onVideoPlay, isLive:%b", new Object[] { Boolean.valueOf(MPVideoView.w(this.jZz)) });
    if ((MPVideoView.y(this.jZz) <= 0) && (!MPVideoView.w(this.jZz)))
      MPVideoView.z(this.jZz).setText(MPVideoView.sI(MPVideoView.i(this.jZz).getVideoDurationSec()));
    MPVideoView.a(this.jZz, MPVideoView.w(this.jZz));
    if (MPVideoView.b(this.jZz))
      MPVideoView.E(this.jZz);
    MPVideoView.m(this.jZz);
    int j = i;
    switch (MPVideoView.D(this.jZz))
    {
    default:
      j = i;
    case 0:
    case 1:
    case 2:
    case 3:
    case 4:
    }
    while (true)
    {
      MPVideoView.m(this.jZz).jVJ.sE(j);
      MPVideoView.F(this.jZz);
      MPVideoView.a(this.jZz, 2);
      AppMethodBeat.o(14510);
      return;
      j = 4;
      continue;
      j = 8;
      continue;
      j = 9;
      continue;
      j = 10;
    }
  }

  public final void aFu()
  {
    AppMethodBeat.i(14511);
    ab.i("MicroMsg.MPVideoView", "onVideoWaiting");
    MPVideoView.b(this.jZz, true);
    MPVideoView.g(this.jZz);
    AppMethodBeat.o(14511);
  }

  public final void aFv()
  {
    AppMethodBeat.i(14512);
    MPVideoView.b(this.jZz, false);
    MPVideoView.l(this.jZz);
    AppMethodBeat.o(14512);
  }

  public final void de(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(14508);
    ab.i("MicroMsg.MPVideoView", "onGetVideoSize width=%d height=%d", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
    MPVideoView localMPVideoView;
    if (MPVideoView.C(this.jZz) == -1)
    {
      localMPVideoView = this.jZz;
      if (paramInt1 >= paramInt2)
        break label91;
    }
    label91: for (paramInt1 = 0; ; paramInt1 = 90)
    {
      MPVideoView.b(localMPVideoView, paramInt1);
      ab.i("MicroMsg.MPVideoView", "onGetVideoSize adjust direction from AUTO to %s", new Object[] { Integer.valueOf(MPVideoView.C(this.jZz)) });
      AppMethodBeat.o(14508);
      return;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.brandservice.ui.widget.MPVideoView.7
 * JD-Core Version:    0.6.2
 */