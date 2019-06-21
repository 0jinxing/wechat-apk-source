package com.tencent.mm.ui;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.a.js;
import com.tencent.mm.sdk.b.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ak;

final class LauncherUITabView$1
  implements View.OnClickListener
{
  private final long ryi = 300L;

  LauncherUITabView$1(LauncherUITabView paramLauncherUITabView)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(29515);
    int i = ((Integer)paramView.getTag()).intValue();
    if ((LauncherUITabView.a(this.ykN) == i) && (i == 0) && (System.currentTimeMillis() - LauncherUITabView.b(this.ykN) <= 300L))
    {
      ab.v("MicroMsg.LauncherUITabView", "onMainTabDoubleClick");
      LauncherUITabView.c(this.ykN).removeMessages(0);
      a.xxA.m(new js());
      LauncherUITabView.a(this.ykN, System.currentTimeMillis());
      LauncherUITabView.a(this.ykN, i);
      AppMethodBeat.o(29515);
    }
    while (true)
    {
      return;
      if (LauncherUITabView.d(this.ykN) != null)
      {
        if ((i != 0) || (LauncherUITabView.a(this.ykN) != 0))
        {
          LauncherUITabView.a(this.ykN, System.currentTimeMillis());
          LauncherUITabView.a(this.ykN, i);
          LauncherUITabView.d(this.ykN).onTabClick(i);
          AppMethodBeat.o(29515);
        }
        else
        {
          LauncherUITabView.c(this.ykN).sendEmptyMessageDelayed(0, 300L);
        }
      }
      else
      {
        LauncherUITabView.a(this.ykN, System.currentTimeMillis());
        LauncherUITabView.a(this.ykN, i);
        ab.w("MicroMsg.LauncherUITabView", "on tab click, index %d, but listener is null", new Object[] { (Integer)paramView.getTag() });
        AppMethodBeat.o(29515);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.LauncherUITabView.1
 * JD-Core Version:    0.6.2
 */