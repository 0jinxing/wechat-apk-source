package com.tencent.mm.plugin.sysvideo.ui.video;

import android.app.Activity;
import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.pluginsdk.i.a;
import com.tencent.mm.pluginsdk.i.b;

final class VideoRecorderUI$10
  implements View.OnClickListener
{
  VideoRecorderUI$10(VideoRecorderUI paramVideoRecorderUI)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(25655);
    paramView = new Intent(this.sxd, VideoRecorderPreviewUI.class);
    paramView.putExtra("VideoRecorder_FileName", VideoRecorderUI.h(this.sxd).filename);
    paramView.putExtra("VideoRecorder_VideoLength", VideoRecorderUI.h(this.sxd).qBs.fXd);
    paramView.putExtra("VideoRecorder_VideoSize", VideoRecorderUI.h(this.sxd).fileSize);
    paramView.putExtra("VideoRecorder_ToUser", VideoRecorderUI.i(this.sxd));
    paramView.putExtra("VideoRecorder_VideoFullPath", VideoRecorderUI.t(this.sxd));
    this.sxd.startActivityForResult(paramView, 0);
    this.sxd.overridePendingTransition(0, 0);
    AppMethodBeat.o(25655);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sysvideo.ui.video.VideoRecorderUI.10
 * JD-Core Version:    0.6.2
 */