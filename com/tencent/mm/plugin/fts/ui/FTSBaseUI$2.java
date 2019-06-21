package com.tencent.mm.plugin.fts.ui;

import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class FTSBaseUI$2
  implements MenuItem.OnMenuItemClickListener
{
  FTSBaseUI$2(FTSBaseUI paramFTSBaseUI)
  {
  }

  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    AppMethodBeat.i(61780);
    this.mIt.finish();
    AppMethodBeat.o(61780);
    return true;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.fts.ui.FTSBaseUI.2
 * JD-Core Version:    0.6.2
 */