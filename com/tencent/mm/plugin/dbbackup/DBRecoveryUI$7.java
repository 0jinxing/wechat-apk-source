package com.tencent.mm.plugin.dbbackup;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.widget.a.c;

final class DBRecoveryUI$7
  implements Runnable
{
  DBRecoveryUI$7(DBRecoveryUI paramDBRecoveryUI, c paramc)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(18953);
    this.gsP.dismiss();
    this.kIj.finish();
    d.bhS();
    AppMethodBeat.o(18953);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.dbbackup.DBRecoveryUI.7
 * JD-Core Version:    0.6.2
 */