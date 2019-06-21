package com.tencent.mm.plugin.scanner.ui;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.widget.ImageView;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class ScannerFlashSwitcher$1
  implements ValueAnimator.AnimatorUpdateListener
{
  ScannerFlashSwitcher$1(ScannerFlashSwitcher paramScannerFlashSwitcher)
  {
  }

  public final void onAnimationUpdate(ValueAnimator paramValueAnimator)
  {
    AppMethodBeat.i(81319);
    float f = ((Float)paramValueAnimator.getAnimatedValue()).floatValue();
    ScannerFlashSwitcher.a(this.qgp).setAlpha(f);
    AppMethodBeat.o(81319);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.scanner.ui.ScannerFlashSwitcher.1
 * JD-Core Version:    0.6.2
 */