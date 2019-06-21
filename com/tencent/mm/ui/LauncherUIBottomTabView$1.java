package com.tencent.mm.ui;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.a.js;
import com.tencent.mm.sdk.b.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ak;

final class LauncherUIBottomTabView$1
  implements View.OnClickListener
{
  private final long ryi = 300L;

  LauncherUIBottomTabView$1(LauncherUIBottomTabView paramLauncherUIBottomTabView)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(29486);
    int i = ((Integer)paramView.getTag()).intValue();
    if ((LauncherUIBottomTabView.a(this.yky) == i) && (i == 0) && (System.currentTimeMillis() - LauncherUIBottomTabView.b(this.yky) <= 300L))
    {
      ab.v("MicroMsg.LauncherUITabView", "onMainTabDoubleClick");
      LauncherUIBottomTabView.c(this.yky).removeMessages(0);
      a.xxA.m(new js());
      LauncherUIBottomTabView.a(this.yky, System.currentTimeMillis());
      LauncherUIBottomTabView.a(this.yky, i);
      AppMethodBeat.o(29486);
    }
    while (true)
    {
      return;
      if (LauncherUIBottomTabView.d(this.yky) != null)
      {
        if ((i != 0) || (LauncherUIBottomTabView.a(this.yky) != 0))
        {
          ab.v("MicroMsg.LauncherUITabView", "directly dispatch tab click event");
          LauncherUIBottomTabView.a(this.yky, System.currentTimeMillis());
          LauncherUIBottomTabView.a(this.yky, i);
          LauncherUIBottomTabView.d(this.yky).onTabClick(i);
          AppMethodBeat.o(29486);
        }
        else
        {
          ab.v("MicroMsg.LauncherUITabView", "do double click check");
          LauncherUIBottomTabView.c(this.yky).sendEmptyMessageDelayed(0, 300L);
        }
      }
      else
      {
        LauncherUIBottomTabView.a(this.yky, System.currentTimeMillis());
        LauncherUIBottomTabView.a(this.yky, i);
        ab.w("MicroMsg.LauncherUITabView", "on tab click, index %d, but listener is null", new Object[] { (Integer)paramView.getTag() });
        AppMethodBeat.o(29486);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.LauncherUIBottomTabView.1
 * JD-Core Version:    0.6.2
 */