package com.tencent.mm.plugin.sns.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

final class SnsAdNativeLandingPagesScrollView$1
  implements Runnable
{
  SnsAdNativeLandingPagesScrollView$1(SnsAdNativeLandingPagesScrollView paramSnsAdNativeLandingPagesScrollView)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(38613);
    int i = this.rnL.getScrollY();
    ab.w("SnsAdNativeLandingPagesScrollView", "1 middlePos %d, newPos %d", new Object[] { Integer.valueOf(SnsAdNativeLandingPagesScrollView.a(this.rnL)), Integer.valueOf(i) });
    if (i != SnsAdNativeLandingPagesScrollView.a(this.rnL))
    {
      if (SnsAdNativeLandingPagesScrollView.b(this.rnL) != null)
      {
        SnsAdNativeLandingPagesScrollView.b(this.rnL);
        SnsAdNativeLandingPagesScrollView.c(this.rnL);
      }
      SnsAdNativeLandingPagesScrollView.a(this.rnL, System.currentTimeMillis());
    }
    if (SnsAdNativeLandingPagesScrollView.a(this.rnL) - i == 0)
    {
      if (SnsAdNativeLandingPagesScrollView.b(this.rnL) != null)
      {
        SnsAdNativeLandingPagesScrollView.b(this.rnL);
        SnsAdNativeLandingPagesScrollView.a(this.rnL);
        SnsAdNativeLandingPagesScrollView.c(this.rnL);
      }
      SnsAdNativeLandingPagesScrollView.a(this.rnL, SnsAdNativeLandingPagesScrollView.a(this.rnL));
    }
    SnsAdNativeLandingPagesScrollView.b(this.rnL, this.rnL.getScrollY());
    ab.w("SnsAdNativeLandingPagesScrollView", "2 middlePos %d, newPos %d", new Object[] { Integer.valueOf(SnsAdNativeLandingPagesScrollView.a(this.rnL)), Integer.valueOf(i) });
    this.rnL.postDelayed(SnsAdNativeLandingPagesScrollView.d(this.rnL), SnsAdNativeLandingPagesScrollView.e(this.rnL));
    AppMethodBeat.o(38613);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesScrollView.1
 * JD-Core Version:    0.6.2
 */