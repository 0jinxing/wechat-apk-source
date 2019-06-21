package com.tencent.mm.plugin.backup.backupmoveui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.backup.d.b;
import com.tencent.mm.plugin.backup.d.d;
import com.tencent.mm.sdk.platformtools.ab;

final class BackupMoveQRCodeUI$1$1
  implements DialogInterface.OnClickListener
{
  BackupMoveQRCodeUI$1$1(BackupMoveQRCodeUI.1 param1)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(17338);
    ab.i("MicroMsg.BackupMoveQRCodeUI", "CLIENT_NOT_SUPPORT_SELECT_TIME_AND_QUICK_BACKUP, user click move all.");
    BackupMoveQRCodeUI.a(this.juT.juS, false);
    b.aSZ().aTb().fl(true);
    AppMethodBeat.o(17338);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.backup.backupmoveui.BackupMoveQRCodeUI.1.1
 * JD-Core Version:    0.6.2
 */