package com.tencent.mm.ui.base;

import android.os.Message;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ak;

final class t$4 extends ak
{
  t$4(o paramo)
  {
  }

  public final void handleMessage(Message paramMessage)
  {
    AppMethodBeat.i(106873);
    this.yxX.dismiss();
    super.handleMessage(paramMessage);
    AppMethodBeat.o(106873);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.base.t.4
 * JD-Core Version:    0.6.2
 */