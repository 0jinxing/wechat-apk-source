package com.tencent.mm.plugin.sight.decode.ui;

import android.util.DisplayMetrics;
import android.view.Display;
import android.view.View;
import android.view.WindowManager;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.pluginsdk.ui.tools.VideoSightView;
import com.tencent.mm.ui.MMActivity;

final class VideoPlayView$3
  implements Runnable
{
  VideoPlayView$3(VideoPlayView paramVideoPlayView)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(70317);
    DisplayMetrics localDisplayMetrics = new DisplayMetrics();
    if ((this.qzs.getContext() instanceof MMActivity))
    {
      ((MMActivity)this.qzs.getContext()).getWindowManager().getDefaultDisplay().getMetrics(localDisplayMetrics);
      if ((VideoPlayView.a(this.qzs) instanceof VideoSightView))
        ((VideoSightView)VideoPlayView.a(this.qzs)).setDrawableWidth(localDisplayMetrics.widthPixels);
    }
    ((View)VideoPlayView.a(this.qzs)).requestLayout();
    ((View)VideoPlayView.a(this.qzs)).postInvalidate();
    AppMethodBeat.o(70317);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sight.decode.ui.VideoPlayView.3
 * JD-Core Version:    0.6.2
 */