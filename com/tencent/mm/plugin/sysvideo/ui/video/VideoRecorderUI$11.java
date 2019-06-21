package com.tencent.mm.plugin.sysvideo.ui.video;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class VideoRecorderUI$11
  implements DialogInterface.OnClickListener
{
  VideoRecorderUI$11(VideoRecorderUI paramVideoRecorderUI)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(25656);
    this.sxd.finish();
    AppMethodBeat.o(25656);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sysvideo.ui.video.VideoRecorderUI.11
 * JD-Core Version:    0.6.2
 */