package com.tencent.mm.plugin.scanner.ui;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.widget.ImageView;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class ScanTranslationCaptureUI$2
  implements ValueAnimator.AnimatorUpdateListener
{
  ScanTranslationCaptureUI$2(ScanTranslationCaptureUI paramScanTranslationCaptureUI)
  {
  }

  public final void onAnimationUpdate(ValueAnimator paramValueAnimator)
  {
    AppMethodBeat.i(81255);
    float f = ((Float)paramValueAnimator.getAnimatedValue()).floatValue();
    if (f <= 0.1F)
      ScanTranslationCaptureUI.r(this.qgh).setAlpha(f * 10.0F);
    while (true)
    {
      ScanTranslationCaptureUI.r(this.qgh).setTranslationY(f * (ScanTranslationCaptureUI.s(this.qgh) - ScanTranslationCaptureUI.r(this.qgh).getHeight()));
      AppMethodBeat.o(81255);
      return;
      if (f >= 0.9F)
        ScanTranslationCaptureUI.r(this.qgh).setAlpha((1.0F - f) * 10.0F);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.scanner.ui.ScanTranslationCaptureUI.2
 * JD-Core Version:    0.6.2
 */