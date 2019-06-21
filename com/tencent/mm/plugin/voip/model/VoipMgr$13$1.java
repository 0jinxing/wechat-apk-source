package com.tencent.mm.plugin.voip.model;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.a.vj;
import com.tencent.mm.g.a.vj.a;
import com.tencent.mm.plugin.voip.a.b;
import com.tencent.mm.plugin.voip.a.c;

final class VoipMgr$13$1
  implements Runnable
{
  VoipMgr$13$1(VoipMgr.13 param13, vj paramvj)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(4473);
    switch (this.sSw.cSr.cuy)
    {
    default:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      AppMethodBeat.o(4473);
      while (true)
      {
        return;
        if (b.GO(VoipMgr.a(this.sSx.sSn).mState))
        {
          this.sSx.sSn.cJn();
          AppMethodBeat.o(4473);
        }
        else
        {
          this.sSx.sSn.cJq();
          AppMethodBeat.o(4473);
          continue;
          if (b.GO(VoipMgr.a(this.sSx.sSn).mState))
          {
            this.sSx.sSn.cJm();
            AppMethodBeat.o(4473);
          }
          else
          {
            this.sSx.sSn.cJp();
            AppMethodBeat.o(4473);
          }
        }
      }
      this.sSx.sSn.cJk();
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.voip.model.VoipMgr.13.1
 * JD-Core Version:    0.6.2
 */