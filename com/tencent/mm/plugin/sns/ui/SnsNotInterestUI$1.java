package com.tencent.mm.plugin.sns.ui;

import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class SnsNotInterestUI$1
  implements MenuItem.OnMenuItemClickListener
{
  SnsNotInterestUI$1(SnsNotInterestUI paramSnsNotInterestUI)
  {
  }

  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    AppMethodBeat.i(39123);
    this.ruR.finish();
    AppMethodBeat.o(39123);
    return true;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.SnsNotInterestUI.1
 * JD-Core Version:    0.6.2
 */