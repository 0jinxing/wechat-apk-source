package com.tencent.mm.plugin.fav.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.audio.b.j.a;
import com.tencent.mm.sdk.platformtools.ap;

final class FavPostVoiceUI$4
  implements j.a
{
  FavPostVoiceUI$4(FavPostVoiceUI paramFavPostVoiceUI)
  {
  }

  public final void onError()
  {
    AppMethodBeat.i(74044);
    FavPostVoiceUI.e(this.miR).stopTimer();
    FavPostVoiceUI.f(this.miR).stopTimer();
    AppMethodBeat.o(74044);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.fav.ui.FavPostVoiceUI.4
 * JD-Core Version:    0.6.2
 */