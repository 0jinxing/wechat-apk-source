package com.tencent.mm.plugin.base.stub;

import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class WXEntryActivity$1
  implements MenuItem.OnMenuItemClickListener
{
  WXEntryActivity$1(WXEntryActivity paramWXEntryActivity)
  {
  }

  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    AppMethodBeat.i(18190);
    WXEntryActivity.a(this.jEd);
    AppMethodBeat.o(18190);
    return false;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.base.stub.WXEntryActivity.1
 * JD-Core Version:    0.6.2
 */