package com.tencent.mm.ui.contact;

import android.content.Intent;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.al;

final class SelectContactUI$1
  implements MenuItem.OnMenuItemClickListener
{
  SelectContactUI$1(SelectContactUI paramSelectContactUI)
  {
  }

  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    AppMethodBeat.i(33850);
    this.zoP.aqX();
    this.zoP.finish();
    if (!this.zoP.getIntent().getBooleanExtra("stay_in_wechat", true))
      al.n(new SelectContactUI.1.1(this), 80L);
    AppMethodBeat.o(33850);
    return true;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.contact.SelectContactUI.1
 * JD-Core Version:    0.6.2
 */