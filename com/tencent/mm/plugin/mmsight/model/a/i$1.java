package com.tencent.mm.plugin.mmsight.model.a;

import android.os.Message;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ak;

final class i$1 extends ak
{
  i$1(i parami)
  {
  }

  public final void handleMessage(Message paramMessage)
  {
    AppMethodBeat.i(76585);
    if (this.owj.ovU != null)
    {
      this.owj.ovU.WU();
      this.owj.ovU = null;
    }
    AppMethodBeat.o(76585);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.mmsight.model.a.i.1
 * JD-Core Version:    0.6.2
 */