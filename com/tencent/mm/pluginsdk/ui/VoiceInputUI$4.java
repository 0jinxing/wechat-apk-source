package com.tencent.mm.pluginsdk.ui;

import android.widget.Button;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class VoiceInputUI$4
  implements VoiceInputFooter.a
{
  VoiceInputUI$4(VoiceInputUI paramVoiceInputUI)
  {
  }

  public final void djs()
  {
    AppMethodBeat.i(27610);
    this.vjG.KP(8);
    AppMethodBeat.o(27610);
  }

  public final void oA(boolean paramBoolean)
  {
    AppMethodBeat.i(27609);
    if (paramBoolean)
    {
      VoiceInputUI.e(this.vjG).setVisibility(4);
      AppMethodBeat.o(27609);
    }
    while (true)
    {
      return;
      VoiceInputUI.e(this.vjG).setVisibility(0);
      AppMethodBeat.o(27609);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.ui.VoiceInputUI.4
 * JD-Core Version:    0.6.2
 */