package com.tencent.mm.plugin.qqmail.ui;

import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class CompressPreviewUI$2
  implements MenuItem.OnMenuItemClickListener
{
  CompressPreviewUI$2(CompressPreviewUI paramCompressPreviewUI)
  {
  }

  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    AppMethodBeat.i(68239);
    this.pxt.onKeyDown(4, null);
    AppMethodBeat.o(68239);
    return true;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.qqmail.ui.CompressPreviewUI.2
 * JD-Core Version:    0.6.2
 */