package com.tencent.mm.plugin.ipcall.a.b;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.ipcall.a.c.b;
import com.tencent.mm.plugin.ipcall.a.i;
import com.tencent.mm.plugin.voip.model.v2protocal;
import com.tencent.mm.sdk.platformtools.ab;

final class c$2
  implements Runnable
{
  c$2(c paramc)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(21813);
    try
    {
      c localc = this.nxs;
      com.tencent.mm.audio.b.c localc1 = new com/tencent/mm/audio/b/c;
      localc1.<init>(v2protocal.VOICE_SAMPLERATE, 1, 6);
      localc.nxm = localc1;
      localc.nxm.gG(20);
      localc.nxm.br(true);
      localc.nxm.EJ();
      localc.nxm.cpB = -19;
      localc.nxm.v(1, false);
      localc.nxm.bq(true);
      localc.nxm.cpM = localc.kzo;
      if (!localc.nxm.EL())
      {
        ab.e("MicroMsg.IPCallRecorder", "start record failed");
        if (localc.nxm.cpq == 13)
          break label144;
        i.bHs().bHQ();
        AppMethodBeat.o(21813);
      }
      while (true)
      {
        return;
        localc.nxm.bs(localc.eif);
        label144: AppMethodBeat.o(21813);
      }
    }
    catch (Exception localException)
    {
      while (true)
      {
        ab.e("MicroMsg.IPCallRecorder", "start record error: %s", new Object[] { localException.getMessage() });
        i.bHs().bHQ();
        AppMethodBeat.o(21813);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.ipcall.a.b.c.2
 * JD-Core Version:    0.6.2
 */