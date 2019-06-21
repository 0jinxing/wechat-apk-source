package com.tencent.mm.plugin.mmsight.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

final class MMSightRecordButton$1
  implements MMSightCircularProgressBar.a
{
  MMSightRecordButton$1(MMSightRecordButton paramMMSightRecordButton, MMSightCircularProgressBar.a parama)
  {
  }

  public final void bnW()
  {
    AppMethodBeat.i(55091);
    ab.c("MicroMsg.MMSightRecordButton", "outer, onProgressFinish", new Object[0]);
    this.oBq.bgk();
    MMSightRecordButton.a(this.oBq, new MMSightRecordButton.1.1(this));
    AppMethodBeat.o(55091);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.mmsight.ui.MMSightRecordButton.1
 * JD-Core Version:    0.6.2
 */