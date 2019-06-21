package com.tencent.mm.plugin.account.bind.ui;

import android.app.ProgressDialog;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.p;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.account.a.a.b;
import com.tencent.mm.plugin.account.friend.a.al;
import com.tencent.mm.plugin.account.friend.a.l;
import com.tencent.mm.sdk.platformtools.ab;

final class MobileFriendUI$10
  implements b
{
  MobileFriendUI$10(MobileFriendUI paramMobileFriendUI)
  {
  }

  public final void cN(boolean paramBoolean)
  {
    AppMethodBeat.i(13728);
    ab.i("MicroMsg.MobileFriendUI", "syncAddrBookAndUpload onSyncEnd suc:%b", new Object[] { Boolean.valueOf(paramBoolean) });
    if (!paramBoolean)
    {
      if (MobileFriendUI.b(this.gtZ) != null)
      {
        MobileFriendUI.b(this.gtZ).dismiss();
        MobileFriendUI.c(this.gtZ);
      }
      AppMethodBeat.o(13728);
    }
    while (true)
    {
      return;
      System.currentTimeMillis();
      l.apX();
      al localal = new al(l.aqb(), l.aqa());
      g.Rg().a(localal, 0);
      AppMethodBeat.o(13728);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.account.bind.ui.MobileFriendUI.10
 * JD-Core Version:    0.6.2
 */