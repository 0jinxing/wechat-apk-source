package com.tencent.mm.ui.chatting;

import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class ResourcesExceedUI$1
  implements MenuItem.OnMenuItemClickListener
{
  ResourcesExceedUI$1(ResourcesExceedUI paramResourcesExceedUI)
  {
  }

  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    AppMethodBeat.i(30984);
    this.yLZ.finish();
    AppMethodBeat.o(30984);
    return true;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.ResourcesExceedUI.1
 * JD-Core Version:    0.6.2
 */