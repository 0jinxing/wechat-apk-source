package com.tencent.mm.plugin.sns.ui;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.pluginsdk.ui.tools.VideoSightView;

final class SnsAdNativeLandingTestUI$4
  implements View.OnClickListener
{
  SnsAdNativeLandingTestUI$4(SnsAdNativeLandingTestUI paramSnsAdNativeLandingTestUI)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(38705);
    if (SnsAdNativeLandingTestUI.a(this.roX).isPlaying())
    {
      SnsAdNativeLandingTestUI.b(this.roX);
      AppMethodBeat.o(38705);
    }
    while (true)
    {
      return;
      SnsAdNativeLandingTestUI.c(this.roX);
      AppMethodBeat.o(38705);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingTestUI.4
 * JD-Core Version:    0.6.2
 */