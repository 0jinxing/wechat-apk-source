package com.tencent.mm.plugin.readerapp.ui;

import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class ReaderAppIntroUI$1
  implements MenuItem.OnMenuItemClickListener
{
  ReaderAppIntroUI$1(ReaderAppIntroUI paramReaderAppIntroUI)
  {
  }

  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    AppMethodBeat.i(76798);
    this.pEW.finish();
    AppMethodBeat.o(76798);
    return true;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.readerapp.ui.ReaderAppIntroUI.1
 * JD-Core Version:    0.6.2
 */