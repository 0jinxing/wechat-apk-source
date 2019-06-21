package com.tencent.mm.plugin.account.ui;

import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class InviteRecommendChoiceUI$1
  implements MenuItem.OnMenuItemClickListener
{
  InviteRecommendChoiceUI$1(InviteRecommendChoiceUI paramInviteRecommendChoiceUI)
  {
  }

  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    AppMethodBeat.i(124901);
    this.gBA.aqX();
    this.gBA.finish();
    AppMethodBeat.o(124901);
    return true;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.account.ui.InviteRecommendChoiceUI.1
 * JD-Core Version:    0.6.2
 */