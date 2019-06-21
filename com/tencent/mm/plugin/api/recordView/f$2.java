package com.tencent.mm.plugin.api.recordView;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.mmsight.api.MMSightRecordView.c;

final class f$2
  implements Runnable
{
  f$2(f paramf)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(138312);
    if (this.gMl.gMe != null)
      this.gMl.gMe.aDp();
    AppMethodBeat.o(138312);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.api.recordView.f.2
 * JD-Core Version:    0.6.2
 */