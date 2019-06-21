package com.tencent.mm.plugin.music.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.aw.a;

final class MusicMainUI$2
  implements MusicSeekBar.a
{
  MusicMainUI$2(MusicMainUI paramMusicMainUI)
  {
  }

  public final void zV(int paramInt)
  {
    AppMethodBeat.i(105090);
    a.lP(paramInt);
    MusicMainUI.d(this.oOZ).setProgress(paramInt);
    MusicMainUI.d(this.oOZ).jA(true);
    AppMethodBeat.o(105090);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.music.ui.MusicMainUI.2
 * JD-Core Version:    0.6.2
 */