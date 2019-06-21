package com.tencent.mm.ui.video;

import android.media.MediaPlayer;
import android.media.MediaPlayer.OnErrorListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

final class VideoView$4
  implements MediaPlayer.OnErrorListener
{
  VideoView$4(VideoView paramVideoView)
  {
  }

  public final boolean onError(MediaPlayer paramMediaPlayer, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(35286);
    ab.d("MicroMsg.VideoView", "Error: " + paramInt1 + "," + paramInt2);
    if ((VideoView.o(this.zLo) != null) && (VideoView.o(this.zLo).onError(VideoView.e(this.zLo), paramInt1, paramInt2)))
      AppMethodBeat.o(35286);
    while (true)
    {
      return true;
      this.zLo.getWindowToken();
      AppMethodBeat.o(35286);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.video.VideoView.4
 * JD-Core Version:    0.6.2
 */