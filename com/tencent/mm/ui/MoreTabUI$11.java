package com.tencent.mm.ui;

import android.view.View;
import android.view.animation.AnimationUtils;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class MoreTabUI$11
  implements Runnable
{
  MoreTabUI$11(MoreTabUI paramMoreTabUI, View paramView)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(29713);
    this.yhM.setVisibility(8);
    this.yhM.startAnimation(AnimationUtils.loadAnimation(this.yoD.getContext(), 2131034181));
    AppMethodBeat.o(29713);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.MoreTabUI.11
 * JD-Core Version:    0.6.2
 */