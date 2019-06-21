package com.tencent.mm.ui.chatting.gallery;

import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class ImageGalleryUI$16
  implements Animation.AnimationListener
{
  ImageGalleryUI$16(ImageGalleryUI paramImageGalleryUI)
  {
  }

  public final void onAnimationEnd(Animation paramAnimation)
  {
    AppMethodBeat.i(32215);
    ImageGalleryUI.N(this.yWC);
    ImageGalleryUI.O(this.yWC);
    AppMethodBeat.o(32215);
  }

  public final void onAnimationRepeat(Animation paramAnimation)
  {
  }

  public final void onAnimationStart(Animation paramAnimation)
  {
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.gallery.ImageGalleryUI.16
 * JD-Core Version:    0.6.2
 */