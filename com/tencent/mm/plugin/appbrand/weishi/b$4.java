package com.tencent.mm.plugin.appbrand.weishi;

import android.animation.ValueAnimator;
import android.support.v4.view.b.a;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class b$4
  implements Runnable
{
  b$4(b paramb)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(133629);
    ViewParent localViewParent = this.iTR.getParent();
    if (!(localViewParent instanceof ViewGroup))
      AppMethodBeat.o(133629);
    while (true)
    {
      return;
      ValueAnimator localValueAnimator = ValueAnimator.ofInt(new int[] { 255, 0 });
      localValueAnimator.addUpdateListener(new b.4.1(this, localViewParent));
      localValueAnimator.setStartDelay(Math.round((float)localValueAnimator.getDuration() * 0.8F));
      localValueAnimator.setDuration(Math.round((float)localValueAnimator.getDuration() * 0.2F));
      localValueAnimator.setInterpolator(new a());
      localValueAnimator.start();
      AppMethodBeat.o(133629);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.weishi.b.4
 * JD-Core Version:    0.6.2
 */