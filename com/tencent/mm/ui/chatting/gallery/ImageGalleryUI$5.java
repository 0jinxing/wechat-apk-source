package com.tencent.mm.ui.chatting.gallery;

import android.view.View;
import android.widget.ImageView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.base.MMViewPager;
import com.tencent.mm.ui.base.MMViewPager.b;

final class ImageGalleryUI$5
  implements MMViewPager.b
{
  ImageGalleryUI$5(ImageGalleryUI paramImageGalleryUI)
  {
  }

  public final void aa(float paramFloat1, float paramFloat2)
  {
    float f1 = 1.0F;
    AppMethodBeat.i(32197);
    float f2 = 1.0F - paramFloat2 / this.yWC.mQT.getHeight();
    if (f2 > 1.0F)
    {
      ImageGalleryUI.a(this.yWC, f1);
      ab.d("MicroMsg.ImageGalleryUI", "alvinluo onGalleryScale tx: %f, ty: %f, scale: %f", new Object[] { Float.valueOf(paramFloat1), Float.valueOf(paramFloat2), Float.valueOf(f1) });
      ImageGalleryUI.a(this.yWC, ImageGalleryUI.a(this.yWC, ImageGalleryUI.j(this.yWC), this.yWC.mQT));
      if (ImageGalleryUI.v(this.yWC) == null)
        break label255;
      if ((paramFloat1 != 0.0F) || (paramFloat2 != 0.0F))
        break label245;
      ImageGalleryUI.w(this.yWC);
      label131: ImageGalleryUI.v(this.yWC).setPivotX(this.yWC.mQT.getWidth() / 2);
      ImageGalleryUI.v(this.yWC).setPivotY(this.yWC.mQT.getHeight() / 2);
      ImageGalleryUI.v(this.yWC).setScaleX(f1);
      ImageGalleryUI.v(this.yWC).setScaleY(f1);
      ImageGalleryUI.v(this.yWC).setTranslationX(paramFloat1);
      ImageGalleryUI.v(this.yWC).setTranslationY(paramFloat2);
      ImageGalleryUI.s(this.yWC).setAlpha(f1);
      AppMethodBeat.o(32197);
    }
    while (true)
    {
      return;
      f1 = f2;
      break;
      label245: ImageGalleryUI.q(this.yWC);
      break label131;
      label255: ab.d("MicroMsg.ImageGalleryUI", "runDragAnimation contentView is null !!");
      AppMethodBeat.o(32197);
    }
  }

  public final void ab(float paramFloat1, float paramFloat2)
  {
    AppMethodBeat.i(32198);
    ImageGalleryUI.c(this.yWC, (int)paramFloat1);
    ImageGalleryUI.d(this.yWC, (int)paramFloat2);
    AppMethodBeat.o(32198);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.gallery.ImageGalleryUI.5
 * JD-Core Version:    0.6.2
 */