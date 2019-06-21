package com.tencent.mm.plugin.clean.ui.newui;

import android.widget.AbsListView;
import android.widget.AbsListView.OnScrollListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.at.a.a;
import com.tencent.mm.at.o;
import com.tencent.mm.sdk.platformtools.ak;

final class b$5
  implements AbsListView.OnScrollListener
{
  b$5(b paramb)
  {
  }

  public final void onScroll(AbsListView paramAbsListView, int paramInt1, int paramInt2, int paramInt3)
  {
  }

  public final void onScrollStateChanged(AbsListView paramAbsListView, int paramInt)
  {
    AppMethodBeat.i(18851);
    o.ahp().cm(paramInt);
    if (paramInt != 2)
    {
      b.a(this.kyI, false);
      b.c(this.kyI).removeCallbacksAndMessages(null);
      b.c(this.kyI).sendEmptyMessageDelayed(0, 200L);
      AppMethodBeat.o(18851);
    }
    while (true)
    {
      return;
      b.a(this.kyI, true);
      AppMethodBeat.o(18851);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.clean.ui.newui.b.5
 * JD-Core Version:    0.6.2
 */