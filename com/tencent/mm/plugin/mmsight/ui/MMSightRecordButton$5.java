package com.tencent.mm.plugin.mmsight.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

final class MMSightRecordButton$5
  implements Runnable
{
  MMSightRecordButton$5(MMSightRecordButton paramMMSightRecordButton)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(55097);
    ab.i("MicroMsg.MMSightRecordButton", "on Long Press, isDispatchSimpleTap: %s, isDispatchLongPress: %s", new Object[] { Boolean.valueOf(MMSightRecordButton.a(this.oBq)), Boolean.valueOf(MMSightRecordButton.b(this.oBq)) });
    if (!MMSightRecordButton.a(this.oBq))
    {
      MMSightRecordButton.c(this.oBq);
      if (MMSightRecordButton.d(this.oBq) != null)
        MMSightRecordButton.d(this.oBq).jdMethod_if();
    }
    AppMethodBeat.o(55097);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.mmsight.ui.MMSightRecordButton.5
 * JD-Core Version:    0.6.2
 */