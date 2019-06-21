package com.tencent.mm.plugin.setting.ui.widget;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.List;

public final class SwitchAccountGridView$4
  implements ValueAnimator.AnimatorUpdateListener
{
  public SwitchAccountGridView$4(SwitchAccountGridView paramSwitchAccountGridView, int paramInt)
  {
  }

  public final void onAnimationUpdate(ValueAnimator paramValueAnimator)
  {
    int i = 0;
    AppMethodBeat.i(127705);
    float f = ((Float)paramValueAnimator.getAnimatedValue()).floatValue();
    ab.i("MicroMsg.SwitchAccountGridView", "value %f", new Object[] { Float.valueOf(f) });
    while (i < this.qrn)
    {
      if (!((String)SwitchAccountGridView.e(this.qrm).get(i)).equals(SwitchAccountGridView.d(this.qrm)))
        ((View)SwitchAccountGridView.f(this.qrm).get(i)).setAlpha(1.0F - f);
      i++;
    }
    if (this.qrn < this.qrm.getChildCount())
      ((View)SwitchAccountGridView.f(this.qrm).get(this.qrn)).setTranslationX(((View)SwitchAccountGridView.f(this.qrm).get(this.qrn)).getWidth() * f);
    AppMethodBeat.o(127705);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.setting.ui.widget.SwitchAccountGridView.4
 * JD-Core Version:    0.6.2
 */