package com.tencent.mm.plugin.voiceprint.model;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.compatible.util.b;
import com.tencent.mm.modelvoice.k;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.bo;

final class p$b extends Thread
{
  ak handler;

  public p$b(p paramp)
  {
    AppMethodBeat.i(26124);
    this.handler = new p.b.1(this, paramp);
    AppMethodBeat.o(26124);
  }

  public final void run()
  {
    AppMethodBeat.i(26125);
    if (p.d(this.sLF) == null)
    {
      ab.e("MicroMsg.VoicePrintRecoder", "Stop Record Failed recorder == null");
      AppMethodBeat.o(26125);
    }
    while (true)
    {
      return;
      synchronized (this.sLF)
      {
        Object localObject1 = m.by(p.e(this.sLF), true);
        ab.d("MicroMsg.VoicePrintRecoder", "fullPathName %s", new Object[] { localObject1 });
        this.sLF.sLC = ((String)localObject1);
        if (p.f(this.sLF) != null)
          p.f(this.sLF).requestFocus();
        if (!p.d(this.sLF).el((String)localObject1))
        {
          p.g(this.sLF);
          localObject1 = new java/lang/StringBuilder;
          ((StringBuilder)localObject1).<init>("Thread Start Record  Error fileName[");
          ab.d("MicroMsg.VoicePrintRecoder", p.e(this.sLF) + "]");
          p.d(this.sLF).EB();
          p.h(this.sLF);
          if (p.f(this.sLF) != null)
            p.f(this.sLF).Mm();
          if (p.i(this.sLF) != null)
            p.i(this.sLF).cHQ();
          AppMethodBeat.o(26125);
          continue;
        }
        if (p.i(this.sLF) != null)
          p.i(this.sLF);
        p.a(this.sLF, bo.yz());
        localObject1 = new java/lang/StringBuilder;
        ((StringBuilder)localObject1).<init>("Thread Started Record fileName[");
        ab.d("MicroMsg.VoicePrintRecoder", p.e(this.sLF) + "]");
        this.handler.sendEmptyMessageDelayed(0, 1L);
        AppMethodBeat.o(26125);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.voiceprint.model.p.b
 * JD-Core Version:    0.6.2
 */