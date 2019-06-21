package com.tencent.mm.plugin.webview.ui.tools.fts;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.view.View;
import android.widget.RelativeLayout.LayoutParams;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

final class a$3
  implements ValueAnimator.AnimatorUpdateListener
{
  a$3(a parama)
  {
  }

  public final void onAnimationUpdate(ValueAnimator paramValueAnimator)
  {
    AppMethodBeat.i(8563);
    float f1 = ((Float)paramValueAnimator.getAnimatedValue()).floatValue();
    float f2 = this.uCE.uCw[1][1];
    float f3 = this.uCE.uCw[1][0];
    float f4 = this.uCE.uCw[1][0];
    float f5 = this.uCE.uCw[0][1];
    float f6 = this.uCE.uCw[0][0];
    float f7 = this.uCE.uCw[0][0];
    this.uCE.uCn.setX((f2 - f3) * f1 + f4);
    this.uCE.uCn.setY((f5 - f6) * f1 + f7);
    this.uCE.uCn.setPadding((int)((this.uCE.uCm - this.uCE.uCl) * f1 + this.uCE.uCl), 0, 0, 0);
    ab.v("MicroMsg.FTS.SosAnimatorBaseController", "searchBarView.paddingLeft %d", new Object[] { Integer.valueOf(this.uCE.uCn.getPaddingLeft()) });
    paramValueAnimator = (RelativeLayout.LayoutParams)this.uCE.uCn.getLayoutParams();
    int i = (int)((1.0F - f1) * this.uCE.uCj);
    paramValueAnimator.leftMargin = i;
    paramValueAnimator.rightMargin = i;
    int j = (int)this.uCE.uCw[2][0];
    paramValueAnimator.width = ((this.uCE.uCj - i) * 2 + j);
    this.uCE.uCn.setLayoutParams(paramValueAnimator);
    AppMethodBeat.o(8563);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.ui.tools.fts.a.3
 * JD-Core Version:    0.6.2
 */