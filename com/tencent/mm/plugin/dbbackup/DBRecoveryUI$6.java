package com.tencent.mm.plugin.dbbackup;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class DBRecoveryUI$6
  implements DialogInterface.OnClickListener
{
  DBRecoveryUI$6(DBRecoveryUI paramDBRecoveryUI)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(18952);
    this.kIj.finish();
    d.bhS();
    AppMethodBeat.o(18952);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.dbbackup.DBRecoveryUI.6
 * JD-Core Version:    0.6.2
 */