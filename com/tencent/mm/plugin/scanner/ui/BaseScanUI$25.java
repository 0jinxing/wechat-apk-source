package com.tencent.mm.plugin.scanner.ui;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.support.v7.app.ActionBar;
import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class BaseScanUI$25
  implements ValueAnimator.AnimatorUpdateListener
{
  BaseScanUI$25(BaseScanUI paramBaseScanUI)
  {
  }

  public final void onAnimationUpdate(ValueAnimator paramValueAnimator)
  {
    AppMethodBeat.i(138484);
    float f = ((Float)paramValueAnimator.getAnimatedValue()).floatValue();
    BaseScanUI.m(this.qbV).setTranslationY(BaseScanUI.m(this.qbV).getHeight() * f);
    this.qbV.getSupportActionBar().getCustomView().setTranslationY(-f * this.qbV.getSupportActionBar().getHeight());
    AppMethodBeat.o(138484);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.scanner.ui.BaseScanUI.25
 * JD-Core Version:    0.6.2
 */