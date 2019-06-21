package com.tencent.mm.plugin.sns.ui;

import android.content.Intent;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class SnsPermissionUI$1
  implements MenuItem.OnMenuItemClickListener
{
  SnsPermissionUI$1(SnsPermissionUI paramSnsPermissionUI)
  {
  }

  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    AppMethodBeat.i(39175);
    this.rvk.aqX();
    this.rvk.setResult(-1, new Intent());
    this.rvk.finish();
    AppMethodBeat.o(39175);
    return true;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.SnsPermissionUI.1
 * JD-Core Version:    0.6.2
 */