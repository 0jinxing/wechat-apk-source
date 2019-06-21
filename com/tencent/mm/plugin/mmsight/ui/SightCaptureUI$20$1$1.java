package com.tencent.mm.plugin.mmsight.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.pluginsdk.ui.tools.VideoPlayerTextureView;
import com.tencent.mm.sdk.platformtools.ab;

final class SightCaptureUI$20$1$1
  implements Runnable
{
  SightCaptureUI$20$1$1(SightCaptureUI.20.1 param1)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(55213);
    ab.i("MicroMsg.SightCaptureUI", "onTextureUpdate");
    if (SightCaptureUI.T(this.oDn.oDm.oDf) == null)
      AppMethodBeat.o(55213);
    while (true)
    {
      return;
      SightCaptureUI.T(this.oDn.oDm.oDf).setAlpha(1.0F);
      SightCaptureUI.g(this.oDn.oDm.oDf, 4);
      SightCaptureUI.G(this.oDn.oDm.oDf);
      AppMethodBeat.o(55213);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.mmsight.ui.SightCaptureUI.20.1.1
 * JD-Core Version:    0.6.2
 */