package com.tencent.mm.plugin.mmsight.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.mmsight.model.e;

final class SightCaptureUI$25
  implements MMSightRecordButton.c
{
  SightCaptureUI$25(SightCaptureUI paramSightCaptureUI)
  {
  }

  public final void uF(int paramInt)
  {
    AppMethodBeat.i(55224);
    if (SightCaptureUI.j(this.oDf) != null)
      SightCaptureUI.j(this.oDf).d(true, true, paramInt);
    AppMethodBeat.o(55224);
  }

  public final void uG(int paramInt)
  {
    AppMethodBeat.i(55225);
    if (SightCaptureUI.j(this.oDf) != null)
      SightCaptureUI.j(this.oDf).d(false, true, paramInt);
    AppMethodBeat.o(55225);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.mmsight.ui.SightCaptureUI.25
 * JD-Core Version:    0.6.2
 */