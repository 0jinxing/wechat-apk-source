package com.tencent.mm.compatible.util;

import android.media.AudioManager.OnAudioFocusChangeListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

final class c$1
  implements AudioManager.OnAudioFocusChangeListener
{
  c$1(c paramc)
  {
  }

  public final void onAudioFocusChange(int paramInt)
  {
    AppMethodBeat.i(93064);
    if (this.euN.euL != null)
    {
      ab.d("MicroMsg.AudioFocusHelper", "jacks change: %d", new Object[] { Integer.valueOf(paramInt) });
      this.euN.euL.gF(paramInt);
    }
    AppMethodBeat.o(93064);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.compatible.util.c.1
 * JD-Core Version:    0.6.2
 */