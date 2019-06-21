package com.tencent.mm.plugin.sns.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.sight.decode.ui.SnsAdNativeLandingPagesVideoPlayerLoadingBar;
import com.tencent.mm.pluginsdk.ui.tools.VideoSightView;
import com.tencent.mm.pluginsdk.ui.tools.e.a;
import com.tencent.mm.sdk.platformtools.al;

final class SnsAdNativeLandingTestUI$5
  implements e.a
{
  SnsAdNativeLandingTestUI$5(SnsAdNativeLandingTestUI paramSnsAdNativeLandingTestUI)
  {
  }

  public final void EA()
  {
  }

  public final int dG(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(38709);
    al.d(new SnsAdNativeLandingTestUI.5.1(this, paramInt1, paramInt2));
    AppMethodBeat.o(38709);
    return 0;
  }

  public final void dH(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(38710);
    SnsAdNativeLandingTestUI.c(this.roX, paramInt1);
    SnsAdNativeLandingTestUI.d(this.roX, paramInt2);
    AppMethodBeat.o(38710);
  }

  public final void onError(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(38708);
    SnsAdNativeLandingTestUI.a(this.roX).stop();
    AppMethodBeat.o(38708);
  }

  public final void pL()
  {
    AppMethodBeat.i(38707);
    if (this.roX.roW.getIsPlay())
      SnsAdNativeLandingTestUI.c(this.roX);
    AppMethodBeat.o(38707);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingTestUI.5
 * JD-Core Version:    0.6.2
 */