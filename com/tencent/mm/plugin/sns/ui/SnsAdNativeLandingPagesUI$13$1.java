package com.tencent.mm.plugin.sns.ui;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnPreDrawListener;
import android.widget.FrameLayout;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.al;

final class SnsAdNativeLandingPagesUI$13$1
  implements ViewTreeObserver.OnPreDrawListener
{
  SnsAdNativeLandingPagesUI$13$1(SnsAdNativeLandingPagesUI.13 param13, RecyclerView paramRecyclerView)
  {
  }

  public final boolean onPreDraw()
  {
    AppMethodBeat.i(38642);
    ab.i("MicroMsg.SnsAdNativeLandingPagesUI", "onPreDraw %d, %d", new Object[] { Integer.valueOf(SnsAdNativeLandingPagesUI.b(this.roQ.roM).getHeight()), Integer.valueOf(SnsAdNativeLandingPagesUI.c(this.roQ.roM)) });
    if (SnsAdNativeLandingPagesUI.d(this.roQ.roM))
      al.n(new SnsAdNativeLandingPagesUI.13.1.1(this), 50L);
    while (true)
    {
      this.jbi.getViewTreeObserver().removeOnPreDrawListener(this);
      AppMethodBeat.o(38642);
      return false;
      SnsAdNativeLandingPagesUI.h(this.roQ.roM).setVisibility(0);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI.13.1
 * JD-Core Version:    0.6.2
 */