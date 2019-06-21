package com.tencent.mm.ui.websearch;

import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class WebSearchBaseActivity$1
  implements MenuItem.OnMenuItemClickListener
{
  WebSearchBaseActivity$1(WebSearchBaseActivity paramWebSearchBaseActivity)
  {
  }

  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    AppMethodBeat.i(35380);
    this.zLJ.finish();
    AppMethodBeat.o(35380);
    return true;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.websearch.WebSearchBaseActivity.1
 * JD-Core Version:    0.6.2
 */