package com.tencent.mm.ui.chatting.gallery;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.ImageView;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class ImageGalleryUI$2 extends AnimatorListenerAdapter
{
  ImageGalleryUI$2(ImageGalleryUI paramImageGalleryUI)
  {
  }

  public final void onAnimationEnd(Animator paramAnimator)
  {
    AppMethodBeat.i(32191);
    ImageGalleryUI.p(this.yWC).setAlpha(0.0F);
    AppMethodBeat.o(32191);
  }

  public final void onAnimationStart(Animator paramAnimator)
  {
    AppMethodBeat.i(32190);
    ImageGalleryUI.p(this.yWC).setAlpha(0.0F);
    AppMethodBeat.o(32190);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.gallery.ImageGalleryUI.2
 * JD-Core Version:    0.6.2
 */