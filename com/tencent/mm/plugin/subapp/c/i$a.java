package com.tencent.mm.plugin.subapp.c;

import android.os.Message;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.j.b;
import com.tencent.mm.modelvoice.k;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.bo;

final class i$a
  implements Runnable
{
  ak handler;

  public i$a(final i parami)
  {
    AppMethodBeat.i(25296);
    this.handler = new ak()
    {
      public final void handleMessage(Message paramAnonymousMessage)
      {
        AppMethodBeat.i(25295);
        if (i.c(i.a.this.stm) <= 0)
        {
          AppMethodBeat.o(25295);
          return;
        }
        paramAnonymousMessage = new StringBuilder("On Part :");
        if (i.a.this.stm.stf == null);
        for (boolean bool = true; ; bool = false)
        {
          ab.d("MicroMsg.VoiceRemindRecorder", bool);
          i.d(i.a.this.stm);
          if (i.a.this.stm.stf != null)
            i.a.this.stm.stf.acE();
          AppMethodBeat.o(25295);
          break;
        }
      }
    };
    AppMethodBeat.o(25296);
  }

  public final void run()
  {
    AppMethodBeat.i(25297);
    if (i.e(this.stm) == null)
    {
      ab.e("MicroMsg.VoiceRemindRecorder", "Stop Record Failed recorder == null");
      AppMethodBeat.o(25297);
    }
    while (true)
    {
      return;
      synchronized (this.stm)
      {
        if (!i.e(this.stm).el(h.by(i.a(this.stm), true)))
        {
          i.abn(i.a(this.stm));
          i.f(this.stm);
          localStringBuilder = new java/lang/StringBuilder;
          localStringBuilder.<init>("Thread Start Record  Error fileName[");
          ab.d("MicroMsg.VoiceRemindRecorder", i.a(this.stm) + "]");
          i.g(this.stm);
        }
        i.a(this.stm, bo.yz());
        StringBuilder localStringBuilder = new java/lang/StringBuilder;
        localStringBuilder.<init>("Thread Started Record fileName[");
        ab.d("MicroMsg.VoiceRemindRecorder", i.a(this.stm) + "] time:" + bo.az(i.h(this.stm)));
        this.handler.sendEmptyMessageDelayed(0, 1L);
        AppMethodBeat.o(25297);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.subapp.c.i.a
 * JD-Core Version:    0.6.2
 */