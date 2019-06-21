package com.tencent.mm.plugin.readerapp.ui;

import android.content.Intent;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.model.bl;
import com.tencent.mm.plugin.readerapp.b.a;
import com.tencent.mm.pluginsdk.n;

final class ReaderAppIntroUI$2
  implements MenuItem.OnMenuItemClickListener
{
  ReaderAppIntroUI$2(ReaderAppIntroUI paramReaderAppIntroUI)
  {
  }

  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    AppMethodBeat.i(76799);
    a.gkE.c(new Intent().putExtra("Contact_User", bl.kG(ReaderAppIntroUI.a(this.pEW))), this.pEW);
    this.pEW.finish();
    AppMethodBeat.o(76799);
    return true;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.readerapp.ui.ReaderAppIntroUI.2
 * JD-Core Version:    0.6.2
 */