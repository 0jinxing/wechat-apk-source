package com.tencent.mm.plugin.music.ui;

import android.os.Looper;
import android.os.Message;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ak;

final class MusicMainUI$9 extends ak
{
  MusicMainUI$9(MusicMainUI paramMusicMainUI, Looper paramLooper)
  {
    super(paramLooper);
  }

  public final void handleMessage(Message paramMessage)
  {
    AppMethodBeat.i(105104);
    if (paramMessage.what == 1)
      MusicMainUI.p(this.oOZ);
    AppMethodBeat.o(105104);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.music.ui.MusicMainUI.9
 * JD-Core Version:    0.6.2
 */