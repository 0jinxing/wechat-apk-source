package com.tencent.mm.plugin.fts.ui.widget;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.modelvoiceaddr.b;
import com.tencent.mm.sdk.platformtools.ap.a;

final class VoiceInputLayout$4
  implements ap.a
{
  VoiceInputLayout$4(VoiceInputLayout paramVoiceInputLayout)
  {
  }

  public final boolean BI()
  {
    AppMethodBeat.i(62213);
    if (VoiceInputLayout.b(this.mNl) == null)
      AppMethodBeat.o(62213);
    while (true)
    {
      return true;
      int i = VoiceInputLayout.b(this.mNl).getMaxAmplitudeRate();
      if (this.mNl.currentState == 2)
        this.mNl.wj(i);
      AppMethodBeat.o(62213);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.fts.ui.widget.VoiceInputLayout.4
 * JD-Core Version:    0.6.2
 */