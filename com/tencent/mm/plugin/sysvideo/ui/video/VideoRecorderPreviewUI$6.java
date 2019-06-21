package com.tencent.mm.plugin.sysvideo.ui.video;

import android.app.Activity;
import android.media.MediaPlayer;
import android.media.MediaPlayer.OnCompletionListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class VideoRecorderPreviewUI$6
  implements MediaPlayer.OnCompletionListener
{
  VideoRecorderPreviewUI$6(VideoRecorderPreviewUI paramVideoRecorderPreviewUI)
  {
  }

  public final void onCompletion(MediaPlayer paramMediaPlayer)
  {
    AppMethodBeat.i(25635);
    this.swE.finish();
    this.swE.overridePendingTransition(0, 0);
    AppMethodBeat.o(25635);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sysvideo.ui.video.VideoRecorderPreviewUI.6
 * JD-Core Version:    0.6.2
 */