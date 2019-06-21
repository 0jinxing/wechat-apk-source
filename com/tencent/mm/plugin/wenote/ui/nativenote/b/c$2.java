package com.tencent.mm.plugin.wenote.ui.nativenote.b;

import android.os.Message;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bk.a;
import com.tencent.mm.plugin.wenote.model.a.l;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.ak;

final class c$2 extends ak
{
  c$2(c paramc)
  {
  }

  public final void handleMessage(Message paramMessage)
  {
    AppMethodBeat.i(27152);
    if (c.a(this.uUq).uOp)
    {
      c.b(this.uUq).removeMessages(4096);
      AppMethodBeat.o(27152);
    }
    while (true)
    {
      return;
      paramMessage = " " + a.B(ah.getContext(), c.a(this.uUq).uOB).toString();
      c.c(this.uUq).setText(paramMessage);
      sendEmptyMessageDelayed(4096, 500L);
      AppMethodBeat.o(27152);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wenote.ui.nativenote.b.c.2
 * JD-Core Version:    0.6.2
 */