package com.tencent.mm.plugin.readerapp.ui;

import android.content.Intent;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.readerapp.b.a;
import com.tencent.mm.pluginsdk.n;

final class ReaderAppUI$8
  implements MenuItem.OnMenuItemClickListener
{
  ReaderAppUI$8(ReaderAppUI paramReaderAppUI)
  {
  }

  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    AppMethodBeat.i(76820);
    a.gkE.c(new Intent().putExtra("Contact_User", ReaderAppUI.f(this.pFj)), this.pFj);
    AppMethodBeat.o(76820);
    return true;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.readerapp.ui.ReaderAppUI.8
 * JD-Core Version:    0.6.2
 */