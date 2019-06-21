package com.tencent.mm.plugin.sns.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.sight.decode.ui.SnsAdNativeLandingPagesVideoPlayerLoadingBar;
import com.tencent.mm.sdk.platformtools.ab;

final class SnsAdNativeLandingTestUI$5$1
  implements Runnable
{
  SnsAdNativeLandingTestUI$5$1(SnsAdNativeLandingTestUI.5 param5, int paramInt1, int paramInt2)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(38706);
    ab.i("MicroMsg.Sns.SnsAdNativieLandingTestUI", "play time " + this.ibq + " video time " + this.qzt);
    if (this.qzt > 0)
    {
      SnsAdNativeLandingTestUI.a(this.rpa.roX, this.qzt);
      SnsAdNativeLandingTestUI.b(this.rpa.roX, this.qzt);
    }
    if (this.rpa.roX.roW.getVideoTotalTime() != this.qzt)
      this.rpa.roX.roW.setVideoTotalTime(this.qzt);
    this.rpa.roX.roW.seek(this.ibq);
    AppMethodBeat.o(38706);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingTestUI.5.1
 * JD-Core Version:    0.6.2
 */