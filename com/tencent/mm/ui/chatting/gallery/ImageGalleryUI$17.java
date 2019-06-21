package com.tencent.mm.ui.chatting.gallery;

import android.view.View;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class ImageGalleryUI$17
  implements Animation.AnimationListener
{
  ImageGalleryUI$17(ImageGalleryUI paramImageGalleryUI)
  {
  }

  public final void onAnimationEnd(Animation paramAnimation)
  {
    AppMethodBeat.i(32216);
    if (ImageGalleryUI.Q(ImageGalleryUI.P(this.yWC)).getVisibility() != 0)
      AppMethodBeat.o(32216);
    while (true)
    {
      return;
      this.yWC.dGm();
      ImageGalleryUI.R(ImageGalleryUI.P(this.yWC)).setVisibility(8);
      ImageGalleryUI.K(this.yWC);
      ImageGalleryUI.L(this.yWC);
      AppMethodBeat.o(32216);
    }
  }

  public final void onAnimationRepeat(Animation paramAnimation)
  {
  }

  public final void onAnimationStart(Animation paramAnimation)
  {
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.gallery.ImageGalleryUI.17
 * JD-Core Version:    0.6.2
 */