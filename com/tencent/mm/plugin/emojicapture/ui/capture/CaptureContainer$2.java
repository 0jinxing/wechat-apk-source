package com.tencent.mm.plugin.emojicapture.ui.capture;

import a.l;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.mmsight.ui.MMSightRecordButton.d;
import com.tencent.mm.sdk.platformtools.ab;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"<anonymous>", "", "onSimpleTap"})
final class CaptureContainer$2
  implements MMSightRecordButton.d
{
  CaptureContainer$2(CaptureContainer paramCaptureContainer)
  {
  }

  public final void bnX()
  {
    AppMethodBeat.i(2950);
    ab.i(CaptureContainer.e(this.lmt), "simpleTapCallback");
    CaptureContainer.a(this.lmt, false);
    AppMethodBeat.o(2950);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.emojicapture.ui.capture.CaptureContainer.2
 * JD-Core Version:    0.6.2
 */