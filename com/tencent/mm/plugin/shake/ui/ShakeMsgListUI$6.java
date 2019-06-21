package com.tencent.mm.plugin.shake.ui;

import android.view.MenuItem;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.shake.b.g;
import com.tencent.mm.sdk.e.e;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.base.n.d;

final class ShakeMsgListUI$6
  implements n.d
{
  ShakeMsgListUI$6(ShakeMsgListUI paramShakeMsgListUI)
  {
  }

  public final void onMMMenuItemSelected(MenuItem paramMenuItem, int paramInt)
  {
    AppMethodBeat.i(24757);
    g localg = ShakeMsgListUI.a(this.quR);
    long l = ShakeMsgListUI.i(this.quR);
    paramMenuItem = "svrid = '" + String.valueOf(l) + "'";
    ab.i("MicroMsg.ShakeMessageStorage", "delBySvrId = ".concat(String.valueOf(localg.bSd.delete(localg.getTableName(), paramMenuItem, null))));
    ShakeMsgListUI.b(this.quR).a(null, null);
    AppMethodBeat.o(24757);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.shake.ui.ShakeMsgListUI.6
 * JD-Core Version:    0.6.2
 */