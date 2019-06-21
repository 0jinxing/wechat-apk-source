package com.tencent.mm.ui.chatting.gallery;

import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnPreDrawListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.storage.bi;
import com.tencent.mm.ui.base.MMViewPager;
import com.tencent.mm.ui.base.g;
import com.tencent.mm.ui.tools.e;

final class ImageGalleryUI$4
  implements ViewTreeObserver.OnPreDrawListener
{
  ImageGalleryUI$4(ImageGalleryUI paramImageGalleryUI)
  {
  }

  public final boolean onPreDraw()
  {
    AppMethodBeat.i(32196);
    this.yWC.mQT.getViewTreeObserver().removeOnPreDrawListener(this);
    this.yWC.rpw = this.yWC.mQT.getWidth();
    this.yWC.rpx = this.yWC.mQT.getHeight();
    if (ImageGalleryUI.j(this.yWC).dFO().bwt())
      this.yWC.rpx = ((int)(this.yWC.rpw / this.yWC.kks * this.yWC.kkt));
    if (ImageGalleryUI.j(this.yWC).dFO().drE())
    {
      g localg = (g)ImageGalleryUI.a(this.yWC, ImageGalleryUI.j(this.yWC), this.yWC.mQT);
      if (localg != null)
      {
        ImageGalleryUI localImageGalleryUI = this.yWC;
        float f = this.yWC.rpw / localg.getImageWidth();
        localImageGalleryUI.rpx = ((int)(localg.getImageHeight() * f));
        if (this.yWC.rpx > this.yWC.mQT.getHeight())
          this.yWC.rpx = this.yWC.mQT.getHeight();
      }
    }
    this.yWC.jYE.hw(this.yWC.rpw, this.yWC.rpx);
    if (!this.yWC.yWc)
    {
      ImageGalleryUI.q(this.yWC);
      ImageGalleryUI.r(this.yWC);
      this.yWC.jYE.a(this.yWC.mQT, ImageGalleryUI.s(this.yWC), new ImageGalleryUI.4.1(this));
    }
    ImageGalleryUI.u(this.yWC);
    AppMethodBeat.o(32196);
    return true;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.gallery.ImageGalleryUI.4
 * JD-Core Version:    0.6.2
 */