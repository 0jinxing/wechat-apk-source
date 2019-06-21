package com.tencent.mm.plugin.aa.ui;

import android.content.Intent;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.q;

final class AAEntranceUI$2
  implements a.a
{
  AAEntranceUI$2(AAEntranceUI paramAAEntranceUI)
  {
  }

  public final void aos()
  {
    AppMethodBeat.i(40709);
    Intent localIntent = new Intent(this.gnc.mController.ylL, AAQueryListUI.class);
    this.gnc.startActivity(localIntent);
    AppMethodBeat.o(40709);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.aa.ui.AAEntranceUI.2
 * JD-Core Version:    0.6.2
 */