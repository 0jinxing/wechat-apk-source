package com.tencent.mm.plugin.sysvideo.ui.video;

import android.os.Message;
import android.view.Window;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.q;

final class VideoRecorderPreviewUI$2 extends ak
{
  VideoRecorderPreviewUI$2(VideoRecorderPreviewUI paramVideoRecorderPreviewUI)
  {
  }

  public final void handleMessage(Message paramMessage)
  {
    AppMethodBeat.i(25631);
    this.swE.getWindow().setFlags(1024, 1024);
    this.swE.mController.hideTitleView();
    AppMethodBeat.o(25631);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sysvideo.ui.video.VideoRecorderPreviewUI.2
 * JD-Core Version:    0.6.2
 */