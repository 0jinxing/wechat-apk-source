package com.tencent.mm.plugin.shake.d.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.protocal.protobuf.btd;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;

final class a$2
  implements Runnable
{
  a$2(a parama, boolean paramBoolean)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(24590);
    if (this.qtE)
    {
      a.a(this.qtD, null, -1L, this.qtF);
      AppMethodBeat.o(24590);
    }
    while (true)
    {
      return;
      if (!this.qtD.qts)
      {
        ab.w("MicroMsg.MusicFingerPrintRecorder", "tryCallBack netscen not return.");
        AppMethodBeat.o(24590);
      }
      else if (this.qtD.coZ != null)
      {
        ab.w("MicroMsg.MusicFingerPrintRecorder", "tryCallBack device not ready!");
        AppMethodBeat.o(24590);
      }
      else if (this.qtD.qtt != null)
      {
        a locala = this.qtD;
        btd localbtd = this.qtD.qtt.ckw();
        e locale = this.qtD.qtt;
        long l1 = bo.anU();
        long l2 = l1;
        if (locale.qtJ > 0L)
        {
          l2 = l1;
          if (locale.qtJ < l1)
            l2 = locale.qtJ;
        }
        a.a(locala, localbtd, l2, this.qtF);
        AppMethodBeat.o(24590);
      }
      else
      {
        a.a(this.qtD, null, -1L, this.qtF);
        AppMethodBeat.o(24590);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.shake.d.a.a.2
 * JD-Core Version:    0.6.2
 */