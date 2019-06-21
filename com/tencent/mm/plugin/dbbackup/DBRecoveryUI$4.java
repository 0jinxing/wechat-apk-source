package com.tencent.mm.plugin.dbbackup;

import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class DBRecoveryUI$4
  implements MenuItem.OnMenuItemClickListener
{
  DBRecoveryUI$4(DBRecoveryUI paramDBRecoveryUI)
  {
  }

  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    AppMethodBeat.i(18947);
    if (DBRecoveryUI.f(this.kIj))
      DBRecoveryUI.e(this.kIj);
    while (true)
    {
      AppMethodBeat.o(18947);
      return true;
      this.kIj.finish();
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.dbbackup.DBRecoveryUI.4
 * JD-Core Version:    0.6.2
 */