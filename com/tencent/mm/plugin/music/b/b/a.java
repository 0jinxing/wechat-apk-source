package com.tencent.mm.plugin.music.b.b;

import android.content.Context;
import android.media.AudioManager;
import android.media.AudioManager.OnAudioFocusChangeListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;

public final class a
{
  AudioManager eoY;
  AudioManager.OnAudioFocusChangeListener mtx;
  public boolean oKT;

  public a()
  {
    AppMethodBeat.i(137395);
    this.oKT = false;
    this.mtx = new a.1(this);
    this.eoY = ((AudioManager)ah.getContext().getSystemService("audio"));
    AppMethodBeat.o(137395);
  }

  public final void bSK()
  {
    AppMethodBeat.i(137397);
    ab.i("MicroMsg.Music.MusicAudioFocusHelper", "abandonFocus");
    if (this.eoY == null)
      AppMethodBeat.o(137397);
    while (true)
    {
      return;
      this.eoY.abandonAudioFocus(this.mtx);
      this.oKT = false;
      AppMethodBeat.o(137397);
    }
  }

  public final boolean requestFocus()
  {
    boolean bool1 = false;
    AppMethodBeat.i(137396);
    boolean bool2;
    if (this.eoY == null)
    {
      AppMethodBeat.o(137396);
      bool2 = bool1;
    }
    while (true)
    {
      return bool2;
      int i = this.eoY.requestAudioFocus(this.mtx, 3, 2);
      if (i == 1);
      for (bool2 = true; ; bool2 = false)
      {
        ab.i("MicroMsg.Music.MusicAudioFocusHelper", "request audio focus %b", new Object[] { Boolean.valueOf(bool2) });
        if (i == 1)
          this.oKT = true;
        if (i != 1)
          break label92;
        AppMethodBeat.o(137396);
        bool2 = true;
        break;
      }
      label92: AppMethodBeat.o(137396);
      bool2 = bool1;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.music.b.b.a
 * JD-Core Version:    0.6.2
 */