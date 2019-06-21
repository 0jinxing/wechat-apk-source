package com.tencent.mm.ui.contact;

import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class MMBaseSelectContactUI$2
  implements MenuItem.OnMenuItemClickListener
{
  MMBaseSelectContactUI$2(MMBaseSelectContactUI paramMMBaseSelectContactUI)
  {
  }

  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    AppMethodBeat.i(105215);
    this.znk.bMQ();
    AppMethodBeat.o(105215);
    return true;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.contact.MMBaseSelectContactUI.2
 * JD-Core Version:    0.6.2
 */