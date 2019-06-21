package com.tencent.mm.ui.chatting.gallery;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.b.a.k;
import com.tencent.mm.plugin.scanner.d;
import com.tencent.mm.ui.base.MMViewPager.c;

final class ImageGalleryUI$23
  implements MMViewPager.c
{
  ImageGalleryUI$23(ImageGalleryUI paramImageGalleryUI)
  {
  }

  public final void bvE()
  {
    AppMethodBeat.i(32224);
    if (ImageGalleryUI.f(this.yWC) == 1)
      AppMethodBeat.o(32224);
    while (true)
    {
      return;
      if ((ImageGalleryUI.f(this.yWC) == 0) || (ImageGalleryUI.f(this.yWC) == 2))
      {
        k localk = new k();
        if (ImageGalleryUI.f(this.yWC) == 2);
        for (long l = 1L; ; l = 0L)
        {
          localk.cVR = l;
          localk.cVS = 1L;
          localk.ajK();
          this.yWC.ak(true, d.cgx());
          AppMethodBeat.o(32224);
          break;
        }
      }
      this.yWC.ak(true, false);
      AppMethodBeat.o(32224);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.gallery.ImageGalleryUI.23
 * JD-Core Version:    0.6.2
 */