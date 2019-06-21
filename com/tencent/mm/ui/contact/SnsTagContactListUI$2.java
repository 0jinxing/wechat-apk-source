package com.tencent.mm.ui.contact;

import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class SnsTagContactListUI$2
  implements MenuItem.OnMenuItemClickListener
{
  SnsTagContactListUI$2(SnsTagContactListUI paramSnsTagContactListUI)
  {
  }

  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    AppMethodBeat.i(33956);
    this.zpu.finish();
    AppMethodBeat.o(33956);
    return true;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.contact.SnsTagContactListUI.2
 * JD-Core Version:    0.6.2
 */