package com.tencent.mm.plugin.subapp.ui.friend;

import android.view.MenuItem;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bi.c;
import com.tencent.mm.ui.base.n.d;

final class FMessageConversationUI$7
  implements n.d
{
  FMessageConversationUI$7(FMessageConversationUI paramFMessageConversationUI)
  {
  }

  public final void onMMMenuItemSelected(MenuItem paramMenuItem, int paramInt)
  {
    AppMethodBeat.i(25364);
    c.e(FMessageConversationUI.d(this.stR), FMessageConversationUI.e(this.stR));
    AppMethodBeat.o(25364);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.subapp.ui.friend.FMessageConversationUI.7
 * JD-Core Version:    0.6.2
 */