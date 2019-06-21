package com.tencent.mm.plugin.profile.ui;

import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class SayHiWithSnsPermissionUI$7
  implements MenuItem.OnMenuItemClickListener
{
  SayHiWithSnsPermissionUI$7(SayHiWithSnsPermissionUI paramSayHiWithSnsPermissionUI)
  {
  }

  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    AppMethodBeat.i(23776);
    if (SayHiWithSnsPermissionUI.k(this.ppC))
      SayHiWithSnsPermissionUI.l(this.ppC)[1] = 1;
    this.ppC.finish();
    AppMethodBeat.o(23776);
    return true;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.profile.ui.SayHiWithSnsPermissionUI.7
 * JD-Core Version:    0.6.2
 */