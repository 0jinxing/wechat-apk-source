package com.tencent.mm.plugin.fts.ui.widget;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

final class FTSVoiceInputLayoutImpl$4
  implements Runnable
{
  FTSVoiceInputLayoutImpl$4(FTSVoiceInputLayoutImpl paramFTSVoiceInputLayoutImpl)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(62184);
    b localb = FTSVoiceInputLayoutImpl.b(this.mNb);
    ab.d("MicroMsg.FTSVoiceInputDrawable", "disableState %s", new Object[] { Integer.valueOf(localb.currentState) });
    localb.currentState = 5;
    localb.invalidateSelf();
    AppMethodBeat.o(62184);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.fts.ui.widget.FTSVoiceInputLayoutImpl.4
 * JD-Core Version:    0.6.2
 */