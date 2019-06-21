package com.tencent.mm.plugin.sns.ui;

import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class SnsSingleTextViewUI$4
  implements MenuItem.OnMenuItemClickListener
{
  SnsSingleTextViewUI$4(SnsSingleTextViewUI paramSnsSingleTextViewUI)
  {
  }

  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    AppMethodBeat.i(39304);
    this.rxm.finish();
    AppMethodBeat.o(39304);
    return true;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.SnsSingleTextViewUI.4
 * JD-Core Version:    0.6.2
 */