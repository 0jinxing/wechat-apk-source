package com.tencent.mm.plugin.voiceprint.ui;

import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class VoicePrintFinishUI$2
  implements MenuItem.OnMenuItemClickListener
{
  VoicePrintFinishUI$2(VoicePrintFinishUI paramVoicePrintFinishUI)
  {
  }

  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    AppMethodBeat.i(26206);
    this.sMs.finish();
    AppMethodBeat.o(26206);
    return true;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.voiceprint.ui.VoicePrintFinishUI.2
 * JD-Core Version:    0.6.2
 */