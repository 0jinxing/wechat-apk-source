package com.tencent.mm.plugin.mmsight.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.an;
import com.tencent.mm.sdk.platformtools.bo;

final class SightCaptureUI$26
  implements MMSightRecordButton.d
{
  SightCaptureUI$26(SightCaptureUI paramSightCaptureUI)
  {
  }

  public final void bnX()
  {
    AppMethodBeat.i(55226);
    ab.v("MicroMsg.TestCaptureUiEvent", "onSimpleTap %s", new Object[] { bo.dpG().toString() });
    if (SightCaptureUI.p(this.oDf) != null)
    {
      ab.i("MicroMsg.SightCaptureUI", "onSimpleTap, mediaRecorder.status: %s", new Object[] { SightCaptureUI.p(this.oDf).WL() });
      SightCaptureUI.p(this.oDf).cancel();
    }
    com.tencent.mm.plugin.mmsight.d.RM("TIME_RECODER_2_PLAY");
    SightCaptureUI.q(this.oDf);
    AppMethodBeat.o(55226);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.mmsight.ui.SightCaptureUI.26
 * JD-Core Version:    0.6.2
 */