package com.tencent.mm.pluginsdk.ui.tools;

import android.media.MediaPlayer;
import android.media.MediaPlayer.OnErrorListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

final class VideoTextureView$8
  implements MediaPlayer.OnErrorListener
{
  VideoTextureView$8(VideoTextureView paramVideoTextureView)
  {
  }

  public final boolean onError(MediaPlayer paramMediaPlayer, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(118016);
    ab.w("MicroMsg.VideoTextureView", "Error: " + paramInt1 + "," + paramInt2);
    if (VideoTextureView.d(this.vvO) != null)
      VideoTextureView.d(this.vvO).onError(paramInt1, paramInt2);
    AppMethodBeat.o(118016);
    return true;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.ui.tools.VideoTextureView.8
 * JD-Core Version:    0.6.2
 */