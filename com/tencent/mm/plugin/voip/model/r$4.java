package com.tencent.mm.plugin.voip.model;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.voip.ui.b;

final class r$4
  implements Runnable
{
  r$4(r paramr, String paramString)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(4604);
    if (this.sTg.sSQ != null)
    {
      VoipMgr localVoipMgr = this.sTg.sSQ;
      String str = this.val$tips;
      if (localVoipMgr.sRe != null)
      {
        localVoipMgr.sRK = str;
        localVoipMgr.sRe.abY(str);
      }
    }
    AppMethodBeat.o(4604);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.voip.model.r.4
 * JD-Core Version:    0.6.2
 */