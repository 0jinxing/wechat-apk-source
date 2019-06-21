package com.tencent.mm.plugin.backup.backupmoveui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

final class BackupMoveRecoverUI$1$14
  implements DialogInterface.OnClickListener
{
  BackupMoveRecoverUI$1$14(BackupMoveRecoverUI.1 param1)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(17376);
    ab.i("MicroMsg.BackupMoveRecoverUI", "move phone old version");
    BackupMoveRecoverUI.h(this.jvd.jvc);
    AppMethodBeat.o(17376);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.backup.backupmoveui.BackupMoveRecoverUI.1.14
 * JD-Core Version:    0.6.2
 */