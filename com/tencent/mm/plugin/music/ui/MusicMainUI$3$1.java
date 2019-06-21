package com.tencent.mm.plugin.music.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.a.ke;
import com.tencent.mm.g.a.ke.a;
import com.tencent.mm.plugin.music.e.e;
import com.tencent.mm.plugin.music.f.c.b;

final class MusicMainUI$3$1
  implements Runnable
{
  MusicMainUI$3$1(MusicMainUI.3 param3, ke paramke)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(105091);
    if ((this.oPa.cFH.action == 0) && (((e)b.ar(e.class)).getMode() != 2))
    {
      MusicMainUI.j(this.oPb.oOZ).setAdapter(MusicMainUI.i(this.oPb.oOZ));
      MusicMainUI.j(this.oPb.oOZ).setCurrentItem(((e)b.ar(e.class)).bUa() + 100000);
    }
    MusicMainUI.k(this.oPb.oOZ);
    AppMethodBeat.o(105091);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.music.ui.MusicMainUI.3.1
 * JD-Core Version:    0.6.2
 */