package com.tencent.mm.plugin.clean.ui.fileindexui;

import android.widget.AbsListView;
import android.widget.AbsListView.OnScrollListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.at.a.a;
import com.tencent.mm.at.o;
import com.tencent.mm.sdk.platformtools.ak;

final class b$6
  implements AbsListView.OnScrollListener
{
  b$6(b paramb)
  {
  }

  public final void onScroll(AbsListView paramAbsListView, int paramInt1, int paramInt2, int paramInt3)
  {
  }

  public final void onScrollStateChanged(AbsListView paramAbsListView, int paramInt)
  {
    AppMethodBeat.i(18751);
    o.ahp().cm(paramInt);
    if (paramInt != 2)
    {
      b.a(this.kxq, false);
      b.g(this.kxq).removeCallbacksAndMessages(null);
      b.g(this.kxq).sendEmptyMessageDelayed(0, 200L);
      AppMethodBeat.o(18751);
    }
    while (true)
    {
      return;
      b.a(this.kxq, true);
      AppMethodBeat.o(18751);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.clean.ui.fileindexui.b.6
 * JD-Core Version:    0.6.2
 */