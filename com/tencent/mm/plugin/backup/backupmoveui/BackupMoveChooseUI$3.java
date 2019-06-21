package com.tencent.mm.plugin.backup.backupmoveui;

import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.backup.backupui.BackupSelectExtUI;
import com.tencent.mm.plugin.backup.d.a;
import com.tencent.mm.plugin.backup.d.b;

final class BackupMoveChooseUI$3
  implements View.OnClickListener
{
  BackupMoveChooseUI$3(BackupMoveChooseUI paramBackupMoveChooseUI)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(17326);
    paramView = new Intent(this.juN, BackupSelectExtUI.class);
    paramView.putExtra("BACKUP_MODE", 2);
    paramView.putExtra("BACKUP_SELECT_TIME_MODE", BackupMoveChooseUI.access$100());
    paramView.putExtra("BACKUP_SELECT_SUPPORT_CONTENT_TYPE", true);
    paramView.putExtra("BACKUP_SELECT_CONTENT_TYPE", BackupMoveChooseUI.access$200());
    paramView.putExtra("BACKUP_SELECT_TIME_START_TIME", BackupMoveChooseUI.aTu());
    paramView.putExtra("BACKUP_SELECT_TIME_END_TIME", BackupMoveChooseUI.access$400());
    paramView.putExtra("BACKUP_SELECT_TIME_MIN_CONVERSATION_TIME", b.aSZ().aTd().jsU);
    this.juN.startActivityForResult(paramView, 0);
    AppMethodBeat.o(17326);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.backup.backupmoveui.BackupMoveChooseUI.3
 * JD-Core Version:    0.6.2
 */