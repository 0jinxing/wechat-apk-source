package com.tencent.mm.plugin.fav.ui;

import android.view.View;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class FavPostVoiceUI$8
  implements Animation.AnimationListener
{
  FavPostVoiceUI$8(FavPostVoiceUI paramFavPostVoiceUI)
  {
  }

  public final void onAnimationEnd(Animation paramAnimation)
  {
    AppMethodBeat.i(74049);
    FavPostVoiceUI.l(this.miR).post(new FavPostVoiceUI.8.1(this));
    AppMethodBeat.o(74049);
  }

  public final void onAnimationRepeat(Animation paramAnimation)
  {
  }

  public final void onAnimationStart(Animation paramAnimation)
  {
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.fav.ui.FavPostVoiceUI.8
 * JD-Core Version:    0.6.2
 */