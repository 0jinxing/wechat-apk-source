package com.tencent.mm.plugin.setting.ui.setting;

import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.widget.a.d;

final class PreviewHdHeadImg$1
  implements MenuItem.OnMenuItemClickListener
{
  PreviewHdHeadImg$1(PreviewHdHeadImg paramPreviewHdHeadImg)
  {
  }

  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    AppMethodBeat.i(126989);
    paramMenuItem = new d(this.qlo, 1, false);
    paramMenuItem.rBl = new PreviewHdHeadImg.1.1(this);
    paramMenuItem.rBm = new PreviewHdHeadImg.1.2(this);
    paramMenuItem.cpD();
    AppMethodBeat.o(126989);
    return true;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.setting.ui.setting.PreviewHdHeadImg.1
 * JD-Core Version:    0.6.2
 */