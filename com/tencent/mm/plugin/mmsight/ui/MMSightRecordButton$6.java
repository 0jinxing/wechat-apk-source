package com.tencent.mm.plugin.mmsight.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

final class MMSightRecordButton$6
  implements Runnable
{
  MMSightRecordButton$6(MMSightRecordButton paramMMSightRecordButton)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(55098);
    ab.i("MicroMsg.MMSightRecordButton", "startTransition, isDown: %s", new Object[] { Boolean.valueOf(MMSightRecordButton.e(this.oBq)) });
    if (MMSightRecordButton.e(this.oBq))
      MMSightRecordButton.f(this.oBq);
    AppMethodBeat.o(55098);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.mmsight.ui.MMSightRecordButton.6
 * JD-Core Version:    0.6.2
 */