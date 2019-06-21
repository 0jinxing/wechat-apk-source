package com.tencent.mm.plugin.setting.ui.setting;

import android.support.v7.widget.RecyclerView.a;
import android.support.v7.widget.RecyclerView.b;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.HashSet;

final class UnfamiliarContactDetailUI$1
  implements MenuItem.OnMenuItemClickListener
{
  UnfamiliarContactDetailUI$1(UnfamiliarContactDetailUI paramUnfamiliarContactDetailUI)
  {
  }

  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    AppMethodBeat.i(127632);
    paramMenuItem = this.qpX;
    boolean bool;
    if (!UnfamiliarContactDetailUI.a(this.qpX))
    {
      bool = true;
      UnfamiliarContactDetailUI.a(paramMenuItem, bool);
      UnfamiliarContactDetailUI.b(this.qpX).clear();
      UnfamiliarContactDetailUI.b(this.qpX, UnfamiliarContactDetailUI.a(this.qpX));
      if (!UnfamiliarContactDetailUI.a(this.qpX))
        break label136;
      UnfamiliarContactDetailUI.c(this.qpX).setEnabled(false);
      UnfamiliarContactDetailUI.d(this.qpX).setEnabled(false);
      this.qpX.updateOptionMenuText(1, this.qpX.getString(2131304144));
    }
    while (true)
    {
      if (UnfamiliarContactDetailUI.e(this.qpX) != null)
        UnfamiliarContactDetailUI.e(this.qpX).aop.notifyChanged();
      AppMethodBeat.o(127632);
      return true;
      bool = false;
      break;
      label136: this.qpX.updateOptionMenuText(1, this.qpX.getString(2131304150));
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.setting.ui.setting.UnfamiliarContactDetailUI.1
 * JD-Core Version:    0.6.2
 */