package com.tencent.mm.plugin.api.recordView;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.mmsight.api.MMSightRecordView.h;

final class f$4
  implements Runnable
{
  f$4(f paramf, MMSightRecordView.h paramh)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(76341);
    this.gMl.gLT = false;
    if (this.gMm != null)
      this.gMm.dX(false);
    AppMethodBeat.o(76341);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.api.recordView.f.4
 * JD-Core Version:    0.6.2
 */