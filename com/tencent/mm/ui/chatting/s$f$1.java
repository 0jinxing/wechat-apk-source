package com.tencent.mm.ui.chatting;

import android.os.Message;
import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ak;

final class s$f$1 extends ak
{
  s$f$1(s.f paramf)
  {
  }

  public final void handleMessage(Message paramMessage)
  {
    AppMethodBeat.i(30721);
    paramMessage = (View)paramMessage.obj;
    if (this.yJP.urq != paramMessage.getScrollY())
    {
      this.yJP.swe = true;
      this.yJP.handler.sendMessageDelayed(this.yJP.handler.obtainMessage(0, paramMessage), 5L);
      this.yJP.urq = paramMessage.getScrollY();
      AppMethodBeat.o(30721);
    }
    while (true)
    {
      return;
      this.yJP.swe = false;
      AppMethodBeat.o(30721);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.s.f.1
 * JD-Core Version:    0.6.2
 */