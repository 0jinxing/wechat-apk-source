package com.tencent.mm.plugin.music.h;

import android.media.AudioManager;
import android.media.AudioManager.OnAudioFocusChangeListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.music.e.k;
import com.tencent.mm.plugin.music.f.a.d;
import com.tencent.mm.sdk.platformtools.ab;

final class a$1
  implements AudioManager.OnAudioFocusChangeListener
{
  a$1(a parama)
  {
  }

  public final void onAudioFocusChange(int paramInt)
  {
    AppMethodBeat.i(137686);
    ab.i("MicroMsg.Music.MusicAudioFocusHelper", "focus change %d", new Object[] { Integer.valueOf(paramInt) });
    if ((paramInt == -2) || (paramInt == -3))
    {
      ab.i("MicroMsg.Music.MusicAudioFocusHelper", "audio focus lossTransient");
      if (!k.bUf().bTS().aig())
        break label208;
      k.bUf().bTS().bSN();
      AppMethodBeat.o(137686);
    }
    while (true)
    {
      return;
      if ((paramInt == 1) || (paramInt == 2) || (paramInt == 3))
      {
        ab.i("MicroMsg.Music.MusicAudioFocusHelper", "audio focus gain");
        if (k.bUf().bTS().aig())
        {
          k.bUf().bTS().resume();
          AppMethodBeat.o(137686);
        }
      }
      else
      {
        if (paramInt == -1)
        {
          ab.i("MicroMsg.Music.MusicAudioFocusHelper", "audio focus loss, passive pause");
          if (k.bUf().bTS().aig())
          {
            k.bUf().bTS().bSN();
            k.bUf();
            k.bUe();
            k.bUf().zI(600000);
          }
          if (this.oPq.eoY != null)
            this.oPq.eoY.abandonAudioFocus(this.oPq.mtx);
        }
        label208: AppMethodBeat.o(137686);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.music.h.a.1
 * JD-Core Version:    0.6.2
 */