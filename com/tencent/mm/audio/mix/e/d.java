package com.tencent.mm.audio.mix.e;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.List;

public final class d
  implements i
{
  private h cmO;
  private int cmP = 4;

  public final com.tencent.mm.audio.mix.a.b I(List<com.tencent.mm.audio.mix.a.d> paramList)
  {
    Object localObject = null;
    AppMethodBeat.i(137116);
    if (this.cmO == null)
    {
      com.tencent.mm.audio.mix.h.b.e("MicroMsg.Mix.AudioMixer", "mixAlgorithm must be init, please call init() first");
      AppMethodBeat.o(137116);
      paramList = localObject;
    }
    while (true)
    {
      return paramList;
      com.tencent.mm.audio.mix.a.b localb = com.tencent.mm.audio.mix.b.a.Dg().Dh();
      if (!this.cmO.a(localb, paramList))
      {
        com.tencent.mm.audio.mix.h.b.e("MicroMsg.Mix.AudioMixer", "mix audio fail");
        AppMethodBeat.o(137116);
        paramList = localObject;
      }
      else
      {
        AppMethodBeat.o(137116);
        paramList = localb;
      }
    }
  }

  public final void init()
  {
    AppMethodBeat.i(137115);
    Object localObject;
    if (this.cmO == null)
      switch (this.cmP)
      {
      default:
        localObject = new j();
      case 1:
      case 2:
      case 3:
      case 4:
      case 5:
      case 6:
      case 7:
      case 8:
      }
    while (true)
    {
      this.cmO = ((h)localObject);
      AppMethodBeat.o(137115);
      return;
      localObject = new n();
      continue;
      localObject = new a();
      continue;
      localObject = new k();
      continue;
      localObject = new j();
      continue;
      localObject = new m();
      continue;
      localObject = new o();
      continue;
      localObject = new l();
      continue;
      localObject = new b();
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.audio.mix.e.d
 * JD-Core Version:    0.6.2
 */