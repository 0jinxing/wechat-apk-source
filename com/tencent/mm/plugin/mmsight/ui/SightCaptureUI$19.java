package com.tencent.mm.plugin.mmsight.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

final class SightCaptureUI$19
  implements Runnable
{
  SightCaptureUI$19(SightCaptureUI paramSightCaptureUI)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(55212);
    if (SightCaptureUI.g(this.oDf) != 4)
    {
      ab.e("MicroMsg.SightCaptureUI", "checkPreviewStatusRunnable, not previewing now!!!");
      SightCaptureUI.g(this.oDf, 9);
    }
    AppMethodBeat.o(55212);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.mmsight.ui.SightCaptureUI.19
 * JD-Core Version:    0.6.2
 */