package com.tencent.mm.plugin.sns.ui;

import android.util.DisplayMetrics;
import android.view.Display;
import android.view.View;
import android.view.WindowManager;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.pluginsdk.ui.tools.VideoSightView;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.q;

final class SnsAdNativeLandingTestUI$7
  implements Runnable
{
  SnsAdNativeLandingTestUI$7(SnsAdNativeLandingTestUI paramSnsAdNativeLandingTestUI)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(38712);
    DisplayMetrics localDisplayMetrics = new DisplayMetrics();
    if ((this.roX.mController.ylL instanceof MMActivity))
    {
      ((MMActivity)this.roX.mController.ylL).getWindowManager().getDefaultDisplay().getMetrics(localDisplayMetrics);
      SnsAdNativeLandingTestUI.a(this.roX).setDrawableWidth(localDisplayMetrics.widthPixels);
    }
    SnsAdNativeLandingTestUI.a(this.roX).requestLayout();
    SnsAdNativeLandingTestUI.a(this.roX).postInvalidate();
    AppMethodBeat.o(38712);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingTestUI.7
 * JD-Core Version:    0.6.2
 */