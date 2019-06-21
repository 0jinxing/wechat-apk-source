package com.tencent.mm.plugin.shake.ui;

import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.aw.a;
import com.tencent.mm.plugin.shake.b.l;
import com.tencent.mm.plugin.shake.b.l.b;
import com.tencent.mm.plugin.shake.d.a.h;
import java.util.ArrayList;
import java.util.List;

final class ShakeReportUI$10
  implements Animation.AnimationListener
{
  ShakeReportUI$10(ShakeReportUI paramShakeReportUI)
  {
  }

  public final void onAnimationEnd(Animation paramAnimation)
  {
    AppMethodBeat.i(24788);
    ShakeReportUI.f(this.qwj, true);
    ShakeReportUI.g(this.qwj, false);
    if (!ShakeReportUI.C(this.qwj))
    {
      ShakeReportUI.a(this.qwj, true);
      ShakeReportUI.d(this.qwj, true);
      ShakeReportUI.D(this.qwj);
      if (ShakeReportUI.E(this.qwj).qrR != 3)
        break label103;
      a.aic();
    }
    while (true)
    {
      ShakeReportUI.E(this.qwj).qrS.start();
      ShakeReportUI.e(this.qwj, false);
      AppMethodBeat.o(24788);
      return;
      label103: if (ShakeReportUI.E(this.qwj).qrR == 5)
      {
        paramAnimation = ShakeReportUI.E(this.qwj).qrS;
        if ((paramAnimation != null) && ((paramAnimation instanceof h)))
        {
          h localh = (h)paramAnimation;
          paramAnimation = new ArrayList();
          paramAnimation.addAll(ShakeReportUI.ckS());
          localh.qtL = paramAnimation;
        }
      }
    }
  }

  public final void onAnimationRepeat(Animation paramAnimation)
  {
  }

  public final void onAnimationStart(Animation paramAnimation)
  {
    AppMethodBeat.i(24787);
    ShakeReportUI.c(this.qwj, false);
    ShakeReportUI.e(this.qwj, true);
    ShakeReportUI.f(this.qwj, false);
    ShakeReportUI.g(this.qwj, true);
    ShakeReportUI.B(this.qwj);
    AppMethodBeat.o(24787);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.shake.ui.ShakeReportUI.10
 * JD-Core Version:    0.6.2
 */