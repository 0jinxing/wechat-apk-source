package com.tencent.mm.plugin.sns.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.sight.decode.ui.b;
import com.tencent.mm.pluginsdk.ui.tools.VideoSightView;
import com.tencent.mm.sdk.platformtools.ab;

final class SnsAdNativeLandingTestUI$3
  implements b
{
  SnsAdNativeLandingTestUI$3(SnsAdNativeLandingTestUI paramSnsAdNativeLandingTestUI)
  {
  }

  public final void aFw()
  {
  }

  public final void oA(int paramInt)
  {
    AppMethodBeat.i(38704);
    ab.i("MicroMsg.Sns.SnsAdNativieLandingTestUI", "onSeek time ".concat(String.valueOf(paramInt)));
    SnsAdNativeLandingTestUI.a(this.roX, paramInt);
    SnsAdNativeLandingTestUI.a(this.roX).B(paramInt);
    AppMethodBeat.o(38704);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingTestUI.3
 * JD-Core Version:    0.6.2
 */