package com.tencent.mm.plugin.music.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.music.e.e;
import com.tencent.mm.plugin.music.f.c.b;
import com.tencent.mm.pluginsdk.i.d.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;

final class MusicMainUI$b extends d.a
{
  private MusicMainUI$b(MusicMainUI paramMusicMainUI)
  {
  }

  public final void bUT()
  {
    AppMethodBeat.i(105106);
    ab.i("MicroMsg.Music.MusicMainUI", "shake %b", new Object[] { Boolean.TRUE });
    long l = bo.az(MusicMainUI.e(this.oOZ));
    if (l < 1200L)
    {
      ab.i("MicroMsg.Music.MusicMainUI", "tryStartShake delay too short:".concat(String.valueOf(l)));
      AppMethodBeat.o(105106);
    }
    while (true)
    {
      return;
      ab.w("MicroMsg.Music.MusicMainUI", "tryStartShake delay too enough:".concat(String.valueOf(l)));
      MusicMainUI.a(this.oOZ, bo.yz());
      MusicMainUI.f(this.oOZ);
      if (MusicMainUI.g(this.oOZ) % 2 == 0)
        ((e)b.ar(e.class)).xs(MusicMainUI.h(this.oOZ));
      AppMethodBeat.o(105106);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.music.ui.MusicMainUI.b
 * JD-Core Version:    0.6.2
 */