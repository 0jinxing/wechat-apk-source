package com.tencent.mm.plugin.topstory.ui.home;

import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class TopStorySettingUI$1
  implements MenuItem.OnMenuItemClickListener
{
  TopStorySettingUI$1(TopStorySettingUI paramTopStorySettingUI)
  {
  }

  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    AppMethodBeat.i(1625);
    this.sCI.finish();
    AppMethodBeat.o(1625);
    return true;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.topstory.ui.home.TopStorySettingUI.1
 * JD-Core Version:    0.6.2
 */