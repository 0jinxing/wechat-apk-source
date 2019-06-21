package com.tencent.mm.ui.voicesearch;

import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class SearchConversationResultUI$2
  implements MenuItem.OnMenuItemClickListener
{
  SearchConversationResultUI$2(SearchConversationResultUI paramSearchConversationResultUI)
  {
  }

  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    AppMethodBeat.i(35316);
    this.zLu.finish();
    AppMethodBeat.o(35316);
    return true;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.voicesearch.SearchConversationResultUI.2
 * JD-Core Version:    0.6.2
 */