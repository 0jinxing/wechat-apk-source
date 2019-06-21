package com.tencent.mm.plugin.setting.ui.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

public final class SwitchAccountGridView$6 extends AnimatorListenerAdapter
{
  public SwitchAccountGridView$6(SwitchAccountGridView paramSwitchAccountGridView)
  {
  }

  public final void onAnimationEnd(Animator paramAnimator)
  {
    AppMethodBeat.i(127707);
    ab.i("MicroMsg.SwitchAccountGridView", "avatar animator end");
    SwitchAccountGridView.g(this.qrm);
    if (SwitchAccountGridView.h(this.qrm) != null)
      SwitchAccountGridView.h(this.qrm).cjg();
    AppMethodBeat.o(127707);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.setting.ui.widget.SwitchAccountGridView.6
 * JD-Core Version:    0.6.2
 */