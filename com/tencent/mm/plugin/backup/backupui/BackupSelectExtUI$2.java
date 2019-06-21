package com.tencent.mm.plugin.backup.backupui;

import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class BackupSelectExtUI$2
  implements MenuItem.OnMenuItemClickListener
{
  BackupSelectExtUI$2(BackupSelectExtUI paramBackupSelectExtUI)
  {
  }

  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    AppMethodBeat.i(17727);
    this.jyR.finish();
    AppMethodBeat.o(17727);
    return true;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.backup.backupui.BackupSelectExtUI.2
 * JD-Core Version:    0.6.2
 */