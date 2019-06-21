package com.tencent.mm.plugin.subapp.ui.friend;

import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class FMessageConversationUI$6
  implements MenuItem.OnMenuItemClickListener
{
  FMessageConversationUI$6(FMessageConversationUI paramFMessageConversationUI)
  {
  }

  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    AppMethodBeat.i(25363);
    this.stR.finish();
    AppMethodBeat.o(25363);
    return true;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.subapp.ui.friend.FMessageConversationUI.6
 * JD-Core Version:    0.6.2
 */