package com.tencent.mm.ui.widget.listview;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class PullDownListView$3 extends AnimatorListenerAdapter
{
  PullDownListView$3(PullDownListView paramPullDownListView)
  {
  }

  public final void onAnimationCancel(Animator paramAnimator)
  {
    AppMethodBeat.i(112727);
    if (PullDownListView.b(this.zRP) != null)
      PullDownListView.b(this.zRP).setVisibility(8);
    AppMethodBeat.o(112727);
  }

  public final void onAnimationEnd(Animator paramAnimator)
  {
    AppMethodBeat.i(112726);
    if (PullDownListView.b(this.zRP) != null)
      PullDownListView.b(this.zRP).setVisibility(8);
    AppMethodBeat.o(112726);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.widget.listview.PullDownListView.3
 * JD-Core Version:    0.6.2
 */