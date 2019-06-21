package com.tencent.mm.ui.contact;

import android.content.Intent;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class SnsAddressUI$2
  implements MenuItem.OnMenuItemClickListener
{
  SnsAddressUI$2(SnsAddressUI paramSnsAddressUI)
  {
  }

  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    AppMethodBeat.i(33924);
    this.zpf.finish();
    if (!this.zpf.getIntent().getBooleanExtra("stay_in_wechat", true))
      this.zpf.moveTaskToBack(true);
    AppMethodBeat.o(33924);
    return true;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.contact.SnsAddressUI.2
 * JD-Core Version:    0.6.2
 */