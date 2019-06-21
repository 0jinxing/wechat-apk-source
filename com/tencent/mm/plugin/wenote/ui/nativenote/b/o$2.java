package com.tencent.mm.plugin.wenote.ui.nativenote.b;

import android.os.Message;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bk.a;
import com.tencent.mm.plugin.wenote.model.a.l;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.ak;

final class o$2 extends ak
{
  o$2(o paramo)
  {
  }

  public final void handleMessage(Message paramMessage)
  {
    AppMethodBeat.i(27185);
    if (o.a(this.uVf).uOp)
    {
      o.b(this.uVf).removeMessages(4096);
      AppMethodBeat.o(27185);
    }
    while (true)
    {
      return;
      paramMessage = " " + a.B(ah.getContext(), o.a(this.uVf).uOB).toString();
      o.c(this.uVf).setText(paramMessage);
      sendEmptyMessageDelayed(4096, 500L);
      AppMethodBeat.o(27185);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wenote.ui.nativenote.b.o.2
 * JD-Core Version:    0.6.2
 */