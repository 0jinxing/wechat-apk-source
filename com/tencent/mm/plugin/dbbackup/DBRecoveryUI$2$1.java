package com.tencent.mm.plugin.dbbackup;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.report.e;

final class DBRecoveryUI$2$1
  implements DialogInterface.OnClickListener
{
  DBRecoveryUI$2$1(DBRecoveryUI.2 param2)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(18944);
    e.pXa.a(873L, 25L, 1L, false);
    DBRecoveryUI.d(this.kIk.kIj);
    AppMethodBeat.o(18944);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.dbbackup.DBRecoveryUI.2.1
 * JD-Core Version:    0.6.2
 */