package com.tencent.mm.plugin.sysvideo.ui.video;

import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.view.SurfaceView;
import android.widget.LinearLayout;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

final class VideoRecorderUI$2
  implements DialogInterface.OnCancelListener
{
  VideoRecorderUI$2(VideoRecorderUI paramVideoRecorderUI)
  {
  }

  public final void onCancel(DialogInterface paramDialogInterface)
  {
    AppMethodBeat.i(25644);
    ab.d("MicroMsg.VideoRecorderUI", "tipDialog onCancel");
    if (VideoRecorderUI.h(this.sxd) != null)
    {
      VideoRecorderUI.u(this.sxd);
      VideoRecorderUI.v(this.sxd).setVisibility(0);
      VideoRecorderUI.w(this.sxd).setVisibility(0);
    }
    AppMethodBeat.o(25644);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sysvideo.ui.video.VideoRecorderUI.2
 * JD-Core Version:    0.6.2
 */