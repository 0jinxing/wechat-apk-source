package com.tencent.mm.pluginsdk.ui;

import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.widget.MMEditText;

final class VoiceInputUI$3
  implements MenuItem.OnMenuItemClickListener
{
  VoiceInputUI$3(VoiceInputUI paramVoiceInputUI)
  {
  }

  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    AppMethodBeat.i(27608);
    VoiceInputUI.c(this.vjG).setText("");
    VoiceInputUI.d(this.vjG);
    this.vjG.KP(6);
    AppMethodBeat.o(27608);
    return true;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.ui.VoiceInputUI.3
 * JD-Core Version:    0.6.2
 */