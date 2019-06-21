package com.tencent.mm.plugin.wear.ui;

import android.animation.Animator;
import android.animation.Animator.AnimatorListener;
import android.view.ViewPropertyAnimator;
import android.widget.ImageView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.al;
import java.util.concurrent.atomic.AtomicInteger;

final class WearYoUI$a
  implements Animator.AnimatorListener
{
  private int hzv = 1;

  public WearYoUI$a(WearYoUI paramWearYoUI, int paramInt)
  {
    this.hzv = paramInt;
  }

  public final void onAnimationCancel(Animator paramAnimator)
  {
    AppMethodBeat.i(26470);
    WearYoUI.g(this.tYZ);
    AppMethodBeat.o(26470);
  }

  public final void onAnimationEnd(Animator paramAnimator)
  {
    AppMethodBeat.i(26469);
    if (this.hzv == 2)
    {
      ab.v("MicroMsg.Wear.WearYoUI", "onAnimationEnd count: %d", new Object[] { Integer.valueOf(WearYoUI.e(this.tYZ).get()) });
      if (WearYoUI.e(this.tYZ).get() > 0)
      {
        WearYoUI.e(this.tYZ).decrementAndGet();
        al.n(WearYoUI.f(this.tYZ), 1000L);
        AppMethodBeat.o(26469);
      }
    }
    while (true)
    {
      return;
      WearYoUI.d(this.tYZ).animate().setListener(null);
      WearYoUI.g(this.tYZ);
      AppMethodBeat.o(26469);
      continue;
      if (this.hzv == 1)
      {
        WearYoUI.d(this.tYZ).animate().scaleX(1.0F);
        WearYoUI.d(this.tYZ).animate().scaleY(1.0F);
        WearYoUI.d(this.tYZ).animate().setDuration(100L);
        WearYoUI.d(this.tYZ).animate().start();
        WearYoUI.d(this.tYZ).animate().setListener(new a(this.tYZ, 2));
      }
      AppMethodBeat.o(26469);
    }
  }

  public final void onAnimationRepeat(Animator paramAnimator)
  {
  }

  public final void onAnimationStart(Animator paramAnimator)
  {
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wear.ui.WearYoUI.a
 * JD-Core Version:    0.6.2
 */