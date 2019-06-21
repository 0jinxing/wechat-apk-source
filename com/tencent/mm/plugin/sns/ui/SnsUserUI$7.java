package com.tencent.mm.plugin.sns.ui;

import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class SnsUserUI$7
  implements MenuItem.OnMenuItemClickListener
{
  SnsUserUI$7(SnsUserUI paramSnsUserUI)
  {
  }

  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    AppMethodBeat.i(39790);
    this.rDa.finish();
    AppMethodBeat.o(39790);
    return true;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.SnsUserUI.7
 * JD-Core Version:    0.6.2
 */