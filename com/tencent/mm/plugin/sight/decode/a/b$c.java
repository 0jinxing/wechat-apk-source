package com.tencent.mm.plugin.sight.decode.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.modelvideo.o;
import com.tencent.mm.sdk.platformtools.ab;

final class b$c
  implements Runnable
{
  volatile boolean ovl;
  int qyd;
  b.b qye;

  public b$c(b paramb)
  {
    AppMethodBeat.i(70238);
    this.ovl = false;
    ab.i("MicroMsg.SightPlayController", "make sure drawJob alive");
    AppMethodBeat.o(70238);
  }

  public final void run()
  {
    AppMethodBeat.i(70239);
    if (this.ovl)
    {
      ab.e("MicroMsg.SightPlayController", "#0x%x-#0x%x match stop draw", new Object[] { Integer.valueOf(this.qxW.hashCode()), Integer.valueOf(hashCode()) });
      AppMethodBeat.o(70239);
    }
    while (true)
    {
      return;
      this.qxW.U(b.C(this.qxW));
      if (b.s(this.qxW) == 0L)
      {
        o.i(this.qye, 0L);
        AppMethodBeat.o(70239);
      }
      else
      {
        long l = this.qxW.qxq - (System.currentTimeMillis() - b.s(this.qxW));
        if (l > 0L)
        {
          o.i(this.qye, l);
          AppMethodBeat.o(70239);
        }
        else
        {
          o.i(this.qye, 0L);
          AppMethodBeat.o(70239);
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sight.decode.a.b.c
 * JD-Core Version:    0.6.2
 */