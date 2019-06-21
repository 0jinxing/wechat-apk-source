package com.tencent.mm.plugin.masssend.ui;

import android.content.Intent;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.masssend.a;
import com.tencent.mm.pluginsdk.n;

final class MassSendHistoryUI$3
  implements MenuItem.OnMenuItemClickListener
{
  MassSendHistoryUI$3(MassSendHistoryUI paramMassSendHistoryUI)
  {
  }

  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    AppMethodBeat.i(22796);
    paramMenuItem = new Intent();
    paramMenuItem.putExtra("Contact_User", "masssendapp");
    a.gkE.c(paramMenuItem, this.ooZ);
    AppMethodBeat.o(22796);
    return true;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.masssend.ui.MassSendHistoryUI.3
 * JD-Core Version:    0.6.2
 */