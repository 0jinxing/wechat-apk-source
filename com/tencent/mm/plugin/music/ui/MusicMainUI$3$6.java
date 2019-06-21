package com.tencent.mm.plugin.music.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;

final class MusicMainUI$3$6
  implements Runnable
{
  MusicMainUI$3$6(MusicMainUI.3 param3)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(105096);
    MusicMainUI.j(this.oPb.oOZ).setCurrentItem(MusicMainUI.j(this.oPb.oOZ).getCurrentItem() + 1);
    AppMethodBeat.o(105096);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.music.ui.MusicMainUI.3.6
 * JD-Core Version:    0.6.2
 */