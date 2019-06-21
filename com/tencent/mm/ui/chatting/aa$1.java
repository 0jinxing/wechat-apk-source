package com.tencent.mm.ui.chatting;

import android.os.Looper;
import android.os.Message;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.model.aw;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ak;

final class aa$1 extends ak
{
  aa$1(aa paramaa, Looper paramLooper)
  {
    super(paramLooper);
  }

  public final void handleMessage(Message paramMessage)
  {
    AppMethodBeat.i(30916);
    if ((this.yLA.kbM == null) || (!aw.RK()))
      AppMethodBeat.o(30916);
    while (true)
    {
      return;
      ab.d("MicroMsg.EggMgr", "post start egg");
      this.yLA.a(this.yLA.yLz, this.yLA.kbM);
      AppMethodBeat.o(30916);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.aa.1
 * JD-Core Version:    0.6.2
 */