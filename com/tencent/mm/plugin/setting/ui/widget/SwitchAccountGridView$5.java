package com.tencent.mm.plugin.setting.ui.widget;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.List;

public final class SwitchAccountGridView$5
  implements ValueAnimator.AnimatorUpdateListener
{
  public SwitchAccountGridView$5(SwitchAccountGridView paramSwitchAccountGridView, int paramInt)
  {
  }

  public final void onAnimationUpdate(ValueAnimator paramValueAnimator)
  {
    AppMethodBeat.i(127706);
    float f = ((Float)paramValueAnimator.getAnimatedValue()).floatValue();
    ab.i("MicroMsg.SwitchAccountGridView", "value %f", new Object[] { Float.valueOf(f) });
    int i = 0;
    if (i < this.qrn)
      if (((String)SwitchAccountGridView.e(this.qrm).get(i)).equals(SwitchAccountGridView.d(this.qrm)))
      {
        ((View)SwitchAccountGridView.f(this.qrm).get(i)).setTranslationX((this.qrm.getWidth() / 2 - ((View)SwitchAccountGridView.f(this.qrm).get(i)).getWidth() * i - ((View)SwitchAccountGridView.f(this.qrm).get(i)).getWidth() / 2) * f);
        AppMethodBeat.o(127706);
      }
    while (true)
    {
      return;
      i++;
      break;
      AppMethodBeat.o(127706);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.setting.ui.widget.SwitchAccountGridView.5
 * JD-Core Version:    0.6.2
 */