package com.tencent.mm.ui.chatting.gallery;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.widget.ImageView;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class ImageGalleryUI$3
  implements ValueAnimator.AnimatorUpdateListener
{
  ImageGalleryUI$3(ImageGalleryUI paramImageGalleryUI, int paramInt)
  {
  }

  public final void onAnimationUpdate(ValueAnimator paramValueAnimator)
  {
    AppMethodBeat.i(32192);
    float f = ((Float)paramValueAnimator.getAnimatedValue()).floatValue();
    if (f <= 0.1F)
      ImageGalleryUI.p(this.yWC).setAlpha(f * 10.0F);
    while (true)
    {
      ImageGalleryUI.p(this.yWC).setTranslationY(f * (this.maj - ImageGalleryUI.p(this.yWC).getHeight()));
      AppMethodBeat.o(32192);
      return;
      if (f >= 0.9F)
        ImageGalleryUI.p(this.yWC).setAlpha((1.0F - f) * 10.0F);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.gallery.ImageGalleryUI.3
 * JD-Core Version:    0.6.2
 */