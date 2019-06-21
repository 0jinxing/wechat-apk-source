package com.tencent.mm.ui.contact;

import android.content.Intent;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.bo;

final class GroupCardSelectUI$3
  implements MenuItem.OnMenuItemClickListener
{
  GroupCardSelectUI$3(GroupCardSelectUI paramGroupCardSelectUI)
  {
  }

  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    AppMethodBeat.i(33730);
    paramMenuItem = new Intent();
    paramMenuItem.putExtra("Select_Conv_User", bo.c(GroupCardSelectUI.e(this.zmK), ","));
    this.zmK.setResult(-1, paramMenuItem);
    this.zmK.finish();
    AppMethodBeat.o(33730);
    return true;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.contact.GroupCardSelectUI.3
 * JD-Core Version:    0.6.2
 */