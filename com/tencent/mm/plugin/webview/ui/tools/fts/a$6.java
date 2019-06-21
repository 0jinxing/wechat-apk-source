package com.tencent.mm.plugin.webview.ui.tools.fts;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.view.View;
import android.widget.RelativeLayout.LayoutParams;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class a$6
  implements ValueAnimator.AnimatorUpdateListener
{
  a$6(a parama)
  {
  }

  public final void onAnimationUpdate(ValueAnimator paramValueAnimator)
  {
    AppMethodBeat.i(8566);
    float f = ((Float)paramValueAnimator.getAnimatedValue()).floatValue();
    if (Math.abs(f - 1.0F) <= 0.001D)
    {
      this.uCE.uCn.setX(this.uCE.uCw[1][0]);
      this.uCE.uCn.setY(this.uCE.uCw[0][0]);
      this.uCE.uCn.setPadding(0, 0, 0, 0);
      paramValueAnimator = (RelativeLayout.LayoutParams)this.uCE.uCn.getLayoutParams();
      paramValueAnimator.leftMargin = this.uCE.uCj;
      paramValueAnimator.rightMargin = this.uCE.uCj;
      paramValueAnimator.width = ((int)this.uCE.uCw[2][0]);
      this.uCE.uCn.setLayoutParams(paramValueAnimator);
      this.uCE.uCn.setAlpha(1.0F);
      AppMethodBeat.o(8566);
    }
    while (true)
    {
      return;
      this.uCE.uCn.setAlpha(1.0F - f);
      AppMethodBeat.o(8566);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.ui.tools.fts.a.6
 * JD-Core Version:    0.6.2
 */