package com.tencent.mm.pluginsdk.ui.tools;

import android.media.MediaPlayer;
import android.media.MediaPlayer.OnSeekCompleteListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

final class VideoTextureView$4
  implements MediaPlayer.OnSeekCompleteListener
{
  VideoTextureView$4(VideoTextureView paramVideoTextureView)
  {
  }

  public final void onSeekComplete(MediaPlayer paramMediaPlayer)
  {
    AppMethodBeat.i(118012);
    if (paramMediaPlayer != null);
    for (int i = paramMediaPlayer.getCurrentPosition(); ; i = -1)
    {
      ab.i("MicroMsg.VideoTextureView", "video seek complete curPos[%d] mStartWhenPrepared[%b] pauseWhenUpdated[%b]", new Object[] { Integer.valueOf(i), Boolean.valueOf(VideoTextureView.g(this.vvO)), Boolean.valueOf(VideoTextureView.j(this.vvO)) });
      if (!VideoTextureView.g(this.vvO))
        break label143;
      if (!VideoTextureView.j(this.vvO))
        break;
      AppMethodBeat.o(118012);
      return;
    }
    this.vvO.start();
    while (true)
    {
      if (VideoTextureView.k(this.vvO) != null)
        VideoTextureView.k(this.vvO).cU(VideoTextureView.g(this.vvO));
      VideoTextureView.a(this.vvO, 0L);
      AppMethodBeat.o(118012);
      break;
      label143: this.vvO.pause();
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.ui.tools.VideoTextureView.4
 * JD-Core Version:    0.6.2
 */