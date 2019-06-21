package com.tencent.mm.plugin.sysvideo.ui.video;

import android.media.MediaPlayer;
import android.media.MediaPlayer.OnPreparedListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.compatible.util.g;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.ui.video.VideoView;

final class VideoRecorderPreviewUI$4
  implements MediaPlayer.OnPreparedListener
{
  VideoRecorderPreviewUI$4(VideoRecorderPreviewUI paramVideoRecorderPreviewUI)
  {
  }

  public final void onPrepared(MediaPlayer paramMediaPlayer)
  {
    AppMethodBeat.i(25633);
    ab.d("MicroMsg.VideoRecorderPreviewUI", g.Mp() + " onPrepared");
    ab.d("MicroMsg.VideoRecorderPreviewUI", g.Mp() + " onPrepared");
    paramMediaPlayer = VideoRecorderPreviewUI.a(this.swE);
    if ((paramMediaPlayer.ieC != null) && (paramMediaPlayer.vvE))
      paramMediaPlayer.ieC.start();
    for (paramMediaPlayer.ief = false; ; paramMediaPlayer.ief = true)
    {
      VideoRecorderPreviewUI.b(this.swE).sendEmptyMessageDelayed(0, 3000L);
      AppMethodBeat.o(25633);
      return;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sysvideo.ui.video.VideoRecorderPreviewUI.4
 * JD-Core Version:    0.6.2
 */