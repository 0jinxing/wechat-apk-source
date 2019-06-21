package com.tencent.mm.plugin.webview.ui.tools;

import android.support.v4.view.s;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class LogoWebViewWrapper$c
  implements Runnable
{
  private final long duration;
  private long startTime;
  private final Interpolator urE;
  private final int urF;
  private final int urG;
  private boolean urH;
  private int urI;

  public LogoWebViewWrapper$c(LogoWebViewWrapper paramLogoWebViewWrapper, int paramInt1, int paramInt2, long paramLong)
  {
    AppMethodBeat.i(7392);
    this.urH = true;
    this.startTime = -1L;
    this.urI = -1;
    this.urG = paramInt1;
    this.urF = paramInt2;
    if (LogoWebViewWrapper.b(paramLogoWebViewWrapper));
    for (paramLogoWebViewWrapper = new AccelerateInterpolator(); ; paramLogoWebViewWrapper = new DecelerateInterpolator())
    {
      this.urE = paramLogoWebViewWrapper;
      this.duration = paramLong;
      AppMethodBeat.o(7392);
      return;
    }
  }

  public final void run()
  {
    AppMethodBeat.i(7393);
    if (this.startTime == -1L)
      this.startTime = System.currentTimeMillis();
    while (true)
    {
      if ((this.urH) && (this.urF != this.urI))
        s.b(this.urD, this);
      AppMethodBeat.o(7393);
      return;
      long l = 500L;
      if (this.duration > 0L)
        l = Math.max(Math.min((System.currentTimeMillis() - this.startTime) * 1000L / this.duration, 1000L), 0L);
      float f = this.urG - this.urF;
      int i = Math.round(this.urE.getInterpolation((float)l / 1000.0F) * f);
      this.urI = (this.urG - i);
      this.urD.Ji(this.urI);
      if (LogoWebViewWrapper.c(this.urD) != null)
        LogoWebViewWrapper.c(this.urD).as(this.urI, false);
    }
  }

  public final void stop()
  {
    AppMethodBeat.i(7394);
    this.urH = false;
    this.urD.removeCallbacks(this);
    AppMethodBeat.o(7394);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.ui.tools.LogoWebViewWrapper.c
 * JD-Core Version:    0.6.2
 */