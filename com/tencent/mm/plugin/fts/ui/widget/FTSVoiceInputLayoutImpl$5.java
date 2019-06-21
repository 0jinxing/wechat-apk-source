package com.tencent.mm.plugin.fts.ui.widget;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

final class FTSVoiceInputLayoutImpl$5
  implements Runnable
{
  FTSVoiceInputLayoutImpl$5(FTSVoiceInputLayoutImpl paramFTSVoiceInputLayoutImpl)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(62185);
    b localb = FTSVoiceInputLayoutImpl.b(this.mNb);
    boolean bool = this.mNc;
    ab.d("MicroMsg.FTSVoiceInputDrawable", "recordingStartState() called with: maxAmplitudeRate = [%s] fromLongCkick = %s", new Object[] { Integer.valueOf(0), Boolean.valueOf(bool) });
    if (!bool)
      localb.currentState = 3;
    localb.mMC = b.wh(0);
    localb.invalidateSelf();
    localb.mME = 0;
    AppMethodBeat.o(62185);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.fts.ui.widget.FTSVoiceInputLayoutImpl.5
 * JD-Core Version:    0.6.2
 */