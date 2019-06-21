package com.tencent.mm.plugin.mmsight.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.compatible.e.m;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.bo;

final class SightCaptureUI$11
  implements Runnable
{
  SightCaptureUI$11(SightCaptureUI paramSightCaptureUI)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(55197);
    String str = com.tencent.mm.plugin.mmsight.d.RK(SightCaptureUI.p(this.oDf).getFilePath());
    if (bo.isNullOrNil(str))
      AppMethodBeat.o(55197);
    while (true)
    {
      return;
      str = str + "\n" + String.format("FPS: %s", new Object[] { Float.valueOf(SightCaptureUI.p(this.oDf).WJ()) });
      str = str + "\n" + String.format("TIME_RECODER_2_PLAY: %s", new Object[] { Long.valueOf(com.tencent.mm.plugin.mmsight.d.RN("TIME_RECODER_2_PLAY")) });
      al.d(new SightCaptureUI.11.1(this, str + "\n" + String.format("CPU: cur %s max:%s", new Object[] { m.Lz(), m.Lx() })));
      AppMethodBeat.o(55197);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.mmsight.ui.SightCaptureUI.11
 * JD-Core Version:    0.6.2
 */