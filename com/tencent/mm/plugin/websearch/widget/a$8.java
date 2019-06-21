package com.tencent.mm.plugin.websearch.widget;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.animation.AccelerateDecelerateInterpolator;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

final class a$8
  implements Runnable
{
  a$8(a parama, int paramInt1, int paramInt2, int paramInt3, int paramInt4, View paramView1, View paramView2, String paramString)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(91402);
    ab.i("FTSSearchWidgetMgr", "animating  size beginH %d, endH %d, beginW %d, endW %d", new Object[] { Integer.valueOf(this.ucZ), Integer.valueOf(this.uda), Integer.valueOf(this.udb), Integer.valueOf(this.udc) });
    if ((this.ucZ == this.uda) && (this.udb == this.udc))
      AppMethodBeat.o(91402);
    while (true)
    {
      return;
      ViewGroup.LayoutParams localLayoutParams1 = this.udd.getLayoutParams();
      ViewGroup.LayoutParams localLayoutParams2 = this.ude.getLayoutParams();
      ValueAnimator localValueAnimator = ValueAnimator.ofInt(new int[] { this.ucZ, this.uda });
      localValueAnimator.setDuration(300L);
      localValueAnimator.setInterpolator(new AccelerateDecelerateInterpolator());
      localValueAnimator.addUpdateListener(new a.8.1(this, localLayoutParams1, localLayoutParams2));
      localValueAnimator.addListener(new a.8.2(this));
      localValueAnimator.start();
      AppMethodBeat.o(91402);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.websearch.widget.a.8
 * JD-Core Version:    0.6.2
 */