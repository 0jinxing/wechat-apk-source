package com.tencent.mm.ui.widget.listview;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.ai;

final class PullDownListView$4 extends AnimatorListenerAdapter
{
  PullDownListView$4(PullDownListView paramPullDownListView, int paramInt1, int paramInt2, boolean paramBoolean)
  {
  }

  public final void onAnimationEnd(Animator paramAnimator)
  {
    AppMethodBeat.i(112729);
    ai.i("MicroMsg.PullDownListView", "onAnimationEnd start:%s, openLimitPx():%s, closeLimitPx():%s", new Object[] { Integer.valueOf(this.zRQ), Integer.valueOf(PullDownListView.e(this.zRP)), Integer.valueOf(PullDownListView.f(this.zRP)) });
    PullDownListView.i(this.zRP);
    PullDownListView.a(this.zRP, false);
    PullDownListView.j(this.zRP);
    PullDownListView.k(this.zRP);
    if ((PullDownListView.g(this.zRP) != null) && (this.zRQ > PullDownListView.e(this.zRP)) && (this.zRQ < PullDownListView.f(this.zRP)))
      if (PullDownListView.h(this.zRP))
      {
        PullDownListView.g(this.zRP).caI();
        if (PullDownListView.l(this.zRP) == null)
          break label177;
        AppMethodBeat.o(112729);
      }
    while (true)
    {
      return;
      PullDownListView.g(this.zRP).jM(this.kAS);
      label177: AppMethodBeat.o(112729);
    }
  }

  public final void onAnimationStart(Animator paramAnimator)
  {
    AppMethodBeat.i(112728);
    ai.i("MicroMsg.PullDownListView", "onAnimationStart start:%s, openLimitPx():%s, closeLimitPx():%s", new Object[] { Integer.valueOf(this.zRQ), Integer.valueOf(PullDownListView.e(this.zRP)), Integer.valueOf(PullDownListView.f(this.zRP)) });
    PullDownListView.a(this.zRP, true);
    if (this.qkc == 0)
    {
      PullDownListView.b(this.zRP, true);
      if ((PullDownListView.g(this.zRP) == null) || (this.zRQ <= PullDownListView.e(this.zRP)) || (this.zRQ >= PullDownListView.f(this.zRP)))
        break label167;
      if (!PullDownListView.h(this.zRP))
        break label155;
      PullDownListView.g(this.zRP).caK();
      AppMethodBeat.o(112728);
    }
    while (true)
    {
      return;
      PullDownListView.b(this.zRP, false);
      break;
      label155: PullDownListView.g(this.zRP).caJ();
      label167: AppMethodBeat.o(112728);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.widget.listview.PullDownListView.4
 * JD-Core Version:    0.6.2
 */