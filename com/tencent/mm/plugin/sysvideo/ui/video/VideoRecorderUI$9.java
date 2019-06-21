package com.tencent.mm.plugin.sysvideo.ui.video;

import android.os.Message;
import android.widget.ImageButton;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ak;

final class VideoRecorderUI$9 extends ak
{
  VideoRecorderUI$9(VideoRecorderUI paramVideoRecorderUI)
  {
  }

  public final void handleMessage(Message paramMessage)
  {
    AppMethodBeat.i(25654);
    super.handleMessage(paramMessage);
    VideoRecorderUI.o(this.sxd).setEnabled(true);
    AppMethodBeat.o(25654);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sysvideo.ui.video.VideoRecorderUI.9
 * JD-Core Version:    0.6.2
 */