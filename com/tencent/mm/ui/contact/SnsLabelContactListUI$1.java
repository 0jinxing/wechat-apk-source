package com.tencent.mm.ui.contact;

import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class SnsLabelContactListUI$1
  implements MenuItem.OnMenuItemClickListener
{
  SnsLabelContactListUI$1(SnsLabelContactListUI paramSnsLabelContactListUI)
  {
  }

  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    AppMethodBeat.i(33938);
    this.zpm.finish();
    AppMethodBeat.o(33938);
    return true;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.contact.SnsLabelContactListUI.1
 * JD-Core Version:    0.6.2
 */