package com.tencent.mm.ui.g;

import android.os.Message;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ak;

final class b$1 extends ak
{
  b$1(b paramb)
  {
  }

  public final void handleMessage(Message paramMessage)
  {
    AppMethodBeat.i(107426);
    switch (paramMessage.what)
    {
    default:
      super.handleMessage(paramMessage);
      AppMethodBeat.o(107426);
    case 256:
    }
    while (true)
    {
      return;
      this.zzD.dismiss();
      AppMethodBeat.o(107426);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.g.b.1
 * JD-Core Version:    0.6.2
 */