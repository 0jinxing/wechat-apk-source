package com.tencent.mm.plugin.masssend.ui;

import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class MassSendMsgUI$1
  implements MenuItem.OnMenuItemClickListener
{
  MassSendMsgUI$1(MassSendMsgUI paramMassSendMsgUI)
  {
  }

  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    AppMethodBeat.i(22824);
    this.opf.finish();
    AppMethodBeat.o(22824);
    return true;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.masssend.ui.MassSendMsgUI.1
 * JD-Core Version:    0.6.2
 */