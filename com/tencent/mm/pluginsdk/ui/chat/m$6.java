package com.tencent.mm.pluginsdk.ui.chat;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ak;

public final class m$6
  implements Runnable
{
  public m$6(m paramm, String paramString)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(62459);
    if (this.voP.cM(this.fOH))
    {
      this.voP.mHandler.sendEmptyMessage(20003);
      AppMethodBeat.o(62459);
    }
    while (true)
    {
      return;
      this.voP.mHandler.removeMessages(20003);
      this.voP.mHandler.sendEmptyMessage(20001);
      AppMethodBeat.o(62459);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.ui.chat.m.6
 * JD-Core Version:    0.6.2
 */