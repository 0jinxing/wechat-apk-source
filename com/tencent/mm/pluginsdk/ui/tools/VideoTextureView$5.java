package com.tencent.mm.pluginsdk.ui.tools;

import android.media.MediaPlayer;
import android.media.MediaPlayer.OnBufferingUpdateListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

final class VideoTextureView$5
  implements MediaPlayer.OnBufferingUpdateListener
{
  VideoTextureView$5(VideoTextureView paramVideoTextureView)
  {
  }

  public final void onBufferingUpdate(MediaPlayer paramMediaPlayer, int paramInt)
  {
    AppMethodBeat.i(118013);
    ab.d("MicroMsg.VideoTextureView", "onBufferingUpdate percent[%d]", new Object[] { Integer.valueOf(paramInt) });
    VideoTextureView.c(this.vvO, paramInt);
    AppMethodBeat.o(118013);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.ui.tools.VideoTextureView.5
 * JD-Core Version:    0.6.2
 */