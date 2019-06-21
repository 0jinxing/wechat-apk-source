package com.tencent.mm.plugin.collect.ui;

import android.view.MenuItem;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.protocal.protobuf.bbj;
import com.tencent.mm.ui.base.n.d;

final class CollectMainUI$19$2
  implements n.d
{
  CollectMainUI$19$2(CollectMainUI.19 param19)
  {
  }

  public final void onMMMenuItemSelected(MenuItem paramMenuItem, int paramInt)
  {
    AppMethodBeat.i(41275);
    switch (paramMenuItem.getItemId())
    {
    default:
    case 1:
    case 0:
    }
    while (true)
    {
      AppMethodBeat.o(41275);
      while (true)
      {
        return;
        if (CollectMainUI.d(this.kHv.kHl) == null)
          break;
        CollectMainUI.dB(CollectMainUI.d(this.kHv.kHl).username, CollectMainUI.d(this.kHv.kHl).iAb);
        AppMethodBeat.o(41275);
      }
      CollectMainUI.e(this.kHv.kHl);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.collect.ui.CollectMainUI.19.2
 * JD-Core Version:    0.6.2
 */