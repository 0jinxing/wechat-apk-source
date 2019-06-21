package com.tencent.mm.plugin.appbrand.game.d;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class b$1
  implements View.OnClickListener
{
  b$1(b paramb)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(130155);
    paramView = this.hrE;
    ValueAnimator localValueAnimator;
    if (paramView.hrA)
    {
      localValueAnimator = ValueAnimator.ofFloat(new float[] { 0.0F, 1.0F });
      localValueAnimator.addUpdateListener(new b.3(paramView));
      localValueAnimator.start();
      paramView.hrA = false;
      AppMethodBeat.o(130155);
    }
    while (true)
    {
      return;
      paramView.setTranslationY(paramView.getDisplayHeight());
      paramView.setVisibility(0);
      localValueAnimator = ValueAnimator.ofFloat(new float[] { 1.0F, 0.0F });
      localValueAnimator.addUpdateListener(new b.4(paramView));
      localValueAnimator.start();
      paramView.hrA = true;
      AppMethodBeat.o(130155);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.game.d.b.1
 * JD-Core Version:    0.6.2
 */