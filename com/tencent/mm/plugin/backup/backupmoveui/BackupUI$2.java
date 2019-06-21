package com.tencent.mm.plugin.backup.backupmoveui;

import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class BackupUI$2
  implements MenuItem.OnMenuItemClickListener
{
  BackupUI$2(BackupUI paramBackupUI)
  {
  }

  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    AppMethodBeat.i(17429);
    this.jvo.finish();
    AppMethodBeat.o(17429);
    return true;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.backup.backupmoveui.BackupUI.2
 * JD-Core Version:    0.6.2
 */