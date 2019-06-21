package com.tencent.mm.plugin.webview.ui.tools.fts;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.view.View;
import android.widget.RelativeLayout.LayoutParams;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class a$4
  implements ValueAnimator.AnimatorUpdateListener
{
  a$4(a parama)
  {
  }

  public final void onAnimationUpdate(ValueAnimator paramValueAnimator)
  {
    AppMethodBeat.i(8564);
    float f = ((Float)paramValueAnimator.getAnimatedValue()).floatValue();
    this.uCE.uCn.setAlpha(f);
    this.uCE.uCn.setX(this.uCE.uCw[1][1]);
    this.uCE.uCn.setY(this.uCE.uCw[0][1]);
    this.uCE.uCn.setPadding(this.uCE.uCm, 0, 0, 0);
    paramValueAnimator = (RelativeLayout.LayoutParams)this.uCE.uCn.getLayoutParams();
    if (paramValueAnimator.leftMargin != 0)
    {
      paramValueAnimator.leftMargin = 0;
      paramValueAnimator.rightMargin = 0;
      paramValueAnimator.width = ((int)this.uCE.uCw[2][0] + this.uCE.uCj * 2);
      this.uCE.uCn.setLayoutParams(paramValueAnimator);
    }
    AppMethodBeat.o(8564);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.ui.tools.fts.a.4
 * JD-Core Version:    0.6.2
 */