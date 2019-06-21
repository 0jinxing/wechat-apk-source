package com.tencent.mm.plugin.scanner.ui;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.view.View;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class ScanTranslationCaptureUI$4
  implements ValueAnimator.AnimatorUpdateListener
{
  ScanTranslationCaptureUI$4(ScanTranslationCaptureUI paramScanTranslationCaptureUI)
  {
  }

  public final void onAnimationUpdate(ValueAnimator paramValueAnimator)
  {
    AppMethodBeat.i(81258);
    float f = ((Float)paramValueAnimator.getAnimatedValue()).floatValue();
    int i = ScanTranslationCaptureUI.t(this.qgh).getHeight();
    i = ((RelativeLayout.LayoutParams)ScanTranslationCaptureUI.t(this.qgh).getLayoutParams()).bottomMargin + i;
    ScanTranslationCaptureUI.t(this.qgh).setTranslationY(i * f);
    int j = ScanTranslationCaptureUI.u(this.qgh).getHeight();
    int k = ((RelativeLayout.LayoutParams)ScanTranslationCaptureUI.u(this.qgh).getLayoutParams()).bottomMargin;
    ScanTranslationCaptureUI.u(this.qgh).setTranslationY((k + (j + i)) * f);
    AppMethodBeat.o(81258);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.scanner.ui.ScanTranslationCaptureUI.4
 * JD-Core Version:    0.6.2
 */