package com.tencent.mm.plugin.sns.ui;

import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class SnsTagPartlyUI$1
  implements MenuItem.OnMenuItemClickListener
{
  SnsTagPartlyUI$1(SnsTagPartlyUI paramSnsTagPartlyUI)
  {
  }

  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    AppMethodBeat.i(39376);
    this.rxH.finish();
    AppMethodBeat.o(39376);
    return true;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.SnsTagPartlyUI.1
 * JD-Core Version:    0.6.2
 */