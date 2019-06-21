package com.tencent.mm.ui.widget.listview;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.view.View;
import android.view.ViewGroup.MarginLayoutParams;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class PullDownListView$5
  implements ValueAnimator.AnimatorUpdateListener
{
  PullDownListView$5(PullDownListView paramPullDownListView)
  {
  }

  public final void onAnimationUpdate(ValueAnimator paramValueAnimator)
  {
    AppMethodBeat.i(112730);
    paramValueAnimator = (Integer)paramValueAnimator.getAnimatedValue();
    ViewGroup.MarginLayoutParams localMarginLayoutParams = (ViewGroup.MarginLayoutParams)PullDownListView.m(this.zRP).getLayoutParams();
    localMarginLayoutParams.topMargin = paramValueAnimator.intValue();
    PullDownListView.m(this.zRP).setLayoutParams(localMarginLayoutParams);
    AppMethodBeat.o(112730);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.widget.listview.PullDownListView.5
 * JD-Core Version:    0.6.2
 */