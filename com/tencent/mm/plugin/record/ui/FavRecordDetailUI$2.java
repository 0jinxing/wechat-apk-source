package com.tencent.mm.plugin.record.ui;

import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.q;
import com.tencent.mm.ui.widget.a.d;

final class FavRecordDetailUI$2
  implements MenuItem.OnMenuItemClickListener
{
  FavRecordDetailUI$2(FavRecordDetailUI paramFavRecordDetailUI)
  {
  }

  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    AppMethodBeat.i(24207);
    paramMenuItem = new d(this.pKi.mController.ylL, 1, false);
    paramMenuItem.rBl = new FavRecordDetailUI.2.1(this);
    paramMenuItem.rBm = new FavRecordDetailUI.2.2(this);
    paramMenuItem.cpD();
    AppMethodBeat.o(24207);
    return true;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.record.ui.FavRecordDetailUI.2
 * JD-Core Version:    0.6.2
 */