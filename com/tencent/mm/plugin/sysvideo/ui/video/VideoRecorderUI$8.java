package com.tencent.mm.plugin.sysvideo.ui.video;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageButton;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.pluginsdk.i.b;
import com.tencent.mm.sdk.platformtools.ak;

final class VideoRecorderUI$8
  implements View.OnClickListener
{
  VideoRecorderUI$8(VideoRecorderUI paramVideoRecorderUI)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(25653);
    VideoRecorderUI.o(this.sxd).setEnabled(false);
    VideoRecorderUI.p(this.sxd).sendEmptyMessageDelayed(0, 3000L);
    VideoRecorderUI.a(this.sxd, true);
    VideoRecorderUI.h(this.sxd).diG();
    if ((VideoRecorderUI.h(this.sxd).b(this.sxd, VideoRecorderUI.q(this.sxd)) != 0) || (VideoRecorderUI.h(this.sxd).b(VideoRecorderUI.r(this.sxd)) != 0))
      VideoRecorderUI.s(this.sxd);
    AppMethodBeat.o(25653);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sysvideo.ui.video.VideoRecorderUI.8
 * JD-Core Version:    0.6.2
 */