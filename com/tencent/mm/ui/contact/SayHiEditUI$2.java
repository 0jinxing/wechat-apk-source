package com.tencent.mm.ui.contact;

import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class SayHiEditUI$2
  implements MenuItem.OnMenuItemClickListener
{
  SayHiEditUI$2(SayHiEditUI paramSayHiEditUI)
  {
  }

  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    AppMethodBeat.i(33842);
    this.zoy.finish();
    AppMethodBeat.o(33842);
    return true;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.contact.SayHiEditUI.2
 * JD-Core Version:    0.6.2
 */