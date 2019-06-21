package com.tencent.mm.plugin.setting.ui.setting;

import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.widget.a.d;

final class PreviewLastHdHeadImg$1
  implements MenuItem.OnMenuItemClickListener
{
  PreviewLastHdHeadImg$1(PreviewLastHdHeadImg paramPreviewLastHdHeadImg)
  {
  }

  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    AppMethodBeat.i(127007);
    paramMenuItem = new d(this.qlt, 1, false);
    paramMenuItem.rBl = new PreviewLastHdHeadImg.1.1(this);
    paramMenuItem.rBm = new PreviewLastHdHeadImg.1.2(this);
    paramMenuItem.cpD();
    AppMethodBeat.o(127007);
    return true;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.setting.ui.setting.PreviewLastHdHeadImg.1
 * JD-Core Version:    0.6.2
 */