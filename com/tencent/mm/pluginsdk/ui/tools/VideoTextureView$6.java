package com.tencent.mm.pluginsdk.ui.tools;

import android.media.MediaPlayer;
import android.media.MediaPlayer.OnInfoListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

final class VideoTextureView$6
  implements MediaPlayer.OnInfoListener
{
  VideoTextureView$6(VideoTextureView paramVideoTextureView)
  {
  }

  public final boolean onInfo(MediaPlayer paramMediaPlayer, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(118014);
    ab.d("MicroMsg.VideoTextureView", "onInfo [%d %d]", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
    if (VideoTextureView.l(this.vvO) != null)
      VideoTextureView.l(this.vvO).gO(paramInt1, paramInt2);
    AppMethodBeat.o(118014);
    return false;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.ui.tools.VideoTextureView.6
 * JD-Core Version:    0.6.2
 */