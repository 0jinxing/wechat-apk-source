package com.tencent.mm.plugin.sight.encode.ui;

import android.media.MediaPlayer;
import android.media.MediaPlayer.OnErrorListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

final class SightVideoTextureView$2$2
  implements MediaPlayer.OnErrorListener
{
  SightVideoTextureView$2$2(SightVideoTextureView.2 param2)
  {
  }

  public final boolean onError(MediaPlayer paramMediaPlayer, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(25119);
    ab.i("MicroMsg.SightVideoTextureView", "play %s error", new Object[] { this.qBT.qBS });
    AppMethodBeat.o(25119);
    return false;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sight.encode.ui.SightVideoTextureView.2.2
 * JD-Core Version:    0.6.2
 */