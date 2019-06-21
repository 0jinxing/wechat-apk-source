package com.tencent.mm.audio.mix.d;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.List;

final class a$1
  implements j
{
  a$1(a parama)
  {
  }

  public final void a(b paramb)
  {
    AppMethodBeat.i(137037);
    com.tencent.mm.audio.mix.h.b.i("MicroMsg.Mix.AudioDecodeMgr", "decode process end");
    h.b(paramb);
    AppMethodBeat.o(137037);
  }

  public final void a(k paramk)
  {
    AppMethodBeat.i(137036);
    if (paramk == null)
    {
      com.tencent.mm.audio.mix.h.b.e("MicroMsg.Mix.AudioDecodeMgr", "process decoder is null");
      AppMethodBeat.o(137036);
    }
    while (true)
    {
      return;
      com.tencent.mm.ag.b localb = paramk.DM();
      paramk.DF();
      paramk.DC();
      paramk.release();
      paramk = this.clG.ckQ;
      if (localb != null);
      try
      {
        if (this.clG.clE.contains(localb.filePath))
          this.clG.clE.remove(localb.filePath);
        AppMethodBeat.o(137036);
      }
      finally
      {
        AppMethodBeat.o(137036);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.audio.mix.d.a.1
 * JD-Core Version:    0.6.2
 */