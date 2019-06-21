package com.tencent.mm.plugin.fingerprint.b;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.fingerprint.FingerPrintAuth;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;

final class q$1
  implements Runnable
{
  q$1(q paramq)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(41559);
    String str = "";
    if (e.bxs())
    {
      ab.i("MicroMsg.SyncGenRsaKey", "device is support FingerPrintAuth");
      str = FingerPrintAuth.genRsaKey(e.dQ(ah.getContext()), e.getUserId(), com.tencent.mm.compatible.e.q.LM());
    }
    while (true)
    {
      if (this.msh.msf != null)
        this.msh.msf.AR(str);
      AppMethodBeat.o(41559);
      return;
      ab.e("MicroMsg.SyncGenRsaKey", "device is not support FingerPrintAuth");
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.fingerprint.b.q.1
 * JD-Core Version:    0.6.2
 */