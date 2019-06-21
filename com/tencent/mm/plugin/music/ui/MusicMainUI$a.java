package com.tencent.mm.plugin.music.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.music.e.e;
import com.tencent.mm.plugin.music.f.c.b;
import com.tencent.mm.plugin.music.model.e.a;

final class MusicMainUI$a
  implements Runnable
{
  int position;

  public MusicMainUI$a(MusicMainUI paramMusicMainUI, int paramInt)
  {
    this.position = paramInt;
  }

  public final void run()
  {
    AppMethodBeat.i(105105);
    ((e)b.ar(e.class)).zH(this.position);
    a locala = ((e)b.ar(e.class)).bTU();
    if (locala == null)
      AppMethodBeat.o(105105);
    while (true)
    {
      return;
      if (locala.bUu())
        this.oOZ.i(locala);
      if (((e)b.ar(e.class)).bUc())
        MusicMainUI.j(this.oOZ).setCanSlide(true);
      MusicMainUI.a(this.oOZ, locala);
      AppMethodBeat.o(105105);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.music.ui.MusicMainUI.a
 * JD-Core Version:    0.6.2
 */