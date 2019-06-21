package com.tencent.mm.plugin.voip.model;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.TimerTask;

final class c$a extends TimerTask
{
  c$a(c paramc)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(4322);
    System.currentTimeMillis();
    if ((c.a(this.sNS) == 1) && (this.sNS.sNi == true))
    {
      System.currentTimeMillis();
      if ((c.b(this.sNS) + this.sNS.fZP < c.c(this.sNS)) && (c.d(this.sNS) == 0))
      {
        c.a(this.sNS, 1);
        int i = this.sNS.sNt.N(c.e(this.sNS), this.sNS.fZP);
        c.a(this.sNS, 0);
        if (i < 0)
        {
          ab.d("MicroMsg.Voip.AudioPlayer", "Task AudioPlayer::  pDevCallBack.PlayDevDataCallBack ret :".concat(String.valueOf(i)));
          AppMethodBeat.o(4322);
        }
      }
    }
    while (true)
    {
      return;
      synchronized (c.f(this.sNS))
      {
        System.arraycopy(c.e(this.sNS), 0, c.g(this.sNS), c.b(this.sNS), this.sNS.fZP);
        c.b(this.sNS, c.b(this.sNS) + this.sNS.fZP);
        c.c(this.sNS, c.h(this.sNS) + (this.sNS.fZP >> 1));
        AppMethodBeat.o(4322);
      }
      AppMethodBeat.o(4322);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.voip.model.c.a
 * JD-Core Version:    0.6.2
 */