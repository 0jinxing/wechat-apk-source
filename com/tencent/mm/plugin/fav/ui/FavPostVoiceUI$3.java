package com.tencent.mm.plugin.fav.ui;

import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.TranslateAnimation;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class FavPostVoiceUI$3
  implements Runnable
{
  FavPostVoiceUI$3(FavPostVoiceUI paramFavPostVoiceUI)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(74043);
    this.miR.findViewById(2131823954).setVisibility(0);
    FavPostVoiceUI.d(this.miR).setVisibility(0);
    this.miR.findViewById(2131823964).setVisibility(0);
    AlphaAnimation localAlphaAnimation = new AlphaAnimation(0.0F, 1.0F);
    localAlphaAnimation.setDuration(300L);
    TranslateAnimation localTranslateAnimation = new TranslateAnimation(1, 0.0F, 1, 0.0F, 1, 1.0F, 1, 0.0F);
    localTranslateAnimation.setDuration(300L);
    FavPostVoiceUI.d(this.miR).startAnimation(localAlphaAnimation);
    this.miR.findViewById(2131823954).startAnimation(localAlphaAnimation);
    this.miR.findViewById(2131823964).startAnimation(localTranslateAnimation);
    AppMethodBeat.o(74043);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.fav.ui.FavPostVoiceUI.3
 * JD-Core Version:    0.6.2
 */