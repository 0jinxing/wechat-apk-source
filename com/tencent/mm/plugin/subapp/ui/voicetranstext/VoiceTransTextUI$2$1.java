package com.tencent.mm.plugin.subapp.ui.voicetranstext;

import android.text.ClipboardManager;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.base.h.c;

final class VoiceTransTextUI$2$1
  implements h.c
{
  VoiceTransTextUI$2$1(VoiceTransTextUI.2 param2)
  {
  }

  public final void iE(int paramInt)
  {
    AppMethodBeat.i(25592);
    if ((paramInt == 0) && (VoiceTransTextUI.a(this.swm.swl) != null) && (VoiceTransTextUI.b(this.swm.swl) != null))
      VoiceTransTextUI.a(this.swm.swl).setText(VoiceTransTextUI.b(this.swm.swl).getText());
    AppMethodBeat.o(25592);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.subapp.ui.voicetranstext.VoiceTransTextUI.2.1
 * JD-Core Version:    0.6.2
 */