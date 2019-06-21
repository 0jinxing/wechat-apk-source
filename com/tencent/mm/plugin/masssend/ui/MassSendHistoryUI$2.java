package com.tencent.mm.plugin.masssend.ui;

import android.content.Intent;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.masssend.a;
import com.tencent.mm.pluginsdk.n;

final class MassSendHistoryUI$2
  implements MenuItem.OnMenuItemClickListener
{
  MassSendHistoryUI$2(MassSendHistoryUI paramMassSendHistoryUI)
  {
  }

  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    AppMethodBeat.i(22795);
    if (MassSendHistoryUI.g(this.ooZ))
      this.ooZ.finish();
    while (true)
    {
      AppMethodBeat.o(22795);
      return true;
      paramMenuItem = new Intent();
      paramMenuItem.addFlags(67108864);
      a.gkE.p(paramMenuItem, this.ooZ);
      this.ooZ.finish();
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.masssend.ui.MassSendHistoryUI.2
 * JD-Core Version:    0.6.2
 */