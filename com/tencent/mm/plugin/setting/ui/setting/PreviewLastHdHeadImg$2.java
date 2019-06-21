package com.tencent.mm.plugin.setting.ui.setting;

import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class PreviewLastHdHeadImg$2
  implements MenuItem.OnMenuItemClickListener
{
  PreviewLastHdHeadImg$2(PreviewLastHdHeadImg paramPreviewLastHdHeadImg)
  {
  }

  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    AppMethodBeat.i(127008);
    this.qlt.finish();
    AppMethodBeat.o(127008);
    return true;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.setting.ui.setting.PreviewLastHdHeadImg.2
 * JD-Core Version:    0.6.2
 */