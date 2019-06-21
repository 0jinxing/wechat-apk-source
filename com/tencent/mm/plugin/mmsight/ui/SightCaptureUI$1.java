package com.tencent.mm.plugin.mmsight.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.mmsight.SightParams;
import com.tencent.mm.plugin.mmsight.model.j;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;

final class SightCaptureUI$1
  implements Runnable
{
  SightCaptureUI$1(SightCaptureUI paramSightCaptureUI, long paramLong)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(55180);
    ab.i("MicroMsg.SightCaptureUI", "connect cost %sms", new Object[] { Long.valueOf(bo.az(this.mRw)) });
    j.c(SightCaptureUI.a(this.oDf).fcY);
    SightCaptureUI.b(this.oDf);
    AppMethodBeat.o(55180);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.mmsight.ui.SightCaptureUI.1
 * JD-Core Version:    0.6.2
 */