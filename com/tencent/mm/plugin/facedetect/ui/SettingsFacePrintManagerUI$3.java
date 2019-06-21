package com.tencent.mm.plugin.facedetect.ui;

import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class SettingsFacePrintManagerUI$3
  implements MenuItem.OnMenuItemClickListener
{
  SettingsFacePrintManagerUI$3(SettingsFacePrintManagerUI paramSettingsFacePrintManagerUI)
  {
  }

  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    AppMethodBeat.i(529);
    this.lYS.finish();
    AppMethodBeat.o(529);
    return true;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.facedetect.ui.SettingsFacePrintManagerUI.3
 * JD-Core Version:    0.6.2
 */