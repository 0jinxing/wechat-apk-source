package com.tencent.mm.plugin.music.b.b;

import android.media.AudioManager;
import android.media.AudioManager.OnAudioFocusChangeListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

final class a$1
  implements AudioManager.OnAudioFocusChangeListener
{
  a$1(a parama)
  {
  }

  public final void onAudioFocusChange(int paramInt)
  {
    AppMethodBeat.i(137394);
    ab.i("MicroMsg.Music.MusicAudioFocusHelper", "focus change %d", new Object[] { Integer.valueOf(paramInt) });
    if ((paramInt == -2) || (paramInt == -3))
    {
      ab.i("MicroMsg.Music.MusicAudioFocusHelper", "audio focus lossTransient");
      AppMethodBeat.o(137394);
    }
    while (true)
    {
      return;
      if ((paramInt == 1) || (paramInt == 2) || (paramInt == 3))
      {
        ab.i("MicroMsg.Music.MusicAudioFocusHelper", "audio focus gain");
        AppMethodBeat.o(137394);
      }
      else
      {
        if (paramInt == -1)
        {
          ab.i("MicroMsg.Music.MusicAudioFocusHelper", "audio focus loss, passive pause");
          if (this.oKU.eoY != null)
            this.oKU.eoY.abandonAudioFocus(this.oKU.mtx);
          this.oKU.oKT = false;
        }
        AppMethodBeat.o(137394);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.music.b.b.a.1
 * JD-Core Version:    0.6.2
 */