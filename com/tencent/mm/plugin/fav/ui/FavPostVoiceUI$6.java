package com.tencent.mm.plugin.fav.ui;

import android.os.Message;
import android.widget.Button;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ak;

final class FavPostVoiceUI$6 extends ak
{
  FavPostVoiceUI$6(FavPostVoiceUI paramFavPostVoiceUI)
  {
  }

  public final void handleMessage(Message paramMessage)
  {
    AppMethodBeat.i(74046);
    super.handleMessage(paramMessage);
    this.miR.bvH();
    FavPostVoiceUI.g(this.miR).setBackgroundResource(2130840009);
    FavPostVoiceUI.g(this.miR).setEnabled(true);
    AppMethodBeat.o(74046);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.fav.ui.FavPostVoiceUI.6
 * JD-Core Version:    0.6.2
 */