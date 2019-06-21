package com.tencent.mm.pluginsdk.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.modelvoiceaddr.g;
import com.tencent.mm.sdk.platformtools.ap.a;

final class VoiceInputLayout$4
  implements ap.a
{
  VoiceInputLayout$4(VoiceInputLayout paramVoiceInputLayout)
  {
  }

  public final boolean BI()
  {
    AppMethodBeat.i(27585);
    if (VoiceInputLayout.b(this.vjt) == null)
      AppMethodBeat.o(27585);
    while (true)
    {
      return true;
      int i = VoiceInputLayout.b(this.vjt).getMaxAmplitudeRate();
      if (this.vjt.currentState == 2)
        this.vjt.wj(i);
      AppMethodBeat.o(27585);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.ui.VoiceInputLayout.4
 * JD-Core Version:    0.6.2
 */