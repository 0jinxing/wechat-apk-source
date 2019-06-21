package com.tencent.mm.plugin.mmsight.segment;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.compatible.e.q;
import com.tencent.mm.plugin.mmsight.model.CaptureMMProxy;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;

final class MMSightEditUI$1
  implements Runnable
{
  MMSightEditUI$1(MMSightEditUI paramMMSightEditUI, long paramLong)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(54959);
    ab.i("MicroMsg.MMSightEditUI", "connect cost %sms", new Object[] { Long.valueOf(bo.az(this.mRw)) });
    if (CaptureMMProxy.getInstance() != null)
      q.ku(CaptureMMProxy.getInstance().getDeviceInfoConfig());
    MMSightEditUI.a(this.oxT);
    AppMethodBeat.o(54959);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.mmsight.segment.MMSightEditUI.1
 * JD-Core Version:    0.6.2
 */