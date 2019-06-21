package com.tencent.mm.plugin.sns.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ak;

final class SnsAdNativeLandingTestUI$a$1
  implements SnsAdNativeLandingTestUI.a.a
{
  SnsAdNativeLandingTestUI$a$1(SnsAdNativeLandingTestUI.a parama, ak paramak, SnsAdNativeLandingTestUI.a.a parama1)
  {
  }

  public final void BD(String paramString)
  {
    AppMethodBeat.i(38722);
    this.mrz.post(new SnsAdNativeLandingTestUI.a.1.2(this, paramString));
    AppMethodBeat.o(38722);
  }

  public final void de(String paramString, int paramInt)
  {
    AppMethodBeat.i(38721);
    this.mrz.post(new SnsAdNativeLandingTestUI.a.1.1(this, paramString, paramInt));
    AppMethodBeat.o(38721);
  }

  public final void lW(String paramString)
  {
    AppMethodBeat.i(38723);
    this.mrz.post(new SnsAdNativeLandingTestUI.a.1.3(this, paramString));
    AppMethodBeat.o(38723);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingTestUI.a.1
 * JD-Core Version:    0.6.2
 */