package com.tencent.mm.plugin.sns.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.sight.decode.ui.SnsAdNativeLandingPagesVideoPlayerLoadingBar;
import com.tencent.mm.pluginsdk.ui.tools.VideoSightView;
import com.tencent.mm.sdk.platformtools.ab;

final class SnsAdNativeLandingTestUI$9
  implements SnsAdNativeLandingTestUI.a.a
{
  SnsAdNativeLandingTestUI$9(SnsAdNativeLandingTestUI paramSnsAdNativeLandingTestUI)
  {
  }

  public final void BD(String paramString)
  {
    AppMethodBeat.i(38715);
    ab.e("MicroMsg.Sns.SnsAdNativieLandingTestUI", paramString);
    AppMethodBeat.o(38715);
  }

  public final void de(String paramString, int paramInt)
  {
    AppMethodBeat.i(38714);
    if (SnsAdNativeLandingTestUI.a(this.roX).isPlaying())
      AppMethodBeat.o(38714);
    while (true)
    {
      return;
      SnsAdNativeLandingTestUI.a(this.roX).setLoop(false);
      if (!paramString.equals(SnsAdNativeLandingTestUI.a(this.roX).getVideoPath()))
        SnsAdNativeLandingTestUI.a(this.roX).setVideoPath(paramString);
      if (this.roX.roW.getIsPlay())
      {
        SnsAdNativeLandingTestUI.a(this.roX).B(SnsAdNativeLandingTestUI.d(this.roX));
        SnsAdNativeLandingTestUI.a(this.roX).start();
      }
      AppMethodBeat.o(38714);
    }
  }

  public final void lW(String paramString)
  {
    AppMethodBeat.i(38716);
    SnsAdNativeLandingTestUI.a(this.roX).setVideoPath(paramString);
    SnsAdNativeLandingTestUI.a(this.roX).setLoop(true);
    if (this.roX.roW.getIsPlay())
    {
      SnsAdNativeLandingTestUI.a(this.roX).B(SnsAdNativeLandingTestUI.d(this.roX));
      SnsAdNativeLandingTestUI.a(this.roX).start();
    }
    AppMethodBeat.o(38716);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingTestUI.9
 * JD-Core Version:    0.6.2
 */