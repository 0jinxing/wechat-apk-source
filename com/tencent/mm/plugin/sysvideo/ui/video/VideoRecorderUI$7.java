package com.tencent.mm.plugin.sysvideo.ui.video;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageButton;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.model.aw;
import com.tencent.mm.model.c;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.base.t;

final class VideoRecorderUI$7
  implements View.OnClickListener
{
  VideoRecorderUI$7(VideoRecorderUI paramVideoRecorderUI)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(25652);
    aw.ZK();
    if (!c.isSDCardAvailable())
    {
      t.hO(this.sxd);
      AppMethodBeat.o(25652);
    }
    while (true)
    {
      return;
      if (VideoRecorderUI.k(this.sxd))
      {
        VideoRecorderUI.d(this.sxd);
        AppMethodBeat.o(25652);
      }
      else if (VideoRecorderUI.l(this.sxd))
      {
        h.a(this.sxd, this.sxd.getString(2131304268), this.sxd.getString(2131297061), new VideoRecorderUI.7.1(this), new VideoRecorderUI.7.2(this));
        AppMethodBeat.o(25652);
      }
      else
      {
        VideoRecorderUI.m(this.sxd).setImageResource(2130840535);
        VideoRecorderUI.n(this.sxd);
        AppMethodBeat.o(25652);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sysvideo.ui.video.VideoRecorderUI.7
 * JD-Core Version:    0.6.2
 */