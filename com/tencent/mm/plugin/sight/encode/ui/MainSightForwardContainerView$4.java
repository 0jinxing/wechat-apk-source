package com.tencent.mm.plugin.sight.encode.ui;

import android.view.View;
import android.view.animation.AnimationUtils;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class MainSightForwardContainerView$4
  implements Runnable
{
  MainSightForwardContainerView$4(MainSightForwardContainerView paramMainSightForwardContainerView)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(25037);
    if ((!MainSightForwardContainerView.b(this.qAL)) || ((MainSightForwardContainerView.a(this.qAL) != null) && (MainSightForwardContainerView.a(this.qAL).qBg.clK())))
    {
      MainSightForwardContainerView.c(this.qAL);
      AppMethodBeat.o(25037);
    }
    while (true)
    {
      return;
      MainSightForwardContainerView.d(this.qAL).setVisibility(0);
      if ((MainSightForwardContainerView.a(this.qAL) != null) && (!MainSightForwardContainerView.a(this.qAL).clR()) && (MainSightForwardContainerView.e(this.qAL).getVisibility() != 0))
      {
        MainSightForwardContainerView.e(this.qAL).setVisibility(0);
        MainSightForwardContainerView.e(this.qAL).startAnimation(AnimationUtils.loadAnimation(MainSightForwardContainerView.f(this.qAL), 2131034180));
      }
      AppMethodBeat.o(25037);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sight.encode.ui.MainSightForwardContainerView.4
 * JD-Core Version:    0.6.2
 */