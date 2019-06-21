package com.tencent.mm.plugin.sight.encode.ui;

import android.media.MediaPlayer;
import android.media.MediaPlayer.OnCompletionListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

final class SightVideoTextureView$2$1
  implements MediaPlayer.OnCompletionListener
{
  SightVideoTextureView$2$1(SightVideoTextureView.2 param2)
  {
  }

  public final void onCompletion(MediaPlayer paramMediaPlayer)
  {
    AppMethodBeat.i(25118);
    ab.i("MicroMsg.SightVideoTextureView", "complete playing %s ", new Object[] { this.qBT.qBS });
    this.qBT.qBR.clV();
    AppMethodBeat.o(25118);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sight.encode.ui.SightVideoTextureView.2.1
 * JD-Core Version:    0.6.2
 */