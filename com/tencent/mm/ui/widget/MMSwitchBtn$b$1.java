package com.tencent.mm.ui.widget;

import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class MMSwitchBtn$b$1
  implements Animation.AnimationListener
{
  MMSwitchBtn$b$1(MMSwitchBtn.b paramb, MMSwitchBtn paramMMSwitchBtn)
  {
  }

  public final void onAnimationEnd(Animation paramAnimation)
  {
    boolean bool1 = true;
    AppMethodBeat.i(112575);
    boolean bool2 = MMSwitchBtn.a(this.zNh.zNf);
    if (this.zNh.direction == 1)
    {
      bool3 = true;
      if (bool2 != bool3)
      {
        paramAnimation = this.zNh.zNf;
        if (this.zNh.direction != 1)
          break label109;
      }
    }
    label109: for (boolean bool3 = bool1; ; bool3 = false)
    {
      MMSwitchBtn.a(paramAnimation, bool3);
      this.zNh.zNf.post(new MMSwitchBtn.b.1.1(this));
      MMSwitchBtn.c(this.zNh.zNf);
      AppMethodBeat.o(112575);
      return;
      bool3 = false;
      break;
    }
  }

  public final void onAnimationRepeat(Animation paramAnimation)
  {
  }

  public final void onAnimationStart(Animation paramAnimation)
  {
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.widget.MMSwitchBtn.b.1
 * JD-Core Version:    0.6.2
 */