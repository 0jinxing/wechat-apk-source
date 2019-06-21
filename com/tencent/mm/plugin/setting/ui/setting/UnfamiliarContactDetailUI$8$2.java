package com.tencent.mm.plugin.setting.ui.setting;

import android.support.v7.widget.RecyclerView.a;
import android.support.v7.widget.RecyclerView.b;
import android.view.MenuItem;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.p;
import com.tencent.mm.kernel.b;
import com.tencent.mm.kernel.g;
import com.tencent.mm.ui.base.n.d;

final class UnfamiliarContactDetailUI$8$2
  implements n.d
{
  UnfamiliarContactDetailUI$8$2(UnfamiliarContactDetailUI.8 param8)
  {
  }

  public final void onMMMenuItemSelected(MenuItem paramMenuItem, int paramInt)
  {
    AppMethodBeat.i(127643);
    g.RQ();
    g.RO().eJo.b(681, UnfamiliarContactDetailUI.h(this.qqb.qpX));
    UnfamiliarContactDetailUI.a(this.qqb.qpX, UnfamiliarContactDetailUI.b(this.qqb.qpX), paramInt);
    UnfamiliarContactDetailUI.b(this.qqb.qpX, false);
    if (UnfamiliarContactDetailUI.e(this.qqb.qpX) != null)
      UnfamiliarContactDetailUI.e(this.qqb.qpX).aop.notifyChanged();
    AppMethodBeat.o(127643);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.setting.ui.setting.UnfamiliarContactDetailUI.8.2
 * JD-Core Version:    0.6.2
 */