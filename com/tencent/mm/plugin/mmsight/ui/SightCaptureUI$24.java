package com.tencent.mm.plugin.mmsight.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.mmsight.model.a.d;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.an;
import com.tencent.mm.sdk.platformtools.bo;

final class SightCaptureUI$24
  implements MMSightRecordButton.a
{
  SightCaptureUI$24(SightCaptureUI paramSightCaptureUI)
  {
  }

  public final void bQu()
  {
    AppMethodBeat.i(55223);
    ab.i("MicroMsg.TestCaptureUiEvent", "onErrorUp: %s", new Object[] { bo.dpG().toString() });
    if (SightCaptureUI.p(this.oDf) != null)
    {
      SightCaptureUI.p(this.oDf).cancel();
      if (SightCaptureUI.l(this.oDf) == 0)
        SightCaptureUI.q(this.oDf);
    }
    AppMethodBeat.o(55223);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.mmsight.ui.SightCaptureUI.24
 * JD-Core Version:    0.6.2
 */