package com.tencent.mm.plugin.topstory.ui.home;

import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class TopStoryUploadUI$1
  implements MenuItem.OnMenuItemClickListener
{
  TopStoryUploadUI$1(TopStoryUploadUI paramTopStoryUploadUI)
  {
  }

  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    AppMethodBeat.i(1680);
    TopStoryUploadUI.a(this.sDa);
    AppMethodBeat.o(1680);
    return true;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.topstory.ui.home.TopStoryUploadUI.1
 * JD-Core Version:    0.6.2
 */