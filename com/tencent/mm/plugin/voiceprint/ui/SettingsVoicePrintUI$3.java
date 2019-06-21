package com.tencent.mm.plugin.voiceprint.ui;

import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class SettingsVoicePrintUI$3
  implements MenuItem.OnMenuItemClickListener
{
  SettingsVoicePrintUI$3(SettingsVoicePrintUI paramSettingsVoicePrintUI)
  {
  }

  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    AppMethodBeat.i(26145);
    this.sMd.finish();
    AppMethodBeat.o(26145);
    return true;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.voiceprint.ui.SettingsVoicePrintUI.3
 * JD-Core Version:    0.6.2
 */