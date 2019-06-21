package com.tencent.mm.plugin.music.h;

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

  public a()
  {
    AppMethodBeat.i(137687);
    this.mtx = new a.1(this);
    this.eoY = ((AudioManager)ah.getContext().getSystemService("audio"));
    AppMethodBeat.o(137687);
  }

  public final void bSK()
  {
    AppMethodBeat.i(137689);
    ab.i("MicroMsg.Music.MusicAudioFocusHelper", "abandonFocus");
    if (this.eoY == null)
      AppMethodBeat.o(137689);
    while (true)
    {
      return;
      this.eoY.abandonAudioFocus(this.mtx);
      AppMethodBeat.o(137689);
    }
  }

  public final boolean requestFocus()
  {
    boolean bool1 = false;
    AppMethodBeat.i(137688);
    boolean bool2;
    if (this.eoY == null)
    {
      AppMethodBeat.o(137688);
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
        if (i != 1)
          break label82;
        AppMethodBeat.o(137688);
        bool2 = true;
        break;
      }
      label82: AppMethodBeat.o(137688);
      bool2 = bool1;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.music.h.a
 * JD-Core Version:    0.6.2
 */