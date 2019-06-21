package com.tencent.mm.plugin.sns.ui;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.sight.decode.ui.SnsAdNativeLandingPagesVideoPlayerLoadingBar;
import com.tencent.mm.pluginsdk.ui.tools.VideoSightView;

final class SnsAdNativeLandingTestUI$6
  implements View.OnClickListener
{
  SnsAdNativeLandingTestUI$6(SnsAdNativeLandingTestUI paramSnsAdNativeLandingTestUI)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(38711);
    if ((!"".equals(SnsAdNativeLandingTestUI.a(this.roX).getVideoPath())) && (SnsAdNativeLandingTestUI.a(this.roX).getVideoPath() != null))
      if (this.roX.roW.getVisibility() == 0)
      {
        this.roX.roW.setVisibility(4);
        AppMethodBeat.o(38711);
      }
    while (true)
    {
      return;
      this.roX.roW.setVisibility(0);
      AppMethodBeat.o(38711);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingTestUI.6
 * JD-Core Version:    0.6.2
 */