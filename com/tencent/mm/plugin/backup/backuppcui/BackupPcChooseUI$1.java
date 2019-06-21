package com.tencent.mm.plugin.backup.backuppcui;

import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class BackupPcChooseUI$1
  implements MenuItem.OnMenuItemClickListener
{
  BackupPcChooseUI$1(BackupPcChooseUI paramBackupPcChooseUI)
  {
  }

  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    AppMethodBeat.i(17573);
    this.jwK.finish();
    AppMethodBeat.o(17573);
    return false;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.backup.backuppcui.BackupPcChooseUI.1
 * JD-Core Version:    0.6.2
 */