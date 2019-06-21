package com.tencent.mm.plugin.sns.ui;

import android.graphics.BitmapFactory;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.pluginsdk.ui.tools.VideoSightView;

final class SnsAdNativeLandingTestUI$8
  implements SnsAdNativeLandingTestUI.a.a
{
  SnsAdNativeLandingTestUI$8(SnsAdNativeLandingTestUI paramSnsAdNativeLandingTestUI)
  {
  }

  public final void BD(String paramString)
  {
  }

  public final void de(String paramString, int paramInt)
  {
  }

  public final void lW(String paramString)
  {
    AppMethodBeat.i(38713);
    SnsAdNativeLandingTestUI.a(this.roX).setThumb(BitmapFactory.decodeFile(paramString));
    AppMethodBeat.o(38713);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingTestUI.8
 * JD-Core Version:    0.6.2
 */