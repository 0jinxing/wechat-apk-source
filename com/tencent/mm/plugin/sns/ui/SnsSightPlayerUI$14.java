package com.tencent.mm.plugin.sns.ui;

import android.util.DisplayMetrics;
import android.view.Display;
import android.view.View;
import android.view.WindowManager;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.pluginsdk.ui.tools.VideoSightView;

final class SnsSightPlayerUI$14
  implements Runnable
{
  SnsSightPlayerUI$14(SnsSightPlayerUI paramSnsSightPlayerUI)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(39268);
    DisplayMetrics localDisplayMetrics = new DisplayMetrics();
    this.rwT.getWindowManager().getDefaultDisplay().getMetrics(localDisplayMetrics);
    if ((SnsSightPlayerUI.g(this.rwT) instanceof VideoSightView))
      ((VideoSightView)SnsSightPlayerUI.g(this.rwT)).setDrawableWidth(localDisplayMetrics.widthPixels);
    ((View)SnsSightPlayerUI.g(this.rwT)).requestLayout();
    ((View)SnsSightPlayerUI.g(this.rwT)).postInvalidate();
    AppMethodBeat.o(39268);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.SnsSightPlayerUI.14
 * JD-Core Version:    0.6.2
 */