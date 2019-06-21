package com.tencent.mm.plugin.backup.backuppcui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

final class BackupPcUI$1
  implements DialogInterface.OnClickListener
{
  BackupPcUI$1(BackupPcUI paramBackupPcUI, int paramInt)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(17588);
    ab.i("MicroMsg.BackupPcUI", "low battery, user click sure. battery:%d", new Object[] { Integer.valueOf(this.jvp) });
    AppMethodBeat.o(17588);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.backup.backuppcui.BackupPcUI.1
 * JD-Core Version:    0.6.2
 */